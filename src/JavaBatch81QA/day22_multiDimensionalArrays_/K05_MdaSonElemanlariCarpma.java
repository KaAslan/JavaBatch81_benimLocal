package JavaBatch81QA.day22_multiDimensionalArrays_;

public class K05_MdaSonElemanlariCarpma {
    public static void main(String[] args) {
         /*
        Soru 2)
        Asagidaki multi dimensional array’in
        ic array’lerindeki son elemanlarin carpimini
        ekrana yazdiran bir program yaziniz

         { {1,2,3}, {4,5,2}, {6,3} }
         */

        int[][] arr={ {1,2,3}, {4,5}, {6} };

        int sonElemanCarp=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j==arr[i].length-1) {
                    sonElemanCarp*=arr[i][j];
                }
            }

        }
        System.out.println("son elemanlar carpim : " + sonElemanCarp);




    }
}
