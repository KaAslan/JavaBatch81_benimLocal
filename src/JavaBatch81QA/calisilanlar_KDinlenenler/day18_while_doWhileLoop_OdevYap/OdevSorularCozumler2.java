package JavaBatch81QA.calisilanlar_KDinlenenler.day18_while_doWhileLoop_OdevYap;

public class OdevSorularCozumler2 {
    public static void main(String[] args) {

        /*
        Soru 2 ) For loop ve while Loop kullanarak
        3 basamakli sayilardan 15, 20 ve 90’na
        tam bolunebilen sayilari yazdirin.
         */

        int ilkSayi=100;
        int sonSayi=999;

        for (int i = ilkSayi; i <=sonSayi ; i++) {
            if (i%15==0 && i%20==0 && i%90==0){
                System.out.print(i+" ");
            }

        }

        System.out.println("***********");

        System.out.println();
            int baslangic=100;
            int bitis=999;

            int sayi=baslangic;

            while (sayi<=bitis) {
                if (sayi % 15 == 0 && sayi % 20 == 0 && sayi % 90 == 0) {
                    System.out.print(sayi + " ");
                }
                sayi++;
            }
    }
}
