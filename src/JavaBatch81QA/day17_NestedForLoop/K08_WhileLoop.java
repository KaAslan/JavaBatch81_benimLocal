package JavaBatch81QA.day17_NestedForLoop;

import java.util.Scanner;

public class K08_WhileLoop {
    public static void main(String[] args) {

        /*
          kullanicidan toplanmak uzere sayilar alin
          sayilarin toplami 500'u gecince (500 dahil)
          sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin
          13 sayi girdinz ve toplamlari 567
         */


        int sayilarToplam=0;
        int sayiAdedi=0;
        int girilenSayi= 0;

        Scanner scan=new Scanner(System.in);

        while (sayilarToplam<500){
            System.out.println("Lutfen toplamak istediginiz sayiyi giriniz");
            girilenSayi= scan.nextInt();
            sayilarToplam+=girilenSayi;
            sayiAdedi++;
        }
        System.out.println("Girilen " + (sayiAdedi) + " tane sayinin toplami :  " +sayilarToplam );
    }
}
