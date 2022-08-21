package JavaBatch81QA.calisilanlar_KDinlenenler.day15_overloading_forLoop;

public class K01_ReturnMethod {
    public static void main(String[] args) {

        // verilen iki sayiyi carpip
        // sonucu bize donduren bir method olusturun

        int sayi1=10;
        int sayi2=6;

        int sonuc=carpGetirsen(sayi1,sayi2);


    }

    private static int carpGetirsen(int sayi1, int sayi2) {
        int sonuc=sayi1*sayi2;

        return sonuc;
    }
}
