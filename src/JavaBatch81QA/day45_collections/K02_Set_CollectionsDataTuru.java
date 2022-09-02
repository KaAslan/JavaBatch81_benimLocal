package JavaBatch81QA.day45_collections;

import java.util.HashSet;
import java.util.Set;

public class K02_Set_CollectionsDataTuru {
    public static void main(String[] args) {

        /*
            Collections’in bir ozelligi de farkli data turunden elementleri
        ekleyebilmenizdir. Bunun icin esitligin sol tarafindaki <> (data turu)
        kaldirilabilir veya data turu olarak Object yazilabilir. Ancak bu
        tavsiye edilmez cunku Java’nin cok fazla Casting yapmasi gerekir.

         */

        Set<Integer> tekrarsizSet=new HashSet<>();

        Set<Object> set1=new HashSet<>();
        set1.add("ali");
        set1.add(3);
        set1.add(false);

        System.out.println("set1 = " + set1);


    }
}
