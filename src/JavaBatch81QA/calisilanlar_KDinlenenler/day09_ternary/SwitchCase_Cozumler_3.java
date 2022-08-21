package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

import java.util.Scanner;

public class SwitchCase_Cozumler_3 {
    public static void main(String[] args) {



        /*
        Soru3 :
        Kullanicidan bir sayi girmesini isteyin
            Girilen sayi
            10 ise “Iki basamakli en kucuk sayi
            100 ise “uc basamakli en kucuk sayi”
            1000 ise “dort basamakli en kucuk sayi”

            diger durumlarda “Girdigin sayiyi degistir” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz. 10  ,  100  ,  1000");
        int sayi= scan.nextInt();


           switch (sayi) {
               case 10:
                   System.out.println("Iki basamakli en kucuk sayi");
                   break;
               case 100:
                   System.out.println("uc basamakli en kucuk sayi");
                   break;
               case 1000:
                   System.out.println("dort basamakli en kucuk sayi");
                   break;
               default:
                   System.out.println("Girdigin sayiyi degistir");
           }

            /*
            LOOP ILE KULLANICIUYA TEKRAR TEKRAR SORABİLİRDİM
             */

    }
}
