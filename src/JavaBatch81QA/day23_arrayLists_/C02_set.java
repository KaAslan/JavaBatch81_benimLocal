package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.List;

public class C02_set {

    public static void main(String[] args) {
        /*
          elimizde urunlerin bulundugu bir liste var
          urun listesindeki istenen siradaki urunu
          istegimiz yeni urunle degistirip
           eski urunu, varolan eski urunler listesine ekleyelim
         */

        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler= new ArrayList<>();
        // listedeki ikram'in yerine biskrem koyalim,
        // ikram'i da eski urunler listesine ekleyelim

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";
        int temp=urunler.indexOf(silinecekUrun);// tempe silinecek urunun indexini attik

        String silinenUrun=urunler.set(temp,yeniUrun);// tempdeki indexi bul yeni urunle degistir(urunler listesinde)
       // ve bana silinen ikrami getir. yani ikram gelir.
        // silinen elementi String silinenUrun diyerek silinenurune atadik

        eskiUrunler.add(silinenUrun); // eski urunler listes,ine silienen elementi ekleidk

        System.out.println("urunler listesi : " + urunler);
        System.out.println("eski urunler listesi : " + eskiUrunler);

        //ayni islemi bir daha yapalim
        yeniUrun="Kahve";
        silinecekUrun="Cay";

        temp=urunler.indexOf(silinecekUrun); // silinecek urunun yeri
        silinenUrun=urunler.set(temp,yeniUrun); // yurunler lisetsine ekle

        eskiUrunler.add(silinenUrun);
        System.out.println("urunler listesi : " + urunler);
        System.out.println("eski urunler listesi : " + eskiUrunler);

        // bir daha değşiklik yapalim listede
        yeniUrun="Findik";
        silinecekUrun="Cekirdek";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun); // eski silinen urunu dondurur.

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : " + urunler);
        System.out.println("eski urunler listesi : " + eskiUrunler);

    }
}
