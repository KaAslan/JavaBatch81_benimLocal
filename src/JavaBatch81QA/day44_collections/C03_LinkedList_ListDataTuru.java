package JavaBatch81QA.day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {


        LinkedList<String> ll1=new LinkedList(); // data turunden dolayi linkedList teki tüm metodlari kullanir.

        List<String> ll2=new LinkedList(); // data turunden dolayi sadece list interface'inde
                                            // olan metodlari, ozellikleri kullanir.

        Queue<String> ll3=new LinkedList();//data turunden dolayi sadece queue ozellikleri gosterir. q
        // queue ozllikli bir list elde edilir

        Deque<String> ll4=new LinkedList();// data turunden dolayi deque ozelliklerinin ağıt bastigi,
        // ama linked oldugu icin birbirine baglı halay seklinde bir List elde edersin

/*
        ------>  List<String> ll2=new LinkedList();
 */

        ll2.add("Berk"); // list data turunde linkedlist'e ekleme yapiyoruz
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");
        System.out.println(ll2); // [Berk, Done, Enes, Ayse]
/*
        .remove() kullanirken dikkat etmeliyiz cunku remove() icine int bir parametree girersek,bunu
        object algılayp listte olan sayigi silebiliyordu. o yuzden cozum olarak int bir listte silinecek
        elemani variable ile atayarak silebilirdik.
        .remove(index: 3); --> bize sildigi elementi doner--> Ayse
        .remove (o: "Enes")--> true / false doner
        alltaki notta da ayni seyi yazdık.
 */

        System.out.println(ll2.remove(3)); // Ayse
        // eger Listemiz Integer elementlerden olusuyorsa
        // direk sayi yazarsak index olarak kabul eder
        // bir variable'a atama yapar ve remove'da o variabe'in ismini yazarsak obje olarak kabul eder
        System.out.println(ll2.remove("Kemal")); // false

        System.out.println(ll2.isEmpty()); // false

        ll2.set(1,"Serap");
        System.out.println(ll2); // [Berk, Serap, Enes]
        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1); //[Berk, Ismail]

        ll2.retainAll(ll1); // ll2 deki tum elementleri ll1 ile karsilastirir
        // ll1'de olmayanlari siler---> iki listeyi karsilastirir, ortak elemanlari saklar, farkli olanlari siler

/*
---->>>>   iki listeyi  karsilastirir, ortak elemanlari saklar, farkli olanlari siler   <<<<<------
*/
        System.out.println(ll2); // [Berk]
        System.out.println(ll2.hashCode()); // 2066939
        ll2.add("Fatih");
        System.out.println(ll2.hashCode()); // 131726141
    }
}
