package JavaBatch81QA.calisilanlar_KDinlenenler.day18_while_doWhileLoop_OdevYap;

import java.util.Scanner;

public class K01_SifreKontrol {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin.

        Girilen sifreyi asagidaki sartlara gore kontrol edin ve
        sifredeki hatalari yazdirin.

        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve
        gecerli sifre girildiginde "sifreniz Kabul edilmistir" yazdirin.

        -Sifre kucuk harf icermelidir
        -Sifre buyuk harf icermelidir
        -Sifre ozel karekter icermelidir
        -sifre enaz 8 karekter olmalidir.
        */


        Scanner scan=new Scanner(System.in);
        String sifre;

       int sifreKontrolSonuc=0;



        do {
            System.out.println("Lutfen sifrenizi giriniz");
            sifre=scan.next();

            sifreKontrolEdermisin(sifre);








        }while(sifreKontrolSonuc==0);








    }

    private static void sifreKontrolEdermisin(String sifre) {
        /*
        -Sifre kucuk harf icermelidir
        -Sifre buyuk harf icermelidir
        -Sifre ozel karekter icermelidir
        -sifre enaz 8 karekter olmalidir.
         */

     boolean kucukHarfKontrol=false;
     boolean buyukHarfKontrol=false;
     boolean ozelKarakterKontrol=false;
     boolean uzunlukKOntrol=false;

        for (int i = 0; i <=sifre.length()-1 ; i++) {
            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                kucukHarfKontrol=true;
            }
            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z') {
                buyukHarfKontrol=true;
            }


        }


















    }
}
