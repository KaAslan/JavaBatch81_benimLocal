package JavaBatch81QA.day22_multiDimensionalArrays_;

import java.util.ArrayList;
import java.util.List;

public class K06_7_List {
    public static void main(String[] args) {


        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);

        isimler.add("enes");

        System.out.println(isimler);
        System.out.println(isimler.add("zeynep")); // true doner


        // indexe gore ekleyelim
        isimler.add(2,"hale");

        System.out.println(isimler);

        isimler.add(1,"kagan");
        isimler.add(2,"ve ");
        System.out.println( isimler);


    }
}
