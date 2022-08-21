package JavaBatch81QA.day21_Arrays;

public class K01_Array_MazSayiyiBulma {
    public static void main(String[] args) {

        /*
        // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
         */

        int [] sayilarArr={1,2,3,6,9,10,4,5};
       // arraydeEnBuyukSayiBul(sayilarArr);
        System.out.println("verilen arraydeki en buyuk sayi : "
                + arraydeEnBuyukSayiBul(sayilarArr));

    }

    private static int arraydeEnBuyukSayiBul(int[] sayilarArr) {
        int enBuyukSayi=sayilarArr[0];

        for (int i = 1; i <sayilarArr.length ; i++) {
            if (sayilarArr[i]>enBuyukSayi){
                enBuyukSayi=sayilarArr[i];

            }
        }
        return enBuyukSayi;

    }
}
