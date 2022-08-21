package JavaBatch81QA.calisilanlar_KDinlenenler.day12_stringManipulations;

import java.util.Scanner;

public class day12_OdevSoruCozum6 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sifre girmesini isteyin
    Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
    sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("sifre giriniz");
        String sifre=scan.nextLine();

        int kontrolAraci=0;

        //kontrol sartlarini yapalim
        //- Ilk harf buyuk harf olmali
        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrolAraci++;
        }else  System.out.println("Ilk harf buyuk harf olmali");

        //- Son harf kucuk harf olmali
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            kontrolAraci++;
        }else System.out.println("son harf kucuk harf olmali");

        //- Sifre bosluk icermemeli
        if (!sifre.contains(" ")){
            kontrolAraci++;
        }else System.out.println("Sifre bosluk icermemeli");

        //- Sifre uzunlugu en az 8 karakter olmali
        if (sifre.length()>=8){
            kontrolAraci++;
        }else System.out.println("Sifre uzunlugu en az 8 karakter olmali");

        //sartlari kontrol ettik simdi kontrol araci 4 olduysa sifre tum sartlari saglar


        if (kontrolAraci==4) {
            System.out.println("Sifre basari ile tanimlandi");
        }else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }




    }
}
