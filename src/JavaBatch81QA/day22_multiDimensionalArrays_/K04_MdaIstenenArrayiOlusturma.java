package JavaBatch81QA.day22_multiDimensionalArrays_;

import java.util.Arrays;

public class K04_MdaIstenenArrayiOlusturma {
    public static void main(String[] args) {

         /*
        Soru 4) Asagidaki multi dimensional array’in
        ic array’lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array’in elemani yapan
        ve yeni array’i ekrana    yazdiran bir program yaziniz

    Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
         */


        int[][] verilenArr= { {1,2,3}, {4,5}, {6,7} };

        System.out.println(verilenArr.length);

        int[] yeniArr=new int[verilenArr.length];

        int toplam=0;
        for (int i = 0; i < verilenArr.length ; i++) {
            for (int j = 0; j < verilenArr[i].length; j++) {
                     toplam+=verilenArr[i][j];
            }
            yeniArr[i]=toplam;
            toplam=0;
        }
        System.out.println("yeni arr : " + Arrays.toString(yeniArr));








    }
}
