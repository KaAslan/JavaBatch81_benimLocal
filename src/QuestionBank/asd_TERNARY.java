package QuestionBank;

public class asd_TERNARY {
    public static void main(String[] args) {

       /*
       Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

            Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

            Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

            Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
             negatifse sayinin karesini yazdirin

            Soru1 : Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam” ,
             100’den kucukse “iki basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin

            Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
                buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin
        */


        //soru 1  Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        int sayi1=15;
        int sayi2=12;
        String sonuc= sayi1>sayi2  ?  "buyuk olan sayi"   : "buyuk olmayan sayi";
        System.out.println(sonuc);

        //soru2 Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

        int alinanSayi=25;
        String sonuc1=alinanSayi%2==0 ? "cift sayi" : "tek sayi";
       System.out.println(sonuc1);

       // soru3  Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
        int mDegersayi=98;

        int mDegerSonuc= mDegersayi>=0 ? mDegersayi : (-1 * mDegersayi);
        System.out.println("mutlak deger : " + mDegerSonuc);

        // Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
        //                buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin


        char harf='3';
        String kucukHarfmi=harf>='a' && harf<='z'  ?  "kucuk harf" :
                harf>='A' && harf<='Z' ? "bUYUK HARF" : "girdiginiz karakter harf degiİ";

        System.out.println(kucukHarfmi);



    }}
