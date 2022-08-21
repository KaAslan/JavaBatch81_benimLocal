package JavaBatch81QA.calisilanlar_KDinlenenler.day11_stringManipulation;

import java.util.Scanner;

public class OdevSorularCozum4 {
    public static void main(String[] args) {

        /*
         Soru 2)
         Kullanicidan bir cumle isteyin.
         Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
         “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
         iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor”
         iki kelimeyi de içeriyorsa "karar ver kucuk mu buyuk mu yazdirayim" desin
          yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        if (cumle.contains("buyuk") && cumle.contains("kucuk")){
            System.out.println("karar ver kucuk mu buyuk mu yazdirayim");

        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());

        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        }else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }


    }
}
