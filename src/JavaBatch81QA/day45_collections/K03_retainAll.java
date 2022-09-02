package JavaBatch81QA.day45_collections;

import java.util.HashSet;
import java.util.Set;

public class K03_retainAll {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);

        set2.addAll(set1);
        set2.add(25);
        set2.add(30);

        System.out.println("set1 = " + set1); // set1 = [20, 10]
        System.out.println("set2 = " + set2); //set2 = [20, 25, 10, 30]

        System.out.println("retainAll ile --> "+set2.retainAll(set1)); // set2'yi set1 ile kıyaslayip farkli elementleri siliyor.
       // System.out.println("removeAll ile --> "+ set2.removeAll(set1)); // yaptigimizda set2'nin icindeki set1 elemanlarini siler

        // retainAll yapinca aynı elementler kalir. farkli elementler silinir.
        System.out.println(set1); // retainAll yapinca [20, 10]
        System.out.println(set2); // retainAll yapinca [20, 10]
    }
}
