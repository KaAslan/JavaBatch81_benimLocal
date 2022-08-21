package JavaBatch81QA.calisilanlar_KDinlenenler.day07_ifStatements;

import java.util.Scanner;

public class OdevSorular2Cozum5 {
    public static void main(String[] args) {

        /*

        Soru 5)
        Kullanicidan bir gun alin

        eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal gun” yazdirin.
        “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gunIsmi=scan.next().toUpperCase();

        if (gunIsmi.equals("CUMA")){
            System.out.println("Muslumanlar icin kutsal gun");

        }else if (gunIsmi.equals("CUMARTESI")){
            System.out.println("Yahudiler icin kutsal gun");

        } else if (gunIsmi.equals("PAZAR")) {
            System.out.println("Hiristiyanlar icin kutsal gun");

        }else {
            System.out.println("Bir yanlislik var. Tekrar deneyin");

        }


    }
}
