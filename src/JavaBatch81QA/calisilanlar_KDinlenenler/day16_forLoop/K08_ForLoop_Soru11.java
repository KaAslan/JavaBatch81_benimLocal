package JavaBatch81QA.calisilanlar_KDinlenenler.day16_forLoop;

import java.util.Scanner;

public class K08_ForLoop_Soru11 {
    public static void main(String[] args) {
        /*

                Soru 11 ) Interview Question
            Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
            sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 10’dan kucuk bir tamsayi yaziniz/faktoryel bulmak istediginiz sayiyi yaziniz");
        int sayi = scan.nextInt();

        String faktoryel = "";
        for (int i = sayi; i >0; i--) {


           if (i>1){faktoryel += i + " * ";
           }else if (i==1){faktoryel+=i;}

                    }

        System.out.println("Girdiginiz " + sayi + " sayisinin faktoryeli : " + faktoryel);

    }
    }