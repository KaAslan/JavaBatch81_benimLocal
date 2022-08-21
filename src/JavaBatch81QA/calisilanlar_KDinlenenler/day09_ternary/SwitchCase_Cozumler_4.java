package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class SwitchCase_Cozumler_4 {
    public static void main(String[] args) {

        /*
        Soru4 :
        Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
                    Kullanici S girerse “Software”

                    D girerse “Developer”
                    E girerse “Engineer”
                    T girerse “In Testing” yazdirin
                 */

        Scanner scan = new Scanner(System.in);
        System.out.println("SDET kisaltmasindaki harflerden birini giriniz");
        char harf = scan.next().toUpperCase().charAt(0);


        switch (harf) {
            case 'S':
                System.out.println("Software");
                break;

            case 'D':
                System.out.println("Developer");
                break;

            case 'E':
                System.out.println("Engineer");
                break;

            case 'T':
                System.out.println("Testing");
                break;

            default:
                System.out.println("Yanlis harf girdiniz. Tekrar deneyiniz");

        }


    }
}
