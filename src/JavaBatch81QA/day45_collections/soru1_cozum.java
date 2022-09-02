package JavaBatch81QA.day45_collections;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Timer;
import java.util.TreeSet;

public class soru1_cozum {
    public static void main(String[] args) {

        // Soru 1 : Bir TreeSet ve HashSet’e random 100 sayi ekleyin, islem surelerini kiyaslayin
       //--------- HashSet ile 100 sayi ekleyip zaman ölçme----------
        long startTime = System.currentTimeMillis();

        HashSet<Integer> hasSet1=new HashSet<>();
        int sayi=0;
        Random rnd= new Random();
        while (hasSet1.size()<100) {
            sayi=rnd.nextInt(1000);
            hasSet1.add(sayi);
        }

        long estimatedTime = System.currentTimeMillis() - startTime;

        System.out.println("olusturulan hashSet --->  " + hasSet1+"\n" +
                "hashset olusturma suresi ---> " + estimatedTime);



        //-------------------------------------------------------------------------
        // --------- HashSet ile 100 sayi ekleyip farkli sekilde zaman ölçme----------



        LocalTime baslangic=LocalTime.now();

        HashSet<Integer> hasSet2=new HashSet<>();
        int sayi2=0;
        Random rnd2= new Random();
        while (hasSet2.size()<100) {
            sayi2=rnd2.nextInt(1000);
            hasSet2.add(sayi2);
        }
        LocalTime bitis=LocalTime.now();

        System.out.println("olusturulan hashSet2 --->  " + hasSet2+"\n" +
                "hashset2 olusturma suresi ---> " + (bitis.getNano()-baslangic.getNano()));

        // -----------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------
        //---------------- TreeSet ile 100 sayi ekleyip zaman ölçme---------------------------------------------

        long startTime1 = System.currentTimeMillis();

        TreeSet<Integer> treeSet1=new TreeSet<>();
        int eklenenSayi=0;
        Random randomSayi= new Random();
        while (treeSet1.size()<100) {
            eklenenSayi=randomSayi.nextInt(1000);
            treeSet1.add(eklenenSayi);
        }
        long estimatedTimeTreeSet = System.currentTimeMillis() - startTime1;

        System.out.println("olusturulan treeSet1 --->  " + hasSet1+"\n" +
                "treeSet1 olusturma suresi ---> " + estimatedTimeTreeSet);

        // -----------------------TreeSet ile 100 sayi ekleyip farkli sekilde zaman ölçme ----------------

        LocalTime baslangic2=LocalTime.now();

        TreeSet<Integer> treeSet2=new TreeSet<>();
        int eklenenSayi2=0;
        Random randomSayi2= new Random();
        while (treeSet2.size()<100) {
            eklenenSayi2=randomSayi2.nextInt(1000);
            treeSet2.add(eklenenSayi2);
        }
        LocalTime bitis2=LocalTime.now();

        System.out.println("olusturulan treeSet2 --->  " + hasSet1+"\n" +
                "treeSet2 olusturma suresi ---> " + (bitis2.getNano()-baslangic2.getNano()));

   }
}
