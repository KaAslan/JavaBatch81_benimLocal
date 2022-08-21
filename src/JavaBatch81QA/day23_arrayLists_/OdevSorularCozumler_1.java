package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OdevSorularCozumler_1 {
    public static void main(String[] args) {

        /*
             SORULAR
           1)
           Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
*/

            List<String> yeniList=new ArrayList<>();
            yeniList.add("A");
            yeniList.add("B");
            yeniList.add("B");



        /*

           2)
           indexsiz add() methodunu kullanarak, B’yi ekleyiniz. index’li add() methodunu kullanarak,
           L’yi 1 numarali index’e ekleyiniz.
           ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
           */
        List<String> list1=new ArrayList<>();
        list1.add("A");
        list1.add("C");
        list1.add("E");
        list1.add("F");

        list1.add("B");
        System.out.println(list1);
            list1.add(1,"L");
        System.out.println(list1);


/*
            3)
            set() methodu kullanarak, E’yi D yapiniz.
            ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.

            */

            list1.set(3,"D");
        System.out.println(list1);


/*
            4)
            remove() methodu kullanarak, F’yi siliniz.
            ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
            */
            list1.remove("F");
        System.out.println(list1);

/*
            5)
            sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
            ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
         */

        Collections.sort(list1);
        System.out.println("siralanmis hali " + list1);










    }
}
