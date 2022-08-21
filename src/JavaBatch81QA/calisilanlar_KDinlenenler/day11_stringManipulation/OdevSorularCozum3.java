package JavaBatch81QA.calisilanlar_KDinlenenler.day11_stringManipulation;

import java.util.Scanner;

public class OdevSorularCozum3 {
    public static void main(String[] args) {

        /*
        Soru 1)
        Kullanicidan email adresini girmesini isteyin,

        mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
        @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
         @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin



         */

        Scanner scan=new Scanner(System.in);
        System.out.println("email adresinizi giriniz");
        String email= scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if ((email.length()-10)==(email.lastIndexOf("@gmail.com"))) {
            System.out.println("Email adresiniz kaydedildi");

        } else {
            System.out.println("lutfen yazimi kontol edin");
        }


    }
}
