package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.List;

public class K04_remove {
    public static void main(String[] args) {

        List<String> esyalar=new ArrayList<>();
        esyalar.add("koltuk");
        esyalar.add("sandakye");
        esyalar.add("masa");
        esyalar.add("bilgisayar");

        // 2 SEKİLDE KULLANILIR
        // 1--> OBJEYİ PARAMETRE OLARAK YAZMAK -- TRUE/ FALSE
        //2 --> INDEXİ PARAMETRE OLARAK YAZMAK --SİLİNEN OGRE DONER

        System.out.println(esyalar);

        /// 1) OBJE YAZARAK
        System.out.println(esyalar.remove("masa"));  // --> TRUE
        System.out.println("obje yazdim --> " + esyalar );

        // 2) INDEX YAZARAK
        System.out.println(esyalar.remove(0)); // --> SİLİNEN OGE- KOLTUK
        System.out.println("Index yazdim -->" + esyalar);


    }
}
