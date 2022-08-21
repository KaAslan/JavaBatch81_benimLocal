package JavaBatch81QA.calisilanlar_KDinlenenler.day08_ifStatements;

import java.util.Scanner;

public class OdevSorular5_8Cozum8 {
    public static void main(String[] args) {

        /*
        Soru 8)
        Kullanicidan maas icin bir teklif isteyin
        ve asagidaki degerlere gore cevap azdirin.

        Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        60 – 80.000 arasinda ise “Konusabiliriz”,
       60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin

         */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen maas icin bir teklif verin");
        int maas= scan.nextInt();





        if (maas>=80000){
            System.out.println("kabul ediyorum");

        } else if (maas>=60000 && maas<80000) {
            System.out.println("Konusabiliriz");

        }else{
            System.out.println("Maalesef Kabul edemem");

        }


    }
}
