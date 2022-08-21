package JavaBatch81QA.day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas= scan.nextInt();

        try {
            if (yas<0) {
            throw new IllegalAccessException();

            }else {
                System.out.println("yasiniz : ");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("yas negatif olamaz");
            System.err.println("yas negatif olamaz");

        }


    }
}
