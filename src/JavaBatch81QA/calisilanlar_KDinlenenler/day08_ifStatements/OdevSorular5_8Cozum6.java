package JavaBatch81QA.calisilanlar_KDinlenenler.day08_ifStatements;

import java.util.Scanner;

public class OdevSorular5_8Cozum6 {
    public static void main(String[] args) {

        /*
        Soru 6)

        Kullanicidan iki sayi isteyin,

        sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

         */


        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        double sayi1=scan.nextDouble();

        System.out.println("2.sayi giriniz");
        double sayi2= scan.nextDouble();



        if (sayi1>0 && sayi2>0){
            System.out.println("toplamlari : "+ (sayi1+sayi2));

        } else if (sayi1<0 && sayi2<0) {
            System.out.println("Carpimi : " + (sayi1*sayi2));

        } else if (sayi1==0 || sayi2==0) {
            System.out.println("sifir carpmaya gore yutan elemandir");

        }else {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");

        }


    }

}
