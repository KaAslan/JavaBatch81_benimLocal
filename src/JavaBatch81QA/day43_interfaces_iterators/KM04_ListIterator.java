package JavaBatch81QA.day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class KM04_ListIterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);

        ListIterator lit1=liste.listIterator();
        Object temp;

        while (lit1.hasNext()) {
            temp=(Integer)lit1.next()+3;

            lit1.set(temp);
        }
        System.out.println(liste);

    }
}
