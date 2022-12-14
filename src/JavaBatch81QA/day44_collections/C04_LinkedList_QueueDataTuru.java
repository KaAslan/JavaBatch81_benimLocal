package JavaBatch81QA.day44_collections;

import java.util.LinkedList;
import java.util.Queue;
public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
                 Queue<String> ll3=new LinkedList();
                        ll3.add("Adem");
                        ll3.add("Zeynep");
                        ll3.add("Hpolat");
                        ll3.add("Kadir");

        // Queue kuyruk demektir, sira onemlidir
        // gelen sona gelir, giden bastan gider

        System.out.println(ll3); // [Adem, Zeynep, Hpolat, Kadir]
        System.out.println(ll3.remove()); // Adem
        System.out.println(ll3); // [Zeynep, Hpolat, Kadir]
/*
       .remove()--> normal kullanimdan farklidir. icine parametre istemez. direk ilk elementi
       siler.Silinen elementi dondurur.
*/
        System.out.println(ll3.remove("Hpolat")); // true
        System.out.println(ll3); // [Zeynep, Kadir]


        System.out.println(ll3.element()); // Zeynep  ---> ilk elemani dondurur. List bos ise throws exception
        System.out.println(ll3.peek()); // Zeynep   ----> ilk elemani dondurur. List boş ise null doner

        Queue<String> ll4=new LinkedList();
        // System.out.println(ll4.element()); // throws exception NoSuchElementException
        System.out.println(ll4.peek()); // null
        // peek ve element silmeden ilk elementi bize dondurur
        // aralarindaki fark bos liste olursa peek null doner, element exception firlatir


        ll3.offer("Ahmet");// SONA EKLEME YAPAR. icine parametre ister.
        ll3.offer("Sefa");
        System.out.println("offer()SONA EKLE metodu sonrasi ile "+ll3); // [Zeynep, Kadir, Ahmet] +Sefa

        System.out.println("poll() İLK INDEXDEKİ ELEMENTİ SİLER VE DONER :" + ll3.poll());
        // Zeynep  -->  İLK ELEMENTİ SİLER VE ONU DONER

        System.out.println("poll() sonrasi :"+ ll3); // [Kadir, Ahmet, Sefa]

        //System.out.println(ll4.remove()); // throws exception NoSuchElementException
        System.out.println("BOS LISTEDE ilk elementi sil poll() NULL VERİR :" + ll4.poll()); // null





    }
}