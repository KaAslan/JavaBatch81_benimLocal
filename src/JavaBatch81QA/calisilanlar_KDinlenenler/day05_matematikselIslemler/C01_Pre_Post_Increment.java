package JavaBatch81QA.calisilanlar_KDinlenenler.day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=sayi1+1 ; // sayi 2 --> 11 olur.

        sayi2+= 5 ; // 16 olur.

        /*
        pre veya post increment /decrement
        sadece ++ ve -- islemleri icin gecerlidir.
        bu 2 islem icin sayidan sonra veya once yazilmasina gore farkli 2 isleyis olur.

         */

        int sayi3=sayi2++; // sari kapladi. kullanilmadigi icin. 1 islem : sayi2 bir arttirilacak
                            // 2.islem : sayi2 degeri sayi3 e atanacak

        System.out.println("sayi3 : " + sayi3); //  16
        System.out.println("sayi2 : " + sayi2); //  17


        /*
        eger ++ veya -- variabledan once ise buna pre ıncrement denir.
        bu durumda o satirda yapilan 2 islem ıncelikli olan arttırma veya azaltmadır.

        ++ veya -- variabledan sonra olursa buna post ıncrement denir.
        bu durumda o satirda yapilan iki islem arttırma veya azaltma islemi sonuncudur.
         */
        int sayi4=++sayi1; //// 1 islem : sayi1 bir arttirilacak
        // 2.islem : sayi1 degeri sayi4 e atanacak
        System.out.println("sayi4 : " + sayi4); //  11
        System.out.println("sayi1 : " + sayi1); //  11

    }
}
