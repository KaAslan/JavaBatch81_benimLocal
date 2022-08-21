package JavaBatch81QA.day24_arrayLists_ForEachLoop_odevYap;

import java.util.ArrayList;
import java.util.List;

public class K_nettenSorular1 {
    public static void main(String[] args) {

/*
Write a method that returns the average of a list of integers.
bir integer listinde ortalamayi donduren bir method yaziniz.

 */

        List<Integer> sayilarList = new ArrayList<Integer>();

        sayilarList.add(100);
        sayilarList.add(100);
        sayilarList.add(100);
        sayilarList.add(100);
        sayilarList.add(100);
        sayilarList.add(120);
        sayilarList.add(120);
        sayilarList.add(120);
        sayilarList.add(120);
        sayilarList.add(120);
        
        listteOrtBul(sayilarList);



    }

    private static int listteOrtBul(List<Integer> sayilarList) {

        int listinOrtalamasi=0;
        int sayac=0; // ortalama isleminde kaca bolecegimi bulmak icin
        for (int each :sayilarList
             ) { listinOrtalamasi+=+each;
                    sayac++;
        }listinOrtalamasi=listinOrtalamasi/sayac;

     return listinOrtalamasi;
    }
}
