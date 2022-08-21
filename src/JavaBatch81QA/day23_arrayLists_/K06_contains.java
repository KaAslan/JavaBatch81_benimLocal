package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.List;

public class K06_contains {
    public static void main(String[] args) {

        /// .contains() methodu
        List<String> urunler=new ArrayList<>();
        urunler.add("elma");
        urunler.add("karpuz");
        urunler.add("muz");
        urunler.add("kako");

        System.out.println(urunler.contains("elma")); // TRUE
        System.out.println(urunler.contains("kivi")); // FALSE

        //.containsAll() methodu LİSTİ DİGER LİSTTE VARMI DİE KONTROL EDER

        List<String> urunler2=new ArrayList<>();
        urunler.add("elma");
        urunler.add("karpuz");

        System.out.println(urunler.containsAll(urunler2));



    }
}
