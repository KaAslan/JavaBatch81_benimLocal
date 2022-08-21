package JavaBatch81QA.calisilanlar_KDinlenenler.day15_overloading_forLoop;

public class K03_Overloading {
    public static void main(String[] args) {

        toplarMisin(5,6);
        toplarMisin(5.2,5);
        toplarMisin(3.4,6.1);



    }

    private static void toplarMisin(int sayi1, int sayi2) {
        System.out.println("iki integer toplami : " + (sayi1+sayi2));
    }
    private static void toplarMisin(int sayi1, double sayi2) {
        System.out.println("bir integer ve bir double toplam : " + (sayi1+sayi2));
    }

    private static void toplarMisin(double sayi1, double sayi2) {
        System.out.println("iki double toplam: " + (sayi1+sayi2));
    }

}
