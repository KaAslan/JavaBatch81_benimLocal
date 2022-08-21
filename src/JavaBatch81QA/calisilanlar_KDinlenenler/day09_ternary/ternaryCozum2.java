package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class ternaryCozum2 {
    public static void main(String[] args) {

        /*
        Soru1 ) Kullanicidan iki sayi alin ve
        buyuk olmayan sayiyi yazdirin
         */

        Scanner scan=new Scanner(System.in);  //1

        System.out.println("Lutfen birinci sayiyi giriniz");  //2
        int sayi1= scan.nextInt();                          // 3

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();


        System.out.println((sayi1<sayi2)  ?  sayi1  : sayi2 );





    }
}
