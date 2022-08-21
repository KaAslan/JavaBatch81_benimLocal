package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;

public class K_buyuktenKucugeSiralama2 {
    public static void main(String[] args) {

        // verilen bir arrayi buyukten kucuge siralayip bize donduren method olusturun


        int inputArr[]={1,9,6,4,8,23,50,12,7};

        System.out.println("siralamadan önce : " + Arrays.toString(inputArr));

        inputArr=arrBuyuktenKucugeSiralaDondur(inputArr);

        System.out.println("siralamadan sonra: "+ Arrays.toString(inputArr));




    }

    private static int[] arrBuyuktenKucugeSiralaDondur(int[] inputArr) {

        Arrays.sort(inputArr);
       // System.out.println("method ici " + Arrays.toString(inputArr)); //[1, 4, 6, 7, 8, 9, 12, 23, 50]
        int[] siralanmisArr=new int[inputArr.length];

        for (int i = 0; i <inputArr.length ; i++) {
            siralanmisArr[i]=inputArr[inputArr.length-1-i]; // inputArr son rakamdan i kadar eksilt
        }


        return  siralanmisArr;
    }
}
