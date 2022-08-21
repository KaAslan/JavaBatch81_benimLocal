package slackAlinanSorular;

import java.util.Scanner;

public class hesap_mak {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Iki sayiyi islem isareti ile birlikte giriniz: ");
        String girilenSayi=scan.nextLine();


        girilenSayi.trim();
        // once kontrol
        int sayilarKontrol=0;
        int girdiKontrol=0;


        int carpimIsaretIndex=girilenSayi.indexOf("*");
        int cikarmaIsaretIndex=girilenSayi.indexOf("-");
        int toplaIsaretIndex=girilenSayi.indexOf("+");
        int bolIsaretIndex=girilenSayi.indexOf("/");

        int islemIsaretiIndex=0;
        String islemIsareti="";
        int sonuc=0;

        // islem isaretini belirleyelim

        if (carpimIsaretIndex!=-1){
            islemIsaretiIndex=carpimIsaretIndex;

        } else if (cikarmaIsaretIndex!=-1) {
            islemIsaretiIndex=cikarmaIsaretIndex;

        } else if (toplaIsaretIndex!=-1) {
            islemIsaretiIndex=toplaIsaretIndex;

        } else if (bolIsaretIndex!=-1) {
            islemIsaretiIndex=bolIsaretIndex;

        }else{
            System.out.println("opsss. somewthing went wrong. \n Please try again");
        }

        islemIsareti=girilenSayi.substring(islemIsaretiIndex,islemIsaretiIndex+1);





        // hadi girdiyi kontrol edelim.


        String birinciSayi=girilenSayi.substring(0,islemIsaretiIndex).trim();
        String ikinciSayi=girilenSayi.substring(islemIsaretiIndex+1).trim();

        System.out.println("birinci sayi : " + birinciSayi+ " ikinciSayi "+ ikinciSayi);



        if (!birinciSayi.contains("\\D")){
            girdiKontrol++;

        } else if (!ikinciSayi.contains("\\D")) {
            girdiKontrol++;

        } else if (islemIsaretiIndex>0) {
            girdiKontrol++;

        }else {
            System.out.println("HATALİ GİRİŞ. TEKRAR DENEYİNİZ");
                    girilenSayi=scan.nextLine();
        }

        // sayilari integer yapalim
        int sayi1=Integer.parseInt(birinciSayi);
        int sayi2=Integer.parseInt(ikinciSayi);



        if (girdiKontrol==3) {
            switch (islemIsareti) {
                case "/":
                    sonuc = sayi1 / sayi2;
                    break;
                case "*":
                    sonuc = sayi1 * sayi2;
                    break;
                case "-":
                    sonuc = sayi1 - sayi2;
                    break;
                case "+":
                    sonuc = sayi1 + sayi2;
                    break;
                default:
                    System.out.println("opsss hata oldu");
            }

            System.out.println("Girdiginiz 1.sayi : " + sayi1 + "\nGirdiginiz 2.sayi : " + sayi2 +
                    "\n" + sayi1 + " " + islemIsareti + " " + sayi2 + " isleminin sonucu " + sonuc);



        }



    }
}
