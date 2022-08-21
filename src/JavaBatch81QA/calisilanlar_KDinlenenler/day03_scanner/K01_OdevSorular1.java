package JavaBatch81QA.calisilanlar_KDinlenenler.day03_scanner;

import java.util.Scanner;

public class K01_OdevSorular1 {
    public static void main(String[] args) {
        /*
        Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
               */


        //soru 1 Kullanicidan iki tamsayi alip
        // bu sayilarin toplam
        // ,fark
        // ve carpimlarini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz birinci sayiyi girin");
        int sayi1=scan.nextInt();

        System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi girin");
        int sayi2= scan.nextInt();

        System.out.println("toplami : " + (sayi1+ sayi2));

        System.out.println("farkı : " + (sayi1-sayi2));

        System.out.println("carpımlari : " + (sayi1*sayi2));



    }

}
