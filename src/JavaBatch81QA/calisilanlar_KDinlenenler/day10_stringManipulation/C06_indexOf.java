package JavaBatch81QA.calisilanlar_KDinlenenler.day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o"));   // 5
        System.out.println(str.indexOf('g'));   // 6
        System.out.println(str.indexOf("t"));   // --> Integer dondurur.
                                                // int'de yok diye bir sayi bulunmuyor
                                            // 0 dersek J'nin indexidir.
                                            // - bir deger donerse biz aranan stringin str'da olmadigini anlariz
                                            // Java -1 dondurmeyi tercih etmistir.

        System.out.println(str.indexOf("t")); //---> -1 dondurur

        String str5="asdasdhkjahsdahdpjkahsdjahsdjhaksjdklajskjdaksjdakjsd;asdasdads";
        // str5 de p harfi kullanilmis midir? ---->
        if (str5.indexOf("=")==-1){
            System.out.println("str5 de istenen harf kullanilmamis");
        } else{
            System.out.println("str5de istenen karakter kullanilmis");
        }




    }


}
