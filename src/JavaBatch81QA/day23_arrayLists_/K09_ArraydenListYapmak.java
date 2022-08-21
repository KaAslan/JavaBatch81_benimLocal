package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K09_ArraydenListYapmak {
    public static void main(String[] args) {

        // ARRAYDEN LIST YAPMAK NASIL OLUR
        // Arrays.asList() COK DA ISE YARAMİYOR

        String []isimler=new String[4];
        isimler[0]="enes";
        isimler[1]="zeynep";
        isimler[2]="kagan";
        isimler[3]="hale";

        System.out.println(Arrays.toString(isimler));

        //----> hadi bu arrayi liste atalim.

        List<String> isimlerListesi=new ArrayList<>();

        //ya teker teker girecegiz

        System.out.println(isimlerListesi.add(isimler[0])); //true
        System.out.println(isimlerListesi); // [enes]
        isimlerListesi.remove("enes");
        System.out.println(isimlerListesi); // [] list boş suan

        // ya da for loop ile
       /*
        for (int i = 0; i <isimler.length ; i++) {
            isimlerListesi.add(isimler[i]);
        }

        System.out.println("for loop ile : " + isimlerListesi);

        */


        // FOR EACH LOOP İLE
        /*
        for (String each: isimler
             ) {
            isimlerListesi.add(each);
        }
        System.out.println("for each loop ile : " + isimlerListesi);
        */

        // Collections.addAll() ile.
     Collections.addAll(isimlerListesi,isimler);
     System.out.println("collections.addAll() ile : " + isimlerListesi); //[enes, zeynep, kagan, hale]









    }
}
