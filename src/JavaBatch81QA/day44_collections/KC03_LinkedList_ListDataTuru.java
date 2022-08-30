package JavaBatch81QA.day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KC03_LinkedList_ListDataTuru {

    public static void main(String[] args) {

        LinkedList ll1=new LinkedList();

        List<String> ll2=new LinkedList<>(); // list ozellerini gosterir. list interface'inde olan
                                            // methodlari kullanir

        Queue<String> ll3= new LinkedList<>();  // queue ozelliklerini gosterir.

        Deque<String> ll4 = new LinkedList<>(); // Deque ozellerine sagip linkedlist

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println(ll2);  // [Berk, Done, Enes, Ayse]
        System.out.println(ll2.remove(3)); // Ayse
        System.out.println(ll2); // [Berk, Done, Enes]
        // eger listemiz Integer elementlerden olusuyorsa direk sayi olarak yazarsak
        //index olarak kabul eder. bir variable'a atama yapar ve remove()'da
        // o variable ismini yazarsak obje olrak kabul eder
        System.out.println(ll2.remove("Enes")); // False
        System.out.println(ll2.isEmpty()); // false
        System.out.println(ll2);
        System.out.println(ll2.set(1,"serap")); // Done
        System.out.println(ll2); //[Berk, serap]

        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println("ll1 'de neler war"+ll1); // Berk, Ismail]
        System.out.println("ll2 de ne var "+ll2); // [Berk, serap]
        ll2.retainAll(ll1); // ll2 deki tum elementleri ll1 ile karsilastirir. ll1'de olmayanlari siler
        System.out.println("ll2 de simdi ne var "+ll2);

        System.out.println(ll2.hashCode()); //2066939
        ll2.add("Fatih");
        System.out.println(ll2.hashCode()); //131726141
    }
}
