package JavaBatch81QA.calisilanlar_KDinlenenler.day16_forLoop;

import java.util.Scanner;

public class K01_Odev_nestedForLoop {
    public static void main(String[] args) {

        /*
        Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin
        ve girilen rakama gore asagidaki sekli cizdirin
            *
            * *
            * * *
            * * * *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir pozitif bir rakam giriniz");
        int input=scan.nextInt();

        for (int i =1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
