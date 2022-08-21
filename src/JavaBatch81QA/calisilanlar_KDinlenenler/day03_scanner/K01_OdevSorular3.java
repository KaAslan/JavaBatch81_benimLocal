package JavaBatch81QA.calisilanlar_KDinlenenler.day03_scanner;

import java.util.Scanner;

public class K01_OdevSorular3 {
    public static void main(String[] args) {

/*
        Soru 3) Kullanicidan yaricap isteyip
         cemberin cevresini
          ve dairenin alanini hesaplayip yazdirin
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yaricap giriniz");
        double yariCap=scan.nextDouble();

        System.out.println("cemberin cevresi : " + (2*3.14*yariCap));

        System.out.println("Cemberin alani : " + (3.14*yariCap*yariCap));


    }
}
