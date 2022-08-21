package Odev_Paylasim;

import java.util.Scanner;

public class soru1_loop {
    public static void main(String[] args) {

        /*
        Kullanıcının girdiği integer sayıyı
        tersten yazdıran kod bloğu yazınız.

        123==>321 yada
        1045==>5401 gibi
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tersinden yazmak icin bir sayi giriniz");
        int alinanSayi = scan.nextInt();

        while (alinanSayi > 0) {
            System.out.print(alinanSayi % 10);
            alinanSayi /= 10;
        }

    }
}