package JavaBatch81QA.calisilanlar_KDinlenenler.day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        /*
        kullanicidan ismini isteyin
        girilen ismi
        isminiz : ismail            seklinde yazdırın

        insanlar dunyasindan kodlarimizin bulundugu class'a deger almak icin
        Scanner class'ini kullaniriz.
         */

            //1. Scanner objesini olusturun
        Scanner scan=new Scanner(System.in);

        //2. kullaniciya ne istegini soralim
        System.out.println("Lutfen isminizi giriniz.");

        //3. olusturdugumuz scan objesi ile kullanicidan girdigi degeri alip
        //olusturacagimiz uygun bir variable a atayalim

        String kullaniciIsmi=scan.next();

        System.out.println("isminiz : " + kullaniciIsmi);

    }
}
