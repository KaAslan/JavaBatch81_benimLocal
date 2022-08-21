package JavaBatch81QA.day24_arrayLists_ForEachLoop_odevYap;

public class OdevSorularCozum1 {
    public static void main(String[] args) {

        /*
        Soru 1:
        Bir integer array olusturunuz
        ve bu array’deki tum sayilarin carpimini For each loop         kullanarak bulunuz.
         Sonucu ekrana yazdiriniz.
         */

        int []arr={1,2,3};

        int carpimToplam=1;
        for (int each:arr
             ) {
            carpimToplam*=each;

        }
        System.out.println("tum sayilarin carpimi : " +carpimToplam );
    }
}
