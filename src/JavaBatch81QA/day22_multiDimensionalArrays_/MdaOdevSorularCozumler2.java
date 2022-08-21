package JavaBatch81QA.day22_multiDimensionalArrays_;

public class MdaOdevSorularCozumler2 {
    public static void main(String[] args) {

        /*
         Soru 2)
        Asagidaki multi dimensional array’in
        ic array’lerindeki son elemanlarin carpimini ekrana yazdiran bir program yaziniz
        { { 1,2,3}, { 4,5}, {6} }
         */
        int[][] carpilcakArr={ {1,2,3}, {4,5}, {6} };

        int carpimSonuc=1;
        for (int i = 0; i <carpilcakArr.length ; i++) {

            carpimSonuc  *=  carpilcakArr[i][carpilcakArr[i].length-1]; // -->> iç i. arraynin son elamani

        }
        System.out.println("son elemanlar carpim sonuc : " + carpimSonuc);


    }
}
