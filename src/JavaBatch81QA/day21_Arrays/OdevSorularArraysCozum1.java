package JavaBatch81QA.day21_Arrays;

public class OdevSorularArraysCozum1 {
    public static void main(String[] args) {

        /*
        SORU 1
    Verilen bir int arraydeki
     en buyuk sayiyi
      yazdiran bir method olusturun
         */

        int []arr = {1,58,56,222,1,3,9};

        enBuyukSayiYazdir(arr);


    }

    private static void enBuyukSayiYazdir(int[] arr) {
        int enBuyukSayi=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }
        }
        System.out.println("arraydeki en buyuk sayiyi : " + enBuyukSayi);




    }
}
