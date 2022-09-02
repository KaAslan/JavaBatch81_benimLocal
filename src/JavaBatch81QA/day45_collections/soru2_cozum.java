package JavaBatch81QA.day45_collections;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class soru2_cozum {
    public static void main(String[] args) {

        // Soru 2 : Ilk soruya 3.bir islem ekleyelim, set’i Hashset olarak olusturup elemanlari
        //ekleyelim ve sonra TreeSet’e cevirip yazdiralim

        long simdikiZaman = System.currentTimeMillis();

        HashSet<Integer> hset1=new HashSet<>();

        Random rnd=new Random();
        int eklenecekSayi=0;
        while (hset1.size()<100) {
            eklenecekSayi=rnd.nextInt(1000);
            hset1.add(eklenecekSayi);
        }

        System.out.println("olusan hset1 --> " + hset1 );

        HashSet<Integer> hset2=new HashSet<>();
        for (int each:hset1
                 ) {
                hset2.add(each-100);
            }
        System.out.println("cıkarma islemi sonrasi hset2 -->" + hset2);

        TreeSet<Integer> treeSetHali = new TreeSet<>();
        for (int each: hset2
             ) {
            treeSetHali.add(each);

        }
        System.out.println("treeSetHali -->  " + treeSetHali);
            long bitisZamani= System.currentTimeMillis()-simdikiZaman;
        System.out.println("sure : --> " + bitisZamani);
    }
}
