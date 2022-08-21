package JavaBatch81QA.calisilanlar_KDinlenenler.day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini soyismini ve yasini alip
        girilen bilgiler = seyfi capar 34 seklinde yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();

        /*
        String veri almak icin next() kullaniriz.
        String veri alirken satir sonuna kadar almak icin nextLine(); kullanilir
         */

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        System.out.println("Girdiginiz bilgiler : "  + isim +" "+ soyisim+ " "+ yas);
    }
}
