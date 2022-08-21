package JavaBatch81QA.day23_arrayLists_;

import java.util.ArrayList;
import java.util.List;

public class K03_indexOf {
    public static void main(String[] args) {

        List<String> urunlerListesi = new ArrayList<>();

        urunlerListesi.add("elma");
        urunlerListesi.add("karpuz");
        urunlerListesi.add("limon");
        urunlerListesi.add("portakal");

        System.out.println(urunlerListesi);
        // [elma, karpuz, limon, portakal]

        System.out.println("urunler listesinden index bilgisi  "+
                urunlerListesi.indexOf("portakal"));





    }
}
