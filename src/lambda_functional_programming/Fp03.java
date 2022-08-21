package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        System.out.println();

        System.out.print("Buyuk harfle yazdir01 : ");
        buyukHarfIleYazdir01(liste);

        System.out.println();
        System.out.println();
        System.out.println("elemanlariUzunlugaGoreYazdir : ");
        elemanlariUzunlugaGoreYazdir(liste);
        System.out.println();

        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();

        System.out.println();
        sonKaraktereGoreSiralaTekrarsizYaz(liste);
        System.out.println();

        System.out.println();
        System.out.println("uzunlukVeIlkHarfeGoreSiralaYazdir : ");
        uzunlukVeIlkHarfeGoreSiralaYazdir(liste);
        System.out.println();

        /*
        System.out.println(        );
        System.out.println("uzunlukBestenBuyukseSil(");
        uzunlukBestenBuyukseSil(liste);
        System.out.println();
        */

        /*
        System.out.println();
        uzunluguSekizIleOnArasiVeOIleBiteniSil(liste);
        */
        System.out.println();
        System.out.print("uzunlugu12denazMi :");
        System.out.println(uzunlugu12denazMi(liste));

        System.out.println();
        System.out.println("xIleBaslamiyorMu  : "+ xIleBaslamiyorMu(liste));

        System.out.println();
        System.out.println("rIleBitenVarMi  :  "+rIleBitenVarMi(liste));


      /*
      System.out.println();
        System.out.println("baslangiciAyadaSonuNolaniSil02");
        baslangiciAyadaSonuNolaniSil02(liste);
*/
       /*
       System.out.println();
        System.out.println("baslangiciAyadaSonuNolaniSil");
        baslangiciAyadaSonuNolaniSil01(liste);
*/
       /*
       System.out.println();
        System.out.println();
        System.out.print("buyukHarfIleYazdir02  :  " );
        buyukHarfIleYazdir02( liste);
        */






    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    //----> 1.YONTEM
    public static void buyukHarfIleYazdir01(List<String> list){
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //----> 1.YONTEM
    /*  BU KOD KALİCİ OLDUGUNDAN list.replaceAll(String::toUpperCase)
    public static void buyukHarfIleYazdir02(List<String> list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
    */

        //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.

        public static void elemanlariUzunlugaGoreYazdir(List<String> list){

            list
                .stream().
                sorted(Comparator.comparing(String::length)). //comparator. Comparing() siralama kosulunu belirmek icin kullanilir
                forEach(Utils::ayniSatirdaBosluklaYazdir);
        }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
        public static void uzunlugaGoreTersYazdir(List<String> list){
        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()). //comparator. Comparing() siralama kosulunu belirmek icin kullanilir
                forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void sonKaraktereGoreSiralaTekrarsizYaz(List<String> list){

            list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAL)).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

        //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list){
            list.
                    stream().
                    sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).// siralama yaparken .thenComparing ile ekleme yapilir
                    forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
   /* public static void uzunlukBestenBuyukseSil(List<String> list){
            list.removeIf(t->t.length()>5);         //lIST MUTABLE OLD ICIN ELEMANLARI KALICI OLARAK DEGİSİR O YUZDEN YORUMA ALDIM
            System.out.println(list);
        }*/



    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

    //1.YONTEM
    /*
    public static void baslangiciAyadaSonuNolaniSil01(List<String> list){
        list.removeIf(t-> t.charAt(0) == 'A' || t.charAt(0) =='a' || t.charAt(t.length()-1) =='N' || t.charAt(t.length()-1) == 'n' );
        System.out.println(list);

    }
*/
    //2.YONTEM
    /*public static void baslangiciAyadaSonuNolaniSil02(List<String> list){
        list.removeIf(t-> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n") );
        System.out.println(list);

    }*/

    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları yazdıran bir method oluşturun.
    /*
    public static void uzunluguSekizIleOnArasiVeOIleBiteniSil(List<String> list){
        list.removeIf(t-> (t.length()>7 && t.length()<11) ||  t.endsWith("o"));
        System.out.println(list);
    }

     */

        //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
        public static boolean uzunlugu12denazMi(List<String> list){


            return list.stream().allMatch(t->t.length()<12);
        }


    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean xIleBaslamiyorMu(List<String> list){

            return list.stream().noneMatch(t-> t.startsWith("X") || t.startsWith("x"));
    }


    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rIleBitenVarMi(List<String> list){

            return list.stream().anyMatch(t->t.endsWith("r"));

    }







}
