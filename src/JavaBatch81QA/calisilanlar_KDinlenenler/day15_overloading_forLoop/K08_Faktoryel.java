package JavaBatch81QA.calisilanlar_KDinlenenler.day15_overloading_forLoop;

public class K08_Faktoryel {
    public static void main(String[] args) {
        /*
          input olarak verilen bir tamsayi icin faktoryel hesaplayip yazdiran
           bir method olusturun
           verilen sayi negatif veya 20'den buyuk olursa
           "girilen sayinin faktoryeli hesaplanamaz"
           uyarisi yazdirin
         */

        int tamsayi=5;
        faktoryelBul(tamsayi);
    }

    public static void faktoryelBul(int tamsayi) {

        if (tamsayi<0 || tamsayi>20) {
            System.out.println("girilen sayinin faktoryeli hesaplanamaz");

        } else if (tamsayi==0) {
            System.out.println("0! = 1' dir");

        }else {

            int faktoryel=1;
            for (int i = 1  ;  i <=tamsayi ; i++) {
                faktoryel*=i;
            }
            System.out.println(tamsayi+" sayisinin faktoryeli "+faktoryel+ " dir.");
            // loop dısında cunku son sonuc gerek bize
        }



















    }
}
