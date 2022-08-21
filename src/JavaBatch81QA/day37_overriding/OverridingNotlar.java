package JavaBatch81QA.day37_overriding;

public class OverridingNotlar {
    /*
    Overriding
Ayni isimde farkli iki method olusturmanin iki yolu vardir
1- Method Signature’ini degistirerek ayni isimde farkli iki method yapmak
Overloading
2- Method Signature’ini degistirmeden iki method’dan sadece birinin calismasini saglamak
Overriding

     Overloading signature'larini degistirerek ayni isimde 2 metodd olusturmaktır
     ekleme(parametreler);  /   ekleme(farklı parametreler) -->>OVERLOADING

     *** Farkli classlarda ayni isim ve signature a sahip metodlar olusturabiliriz. cunku her bir classs kendi
     icinde calisir.

        @Iverride notasyonu varsa, parent classtaki metodu selersek CTE verir. metod degil @override
        notasyonu CTE verir.
         notasyon metodlarin birbiri
        ile kontrolunu saglar.

        @override notasyonu yazmak mecburi degildir. istersek yazmayabiliriz. metod silinince CTE vermesini
        istiyorsak o zaman yazariz


        @Override kullanmak zorunda degiliz, istersek silebiliriz. Ancak kodun anlasilabilir ve
        okunabilir olmasi icin degil, overridden method’da degisiklik yapildiginda Java’nin
        rapor etmesi icin kullanilmasi tercih edilir.

        ** private metodlar override edilemez. eger child classta parent classdaki private method ile ayni signature'da
        bir method olusturursaniz bu overriding method olmaz

        super.marka() (method icine) yazarsak hem overridden hem de overriding methodu calistirabilrz

        access modifier konusunda parent classdaki metodun(overridden ) modifierindan daha dar olamaz.
        parent class daha genis olmali.
        COCUK BABAYİ SINIRLAYAMAZ



        POLYMORPHISM
        OLuşturulan nesnelerin gerektiğinde kılıktan kılığa girip başka bir nesneymiş gibi
davranabilmesine polymorphism diyebiliriz


    ***actigimiz bir class icinde baska classlar acabiliriz. ama PUBLİC yapamayiz. bir sayfada bir tek
PUBLIC olur


     */


}
