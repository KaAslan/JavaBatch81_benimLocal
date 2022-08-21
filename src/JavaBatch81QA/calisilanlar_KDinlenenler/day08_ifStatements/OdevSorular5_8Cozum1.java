package JavaBatch81QA.calisilanlar_KDinlenenler.day08_ifStatements;

import java.util.Scanner;

public class OdevSorular5_8Cozum1 {
    public static void main(String[] args) {

        /*
        Soru 5)
        Kullanicidan gun ismini yazmasini isteyin.

        Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini
        ilk harf buyuk diger ikisi kucuk olarak yazdirin,

        gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin ----HOCA COZDU
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Gun ismini yaziniz");
        String gun=scan.nextLine();

        if (gun.equalsIgnoreCase("PAZARTESI") || gun.equalsIgnoreCase("SALI")
        ||  gun.equalsIgnoreCase("CARSAMBA") || gun.equalsIgnoreCase("PERSEMBE")
        || gun.equalsIgnoreCase("CUMA") || gun.equalsIgnoreCase("CUMARTESI") ||
                gun.equalsIgnoreCase("PAZAR") ){

            if (gun.equalsIgnoreCase("PAZARTESI") || gun.equalsIgnoreCase("PAZAR")){
                System.out.println("Paz");

            }else if ( gun.equalsIgnoreCase("CUMA") || gun.equalsIgnoreCase("CUMARTESI")){
                System.out.println("Cum");

            } else if (gun.equalsIgnoreCase("SALI")) {
                System.out.println("Sal");
            } else if (gun.equalsIgnoreCase("CARSAMBA")) {
                System.out.println("Car");

            }else{
                System.out.println("Per");
            }


        }else{
            System.out.println("Gecerli gun ismi giriniz");

        }







    }
}
