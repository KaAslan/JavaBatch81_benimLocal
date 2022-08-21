package JavaBatch81QA.calisilanlar_KDinlenenler.day07_ifStatements;

import java.util.Scanner;

public class OdevSorularCozum4 {
    public static void main(String[] args) {

            /*
           Soru 4)
           Kullanicidan bir ucgenin uc kenar uzunlugunu alin X3

           eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
           Diger durumlarda ekrana “Eskenar degil” yazdirin.


        sart 1      kenarlar esitse
        sart 2      kenarlar esit degil ve digerleri
            */

        Scanner scan= new Scanner(System.in);

        System.out.println("Ucgenin 1. kenar uzunlugunu giriniz");
        int aKenar= scan.nextInt();

        System.out.println("Ucgenin 2. kenar uzunlugunu giriniz");
        int bKenar= scan.nextInt();

        System.out.println("Ucgenin 3. kenar uzunlugunu giriniz");
        int cKenar= scan.nextInt();

        if (aKenar==bKenar && bKenar==cKenar){
            System.out.println("Eskenar ucgen");

        }else{
            System.out.println("Eskenar degil");

        }




    }
}
