package QuestionBank;

import java.util.Scanner;

public class asd_switch {
    public static void main(String[] args) {

        /*
        Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
        Soru2 : Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin

        Soru3 : Kullanicidan bir sayi girmesini isteyin
                    Girilen sayi
            10 ise “Iki basamakli en kucuk sayi
            100 ise “uc basamakli en kucuk sayi”
            1000 ise “dort basamakli en kucuk sayi”
            diger durumlarda “Girdigin sayiyi degistir” yazdirin

            Soru4 : Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
                    Kullanici S girerse “Software”

                    D girerse “Developer”
                    E girerse “Engineer”
                    T girerse “In Testing” yazdirin

            Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
         */


        //soru 4
        Scanner scan=new Scanner(System.in);
        System.out.println("SDET kisaltmasindaki harflerden birini yaziniz ");
        String harf=scan.next().toLowerCase();

        switch (harf){
            case "s":
                System.out.println("Software");
                break;

            case "d":
                System.out.println("Developer");
                break;

            case "e":
                System.out.println("Engineer");
                break;

            case "t":
                System.out.println("Testing");
                break;

            default:
                System.out.println("bir yanlislik war");

        }


        /*soru 3
        Soru3 : Kullanicidan bir sayi girmesini isteyin
        Girilen sayi
        10 ise “Iki basamakli en kucuk sayi
        100 ise “uc basamakli en kucuk sayi”
        1000 ise “dort basamakli en kucuk sayi”
        diger durumlarda “Girdigin sayiyi degistir” yazdirin
        */

        Scanner scan1=new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi= scan1.nextInt();

        switch (sayi){
            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;

            case 100 :
                System.out.println("uc basamakli en kucuk sayi");
                break;

            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistir");

        }



    }
}
