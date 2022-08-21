package JavaBatch81QA.calisilanlar_KDinlenenler.day08_ifStatements;

import java.util.Scanner;

public class K00_OdevCozum7 {
    public static void main(String[] args) {

        /*
        Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        Not’u harf sistemine cevirip yazdirin.
        50’den kucukse “D”,
        50 ye esit veya büyük, 60 dan kucukse “C”,
        60'a esit veya buyuk, 80'den kucuk “B”,
        80’e esit veya uzerinde ise “A”
        gecersiz not girildiginde uyari verelim
--------------HOCA COZDU


         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 0' dan 100'e kadar bir not degeri giriniz");
        double not=scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("Lutfen gecerli not giriniz 0-100 arasi");

        }else if (not<50){
            System.out.println("notunuzun harf degeri D");

        } else if (not<60) {
            System.out.println("notunuzun harf degeri C");

        }else if (not<80){
            System.out.println("notunuzun harf degeri B");

        } else {
            System.out.println("notunuzun harf degeri A");

        }


    }
}
