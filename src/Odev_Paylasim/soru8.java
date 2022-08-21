package Odev_Paylasim;

import java.util.Arrays;

public class soru8 {
    public static void main(String[] args) {

        /*
        aşağıdaki örnekte olduğu gibi 1 den 10 a kadar sayılar oluşan
         dizide eksik olan sayıyı döndüren metodu oluşturunuz.
         ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
        ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
        ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10
         */

            int arr[]={7, 2, 3, 10, 5, 9, 1, 4, 8};

         int eksikSayi=eksikSayiyiBul(arr);

       System.out.println("eksik olan sayi -->>  " + eksikSayi);
    }

    private static int eksikSayiyiBul(int[] arr) {
        Arrays.sort(arr);
        int eksikSayiBul=arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (eksikSayiBul!=arr[i]) {
                break;
            }else{eksikSayiBul++;}
        }
       return eksikSayiBul;
    }
}
