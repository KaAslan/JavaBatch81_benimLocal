package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OdevSorularCozum4 {
    public static void main(String[] args) {

        /*
        soru 4
    Kullanicidan bir array'in boyutunu ve tüm elementlerini alarak
     bir array olusturup,
     bu arrayi bize donduren bir method olusturun
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen olusturmak isteginiz arrayin uzunlugunu giriniz");
        int uzunluk= scan.nextInt();
        int elementler;
        int []arr=new int[uzunluk];

        int count=1;
        while (count<=uzunluk) {
            System.out.println("Lutfen arrayin" +count+ ".inci elementini giriniz");
            elementler= scan.nextInt();
             arr[count-1]=elementler;
            count++;
        }
        System.out.println("olusturdugunuz arr : " + Arrays.toString(arr));


    }
}
