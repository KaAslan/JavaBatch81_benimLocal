package JavaBatch81QA.calisilanlar_KDinlenenler.day12_stringManipulations;

import java.util.Scanner;

public class day12_OdevSoruCozum5 {
    public static void main(String[] args) {


        /*
          Soru 5
    Kullanicidan 4 harfli bir kelime isteyin                            0   1  2  3
     ve girilen kelimeyi tersten yazdirin                               A  B  C  D
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime=scan.nextLine();

        String terstenKelime=kelime.substring(kelime.length()-1)+
                            kelime.substring(2,3)+
                            kelime.substring(1,2)+
                            kelime.substring(0,1);

        System.out.println(terstenKelime);


    }
}
