package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;

public class OdevSorularArraysCozum5 {
    public static void main(String[] args) {

        /*
          SORU 5
    Verilen bir array'e
     yeni bir element ekleyin

         */

        String[] arr={"enes","kagan","hale","zeynep"};
        String[] arrSon=new String[arr.length+1];
        String eklenecekElement="Aslan";


        for (int i = 0; i < arr.length ; i++) {
            arrSon[i]=arr[i];
            arrSon[arrSon.length-1]=eklenecekElement;
        }
        System.out.println("arr eklenmis hali : " + Arrays.toString(arrSon));





    }
}
