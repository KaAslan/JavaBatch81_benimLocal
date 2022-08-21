package JavaBatch81QA.calisilanlar_KDinlenenler.day03_scanner;

import java.util.Scanner;

public class K01_OdevSorular2 {
    public static void main(String[] args) {
        /*

        Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin
         ve karenin cevresini ve
         alanini hesaplayip yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin kenar uzunlugunu giriniz");

        int kenarUzunluk=scan.nextInt();

        //ax4
        System.out.println("karenin cevresi : "  + (kenarUzunluk*4));

        System.out.println("karenin alani : " + (kenarUzunluk*kenarUzunluk));



    }
}
