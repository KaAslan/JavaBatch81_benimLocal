package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;

public class K05_ArrayeElementEkleme {
    public static void main(String[] args) {

        // Soru 5-
        // Verilen bir array’e yeni bir element ekleyen method olusturun

            int []arr=new int[3];
            arr[0]=3;
            arr[1]=4;
            arr[2]=5;

           int eklenecekSayi=10;

           arr= arrayeElementEkle(arr,eklenecekSayi);


        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElementEkle(int[] arr,int eklenecekSayi) {

                int[] yeniArr=new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];

        }
        yeniArr[yeniArr.length-1]=eklenecekSayi;

        return yeniArr;
    }


}
