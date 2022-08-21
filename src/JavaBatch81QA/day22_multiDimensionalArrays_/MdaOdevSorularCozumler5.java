package JavaBatch81QA.day22_multiDimensionalArrays_;

import java.util.Arrays;
import java.util.Scanner;

public class MdaOdevSorularCozumler5 {
    public static void main(String[] args) {
        /*
        Soru 5)
       Kullanicidan bir cumle isteyin
       ve cumledeki kelime sayisini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        String []cumleArr=cumle.split(" ");

        //System.out.println(Arrays.toString(cumleArr));

        int kelimeSayac=0;
        for (int i = 0; i <cumleArr.length ; i++) {
            kelimeSayac++;
        }
        System.out.println("yapilan arr : " + Arrays.toString(cumleArr)+ "\n bu Arrayin kelime sayisi : " + kelimeSayac);

    }
}
