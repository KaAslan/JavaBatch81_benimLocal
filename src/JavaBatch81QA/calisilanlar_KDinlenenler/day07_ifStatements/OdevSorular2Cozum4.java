package JavaBatch81QA.calisilanlar_KDinlenenler.day07_ifStatements;

import java.util.Scanner;

public class OdevSorular2Cozum4 {
    public static void main(String[] args) {



        /*
        Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
         ve dikdortgenin kare olup olmadigini yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("1. kenar uzunlugunu giriniz");
        int kenar1= scan.nextInt();


        System.out.println("2. kenar uzunlugunu giriniz");
        int kenar2= scan.nextInt();

        if(kenar1==kenar2){
            System.out.println("karedir");

        }else{
            System.out.println("kare degildir.");
        }


    }

}
