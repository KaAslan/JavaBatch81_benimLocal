package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;

public class K06_ArrayeElementEkleme {
    public static void main(String[] args) {

        // C05(K05) deki method'u kullanarak array'e eleman ekleyelim

            int[] sayiList=new int[3];

            sayiList[0]=2;
            sayiList[1]=5;
            sayiList[2]=9;

            int eklenecekSayi=19;

            sayiList=K05_ArrayeElementEkleme.arrayeElementEkle(sayiList,eklenecekSayi);


        System.out.println(Arrays.toString(K05_ArrayeElementEkleme.arrayeElementEkle(sayiList,eklenecekSayi)));




    }



}
