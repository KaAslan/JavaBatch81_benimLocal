package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class ternaryCozum4 {
    public static void main(String[] args) {

        /*
        Soru3 )
        Kullanicidan bir sayi alin
        ve sayinin mutlak degerini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mutlak deger ogrenmek icin bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println("sayinin mutlak degeri : " +
                (sayi>=0 ? sayi : (-1 * sayi)));



    }
}
