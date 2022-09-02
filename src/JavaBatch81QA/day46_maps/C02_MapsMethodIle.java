package JavaBatch81QA.day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {


    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap =ReusableMethods.mapOlustur();// Reuseble Method'dan olusturduk
        System.out.println("ogrenciMap :"+ogrenciMap);//{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        //todo soru: value'lari sira numarali olarak yazdirin

        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);
        /*
        cevap:1 - Ali, Can, JDev
              2 - Enes, Cem, Tester
              3 - Taha, Emre, JDev
              4 - Derya, Deniz, Devops
              5 - Enes, Can, Tester
              6 - Taha, Deniz, JDev
              7 - Derya, Cem, Tester

         */

        //todo soru: Isim ve soyisimlerin birlikte olacagi bir liste olusturun

        List<String> sinifisimsoyisimList= ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);//cevap: [Ali Can, Enes Cem, Taha Emre, Derya Deniz]

        //todo soru: kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
    }
}
