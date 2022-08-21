package JavaBatch81QA.calisilanlar_KDinlenenler.day05_matematikselIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi=10;
        System.out.println("Pre-Increment  : "+ ++sayi); //11

        System.out.println("Post-Increment  : "+ sayi++); // 11

        System.out.println("Post_ıncrementten sonra sayi : " + sayi); //12 -->9. satırda once yazdırdı sonra 1 arttırdı.
                                                            //1 arttırdıgı icin sayi nın degeri 12 oldu.
                                            // 11. satırda artmıs olarak sayi yi yazdirdik

        sayi++; // 13 oldu

        ++sayi; // 14

    }
}
