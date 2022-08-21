package JavaBatch81QA.calisilanlar_KDinlenenler.day08_ifStatements;

import java.util.Scanner;

public class OdevSorular5_8Cozum7 {
    public static void main(String[] args) {

        /*
        Soru 7)
        Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
            50’den kucukse “D”,
            50-60 arasi “C”,
             60-80 arasi “B”,
             80’nin uzerinde ise “A”
--------------HOCA COZDU
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();


        if (not>=0 && not<50){
            System.out.println("notunuz D");

        } else if (not>=0 && not<60) {
            System.out.println("notunuz C");

        } else if (not>=0 && not<80) {
            System.out.println("notunuz B");

        } else if (not>=0 && not<=100) {
            System.out.println("notunuz A");

        } else {
            System.out.println("opsss bir  hata ile karsilastik. Tekrar deneyin");

        }

    }
}
