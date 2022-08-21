package JavaBatch81QA.day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class KM03_Iterator {

    public static void main(String[] args) {

        List<Integer> liste =new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);  //[10, 20, 30]

        //listedeki tum elementleri index kullanmadan 3 arttırın.
        for (Integer each: liste
             ) {
            System.out.print(each+3 + " ");
        }
        System.out.println();
        System.out.println(liste);  // ---> kalici degisiklik olmaz for each loop ile


        /*
        java index yapisi olmayan collectionlardaki elementlere ulasmak ve degistirmek icin
         Iterator interface'ini olusturmustur.

         Iterator interface oldugundan ondan obje uretmemiz mumkun degildir bunun yerine bize
         Iterator donduren liste.iterator() metodunu kullaniyoruz.
         */

        Iterator it1= liste.iterator();
        System.out.println(it1.hasNext()); //true cunku iterator basta
        System.out.println(it1.next()); //10 ilk eleman
        System.out.println(it1.next()); //20 iterator saga kaydi ikinci elementi yazdi
        System.out.println(it1.next()); //30 iterator saga kaydi ucuncu elementi yazdi

        // --->  System.out.println(it1.next()); // 30'dan sonra element kalmadigindan next metodu burda hata verdi
                                        // Exception in thread "main" java.util.NoSuchElementException

        /*
        iterator da geri donus yok. adim adim sona ulasinca basa donmek icin yeniden bir iterator olusturmak gerek
         */
        System.out.println(it1.hasNext()); // false. cunku iterator sona geldi. saginda element yok

        Iterator it2=liste.iterator();
        // yeni it2 yi kullanarak listenin tum elementlerini silelim
        it2.next(); //İteratora element yukledim
        it2.remove(); // sil
        System.out.println(liste); // [20, 30] ilk element iterator'ın isaret ettigi yer silindi.
        //YENİDEN SİLMEK İCİN it2.next() ardindan it2.remove() yapmaliyiz.



        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste" + liste);
        Iterator it3=liste.iterator();

        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("while loop sonrasi liste : " + liste);

        /*
         Goruldugu gibi Iterator kullanarak yapabildigim
         1- tum collection elementlerini yazdirmak
         2- tum collection elementlerini silmek
         Bu da bize yetmez
         */




    }
}
