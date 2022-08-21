package JavaBatch81QA.calisilanlar_KDinlenenler.day03_scanner;

import java.util.Scanner;

public class K01_OdevSorular5 {
    public static void main(String[] args) {

        /*
        Soru 5) Kullanicidan ismini
        ve soyismini isteyip
         asagidaki sekilde yazdirin

            Isminiz : Mehmet
            Soyisminiz : Bulut
            Kursumuza katiliminiz alinmistir,tesekkur ederiz
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen isminizi giriniz :   ");
        String isim=scan.next();

        System.out.print("Lutfen soyisminizi giriniz :   ");
        String soyIsım= scan.next();

        System.out.println("Isminiz : " + isim+ "\nSoyisminiz : " + soyIsım +
                " \nKursumuza katiliminiz alinmistir,tesekkur ederiz");

    }
}
