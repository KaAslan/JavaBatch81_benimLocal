package slackAlinanSorular;

import java.util.Scanner;

public class soru_2 {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            System.out.print("Iki sayiyi islem isareti ile birlikte giriniz: ");
            String sayi = input.nextLine();
            System.out.println("Islemin Sonucu : " + islem(sayi));
        }
    /*
        Hatali veri girilmemis kabul ettim. double veri tipinde girilebilir
        12.5+3.7     gibi sayilar arasi nokta
    */
        public static double islem(String sayi) {
            double sonuc = 0;
            sayi = sayi.replace(" ", "");
            String isaret = sayi.replace(".", "1").replaceAll("\\d", "");
            int yeri = sayi.indexOf(isaret);
            double sayi1 = Double.parseDouble(sayi.substring(0, yeri));
            double sayi2 = Double.parseDouble(sayi.substring(yeri + 1));
            switch (isaret) {
                case "+": sonuc = sayi1 + sayi2; break;
                case "-": sonuc = sayi1 - sayi2; break;
                case "*": sonuc = sayi1 * sayi2; break;
                case "/": sonuc = sayi1 / sayi2; break;
            }
            return sonuc;
        }












    }

