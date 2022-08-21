package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

    /*
        1) Lambda (Functional Programming) Java 8 ile kullanilmaya başlanılmıstır.

        2)Functional Programming "Ne yapılacak"(What to do ) üzerine yogunlasılır.
        Structered Programming "Nasil yapılacak" (How to do)üzerine yogunlasir.

        3) Functional Programming Arrays ve Collections ile kullanılır.

        4) "entrySet()" metodu ile Map, Set'e donusturulerek Functional Programming'de kullanılabilir.

         */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        //1) Ardışık liste elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);

        System.out.println();
        ciftElemanlariYazdirStructered(liste);

        System.out.println();
        System.out.println("Functional cift sayilar : ");
        ciftElemanlariYazdirFunctional(liste);

        System.out.println(      );
        System.out.println("tek sayi olan elementlerin karesi functional");
        tekElemanlarininKareleriniYazdir(liste);

        System.out.println();
        System.out.println("tekrarsiz Tek Elemanlarin Kupu functional");
        tekrarsizTekElemanlarinKupunuYazdir(liste);

        System.out.println();
        System.out.println("tekrarsiz Cift Elemanlarin Kare Toplami");
        tekrarsizCiftElemanlarinKareToplami(liste);

        System.out.println();
        System.out.println("tekrarsizCiftElemanlarinKupununCarpimi");
        tekrarsizCiftElemanlarinKupununCarpimi(liste);

        System.out.println();
        System.out.println("getMaxEleman");
        getMaxEleman01(liste);

        System.out.println();
        getMaxEleman02(liste);

        System.out.println();
        getYedidenBuyukMin1(liste);

        System.out.println();
        getYedidenBuyukMin2(liste);

        System.out.println();
        getYedidenBuyukMin3(liste);

        System.out.println();
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);

        System.out.println();
        minBul(liste);


    }
    public static void listElemanlariniYazdirStructured(List<Integer> list){
        for (Integer w : list) {
            System.out.print(w+" ");
        }
    }
    //1) Ardışık liste elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t +" ")); // forEach(t-> .. t (degisken)variable'ni al ve ....
        // --> list.forEach(t-> System.out.print(t+" ")); --> bu sekilde de olabilir

        //* stream() metodu collection'dan elementleri akışa dahil etmek icin ve metodlara ulasmak icin kullanilir

    }

    //2)çift sayi olan list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructered(List<Integer> list){
        for (Integer w : list){
            if (w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //2)çift sayi olan list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" ")); // verilen listeyi filtreler
                                            // ve forEach ile yazdirir.
    }

    //3) Ardışık tek sayi olan list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarininKareleriniYazdir(List<Integer> list){

      //Benim yaptgim-->  list.stream().filter(t-> t%2!=0).forEach(t->System.out.print( t*t+" " ));
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print( t+" " ));
        //Elemanlarin degerleri degisecekse .map() metodu kullanilir.
    }

    ///4) Ardışık tek list elementlerinin küplerini
    // tekrarsız olarak aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.

public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
        //==>listi al streame sok.tekrarsiz elemani al.filtrele.degeri degistir.

}

    //5) Tekrarsız çift elemanlarin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){
      //yada -->  System.out.println(list.stream().distinct().filter(t->t%2==0).map(t-> t*t).reduce(0,(t,u)->t+u));
       Integer toplam= list.stream().distinct().filter(t->t%2==0).map(t-> t*t).reduce(0,(t,u)->t+u);
        Integer ttoplam= list.stream().distinct().filter(t->t%2==0).map(t-> t*t).reduce((t,u)->t+u).get(); // -->>BU DAHA KOLAY
        // reduce(0,(t,u)->     ) -->t baslangic degeri o yuzden sifir atadik.
        System.out.println(toplam);


    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list){
        Integer carpim=list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u) -> t*u);
        System.out.println(carpim);

    }

        //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    //1.YONTEM
    public static void getMaxEleman01(List<Integer> list){
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u) -> t>u ? t : u);
        // sonda ternary yaptik(t>u ? t : u).reduce coklu gelen elemani teke indirgeme, integer min value cunku en kucuk sayi
        //
        // Integer max = list.stream().distinct().reduce(list.get(0),(t,u) -> t>u ? t : u); -->BUDA OLUR
        System.out.println(max);
    }
    //2.YONTEM
    public static void getMaxEleman02(List<Integer> list){
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        //sorted() oldugu icin son dger en buyuk sayi olacak
        System.out.println("max Eleman 02 = " + max);
    }
    //Odev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    public static void minBul(List<Integer> list){
        int minSayi=list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)-> u);
        System.out.println("Kendi yaptigim min sayi (soru 8) :  " + minSayi);
    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void getYedidenBuyukMin1(List<Integer> list){
        Integer minValue=list.
                stream().
                distinct().
                sorted().
                filter(t -> t%2==0).
                filter(t-> t>7).
                reduce(Integer.MAX_VALUE,(t,u) -> t<u ? t : u);
        System.out.println("minValue : " + minValue);

       // list.stream().distinct().sorted().filter(t ->   t%2==0    &&   t>7  ).reduce(Integer.MAX_VALUE,(t,u) -> t<u ? t : u);
        // yukarıdaki gibi de olur. filter() icine && ile filtre cogaltilabilir.
    }

    // 2.YONTEM
    public static void getYedidenBuyukMin2(List<Integer>list){
        Integer min= list.
                stream().
                distinct().
                filter(t-> t%2==0)
                .filter(t-> t>7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE,(t,u)->u);


        System.out.println("getYedidenBuyukMin2 : "+ min);
    }
    // 3.YONTEM
    public static void getYedidenBuyukMin3(List<Integer>list){
        Integer min =list.
                stream().
                distinct().
                filter(t->t>7).
                sorted().
                findFirst().
                get();

        System.out.println("getYedidenBuyukMin3 = " + min);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların
    // yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {

        List<Double> sonuc = list.
                stream().
                distinct().
                filter(t -> t > 5).
                map(t -> t / 2.0).
                sorted(Comparator.reverseOrder()). //--> buraya sadece toList()'de yazilabilir.
                collect(Collectors.toList()); //==> toList()

        System.out.println("TersSiralamaylaTekrarsizElemanlarinYarisi  : " + sonuc);
    }



}
