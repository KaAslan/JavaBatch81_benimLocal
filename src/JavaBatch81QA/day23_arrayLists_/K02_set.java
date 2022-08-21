package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class K02_set {
    public static void main(String[] args) {

        /*
        senaryo ;
        Elimizde bir urunler listesi olsun.
        birde biten urunler listesi olsun.
        yeni urun geldiginde,
        biten urunleri bulup bitenUrunler listesine alalim
         ve yeni gelen urunu urunler listesine ekleyelim
         */


        // urunler listesi olsuturalim
        List<String> urunlerListesi = new ArrayList<>();

        // bitenUrunler listesini hazirlayalim
        List<String> bitenUrunlerListesi = new ArrayList<>();

        //urunler listesine bir kac urun ekleyelim
        urunlerListesi.add("elma");
        urunlerListesi.add("karpuz");
        urunlerListesi.add("limon");
        urunlerListesi.add("portakal");

        //urunlerListesini yazdiralim
        System.out.println(urunlerListesi); // [elma, karpuz, limon, portakal]

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yeni eklenecek urun adini giriniz : ");
        //eklenecek urunler icin variable olusturalim
        String yeniUrun = scan.nextLine();

        System.out.println("Lutfen silinecek urunu giriniz : ");
        // silinecek urun variable
        String silinecekUrun = scan.nextLine();

        // silinecek urunun indexini bulalim ve bir variable a atayalim
        int silinecekUrunIndex = 0;
        for (String each : urunlerListesi
        ) {
            if (silinecekUrun.equals(each)) {
                silinecekUrunIndex = urunlerListesi.indexOf(each);
            }
        }

        // urunu sildigimizde koyacagimiz bir kap (variable) olusturalim
        String temp = urunlerListesi.set(silinecekUrunIndex, yeniUrun);
        bitenUrunlerListesi.add(temp);
        System.out.println("eski liste " + bitenUrunlerListesi);
        System.out.println("yeni list : " + urunlerListesi);





    }
}