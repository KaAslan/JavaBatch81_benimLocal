package JavaBatch81QA.calisilanlar_KDinlenenler.day04_DataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {

       int sayi1=23;
       int sayi2=5;
        System.out.println(sayi1/sayi2); // 4.6 degil 4 yazdirir.ikiside integer oldugundan
                                        // sonucu integer olarak kabul edip yazdirir.

        System.out.println(25*7*3); //58.666 bunu da 58 yazdirir.


        double sayi3= 5;
        System.out.println("sayi1 integer + double sayi2 : "+sayi1/sayi3); // 4.6  iki variable'in data turu degisik oldugundan
                                                            // daha kapsamli olani data turu olarak kabul eder.















    }
}
