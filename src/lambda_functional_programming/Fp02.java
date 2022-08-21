package lambda_functional_programming;

import jdk.jshell.execution.Util;
import lambda_functional_programming.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1)  t-> "Logic" , (t, u)-> "Logic" (t-> bunun ardina bir islem koyuyoruz yani logic.bu yapiya lamda expression denir)
        Bu yapıya "Lambda Expession"
    2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
       "Lambda Expession" yerine "Method Reference" tercih edilir.
    3) "Method Reference" kullanımı "Class Name :: Method Name"

       Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
       Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
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

        listElemanlariniYazdirFunctional(liste);

        System.out.println();
        System.out.println("citListElemanlariniYazdirFunctional :");
        citListElemanlariniYazdirFunctional(liste);

        System.out.println();
        System.out.println("tekElemanlarinKareleriniYazdir");
        tekElemanlarinKareleriniYazdir(liste);

        System.out.println();
        System.out.println("tekrarsizTekElemanlarinKupunuYazdir");
        tekrarsizTekElemanlarinKupunuYazdir(liste);

        System.out.println();
        tekrarsizCiftElemanlarinKareToplami01(liste);

        System.out.println();
        tekrarsizCiftElemanlarinKareToplami02(liste);

        System.out.println();
        tekrarsizCiftElemanlarinKareToplami03(liste);

        System.out.println();
        TekrarsizCiftElemanlarinKupununCarpimi(liste);

        System.out.println();
        getMaxEleman(liste);

        System.out.println();
        getMinEleman(liste);

        System.out.println();
        yedidenBuyukCiftMinDeger(liste);

        System.out.println();
        tersSıralamaylaTekrarsizElemanlarinYarisi(liste);
    }



    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //2) Ardışık çift list elemanlarını aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional )

    public static void citListElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){
        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    //1.Yontem
        public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer> list){
        Integer toplam= list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0,Math::addExact);
// yada list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
            System.out.println("1.yontem toplam tekrarsizCiftElemanlarinKareToplami01  " +toplam);
        }//2.Yontem
    public static void tekrarsizCiftElemanlarinKareToplami02(List<Integer> list){
        Integer toplam= list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
// yada list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println("2.yontem toplam tekrarsizCiftElemanlarinKareToplami01  " +toplam);
    }

    //3.Yntem
    public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer> list){
        Integer toplam= list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0,Integer::sum);
// yada list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println("3.yontem toplam tekrarsizCiftElemanlarinKareToplami01  " +toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void TekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list){
        Integer carpim=list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(" TekrarsizCiftElemanlarinKupununCarpimi = " + carpim);

    }


    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman(List<Integer> list){
        Integer max=list.stream().distinct().reduce(Math::max).get();
        System.out.println("getMaxEleman : " +max);
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    public static void getMinEleman(List<Integer> list){
        Integer min = list.stream().distinct().reduce(Math::min).get();

        System.out.println("get min eleman  = " + min);
    }


    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
        public static void yedidenBuyukCiftMinDeger(List<Integer> list){
        Integer yedidenBuyukeleman=list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemaniSec).reduce(Math::min).get();
            System.out.println(" yedidenBuyukCiftMinDeger   "+ yedidenBuyukeleman);
        }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
        public static void tersSıralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){
        List<Double> sonuc=list.
                stream().// gerekli methodlari kullanmamizi saglar.bir akis acar
                distinct(). // tekrarli olanlari almaz
                filter(t->t>5). // kosula gore filtreleme yapar
                map(Utils::yarisiniAl). // herbir elemanin degerini degistirmeye yarar
                sorted(Comparator.reverseOrder()). // siralama yapar
                collect(Collectors.toList());   // elamanlari collection'a cevirir.
            System.out.println("tersSıralamaylaTekrarsizElemanlarinYarisi" + sonuc);
        }




}