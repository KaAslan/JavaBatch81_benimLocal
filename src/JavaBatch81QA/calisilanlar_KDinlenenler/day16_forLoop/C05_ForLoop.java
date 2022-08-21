package JavaBatch81QA.calisilanlar_KDinlenenler.day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

     /*
                     Soru 10 )
                Kullanicidan iki sayi isteyin.
                Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
                sonucu yazdiran bir program yaziniz
      */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis sayilarini  giriniz");
        int baslangic=scan.nextInt();

        int bitis= scan.nextInt();

        aradakiSayilariTopla(baslangic,bitis);






    }

    private static void aradakiSayilariTopla(int baslangic, int bitis) {
        int toplam=0;
        if (baslangic<=bitis){
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+= i;

            }

        }else{
            for (int i = bitis; i <=baslangic ; i++) {
            toplam+=i;
            }
        }

        System.out.println("Girdiginiz sayilar " + baslangic + " ve " + bitis+
                " arasındaki sayilarin toplami = " + toplam );


    }


}
