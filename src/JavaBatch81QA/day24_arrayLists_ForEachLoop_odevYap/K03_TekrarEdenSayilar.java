package JavaBatch81QA.day24_arrayLists_ForEachLoop_odevYap;

import java.util.*;

public class K03_TekrarEdenSayilar {
    public static void main(String[] args) {

       // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};
        Arrays.sort(arr);
        List<Integer> tekrarEdenlerList= new ArrayList<>();

        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]==arr[i+1] &&
                !tekrarEdenlerList.contains(arr[i])){
                System.out.print(arr[i]+" ");
                tekrarEdenlerList.add(arr[i]);

            }
        }





    }
}
