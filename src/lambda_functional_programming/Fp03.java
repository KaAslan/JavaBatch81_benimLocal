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

    //1) T??m elemanlar?? b??y??k harf ile yazd??ran bir method olu??turun.
    //----> 1.YONTEM
    public static void buyukHarfIleYazdir01(List<String> list){
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //----> 1.YONTEM
    /*  BU KOD KAL??C?? OLDUGUNDAN list.replaceAll(String::toUpperCase)
    public static void buyukHarfIleYazdir02(List<String> list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
    */

        //2) Elemanlar?? uzunluklar??na g??re s??ralay??p yazd??ran bir method olu??turun.

        public static void elemanlariUzunlugaGoreYazdir(List<String> list){

            list
                .stream().
                sorted(Comparator.comparing(String::length)). //comparator. Comparing() siralama kosulunu belirmek icin kullanilir
                forEach(Utils::ayniSatirdaBosluklaYazdir);
        }

    //3) Elemanlar?? uzunluklar??na g??re ters s??ralay??p yazd??ran bir method olu??turun.
        public static void uzunlugaGoreTersYazdir(List<String> list){
        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()). //comparator. Comparing() siralama kosulunu belirmek icin kullanilir
                forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //4) Elemanlar?? son karakterlerine g??re s??ralay??p tekrars??z yazd??ran bir method olu??turun.
    public static void sonKaraktereGoreSiralaTekrarsizYaz(List<String> list){

            list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAL)).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

        //5) Elemanlar?? ??nce uzunluklar??na g??re ve sonra ilk karakterine g??re s??ralay??p yazd??ran bir method olu??turun.
    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list){
            list.
                    stream().
                    sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).// siralama yaparken .thenComparing ile ekleme yapilir
                    forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //6) Uzunlu??u 5'ten b??y??k olan elemanlar?? silen bir method olu??turun.
   /* public static void uzunlukBestenBuyukseSil(List<String> list){
            list.removeIf(t->t.length()>5);         //lIST MUTABLE OLD ICIN ELEMANLARI KALICI OLARAK DEG??S??R O YUZDEN YORUMA ALDIM
            System.out.println(list);
        }*/



    //7) ???A???, ???a??? ile ba??layan yada ???N???, ???n??? ile biten elemanlar?? silen bir method olu??turun.

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

    //8) Uzunlu??u 8 ile 10 aras?? olan yada 'o' ile biten elemanlar?? yazd??ran bir method olu??turun.
    /*
    public static void uzunluguSekizIleOnArasiVeOIleBiteniSil(List<String> list){
        list.removeIf(t-> (t.length()>7 && t.length()<11) ||  t.endsWith("o"));
        System.out.println(list);
    }

     */

        //9) T??m elemanlar??n uzunluklar??n??n 12'den az olup olmad??????n?? kontrol eden bir method olu??turun.
        public static boolean uzunlugu12denazMi(List<String> list){


            return list.stream().allMatch(t->t.length()<12);
        }


    //10) Hi??bir eleman??n 'X' ile ba??lamad??????n?? kontrol eden bir method olu??turun.
    public static boolean xIleBaslamiyorMu(List<String> list){

            return list.stream().noneMatch(t-> t.startsWith("X") || t.startsWith("x"));
    }


    //11) Herhangi bir eleman??n 'r' ile bitip bitmedi??ini kontrol eden bir method olu??turun.
    public static boolean rIleBitenVarMi(List<String> list){

            return list.stream().anyMatch(t->t.endsWith("r"));

    }







}
