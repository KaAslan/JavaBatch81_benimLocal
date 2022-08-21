package JavaBatch81QA.calisilanlar_KDinlenenler.day04_DataCasting;

public class K02_OdevSoruCozum2 {
    public static void main(String[] args) {
        /*
        Soru 2 ) int veri turunde bir degisken olusturun
        ve adim adim narrowing yapin
        ve yazdirin
         */
            int intSayi=158;

            short shortSayi=(short)intSayi ;
        System.out.println("short sayi : " + shortSayi);

            byte byteSayi= (byte)intSayi;
        System.out.println("byte sayi : " + byteSayi);

    }
}
