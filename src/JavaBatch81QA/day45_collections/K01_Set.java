package JavaBatch81QA.day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class K01_Set {
    public static void main(String[] args) {
        //verilen bir arraydeki tekrar eden elementleri silip ,
        // verilen arrayi tekrarsiz hale getirelim.

        int[] arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};
        Set<Integer> tekrarsizSet = new HashSet<>();  // set deklarasyon

        for (int each: arr  // arr deki her bir elementi al
             ) {
            tekrarsizSet.add(each);  // arr deki her bir elementi alıp tekrarsizSet icine ekle

        }
        System.out.println(tekrarsizSet); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] Set kullandigimiz icin ne oldu?
                                    // hem sırali(doğal sırali) hem tekrarsiz sekilde yani unique sekilde verdi.

        int [] tekrarsizArr=new int[tekrarsizSet.size()];

        System.out.println(Arrays.toString(tekrarsizArr));

        /*
        elementlerin hepsini arr'ye atayalim
        for each loop olmaz cunku arr index ister
        for loop olmaz set'ten alamayiz. set'te index yapisi yok.
        o zaman for each loopu olusturalim setten elementleri alicaz ama indexi kendimiz olusturucaz.
         */

        int indexSayac=0;  // bunu yaparak for each loopu indexi hala getirdik.
        for (int each: tekrarsizSet
             ) {
            tekrarsizArr[indexSayac]=each;
            indexSayac++; // indexin sonraki sayıiya ilerlemesi icin
        }
        //normal for loop ile yapamazdik cunku set'de index yok.
        System.out.println("Tekrarsiz Array : --> "+Arrays.toString(tekrarsizArr));
        // bizim tekrarsizArr baska bir arraydir. bastaki arr degil. yeni yapilan tekrarsizArr'i eski arrayimiz yapmak icin
        arr=tekrarsizArr;

        System.out.println("bastaki bizim arr'nin son hali --> "+Arrays.toString(arr));

        /*
        1.biz bu soruyu arr ve for loop kullanarak cozebilirdik ama if ile kontrol edip,
         yeniden if ile baska bir arraye atamak zorundaydik.
        2. biz bu soruyu list ile cozebililirdik ama yine ifler ile kontrol ederek yapabilirdik.
        3. en kısa yolu bence set oldu. set kendisi zaten siralayıp tekrarsiz halini aliyor.iflere
        gerek yok
         */


    }
}
