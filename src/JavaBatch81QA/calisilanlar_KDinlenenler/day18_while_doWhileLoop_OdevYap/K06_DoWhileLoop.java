package JavaBatch81QA.calisilanlar_KDinlenenler.day18_while_doWhileLoop_OdevYap;

import java.util.Scanner;

public class K06_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Soru 4)
        Kullanicidan toplamak uzere pozitif sayilar isteyin,

        islemi bitirmek icin 0’a basmasini soyleyin.

        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        ve “Negatif sayi giremezsiniz” yazdirip basa donun

        Kullanici 0’a bastiginda
        toplam kac pozitif sayi girdigini,
        yanlislikla kac negative sayi girdigini ve
        girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.


        1 )


         */

        Scanner scan=new Scanner(System.in);

        int pozitifAded=0;
        int  negatifAded=0;
        int toplamPozitif=0;
        int girilenSayi;

        do {
            System.out.println("toplam itediginiz sayilari giriniz, \nislemi bitirmek icin '0'a basin");
            girilenSayi= scan.nextInt();
            toplamPozitif+=girilenSayi;


        }while(girilenSayi!=0);



    }
}
