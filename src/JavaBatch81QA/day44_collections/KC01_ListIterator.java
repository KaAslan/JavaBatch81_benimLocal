package JavaBatch81QA.day44_collections;


import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class KC01_ListIterator {

    /*
        Soru 3)
        Bir listedeki istenen sayi araliginda olmayan elementleri
        silen bir program yaziniz
        (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
        Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        output: [23,40]
             */
    public static void main(String[] args) {


        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println(liste); // [2, 13, 56, 23, 45, 14, 40]

        ListIterator lit1=liste.listIterator();

        int basSinir =30;
        int bitSinir=40;
        while (lit1.hasNext()) {
            Integer temp=(Integer)lit1.next();
            if (temp<basSinir || temp>bitSinir ) { // if (lit1.next()<basSinir || lit1.next()>bitSinir )
                   lit1.remove();                 // YUKARIDAKİ OLMAZ CUNKU .next() METODU HER CALİSTİGİNDA
                                                  // İTERATOR BİR SONRAKİ ELEMENTİ SECER
            }
        }
        System.out.println(liste);













    }
}
