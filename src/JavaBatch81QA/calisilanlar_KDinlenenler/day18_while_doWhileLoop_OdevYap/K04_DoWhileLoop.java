package JavaBatch81QA.calisilanlar_KDinlenenler.day18_while_doWhileLoop_OdevYap;

import java.util.Scanner;

public class K04_DoWhileLoop {
    public static void main(String[] args) {

             /*
          Kullanicidan tam sayilar alin
          kullanici cift sayi girdigi muddetce sayiyilari yazdirin
          tek sayi girdiginde islemi bitirin

         */


        Scanner scan=new Scanner(System.in);

        int sayi=0;

        System.out.println("**********while ile cozum*********");
        System.out.println("");

        while (sayi%2==0){
            System.out.println("LUTFEN TAMSAYI GIRINIZ");
            sayi=scan.nextInt();

            if (sayi%2==0){
                System.out.println("girilen sayi cift :" + sayi);

            }else{
                System.out.println("benden bu kadar tek sayi girdin");
            }
        }


        System.out.println("");
        System.out.println("*******do while ile cozum********");

        Scanner tara=new Scanner(System.in);

        int girilenSayi;


        do{
            System.out.println("TAM SAYI GIRINIZ");
            girilenSayi=scan.nextInt();

            if (girilenSayi%2==0){
                System.out.println("girilen sayi cift : " + girilenSayi);
            }else{
                System.out.println("benden bu kadar TEK girdin");
            }


        }while(girilenSayi%2==0);


















    }
}
