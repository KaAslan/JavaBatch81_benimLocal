package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class ternaryCozum5 {
    public static void main(String[] args) {


        /*
        Kullanicidan bir sayi alin.
        Sayi pozitifse “Sayi pozitif” yazdirin,
             negatifse sayinin karesini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz ");
        int sayi= scan.nextInt();

        System.out.println(sayi>=0 ? "sayi pozitif " : (sayi*sayi));




    }
}
