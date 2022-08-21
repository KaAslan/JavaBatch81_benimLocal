package JavaBatch81QA.day22_multiDimensionalArrays_;

public class K_MdaTumElementleriTopla {
    public static void main(String[] args) {
        // verilen multi dimensional array'in tum elementlerinin toplamini bulunuz

       int [][] verilenArr= { { 6,7,3}, { 9,5}, {10} };

       int elementlerToplam=0;

        for (int i = 0; i <verilenArr.length ; i++) {
            for (int j = 0; j <verilenArr[i].length ; j++) {
                elementlerToplam+=verilenArr[i][j];
            }

        }
        System.out.println(elementlerToplam);




    }
}
