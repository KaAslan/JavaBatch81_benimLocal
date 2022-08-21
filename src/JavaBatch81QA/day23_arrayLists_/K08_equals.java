package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class K08_equals {
    public static void main(String[] args) {

        List<String> sayilar=new ArrayList<>();
        sayilar.add("bir");
        sayilar.add("iki");
        sayilar.add("uc");
        sayilar.add("dort");

        List<String> sayilarDier=new ArrayList<>();
        sayilarDier.add("uc");
        sayilarDier.add("dort");
        sayilarDier.add("bir");
        sayilarDier.add("iki");



        // Collections.sort() yapmadan
        System.out.println("Collections.sort() yapmadan once     " +
                sayilar.equals(sayilarDier));// FALSE


        // // Collections.sort() YAPTİKTAN SONRA
        Collections.sort(sayilar);
        Collections.sort(sayilarDier);

        System.out.println("Collections.sort() YAPTİKTAN SONRA   "+
                sayilar.equals(sayilarDier)); //-->true

        System.out.println(sayilar);
        System.out.println(sayilarDier);
    }
}
