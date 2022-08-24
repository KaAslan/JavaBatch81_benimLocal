package JavaBatch81QA.day44_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class KC02_ListIterator {

    public static void main(String[] args) {


        // Soru 4) Bir listedeki elementleri iterator kullanarak
        // sondan basa dogru yazdirin
        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        // sondan basa gelebilmek icin
        // once sona gitmek lazim
        System.out.println("listenin ilk hali : " + liste);

        ListIterator lit1=liste.listIterator();

        while (lit1.hasNext()) {
           lit1.next();     // BU LOOP SONA GOTURUR.

        }

        System.out.print("tersten yazilisi : ");
        while (lit1.hasPrevious()) {  // ELEMAN VAR Mİ?
            System.out.print(lit1.previous() +" ");     // ITERATOR YUKLENDİGİ ELEMENTİ YAZDİRİR.
        }















    }
}
