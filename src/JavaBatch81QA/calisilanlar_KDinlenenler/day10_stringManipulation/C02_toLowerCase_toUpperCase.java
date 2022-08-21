package JavaBatch81QA.calisilanlar_KDinlenenler.day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Beni psikopata baglamayin";

        System.out.println(str.toUpperCase()); //BENİ PSİKOPATA BAGLAMAYİN

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

        /*
        Eger buyuk kucuk harf donusumde Local bir dili esas almak isterseniz bu method kullanilabilir
        --->  (str.toUpperCase(Locale.forLanguageTag("Tr")))
         */











    }
}
