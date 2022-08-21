package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class K01_Lists {
    public static void main(String[] args) {

        List<Integer> sayilarList=new ArrayList<>(); //--> sadece ici bos list olusturma
        System.out.println("list : " + sayilarList);   // []

        int arr[]=new int[5]; //--->5 elementli array olusturma
        System.out.println("arr : " + Arrays.toString(arr)); // [0, 0, 0, 0, 0]
        //*********************
        // hadi liste eleman ekleyelim
        sayilarList.add(5);
        sayilarList.add(6);
        System.out.println("Liste eleman ekledikten sonra : " +sayilarList);

        // arrayede ekleyelim
            arr[0]=4;
            arr[1]=5;
            arr[3]=10;
        System.out.println("arrye eleman ekledikten sonra " +Arrays.toString(arr));

        //***********
        System.out.println("listenin boyutu  :  " + sayilarList.size());
        System.out.println("arr'nin boyutu   :  " + arr.length);

        //************
        System.out.println("sayilar eleman update : " + sayilarList.set(1,155));
        // --- > SOUT İCİNDE YAZİNCA BİZE SİLDİGİNİ GETİRDİ.
        //** silinen eleman lazim olursa set() metodundan sonra .add() ile baska liste kullanilabilir
        System.out.println("list update edilmis hali : " + sayilarList);



    }
}
