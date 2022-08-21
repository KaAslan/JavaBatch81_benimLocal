package JavaBatch81QA.calisilanlar_KDinlenenler.day04_DataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=50;
        byte sayi2= (byte) sayi1;

        System.out.println(sayi2); // 50



        /*
        Genis datra turundeki degeri, dar ddata turunendeki variable'a atamak isterseniz
        Java sizin genis data turundeki degerin, dar data turunun
        sinirlarina uyup uymayacaginni calistirana kadar bilemez
        amm Java risk almaz
        riski sıfıra indirmak icin burada bir sorun olursa
        sorumlullugu kabbul etmenizi bekler
        bunun icin degerin onune parantez icerisinde istedigimiz data turunu yazmamiz yeterlidir.


        Bu riski ustlendigimizde, 3 durum olusabilir.
        1. bizim degerimiz dar kalip degerlerine uygun olursa hic kayip olmadan cast olur
        2. double bir sayiyi integer a cast etmek gibi durumlarda data kaybı yasanabilir.
        3. genis kalibtan degeri dar kaliba koydugunuzda sinirlari asan durumlarda veri baskalasabilir.

         */



    }
}
