package JavaBatch81QA.calisilanlar_KDinlenenler.day07_ifStatements;

import java.util.Scanner;

public class OdevSorularCozum3 {
    public static void main(String[] args) {

        /*
        Soru 3)
        Kullaniciya yasini sorun,
        eger yas 65’den kucuk ise “emekli olamazsin,calismalisin”,
         65’e esit veya buyukse “Emekli olabilirsin” yazdirin
                    ----------COZDU HOCA
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();


        if(yas<0  ||  yas>120){
            System.out.println("dogru yaz");

        } else if(yas<65){
            System.out.println("emekli olamazsin,calismalisin");

        }else {
            System.out.println("Emekli olabilirsin");
        }



    }
}
