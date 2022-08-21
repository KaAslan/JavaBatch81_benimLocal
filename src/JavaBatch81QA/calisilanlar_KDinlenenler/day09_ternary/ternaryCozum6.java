package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class ternaryCozum6 {
    public static void main(String[] args) {

        /*
        Soru1 :
         Kullanicidan bir tamsayi alin
         ve sayi 10’dan kucukse “Rakam” ,
         100’den kucukse “iki basamakli sayi”
         degilse “uc basamakli veya daha buyuk sayi” yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        System.out.println((sayi<10) ? "rakam" :
                (sayi<100)  ? "iki basamakli sayi" : "uc basamakli veya daha buyuk sayi");


    }
}
