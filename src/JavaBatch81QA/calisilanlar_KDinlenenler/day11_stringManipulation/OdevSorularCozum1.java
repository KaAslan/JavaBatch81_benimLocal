package JavaBatch81QA.calisilanlar_KDinlenenler.day11_stringManipulation;

import java.util.Scanner;

public class OdevSorularCozum1 {
    public static void main(String[] args) {




        /*
        Soru 1) Kullanicidan bir cumle ve bir harf isteyin,
        harfin cumlede var olup olmadigini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cumlenizi yaziniz");
        String cumle= scan.nextLine();

        System.out.println("Lutfen aramak istediginiz harfi giriniz");
        String harf=scan.next();


        if (cumle.contains(harf)){
            System.out.println("aradiiginiz " + harf + " harfi cumlede VAR.");

        }else{
            System.out.println("aradiginiz harf cumlede yok");

        }
    }
}
