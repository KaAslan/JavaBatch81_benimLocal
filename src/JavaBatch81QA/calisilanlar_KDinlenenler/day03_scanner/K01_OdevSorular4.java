package JavaBatch81QA.calisilanlar_KDinlenenler.day03_scanner;

import java.util.Scanner;

public class K01_OdevSorular4 {
    public static void main(String[] args) {

        /*
        Soru 4) Kullanicidan dikdortgenler prizmasinin uzun,
         kisa kenarlarini ve
         yuksekligini isteyip



prizmanin hacmini hesaplayip yazdirin  V= a x b x c
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("dikdortgenler prizmasinin uzun kenarini giriniz" );
        int uzunKenar=scan.nextInt();

        System.out.println("dikdortgenler prizmasinin kısa kenarini giriniz");
        int kısaKenar=scan.nextInt();

        System.out.println("dikdortgenler prizmasinin yuksekligini giriniz");
        int yukseklik=scan.nextInt();

        System.out.println("Prizmanin hacmi : " + uzunKenar*kısaKenar*yukseklik);


    }
}
