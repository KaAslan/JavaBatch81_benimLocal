package JavaBatch81QA.day20_Arrays;

import java.util.Arrays;

public class ArraysOdevCozum1ve2 {
    public static void main(String[] args) {
        /*
        Soru 1:
    Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun ve bu array’i yazdirin.
         */


        String []arr={"Ali", "Veli", "Ayse", "Fatma"};
        System.out.println(Arrays.toString(arr));

        /*
         Soru 2:
    Soru 1’deki elemanlardan “Ali” yerine “Can”, “Ayse” yerine “Gul” atayin.
         */


        arr[0]="Can";
        arr[2]="Gul";
        System.out.println(Arrays.toString(arr));
    }
}
