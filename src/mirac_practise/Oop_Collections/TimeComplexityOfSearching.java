package mirac_practise.Oop_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TimeComplexityOfSearching {
    public static void main(String[] args) {

        List<Integer> arrayList1 = new ArrayList<>();
        List<Integer> linkedList1 = new LinkedList<>();

        // yukarida ki listlerin icine belirli miktarda sayi girelim ve sonra istedigimiz bir sayiyi aratalim ve sureyi karsılastiralim.

        Random r = new Random(); // rastgele sayi uretme

        long endTime;
        long startTime;
        long estimatedTime;
        double second;  // System.currentTimeMillis() milisaniyeyi saniyeye donusturmek icin kullanicaz
        int a=0; // her loopta degiseck sayi


        for (int i = 0; i < 100000; i++) {
           a=r.nextInt(100); // 100'e kadar farkli sayilar ekleyecek
           arrayList1.add(a);
           linkedList1.add(a);
        }

        arrayList1.add(200);// aratacagimiz sayiyi manuel girdim
        linkedList1.add(200);


        startTime=System.currentTimeMillis();

        for (int e: arrayList1
             ) {
            if (e==200){
                endTime=System.currentTimeMillis();
                estimatedTime=endTime-startTime;
                second=(double)estimatedTime/1000;
                System.out.println("arrayList1'de 200 sayisini " + second + " saniyede buldum.");
            }

        }

        //LinkedList icin de yapalim
        startTime=System.currentTimeMillis();

        for (int e: linkedList1
        ) {
            if (e==200){
                endTime=System.currentTimeMillis();
                estimatedTime=endTime-startTime;
                second=(double)estimatedTime/1000;
                System.out.println("linkedList1'de 200 sayisini " + second + " saniyede buldum.");
            }

        }




    }
}
