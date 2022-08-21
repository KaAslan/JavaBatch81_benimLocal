package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class K07_sort {
    public static void main(String[] args) {
// .collections.sort() methodu ------->>>>
        /*
        1.LİST ICIN KULLANILIR
        2. Arrays.sort() ise sadece arrayler icin
        3. natural order'a gore siralar
         */


        List<String> aile=new ArrayList<>();
        aile.add("alparslan");
        aile.add("kadriye");
        aile.add("enes");
        aile.add("zeynep");


        Collections.sort(aile);// COLLECTİONS CLASSINDAN .sort() methodu ile
        System.out.println(aile);











    }
}
