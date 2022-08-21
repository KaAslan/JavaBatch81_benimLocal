package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class ternaryCozum3 {
    public static void main(String[] args) {


        /*
        Soru2 ) Kullanicidan bir tamsayi alin ve
        sayinin tek veya cift oldugunu yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cift mi tek mi ogrenmek icin bir tamsayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi%2==0 ?  "cift"  : "tek");

    }
}
