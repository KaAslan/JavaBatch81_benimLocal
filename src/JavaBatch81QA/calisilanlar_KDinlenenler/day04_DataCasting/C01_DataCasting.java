package JavaBatch81QA.calisilanlar_KDinlenenler.day04_DataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

        char harf='a';
        // char yeniHarf=harf+1;  // kod bu durumda once sagdaki islemi yapar
                                //char yeniHarf=97+1=98
                                // char bir variable 98 olamaz java hata veir.

        char yeniHarf=(char)(harf+1);


        System.out.println(yeniHarf);
            /*
            bazen bir variablea olusturuldugu data turu didindan deger atanabilir. bunlardan bazisini
            java otamatik olarak kabul eder.


              java eger bu deger atamasinda sorun olusacagini ( data kayiplarinin olabilecegi veya
              datanin baskalasabilecegini ) gorurse bu durumda otomatik olarak bu atamayi kabul etmez
              sizden eger bu atamayi yapmak istiyorsaniz sorumlulugu almanizi bekler.
             */
        int sayi1=(int)7.3;
        System.out.println("sayi1 int deger = " + sayi1); //

        double sayi2=10; //10.0
        System.out.println("sayi2 : " +sayi2);

        int sayi3='c';
        System.out.println("sayi3 : " +sayi3); //99

        char harf2=98;
        System.out.println("harf2 : " + harf2); // b


    }

}
