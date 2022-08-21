package JavaBatch81QA.calisilanlar_KDinlenenler.day16_forLoop;

import java.util.Scanner;

public class K07_ForLoop_Soru5 {
    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin.
        1’den baslayarak girilen sayiya kadar 3’un
        veya 5”in kati olan sayilari yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100’den kucuk bir tamsayi giriniz ");
        int sayi= scan.nextInt();


        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0 || i%5==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        // ya da
        System.out.println("*********************");
        System.out.println("Lutfen 100’den kucuk bir tamsayi giriniz ");
        int sayi1= scan.nextInt();

        String ucBesKatiSayilar="";
        for (int i = 1; i <=sayi1 ; i++) {
            if (i%3==0 || i%5==0){
                ucBesKatiSayilar+=i +" ";
            }

        }
        System.out.println("3 veya 5e bolunebilen sayilar : "+ ucBesKatiSayilar);
    }
}
