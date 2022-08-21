package JavaBatch81QA.day20_Arrays;

import java.util.Arrays;

public class ArraysOdevCozumlerHepsi {
    public static void main(String[] args) {

        /*
        Soru 1:
    Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma”
    olan bir array olusturun ve bu array’i yazdirin.
         */

        String [] arrIsimler={"ali","veli","ayse","fatma"};


        /*
         Soru 2:
    Soru 1’deki elemanlardan
    “Ali” yerine “Can”,
    “Ayse” yerine “Gul” atayin.
         */

       arrIsimler[0]="Can";
       arrIsimler[2]="Gul";
        System.out.println("arreyden degistikten sonra " + Arrays.toString(arrIsimler));


        /*
         Soru 1:
    Verilen 3 elemanli bir array’in tum elemanlarini
     bir soldaki konuma tasiyacak bir program yazin.

    Ornek; array [1,2, 3] ise
    output [2, 3, 1] olacak.
         */

        int arr[]={1,2,3};

        int temp=arr[0];

        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;

        System.out.println(Arrays.toString(arr));


        /*
        Soru 2:
    Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
         */


        int verilenArr[]={1,2,3,4,5};

        int arrToplam=0;
        for (int i = 0; i < 5; i++) {
            arrToplam+=verilenArr[i];
        }
        System.out.println("Arrayin toplami  :  "  + arrToplam);













    }
}
