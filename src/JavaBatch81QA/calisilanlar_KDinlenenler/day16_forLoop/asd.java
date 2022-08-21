package JavaBatch81QA.calisilanlar_KDinlenenler.day16_forLoop;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {

       /*
       Soru 9 ) Interview Question
       Kullanicidan bir String isteyin.
       Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
       bir program yazin.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("kelime yaz pallindrome");
        String kelime=scan.nextLine();

        String tersKelime="";
        for (int i = kelime.length()-1; i >=0 ; i--) {
            tersKelime+=kelime.charAt(i);

        }
        System.out.println(tersKelime);


        String sonuc= tersKelime.equals(kelime) ? "kelimeniz Pallindromdur" : "kelime pallindrome degil";

            System.out.println(sonuc);

    }

}
