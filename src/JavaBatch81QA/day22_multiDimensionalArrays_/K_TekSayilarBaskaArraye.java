package JavaBatch81QA.day22_multiDimensionalArrays_;

import java.util.Arrays;

public class K_TekSayilarBaskaArraye {
    public static void main(String[] args) {
        //Java Dizideki Tek Sayıları Başka Diziye Atan Program

        int arr[]={3,2,4,11,67,55,32,66,77,101,23};
        int tekSayilarSayac=0;

        for (int i = 0; i < arr.length; i++) {
            if (i%2!=0){
                tekSayilarSayac++;
            }
        }



        int []yenniArr =new int[tekSayilarSayac];
        int yeniArrIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2!=0){
                yenniArr[yeniArrIndex]=arr[i];
                yeniArrIndex++;
            }
        }
        System.out.println("Tek sayilardan olusan yeni array : " + Arrays.toString(yenniArr));
    }
}
