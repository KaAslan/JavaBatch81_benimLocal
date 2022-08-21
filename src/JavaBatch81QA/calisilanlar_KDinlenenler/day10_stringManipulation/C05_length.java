
package JavaBatch81QA.calisilanlar_KDinlenenler.day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";
        System.out.println(str.length()); // strin karakter sayisini dondurur -->

        // son karakterini yazdiralim
        System.out.println(str.charAt(str.length()-1)); // p

        System.out.println(str.charAt(str.length()-3)); // sondan 3. karakteri yazdiralim. ---> k

        /*
        Java da null pointer(isaretleyici)
            bir deger degil karsisina yazdildigi variable'ın hiç bir deger almadiginin isaretcisidir.

         */

        String str2=""; // str'2 ye bir deger atanmismidir. EVET
        // bu deger nedir ---> HİCLİK
        System.out.println(str2.length()); //0 --> SIFIR

        String str3=null;
        //str3'e bir deger atanmismidir ? -->HAYIR
        // null bu deger atamamayi isaret etmektedir.
        System.out.println(str3.length()); // Bİ DEGER ATANMAMİS Kİ NASİL UZUNLUGU OLSUN DER SANA -->
                                        // --> NullPointerException



    }
}
