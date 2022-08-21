package Odev_Paylasim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class soru9_cozmedim {
    public static void main(String[] args) {
        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */


            int[] arr = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                if (!list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }

            Collections.sort(list);

            Object[] yeniArray = list.toArray();
            System.out.println("yeni array : " + Arrays.toString(yeniArray));




        }
}
