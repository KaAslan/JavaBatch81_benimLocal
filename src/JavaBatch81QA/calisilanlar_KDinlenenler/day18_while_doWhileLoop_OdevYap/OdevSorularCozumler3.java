package JavaBatch81QA.calisilanlar_KDinlenenler.day18_while_doWhileLoop_OdevYap;

import java.util.Scanner;

public class OdevSorularCozumler3 {
    public static void main(String[] args) {
        /*
         Soru 3 ) Kullanicidan baslangic ve bitis degerlerini alin.
          Baslangic degeri ve bitis degeri dahil
            aradalarindaki tum cift tamsayilari
            while loop kullanarak ekrana yazdiriniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri icin bir sayi giriniz");
        int baslangic=scan.nextInt();

        System.out.println("Lutfen bitis degeri icin bir sayi giriniz");
        int bitis= scan.nextInt();


        int sayilar=baslangic;
        while (sayilar<=bitis){

            if (sayilar<bitis && sayilar%2==0){
                    System.out.print(sayilar+", ");

            }else if (sayilar==bitis && sayilar%2==0){
                    System.out.println(sayilar);
            }

            sayilar++;
        }




    }
}
