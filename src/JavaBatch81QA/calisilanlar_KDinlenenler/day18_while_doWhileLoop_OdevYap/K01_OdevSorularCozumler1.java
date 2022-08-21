package JavaBatch81QA.calisilanlar_KDinlenenler.day18_while_doWhileLoop_OdevYap;

import java.util.Scanner;

public class K01_OdevSorularCozumler1 {
    public static void main(String[] args) {

        /*
        Soru 4) Kullanicidan baslangic ve bitis haflerini alin
         ve baslangic harfinden baslayip bitis harfinde biten
         tum harfleri buyuk harf olarak ekrana yazdirin.
         Kullanicinin hata yapmadigini farz edin.
            -----------COZDUK DERSTE
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangiç icin bir harf giriniz");
        char baslangic=scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen bitis icin bir harf giriniz");
        char bitis=scan.next().toUpperCase().charAt(0);


        char harf=baslangic;
        while (harf<=bitis){
            System.out.print( harf+ " ");
            harf++;
        }
        System.out.println();
        System.out.println("");
        System.out.println("******** YA DA BOYLE YAPILABILIR ********");
        System.out.println("");


        Scanner tara=new Scanner(System.in);
        System.out.println("(2.kod) Lutfen baslangiç icin bir harf giriniz");
        char ilkHarf=scan.next().charAt(0);

        System.out.println("(2.kod) Lutfen bitis icin bir harf giriniz");
        char sonHarf=scan.next().charAt(0);


        char baslangıcHarfi=ilkHarf;
        String buyukYap=" ";
        while (baslangıcHarfi<=sonHarf){
            buyukYap=(baslangıcHarfi + " ").toUpperCase();
                        baslangıcHarfi++;
        }
        System.out.println(buyukYap);









    }
}
