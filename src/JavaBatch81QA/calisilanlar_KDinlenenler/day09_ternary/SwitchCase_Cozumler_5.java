package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class SwitchCase_Cozumler_5 {
    public static void main(String[] args) {
        /*
        Soru5 :
        Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Gun ismini giriniz");
        String gunIsmi= scan.next().toUpperCase().trim(); // trim() kullanici bosluk girerse siler.

        switch (gunIsmi) {
            case "PAZARTESİ":

            case "SALI" :

            case "ÇARŞAMBA" :

            case "PERŞEMBE" :

            case "CUMA" :
                System.out.println("girdiginiz gun ismi : " + gunIsmi + " --> Haftaicidir");
                break;

            case "CUMARTESİ" :
            case "PAZAR" :
                System.out.println("girdiginiz gun ismi : " + gunIsmi +" --> Haftasonudur");
                break;

            default:
                System.out.println("Gun ismini yanlis girdiniz. Tekrar yazmayi deneyiniz");
        }







    }
}
