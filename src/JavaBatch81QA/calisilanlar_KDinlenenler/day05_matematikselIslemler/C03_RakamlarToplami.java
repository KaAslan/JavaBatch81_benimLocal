package JavaBatch81QA.calisilanlar_KDinlenenler.day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        /*
        Soru 1)
                Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin
         */

        //Herhangi bir sayiin birler basamagini bulmak icin
        //sayi % 10 --> bize 1ler basamagini verir.

        //Herhangi bir sayinin birler basamagindan kurtulmak icin
        // 538 / 10 --> 53 birler basamagindan kurtuldum.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir pozitif tamsayi giriniz.");
        int sayi=scan.nextInt(); //5267 olsun sayimiz

        int ilkGirilienSayi=sayi;
        int rakamlarToplami=0;
        int birlerBasamagi=0;

        // suanda sayi 5267 birlerBa=0  rakamlatT=0

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;

        sayi/=10; // birler basamagindan (7) kurtulduk

        //526 suan sayi. birler basamagi suan 7 rakamlarToplami suan 7

        birlerBasamagi = sayi % 10; //6
        rakamlarToplami+=birlerBasamagi; // suan 7+6 -->13oldu

        sayi/=10; // birler basamagindan kurtul. 6 gitti.

        // suan sayi 52 birlerBasamagi 6 rakamlarToplami 13


        birlerBasamagi = sayi % 10;  // 2
        rakamlarToplami += birlerBasamagi; // 13+2 oldu

        sayi/=10; // birler basamagiindan kurtul 5 oldu

        // suanda syi 5 birler Basamagi 5 rakamlartoplami 15

        birlerBasamagi = sayi % 10; //5
        rakamlarToplami += birlerBasamagi; // 15+5

        sayi /= 10; // 5den kurtul.0,5 -->integer oldugu iicn 0 oldu

        //suanda sayi 0 birler basamagi 5 rakamlar toplami 20

        System.out.println(ilkGirilienSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
    }
}
