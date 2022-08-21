package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu : " + sayilar1.size());

        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1); // [5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("Listenin yeni boyutu : " + sayilar1.size());

        sayilar1.set(2,8);// --Z sout icinde yazarsak bize sildigi elemani getirir
        System.out.println(sayilar1); // [5, 3, 8, 2, 5, 3, 2, 2]

        System.out.println(sayilar1.set(0,12)); // 5 //--> sout icinde 0.indexi 5 yaptik ve o bize 5 yani sildigini geritrdi.
        System.out.println(sayilar1); // [12, 3, 8, 2, 5, 3, 2, 2] //--> yazdirinc 0. index 12 oldu

        /*
         set method'u istenen index'deki eski elementi silip,
          yerine verdigimiz yeni elementi set eder.
          eger eski elementi silmek istemiyorsak,
          add(index,deger) method'unu kullanabiliriz
          set() sildigi eski elementi de bize dondurur
         */
    }
}
