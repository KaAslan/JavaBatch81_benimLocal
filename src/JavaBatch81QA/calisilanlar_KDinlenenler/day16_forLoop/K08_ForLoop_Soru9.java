package JavaBatch81QA.calisilanlar_KDinlenenler.day16_forLoop;

import java.util.Scanner;

public class K08_ForLoop_Soru9 {
    public static void main(String[] args) {

        /*
        Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
palindrome olup olmadigini kontrol eden bir program yazin.
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");

        String girilenKelime=scan.next();

        String kelime1=girilenKelime;

        palindromeKontrolEt(girilenKelime);
        System.out.println();

    }

    private static void palindromeKontrolEt(String girilenKelime) {
        String terstenKelime="";

        for (int i = girilenKelime.length()-1; i >=0 ; i--) {
                terstenKelime+=girilenKelime.charAt(i);

        }
        System.out.println(terstenKelime);

        if (girilenKelime.equalsIgnoreCase(terstenKelime)){
            System.out.println("Girdiginiz - " + girilenKelime +" - kelimeesi palindrome kelimedir.");
        }else {
            System.out.println("Girdiginiz - " + " - kelimesi palindrome degildir" );
        }
    }
}