package JavaBatch81QA.calisilanlar_KDinlenenler.day08_ifStatements;

import java.util.Scanner;

public class K05_NestedIfElseStatements {
    public static void main(String[] args) {
        /*
        Soru 11)
        Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
        “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

        Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
                ------------HOCA COZDU
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre=scan.nextLine();
        char ilkHarf=sifre.charAt(0);

        if (ilkHarf=='A'){
            System.out.println("gecerli");

        }else if (ilkHarf=='z'){
            System.out.println("gecerli");

        }else{
            System.out.println("gecersiz");

        }
//// NESTED IF ELSE İLE COZMEK LAZİM SUAN YANLIS




    }
}
