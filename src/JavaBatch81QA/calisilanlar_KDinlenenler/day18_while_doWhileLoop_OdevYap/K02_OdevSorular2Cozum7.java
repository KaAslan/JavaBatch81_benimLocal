package JavaBatch81QA.calisilanlar_KDinlenenler.day18_while_doWhileLoop_OdevYap;

import java.util.Scanner;

public class K02_OdevSorular2Cozum7 {
    public static void main(String[] args) {

        /*
        Soru 7 ) Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazdirin
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();


        int sayiKutusu=sayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayiKutusu>0){
            birlerBasamagi=sayiKutusu % 10;

            rakamlarToplami += birlerBasamagi;
            sayiKutusu/=10;  // ==> sayiKutusu=sayiKutusu/10; burda birler basamagindan kurtulduk
       }
        System.out.println("girilen " +sayi+ "sayisinın rakamlar toplami :"+ rakamlarToplami);


    }
}
