package JavaBatch81QA.day22_multiDimensionalArrays_;

import java.util.Arrays;

public class MdaOdevSorularCozumler4 {
    public static void main(String[] args) {
        /*
        Soru 4)
        Asagidaki multi dimensional array’in ic array’lerindeki
        tum elemanlarin toplamini birer birer bulan ve
        herbir sonucu yeni bir array’in elemani yapan ve
         yeni array’i ekrana yazdiran bir program yaziniz { { 1,2,3}, { 4,5}, {6,7} }
            Ornek
            { { 1,2,3}, { 4,5}, {6,7} } --> 1+2+3=6  --->4+5 = 9  --> 6+7=13  --->>>> output: {6,9,13}
            1, 2 3 4 5 6 7 1 2 3 6 4 5 9 6 7 13 output 6 9 13
         */

            int[][] sayilarArr={ { 1,2,3}, { 4,5}, {6,7} };

            int elemanlarToplam=0;

            int[]yeniArr=new int[sayilarArr.length];


        for (int i = 0; i <sayilarArr.length ; i++) {
            for (int j = 0; j <sayilarArr[i].length ; j++) {

                elemanlarToplam+=sayilarArr[i][j];


            }
            yeniArr[i]=elemanlarToplam;
            elemanlarToplam=0;
        }
        System.out.println("yeni olusturulan arr : " + Arrays.toString(yeniArr));


    }
}
