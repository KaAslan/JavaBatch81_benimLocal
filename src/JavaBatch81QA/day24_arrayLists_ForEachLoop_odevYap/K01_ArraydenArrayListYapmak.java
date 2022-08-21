package JavaBatch81QA.day24_arrayLists_ForEachLoop_odevYap;

import java.util.Arrays;
import java.util.List;

public class K01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String [] arr={"Ismail","Nurullah","Fatih"};
        /*
        Uzun listeler olusturmamiz gerektighinde
        tek tek eklemek yerine Array olusturup bunlari liste cevirmek
        daha pratik olabilir.
        1- Loop ile Arraydeki tum elementleri liste atabiliriz
        2- Arrays.asList() kullanabiliriz. Ancak bu methodun 2 tane kotu yan etkisi var
                - Arrays classi kullanilşdigi icin array ozellikleri gecerli olur. dolayısıyla list'te olan
                add, remove gibi size i degistiren methodlar bu sekilde olusturulan listlerde kullanilamaaz.
                - Kaynak olan Array ile urun olan list ozdeslestirilir.
                birinde yapilan degisiklik, otomatik olarak digerinede islenir.
                --> mehmet hoca bu yontemi tavsiye etmiyor
         */
        List<String> sinifList= Arrays.asList(arr); // arr arrayindeki elementleri siniflist yaptik
        System.out.println(sinifList);

        List<Integer> sayilar=Arrays.asList(new Integer[5]);  // --> bunuda kabul ediyor uzunlugu 5 olan bir array. cokda gerek yok

        // yan etkileri
        //1.yan etkisi -
       // sinifList.add("Erdi"); //problem yok ama calisinca hata veriyor UnsupportedOperationException
       // sinifList.remove(1); // problem yok gozukuyor ama yine hata -->UnsupportedOperationException


        //2.yan etki

        arr[1]="emre";
        System.out.println("degisim sonrasi array : "+ Arrays.toString(arr)); //degisim sonrasi array : [Ismail, emre, Fatih]
        System.out.println("arrayi degistirince list : " + sinifList);

        sinifList.set(0,"utku");
        System.out.println("listi degistirince list : " + sinifList);
        System.out.println("listi degistirince array : " + Arrays.toString(arr));




    }
}
