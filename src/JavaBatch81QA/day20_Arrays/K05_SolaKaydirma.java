package JavaBatch81QA.day20_Arrays;

import java.util.Arrays;

public class K05_SolaKaydirma {
    /*
    Verilen 3 elemanli bir array’in tum elemanlarini
    bir soldaki konuma tasiyacak bir program yazin.

    Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

     */

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,9};
        int bastakiElement=arr[0];

        for (int i = 0; i  < arr.length-1; i++) {
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=bastakiElement;
        System.out.println("sola jaydirma : " +Arrays.toString(arr));// [2, 3, 1]



        /*
        -----------
         */
        // ilk durumuna getirmek icin saga kaydiralim

        int sondakiElement=arr[arr.length-1];

        for (int i = arr.length-1; i >0 ; i--){
            arr[i]=arr[i-1];

        }arr[0]=sondakiElement;

        System.out.println("saga kaydirma : "+Arrays.toString(arr));

    }
}

