package JavaBatch81QA.day22_multiDimensionalArrays_;

public class K02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {

        // verilen bir multi-dimensional array'in
        // tum elementlerini yazdiran bir method olusturun
        int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};

        neVarsaYazdirMdade(sayilar);



    }

    private static void neVarsaYazdirMdade(int[][] sayilar) {

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {


                    System.out.print(sayilar[i][j]+ ", ");


            }
        }



    }
}
