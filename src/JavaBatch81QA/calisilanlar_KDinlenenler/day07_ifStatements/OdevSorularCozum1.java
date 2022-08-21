package JavaBatch81QA.calisilanlar_KDinlenenler.day07_ifStatements;

import java.util.Scanner;

public class OdevSorularCozum1 {
    /*
    Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
     ve dikdortgenin kare olup olmadigini yazdirin

     sart 1 kare olmasi             if          (kenarlari esit)
     sart 2 kare olmamasi           else if     (kenarlari esit degil)
     sart 3 hata vermesi            else        (1 ve 2 sarta uymayanlar)
     */

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);


        System.out.println("dikdortgenin kenar uzunluklarini giriniz");
        double kenarUzunluğu1=scan.nextDouble();

        System.out.println("dikdortgenin diger kenar uzunlugunu giriniz");
        double kenarUzunluğu2=scan.nextDouble();


        if (kenarUzunluğu1==kenarUzunluğu2){
            System.out.println("karedir");

        }else if(kenarUzunluğu1!=kenarUzunluğu2){
            System.out.println("kare degildir");

        }else{
            System.out.println("Yanlıs giris yaptiniz.Tekrar deneyin");

        }

    }



}
