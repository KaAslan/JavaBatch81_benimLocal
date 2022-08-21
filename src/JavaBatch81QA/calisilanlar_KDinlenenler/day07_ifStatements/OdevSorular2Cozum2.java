package JavaBatch81QA.calisilanlar_KDinlenenler.day07_ifStatements;

import java.util.Scanner;

public class OdevSorular2Cozum2 {
    public static void main(String[] args) {


        /*
        Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin
        ve o harfle baslayan gun isimlerini yazdirin

                Ornek: ilkHarf=P
                output = “Pazar, Pazartesi veya Persembe”
                ilkHarf=S output = “Sali”

                *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

            sart 1      p yazarsa       Pazar, Pazartesi veya Persembe      if
            sart 2      s yazarsa       sali                                else if
            sart 3      c               carsamba,cuma,cumartesi             else if
            sart 4      baska harf      tekrar deneyin                      else

         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin ilk harfini giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);

        if(ilkHarf=='P'){
            System.out.println(" Pazar, Pazartesi veya Persembe");

        }else if (ilkHarf=='S'){
            System.out.println("sali");

        }else if (ilkHarf=='C'){
            System.out.println("carsamba,cuma,cumartesi ");

        }else{
            System.out.println("Tekrar deneyin");

        }




    }
}
