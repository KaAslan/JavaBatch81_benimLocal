package JavaBatch81QA.day22_multiDimensionalArrays_;

import java.util.ArrayList;
import java.util.List;

public class K09_get {
    public static void main(String[] args) {

//  .get() METHODU LİSTLERDE INDEXI VERİLEN ELEMANI GETİRİR.DONDURUR.
        List<String> sehirler=new ArrayList<>();
        sehirler.add("isparta");
        sehirler.add("van");
        sehirler.add("eskisehir");

        List<Integer> plakalar=new ArrayList<>();
        plakalar.add(32);
        plakalar.add(34);
        plakalar.add(26);

       //--> System.out.println(sehirler.get("van"));    //KABUL ETMIYOR
        System.out.println(sehirler.get(1)); //--> van YAZDI EKRANDA

        System.out.println(plakalar.get(1)); // 34 YAZDI KONSOLDA


    }
}
