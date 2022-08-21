package JavaBatch81QA.calisilanlar_KDinlenenler.day16_forLoop;

import java.util.Scanner;

public class K08_ForLoop_Soru10 {
    public static void main(String[] args) {

        /*
        Soru 10 ) Kullanicidan iki sayi isteyin.
        Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        sonucu yazdiran bir program yaziniz

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen girmek istediginiz sayilari giriniz.");
        int sayi1=scan.nextInt();
        int sayi2= scan.nextInt();

        int toplam=0;

        if (sayi1>sayi2){
            for (int i = sayi2; i <=sayi1 ; i++) {
                toplam+=i;
            }
            System.out.println("Girdiginiz sayilar : " + sayi1 +" - " + sayi2 + " 'nin toplami: "+ toplam);
        }else if (sayi2>sayi1){
            for (int i = sayi1; i <=sayi2; i++) {
                toplam+=i;
            }
            System.out.println("Girdiginiz sayilar : " + sayi1 +" - " + sayi2 + " 'nin toplami: "+ toplam);
        }else{
            System.out.println("Tekrar deneyiniz");
        }


    }
}
