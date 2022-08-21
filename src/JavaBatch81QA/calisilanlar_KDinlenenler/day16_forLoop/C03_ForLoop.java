package JavaBatch81QA.calisilanlar_KDinlenenler.day16_forLoop;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {

        /* 100’den baslayarak 50’ye kadar olan sayilari
        aralarinda virgul olarak ayni satirda yazdirin

         */

        int sayilar = 0;

        for (int i = 50; i < 101; i++) {
            System.out.print(i + " ,"); // line

        }
         /* Kullanicidan 100’den kucuk bir tamsayi isteyin.
         1’den baslayarak girilen sayiya kadar
         3’un kati olan sayilari yazdirin.

               */

        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir tamsayi giriniz");
        int girilenTamsayi = scan.nextInt();

        for (int i = 1; i < girilenTamsayi; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");

            }
        }


        System.out.println("");

        /* 10 ile 30 arasindaki sayilari aralarinda virgule
        olarak ayni satirda yazdirin

         */
            int baslangic=10;
            int bitis=30;

        for (int i = baslangic; i <=bitis ; i++) {

            if (i<bitis){
            System.out.print(i+ ", ");
            }else{
                System.out.print(i);
            }
        }





    }
}
