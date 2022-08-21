package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class ternaryCozum9 {
    public static void main(String[] args) {

        /*
        Soru4 )
        Kullanicidan dikdortgenin uzunlugunu ve genisligini alin,
        girilen degerlere gore dikdorgenin kare olup olmadigini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin uzunlugunu giriniz");
        int uzunluk= scan.nextInt();

        System.out.println("Lutfen dikdortgenin genisligini giriniz");
        int genislik=scan.nextInt();

        System.out.println(uzunluk==genislik ?  "Kare" : "Dikdortgen"     );




    }
}
