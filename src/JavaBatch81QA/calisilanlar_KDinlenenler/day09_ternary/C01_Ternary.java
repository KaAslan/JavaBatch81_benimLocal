package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        // Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();


        System.out.println("Girdiginiz sayinin mutlak degeri : "+ (sayi>=0 ? sayi : (-1 * sayi)));


        Scanner tara = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi1=tara.nextDouble();



        System.out.println("Girdiginiz sayinin mutlak degeri : " + (sayi1>=0 ? sayi1 : (-1*sayi1)));










    }
}
