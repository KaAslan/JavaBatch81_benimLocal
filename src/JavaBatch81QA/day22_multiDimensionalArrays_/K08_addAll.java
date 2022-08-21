package JavaBatch81QA.day22_multiDimensionalArrays_;

import java.util.ArrayList;
import java.util.List;

public class K08_addAll {
    public static void main(String[] args) {


        //   .addAll() METHODU BİR LİSTE BASKA BİR LİST EKLEMEK İCİN KULLANİLİR.
        // ISTEDİGİMİZ INDEX SONRASINA DA EKLENEBİLİR
        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(1);
        sayilar1.add(2);
        sayilar1.add(3);
        sayilar1.add(4);
        sayilar1.add(5);

        List<Integer> sayilar2=new ArrayList<>();
        sayilar2.add(6);
        sayilar2.add(7);
        sayilar2.add(8);
        sayilar2.add(9);
        sayilar2.add(10);

        sayilar1.addAll(sayilar2); // 1.listin sonuna ekledi kaykil micheal
        System.out.println(sayilar1);

        sayilar1.addAll(3,sayilar2);// 2.index sonrasina ekledi
        System.out.println(sayilar1);

        // bir listenin sonuna veya istedigimiz bir indexine,
        // baska bir collection ekleyebiliriz



    }
}
