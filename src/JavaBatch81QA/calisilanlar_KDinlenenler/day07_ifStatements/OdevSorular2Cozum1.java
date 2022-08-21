package JavaBatch81QA.calisilanlar_KDinlenenler.day07_ifStatements;

import java.util.Scanner;

public class OdevSorular2Cozum1 {
    public static void main(String[] args) {

        /*
        Soru 1)
        Kullanicidan bir tamsayi isteyin
        ve sayinin tek veya cift oldugunu yazdirin


        sart 1 tek
        sart 2 cift

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();


        if(sayi%2==0){
            System.out.println("cift sayi");

        }else{
            System.out.println("tek sayi");

        }


    }



}
