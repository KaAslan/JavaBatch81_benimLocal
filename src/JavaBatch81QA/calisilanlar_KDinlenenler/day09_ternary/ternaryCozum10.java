package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class ternaryCozum10 {
    public static void main(String[] args) {

        /*
        Soru5 )
        Kullanicidan bir sayi alin ve
        sayi 3 basamakli ise “uc basamakli sayi”,
        yoksa “Uc basamakli degil” yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi>=100 && sayi<=999 ? "uc basamakli sayi "  :  " uc basamakli degil");


    }
}
