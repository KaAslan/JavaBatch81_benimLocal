package JavaBatch81QA.day21_Arrays;

public class OdevSorularCozum1 {
    public static void main(String[] args) {

        /*
        Soru 1
    Verilen bir int arraydeki
    en buyuk sayiyi yazdiran bir method olusturun.
         */

        int[] numArr={1,9,5,56,95,25,13};

        findTheLargestNumInArr(numArr);
   }

    private static void findTheLargestNumInArr(int[] numArr) {
        int max=numArr[0];

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i]>max) max=numArr[i];
        }
        System.out.println("the largest element in the array : " + max);
    }


}
