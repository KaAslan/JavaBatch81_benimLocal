package JavaBatch81QA.calisilanlar_KDinlenenler.day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi soyisminizi ve yasinizi giriniz \naralarda Enter tusuna basiniz");

        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();

        System.out.println("Girdiginiz bilgiler : "  + isim +" "+ soyisim+ " "+ yas);
    }

    /* bir onceki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz

    Kullanicidan ismini soyismini ve yasini alip
        girilen bilgiler = seyfi capar 34 seklinde yazdirin
     */
}

