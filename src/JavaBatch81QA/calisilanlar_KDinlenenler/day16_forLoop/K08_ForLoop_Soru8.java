package JavaBatch81QA.calisilanlar_KDinlenenler.day16_forLoop;

import java.util.Scanner;

public class K08_ForLoop_Soru8 {
    public static void main(String[] args) {

        /*
         Soru 8 ) Interview Question
         Kullanicidan bir String isteyin
         ve Stringi tersine ceviren bir method yazin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime veya cumle giriniz");
        String input=scan.nextLine();

        String terstenInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);

        }

        System.out.println("girdiginiz cumle/kelime : " + input+
                "\nkelimenin/cumlenin tersten yazilisi : "+ terstenInput);
    }
}
