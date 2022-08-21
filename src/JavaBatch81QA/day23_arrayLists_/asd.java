package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class asd {
    public static void main(String[] args) {

        String []isimler=new String[4];
        isimler[0]="enes";
        isimler[1]="zeynep";
        isimler[2]="kagan";
        isimler[3]="hale";

        System.out.println("array isimler : " + Arrays.toString(isimler));


        // yukarida ki arrayi liste donusturmek icin
        // 1. teker teker ekleyebiliriz.--isimlerListesi.add(isimler[0])
        //2. for loop ile --
        //3.Collections.addAll() ile.

        //arrayin donuturecegim list altta
        List<String> isimlerListesi=new ArrayList<>();

        //Collections.addAll() ile.
        Collections.addAll(isimlerListesi,isimler);//addAll(Listenin adi , array adi)
        System.out.println(isimlerListesi); //[enes, zeynep, kagan, hale]



    }
}
