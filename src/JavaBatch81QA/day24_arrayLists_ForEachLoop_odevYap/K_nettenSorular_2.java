package JavaBatch81QA.day24_arrayLists_ForEachLoop_odevYap;

import java.util.Arrays;

public class K_nettenSorular_2 {
    public static void main(String[] args) {

        /*
        Find the second largest number in Array
        dizideki (Arrayde) ikinci en buyuk sayiyi bul.
         */


       Integer arr[] ={ 45,69,78,120,5,15,23,5,100};



       Arrays.sort(arr);

       int ikinciEnBuyk= arr[arr.length-2];

        System.out.println("ikinci en buyk sayi : " + ikinciEnBuyk);

    }
}
