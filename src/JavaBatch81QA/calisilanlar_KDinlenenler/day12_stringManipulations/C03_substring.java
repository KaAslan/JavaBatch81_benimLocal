package JavaBatch81QA.calisilanlar_KDinlenenler.day12_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String isim= "Suleyman";
        String soyisim= "Karanfil";
        String kartNo= "1234 6589 7458 9658";

        System.out.println(isim.substring(3)); // eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); // fil
        System.out.println(isim.substring(2,4)); // le

        // isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        // kredi kartinin ilk 4 rakami gorunsun geriye kalan *
        String isimIlkHarf= isim.substring(0,1).toUpperCase(); // ilk harf aldik buyuk yaptik
        String isimGeriyeKalanlar= isim.substring(1).replaceAll("\\w","*"); // harflerin yeine *

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase(); // --> ilk harf aldik, buyuk hard yaptk
        String soyisimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w","*");
        //--> soyisimde 1den itibaren(ilk harf haric) geriye kalanlari aldik ve yıldız yaptik

        String kkIlk4=kartNo.substring(0,4); // --> 0.inci indexten 4.uncu indexe kadar (0,1,2,3)aldik. 4 dahil degil.
        String kkGeriyeKalanlar= " **** **** ****"; // geriye kalanlar onemsiz * yaptik

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyisimIlkHarf+soyisimGeriyeKalanlar+ "\n" +
                kkIlk4+kkGeriyeKalanlar );
    }
}
