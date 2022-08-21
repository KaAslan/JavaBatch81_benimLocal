package JavaBatch81QA.calisilanlar_KDinlenenler.day04_DataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        /*
        dar veri turundelk, bi,r degeri genis veri turundeki variable'a otomatik olarak assign eder.
         */


        byte sayi1=23;
        short sayi2=55;

        int sayi3=sayi1+sayi2; // 88

        double sayi4=sayi1*sayi2; // 1265.0

        sayi4=sayi2/sayi1; //2.391 ama islem sonucu 2.0 olur. duzeltmek icin (double)sayi2/sayi1 yapmak lazim
        System.out.println(sayi4);//2.0


        sayi4=(double)sayi2/sayi1;
        System.out.println(sayi4); //2.391304347826087






    }
}
