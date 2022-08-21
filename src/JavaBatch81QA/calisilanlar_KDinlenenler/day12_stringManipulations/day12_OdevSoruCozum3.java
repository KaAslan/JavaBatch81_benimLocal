package JavaBatch81QA.calisilanlar_KDinlenenler.day12_stringManipulations;

import java.util.Scanner;

public class day12_OdevSoruCozum3 {
    public static void main(String[] args) {

        /*
         Soru 3
        Kullanicidan isim isteyin Eger
      - isim “ harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
      - isim “ harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
      -  ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
         */







        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.nextLine();

        if (isim.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");

        }
        if (isim.contains("z")) {
            System.out.println("Girdiginiz isim z harfi iceriyor");

        }
        if (!isim.contains("a") && !isim.contains("Z")){
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }


    }
}
