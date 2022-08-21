package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;

public class K_buyuktenKucugeSiralama {
    public static void main(String[] args) {

        // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun.

        int inputArr[]={1,9,6,4,8,23,50,12,7};

        arrBuyuktenKucugeSirala(inputArr);





    }

    private static void arrBuyuktenKucugeSirala(int[] inputArr) {

        int []siraliArr=new int[inputArr.length];
        Arrays.sort(inputArr);
        for (int i = inputArr.length-1; i >=0 ; i--) {
            siraliArr[i]=inputArr[i];
        }
        System.out.println(Arrays.toString(siraliArr));

/*  YA DA
            for (int i = 0; i <inputArr.length ; i++) {
            siraliArr[i]= inputArr[inputArr.length-1-i] ;
        }
 */


    }
}
