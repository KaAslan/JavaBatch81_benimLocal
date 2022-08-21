package JavaBatch81QA.calisilanlar_KDinlenenler.day04_DataCasting;

public class K01_OdevSoruCozum1 {
    public static void main(String[] args) {
        /*
         Soru 1 ) byte veri tipinde bir degisken olusturun,
         short,int,float ve double data tiplerinde
        birer degisken olusturup adim adim widening yapin ve yazdirin
         */
            byte sayi1=5;

            short sayi2=sayi1;
        System.out.println("short : " + sayi2);

            int sayi3=sayi1+sayi2;
        System.out.println("int sayi / byte + short toplam: " + sayi3);

            float sayi4=sayi3+sayi2;
        System.out.println("float sayi,int ve short toplam : " + sayi4);

        double sayi5=sayi3+sayi4;
        System.out.println("double sayi, float ve int toplam : " + sayi5);
    }
}
