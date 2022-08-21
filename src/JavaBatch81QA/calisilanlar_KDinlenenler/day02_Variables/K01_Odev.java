package JavaBatch81QA.calisilanlar_KDinlenenler.day02_Variables;

public class K01_Odev {
    public static void main(String[] args) {

        /*

            2 - isim ve soyisim icin iki variable olusturun ve bunlari
                isminiz : Mehmet
                soyisminiz : Bulutluoz
                    seklinde yazdirin
            3 - Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
            4 -  Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
            5 - char data turunde bir variable olusturun ve yazdirin
            6 - Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
         */


        System.out.println(" ************ Soru 2 *************");

        String isim="Mehmet";
        String soyisim="Bulutlu";

        System.out.println("isminiz : " + isim);
        System.out.println("isminiz : "+ soyisim);

        System.out.println();
        System.out.println("isminiz : " + isim + "\nsoyisminiz : " + soyisim);


        // soru 3
        System.out.println();
        System.out.println(" ************ Soru 3 *************");
        int sayi1=5;
        int sayi2=4;

        System.out.println("sayilar toplami : " + sayi1 + sayi2);

        //soru 4
        System.out.println();
        System.out.println(" ************ Soru 4 *************");
        int sayi3=6;
        double sayi4=6.1;

        System.out.println("Sayilar toplami : " + sayi3 + sayi4);

        // sayi 5
        System.out.println();
        System.out.println(" ************ Soru 5 *************");
        char ilkHarf='A';
        System.out.println("Alfabenin ilk harfi : " + ilkHarf);


        //soru 6
        System.out.println();
        System.out.println(" ************ Soru 6 *************");
        int sayi8=15;
        char sonHarf='Z';

        System.out.println("bir int ve bir char toplam : " + sayi8+sonHarf);





    }
}
