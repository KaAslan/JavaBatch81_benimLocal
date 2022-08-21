package slackAlinanSorular;

import java.util.Scanner;

public class kontrol_girdi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Iki sayiyi islem isareti ile birlikte giriniz: ");
        String girilenSayi=scan.nextLine();


        int girdiKontrol=0;
        int islemIsaretiIndex=0;


        int carpimIsaretIndex=girilenSayi.indexOf("*");
        System.out.println("carpim index : " +carpimIsaretIndex);
        int cikarmaIsaretIndex=girilenSayi.indexOf("-");
        int toplaIsaretIndex=girilenSayi.indexOf("+");
        int bolIsaretIndex=girilenSayi.indexOf("/");

        // islem isaretini belirleyelim
        String islemIsareti="";

        if (carpimIsaretIndex>0){
            islemIsaretiIndex=carpimIsaretIndex;
            System.out.println("islem isareti : " + islemIsareti);

        } else if (cikarmaIsaretIndex>0) {
            islemIsaretiIndex=cikarmaIsaretIndex;
            System.out.println("islem isareti : " + islemIsareti);

        } else if (toplaIsaretIndex>0) {
            islemIsaretiIndex=toplaIsaretIndex;
            System.out.println("islem isareti : " + islemIsareti);

        } else if (bolIsaretIndex>0) {
            islemIsaretiIndex=bolIsaretIndex;
            System.out.println("islem isareti : " + islemIsareti);

        }else{
            System.out.println("opsss. somewthing went wrong. \n Please try again");
        }

        System.out.println("islem isaret index : " +islemIsaretiIndex);

        islemIsareti=girilenSayi.substring(islemIsaretiIndex,islemIsaretiIndex+1);
        System.out.println("islem isareti__ : " + islemIsareti);

        String birinciSayi=girilenSayi.substring(0,islemIsaretiIndex).trim();
        String ikinciSayi=girilenSayi.substring(islemIsaretiIndex+1).trim();


        if (!birinciSayi.contains("\\D")){
            girdiKontrol++;

        } else if (!ikinciSayi.contains("\\D")) {
            girdiKontrol++;

        } else if (islemIsaretiIndex>0) {
            girdiKontrol++;

        }else {
            System.out.println("HATALİ GİRİŞ. TEKRAR DENEYİNİZ");
            girilenSayi = scan.nextLine();
        }

    }
}
