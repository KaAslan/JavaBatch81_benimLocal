package JavaBatch81QA.day22_multiDimensionalArrays_;

public class MdaOdevSorularCozumler3YAPAMADİM {
    public static void main(String[] args) {

        /*

        Soru 3)
        Asagidaki multi dimensional array’lerin
        ic array’lerinde       ayni index’e      sahip elemanlarin toplamini
        ekrana yazdiran bir program yaziniz. (Zor soru)
        arr1 = { { 1,2},{ 3,4,5}, {6} }
        ve arr2 = { { 7,8,9}, { 10,11}, {12} }

         */
        //
        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};


        int yeniArr[]=new int[arr1.length];

        int indexeGoreAlinanSayilarToplam=0;

        for (int i = 0; i < arr1.length && i< arr2.length; i++) {

            for (int j = 0; j < arr1[i].length  && j< arr2[i].length; j++) {
             indexeGoreAlinanSayilarToplam+=arr1[i][j]+arr2[i][j];

            }
            System.out.println("indexi" + i +" olan sayilar toplami : "+ indexeGoreAlinanSayilarToplam);
           indexeGoreAlinanSayilarToplam=0;
        }













    }


}


