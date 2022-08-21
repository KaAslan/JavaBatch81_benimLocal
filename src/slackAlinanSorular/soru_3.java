package slackAlinanSorular;

import java.util.Scanner;

public class soru_3 {
    public static void main(String[] args) {

/*
Girilen bir cümle içinde, istediğiniz harf veya kelime nin kaç adet olduğunu bulan java programı.

C20_For_Loop_Cumlede_kac_adet_var
 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Cümleyi Girin :");
        String cumle = scan.nextLine();
        System.out.print("Aratmak İstediğiniz Kelimeyi Girin :");
        String kelime = scan.nextLine();

        int cumleuzun = cumle.length();
        int kelimeuzun = kelime.length();
        int toplam = 0;
        for (int i = 0; i <= cumleuzun - kelimeuzun; i++) {
            String kes = cumle.substring(i, i + kelimeuzun);

            if (kes.equals(kelime)) toplam++;
        }
        System.out.println(kelime + " Cümlede  " + toplam + " adet vardır");












    }
}
