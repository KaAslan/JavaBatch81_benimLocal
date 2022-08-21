package JavaBatch81QA.calisilanlar_KDinlenenler.day07_ifStatements;

import java.util.Scanner;

public class OdevSorularCozum2 {
    public static void main(String[] args) {

        /*
        Soru 2) Kullanicidan bir karakter girmesini isteyin
            ve girilen karakterin harf olup olmadigini yazdirin  -------COZDU HOCA

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        if (girilenKarakter>='a' && girilenKarakter<='z'  ||
                girilenKarakter>='A' && girilenKarakter<='Z' ){
            System.out.println("Girdiginiz " + girilenKarakter + " karakteri HARFtir");
        }else{
            System.out.println("Girdiginiz "+ girilenKarakter+" karakteri HARF degildir ");
        }






    }
}
