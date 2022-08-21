package JavaBatch81QA.calisilanlar_KDinlenenler.day11_stringManipulation;

import java.util.Scanner;

public class OdevSorularCozum2 {
    public static void main(String[] args) {

        /*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
        kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin

        - Girilen kelime cumlede kullanilmamis.
        - Girilen kelime cumlede 1 kere kullanilmis.
        - Girilen kelime cumlede 1’den fazla kullanilmis.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        System.out.println("Lutfen aramak istediginiz kelimeyi de yaziniz");
        String kelime= scan.nextLine();


        if (!cumle.contains(kelime)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime)) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");

        }else{
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");

        }
    }
}
