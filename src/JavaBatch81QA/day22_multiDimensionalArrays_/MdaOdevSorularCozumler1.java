package JavaBatch81QA.day22_multiDimensionalArrays_;

public class MdaOdevSorularCozumler1 {
    public static void main(String[] args) {
        /*
         Soru 1 )

        Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
        yazdiran bir method yaziniz. { { 1,2,3}, {4,5,6} }
         */

        int [][] sayilar= { {1,2,3},{4,5,6} };

        arrTumElemanlarCarp(sayilar);



    }

    private static void arrTumElemanlarCarp(int[][] sayilar) {
        int carpim=1;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                carpim*=sayilar[i][j];
            }

        }
        System.out.println("carpim sonuc :" + carpim);

    }
}
