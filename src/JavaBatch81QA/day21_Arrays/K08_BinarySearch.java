package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;

public class K08_BinarySearch {
    public static void main(String[] args) {

        int[] sayilarListesi={1,9,5,56,25,13};

        // binary search yapmadan once mutlaka .sort() yap
        int aranacakSayi=5;


        Arrays.sort(sayilarListesi); // sayilarListesi arrayini kucukten buyuge (natural ordera) gore siraya koyduk ama atamadik o yuzden
                                    // sonra yeniden ayni array kullanirsak sirali OLMAYACAK
                                    // BUNU ENGELLEMEK ICIN --> AYNİ ARRAYE SIRAYA KONMUS ARRAYİ ATAMALİYİZ. ASAGİDAKİ GİBİ

        System.out.println("siraya konmus array : " + Arrays.toString(sayilarListesi));

        Arrays.binarySearch(sayilarListesi,aranacakSayi);

        System.out.println("aranan sayinin indexi : "+Arrays.binarySearch(sayilarListesi,aranacakSayi));





    }
}
