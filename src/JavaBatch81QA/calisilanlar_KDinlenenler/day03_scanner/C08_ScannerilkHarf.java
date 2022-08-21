package JavaBatch81QA.calisilanlar_KDinlenenler.day03_scanner;

import java.util.Scanner;

public class C08_ScannerilkHarf {
    public static void main(String[] args) {
        /*
        Soru 7)  Kullanicidan ismini alip isminin bas harfini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");


        /*
        Javada Scanner class'inda nextChar() yoktur.
        bunun yerine Stri,ng olarak ilk kelimeyi alip
        onun da ilk harfini alabiliriz.
         */

        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("isminizin ilk harfi : " + ilkHarf);
    }
}
