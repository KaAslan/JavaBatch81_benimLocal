package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class SwitchCase_Cozumler_1 {
    public static void main(String[] args) {


        /*
         Soru1 :
         Kullanicidan haftanin kacinci gunu oldugunu sorun
         ve gun ismini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("haftanin kacinci gunu?");
        int gunSayi= scan.nextInt();

        switch (gunSayi) {
            case 1 :
                System.out.println("Pazartesi");
                break;

            case 2 :
                System.out.println("Sali");
                break;

            case 3 :
                System.out.println("Carsamba");
                break;

            case 4 :
                System.out.println("Persembe");
                break;

            case 5 :
                System.out.println("Cuma");
                break;

            case 6 :
                System.out.println("Cumartesi");
                break;

            case 7 :
                System.out.println("Pazar");
                break;

            default :
                System.out.println("lutfen gecerli bir gun sayisi giriniz. 1 - 7 arasi:");

        }



    }
}
