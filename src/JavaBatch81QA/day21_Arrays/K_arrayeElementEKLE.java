package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class K_arrayeElementEKLE {
    public static void main(String[] args) {

        /*
         // verilen bir array'e yeni bir element ekleyen bir method olusturun

         */

        int[] verilenArr={3,5,9,78,5};

        verilenArr=elementEkle(verilenArr);

        System.out.println("Kontrol icin array eklenmis hali  -->" + Arrays.toString(verilenArr));
    }

    private static int[] elementEkle(int[] verilenArr) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen arraye eklemek istediginiz sayiyi giriniz");
        int eklenecekSayi=scan.nextInt();

        int[]eklenmisArr=new int[verilenArr.length+1];      // eski arrayde+1 uzunlukta yeni array olusturdum

        for (int i = 0; i < verilenArr.length; i++) {
            eklenmisArr[i]=verilenArr[i];
        }
        eklenmisArr[eklenmisArr.length-1]=eklenecekSayi; // ---> yeni olusan elementin son hanesine eklecek sayiyi ekleidm


       return eklenmisArr;

    }
}
