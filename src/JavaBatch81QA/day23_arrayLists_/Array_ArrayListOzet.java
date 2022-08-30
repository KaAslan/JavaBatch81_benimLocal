package JavaBatch81QA.day23_arrayLists_;

import java.util.Collections;



import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
    public class Array_ArrayListOzet {
        public static void main(String[] args) {
        /*                                /-/-/ ARRAY LİST /-/-/
        ArrayList : öğe koleksiyonunu depolamak için, dinamik olarak boyutlandırılmış array'lerdir.
        Bazı sınırlamalar array'den kaynaklı olarak arraylist'e de geçmiştir.
        Array'ler elementleri depolamak ve istediğimiz elementlere ulaşmak, update etmek, listelemek gibi bir çok
        işlemi rahatlıkla yapmamıza imkan tanır.
        Ancak element ekleme veya silemeye izin vermediklerinden kullanıcıların çok tercih etmediği bir yapıdır.
        Array'lerin uzunlukları değiştirilemiyordu. Array'in uzunluğunu değiştirmek istersek dönüştürmemiz gerekiyordu.
           int [] arr = {3,4,5,6};
           Örneğin yukarıdaki array'e 7 elemanını eklemek istersek;
                * java beşinci elemanı bu array'e eklemeyi kabul etmez.
                * dönüşüm uygulamamız gerekiyor.
                * öncelikle yeni bir array oluşturmalıyız.
           int [] yeniArr = new int[arr.length+1];      // 5 elementli yeni bir array oluşturduk.
                                                        // eski array'in uzunluğunu 1 arttırdık.
                * new int [] array oluşturduğumuz için java default değerler atar. int olduğu için [0, 0, 0, 0, 0]
                * for loop kullanarak eski elementleri yeni array'e taşımamız gerekiyor.
                * 4 elemanı taşıdıktan sonra, 5. element (4.indexteki) in yerine 7 elemanını ekliyoruz.
            for (int i = 0; i < arr.length; i++) {
                yeniArr [i] = arr[i];               // eski array'in elemanlarını yeni array'e taşıdık
            }
            yeniArr [yeniArr.length-1] = 7;         // 7 elemanını, 5. index'e ekledik
            arr = yeniArr;                          // eski array'in yeni array'e eşit olması için atama yaptık.
         */
            int [] arr = {3,4,5,6};
            int [] yeniArr = new int[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                yeniArr [i] = arr[i];
            }
            yeniArr [yeniArr.length-1] = 7;
            arr = yeniArr;
            System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 7]
            // *** bu array (arr) aynı isimde ama yeni, farklı bir array'dir.!!!
        /*
        JAVA, ARRAY'LERDEKİ bu dezavantajı ortadan kaldırmak için COLLECTIONS FRAMEWORK'u altında LIST INTERFACE'ini
        oluşturmuştur.
        //-------------------
        Java Collections Nedir?
        Çoğu zaman programlarımızı geliştirirken tek bir öge yerine ögelerden oluşan diziler tanımlamak isteriz.
        Bu tanımlamalarda eğer veri tipimiz aynı ise, eleman sayımız belliyse standart bir dizi tanımlaması
        gerçekleştiriyorduk.
        Söz konusu değerlerin belirsizliği durumunda ise collection framework içerisinde bulunan
        interfaceler ve bu interfacelerden oluşan kurgulardan faydalanırız.
        Bu oluşumların en temelinde List, Set ve Map olmak üzere üç tip yer almaktadır.
        Bu kavramlardan Set ve List, Java Collection interface’ini kullanırken Map kavramı ise ayrı bir tür olarak
        bu yapıdan ayrılır. Bu yapıların bütününü ele aldığımızda ortaya Java Collection Framework çıkmaktadır.
        Konumuzu fazla dağıtmadan asıl sorumuz olan “Java Collections Nedir” sorusuna dönecek olursak;
        verileri saklamak, saklanan veriyi çekmek, işlemek ve zaman zaman sakladığımız yerde çeşitli verileri aramak
        için collections kullanırız.
        Java Interface Nedir?
        Java’da Interface kullanıldığı zaman içerisinde sadece kendi bünyesinden türeyen alt sınıfların kullanılması,
        doldurması zorunda olduğu içi boş bir metot tanımlaması gerçekleştirilen yapılardır.
        Biraz daha akılda kalıcılığı arttırmak için Java Interface Nedir sorusuna cevap olarak kendisinden üretilen
        sınıflar için bir kılavuz, yol gösterici veya gerçekleştirilmesi gereken görevler bütünü gibi örneklendirerek
        bu soruyu cevaplayabiliriz.
        //---------------------
       - ArrayList temelde array yapısında oluşturulmuş olduğundan, esnek uzunluğa sahip bir array gibi düşünülebilir.
       - Bir ArrayList oluşturmak için data türü <> içerisine yazılmalıdır.
                List<String> isimler = new ArrayList<>();
              *** List bir interface olduğundan eşitliğin sağında List değil, bir Class olan ArrayList kullanılmalıdır.
              *** Eşitliğin sağında <> içerisine data türü yazılabilir ama yazılması zorunlu değildir.
              *** Data türü olarak, primitive data türlerini kabul etmez, Wrapper Class'lar kullanılabilir.
              *** Data türü olarak <Object> yazarsanız, farklı data türlerinden elemanları kullanmanıza izin verir,
                  ancak bu durumda List kullanılırken çok fazla cast işlemi yapmanız gerekeceğinden
                  çok tercih edilen birşey değildir.
         // ----------------------- //
         ARRAYLIST DEZAJANTALARI :
         * ArrayList temelde bir array olduğu için elementleri tek tek eklemek zorundasınız.
           Element eklemek için biz bir şey yapmak zorunda olmasak da arka planda Java element ekleyebilmek için
           her seferinde belli işlemler yapmak zorunda olduğundan ArrayList oluştururken tüm elementleri toplu olarak
           girmenize izin vermez.
           Var olan bir ArrayList'e başka bir Collection eklemek veya başka bir Collection üyelerini silmek istediğimizde
           uzunluk baştan hesaplanabildiği için ArrayList bu tür ekleme ve silme yapmamıza izin verir.
         */
            List<String> isimler1 = new ArrayList<>();
            List<String> isimler2 = new ArrayList<>();
            List<String> isimler3 = new ArrayList<>();
            isimler1.add("Ali");
            isimler1.add("Veli");
            System.out.println(isimler1); // [Ali, Veli]
            isimler2.add("Ayse");
            isimler2.add("Fatma");
            System.out.println(isimler2); // [Ayse, Fatma]
            isimler3.add("Ayse");
            isimler3.add("Veli");
            System.out.println(isimler3); // [Ayse, Veli]
            isimler1.addAll(isimler2);
            System.out.println(isimler1); // [Ali, Veli, Ayse, Fatma]
            isimler1.removeAll(isimler3);
            System.out.println(isimler1); // [Ali, Fatma]
            //--------------------------------------------------------------------------//
        /*
        ARRAY'DEN ARRAYLIST YAPMA :  /-/-/  FOR-EACH LOOP Kullanarak List oluşturma /-/-/
        * ArrayList oluştururken elementleri tek tek eklemek istemezseniz, önce bir array oluşturup sonra bu array'i
          ArrayList yapmayi terch edebilirsiniz.
          - Özellikle fazla elementi olan bir liste oluşturmamız gerektiğinde, elementleri tek tek eklemek çok zahmetli
            olacaktır.
          - Array bu konuda daha kullanışlı olduğundan, uzun listeleri önce Array olarak oluşturup sonra ArrayList'e
            çevirmek daha avantajlı olacaktır.
            Örneğin aşağıdaki array'i bir list olarak oluşturmak için 17 satir add() kullanmak gerekir.
                int [] arrx = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6};
            Bunun yerine boş bir liste oluşturup FOR-EACH LOOP ile tüm elementleri bu list'e ekleyebilirsiniz.
         */
            int [] arrx = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6};
            List<Integer> sayilarx = new ArrayList<>();
            for (Integer each:arrx
            ) {
                sayilarx.add(each);
            }
            System.out.println("sayilarx : " + sayilarx); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6]
        /*
        ARRAY'DEN ARRAYLIST YAPMA :  /-/-/ ARRYS.ASLIST() METHOD'U Kullanarak List oluşturma /-/-/
        * Array'den ArrayList yapmak için Arrays.asList() method'u da kullanılabilir ancak bu method'un
          2 BÜYÜK DEZAVANTAJI olduğunu bilmemiz gerekir.
            String [] strarr = {"a","b","c"};
            List<String> harfler = Arrays.asList(strarr);
            System.out.println("harfler : " + harfler); // [a, b, c]
          1-) Bu method ile oluşturlan ArrayList'ler, array'in negatif tarafı olan sabit uzunluk kuralına tabi olurlar
              yani bu listelere ekleme veya silme yapamazsınız
                harfler.add("f");
                harfler.remove ("a");
              Ekeleme veya remove yapmak istediğimizde compile time'de Java problemi göremez, çünkü yapılan işlem
              syntax açısından doğrudur. Fakat çalıştırdığımızda exception ile karşılaşırız.
              (Harfler ArrayList'ini oluştururken, arrays class'ından yardım aldığımız için
              buna array gibi muamele yapıyor.
              Yani her ne kadar ArrayList olsa da, array'in en kötü huyu olan uzunluğunun değişmemesidir.
              Dolayısıyla array'lerin add ve remove özelliğinin olmaması ArrayList'e de geçiyor.)
          2-) Büyük dezavantaj da her ne kadar kaynak olarak kullandığımız strArr ve oluşturduğumuz yeni harfler listesi
              farklı objeler olsa da;
              Java bunları tek bir yapı gibi görür ve birinde yaptığımız değişiklikleri otomatik olarak diğerine de işler.
              Baslangicta strArr : [a, b, c]
              Baslangicta harfler : [a, b, c]
              strArr[0] = "e";                               // arr nin 0. index'indeki elemanı değiştirdik
              Array'i update ettiğimizde strArr : [e, b, c]
              Array'i update ettiğimizde harfler : [e, b, c]
                                                             // !!! sadece array'de değil, harfler arralist'inde de
                                                             // değişiklik yaptı.!!!
              harfler.set(2,"t");                            // list in 2. elemanını "t" yapalım
              List'i update ettiğimizde harfler : [e, b, t]
              List'i update ettiğimizde strArr : [e, b, t]
                                                            // değişikliği yine hem arr'ye, hem de arralist'e uyguladı.
         */
        /*    //~~~~~~~~~~~~~~~~~~~~~~~ARRAYLIST METHODS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        ArrayList Methodları : ArrayList pekçok işlemi kolayca yapabileceğimiz methodlara sahiptir.
        - Bir ArrayList'i yazdırmak kolaydır.
        List<String> isimler = new ArrayList<>();
                                                // Array'i yazdırmak için Arrays class'ından yardım almamız gerekiyordu.
                                                // (System.out.println(Arrays.toString(arr));
        System.out.println(isimler);         // List'in adını yazmamız yeterli (isimler)
                                             // [] (yeni oluşturduğumuz için, içinde hiç element olmadığından çıktı boş)
        isimler.add("Ali");
        isimler.add("Veli");
        System.out.println(isimler);        // [Ali, Veli]
        1-add() methodu : list e eleman eklemek icin kullanilan methoddur.
                          index li de eklenebilir index sizde eklenebilir.
        2-set() methodu : var olan bir elemani baskasiyla degistirmeye yarar.
        3-remove() methodu : belli bir elemanı silmeye yarar iki sekilde yapilir.
            i)--index kullanarak siler
            *** remove (index) method'u, silinen elemanı döndürür.
                Yani method'u System.out.println(hayvan.remove(1)) içinde kullanırsak silinen elemanı ekrana yazdırır.
            ii)--direk elaman belirtilerek, kullanilan ilk yerdeki elemani siler
                *** Not: Index’siz remove( ) method’u true veya false dondurur.
                    System.out.println(hayvan.remove(“kedi”)); //true yani kedi eleman olarak vardi ve sildim
                    System.out.println(hayvan.remove(“tavsan”)); // false yani tavsan eleman olarak yoktu
                                                                 // dolayisiyla silemedim
        4-sort() methodu : elemanlari a dan z ye buyukten kucuge naturel order seklinde siralar.
                           Bunu yaparken """"Collections.sort()"""" seklinde yapar.
        5-contains() methodu : list te bir elemanin var olup olmadigini kontrol eder true ve false olarak dondurur.
        6-get() methodu : List te istenen index teki elemanlari getirir.
        7-size() methou : kac eleman oldugunu verir.uzunlugu da diyebiliriz.
                          Onemli noktasi array in uzunlugunu length verirken Array list te size verir.
        8-clear() methodu : adı ustunde temizlik yapar tum elemanlari siler.
        9-isEmpty methodu : List in ici bos ise true, dolu ise false olarak dondurmeye yarar.
        10-equals() methodu : List lerin yani birden fazla list in icindeki elemanlari kiyaslar
                              Esit ise true degilse false dondurur...
         */
            // Soru uzerinde tum methodları gösterecek olursak...
            // SORU 1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
            List<String> list1 = new ArrayList<>();
            list1.add("A");
            list1.add("C");
            list1.add("E");
            list1.add("F");
            System.out.println("CEVAP 1 : " + list1); // [A, C, E, F]
            // 1. sorunun devaminda sunlar isteniyor
            // indexsiz add() methodunu kullanarak, B yi ekleyiniz.
            // indexli add() methodunu kullanarak, L yi 1 numarali indexe ekleyiniz.
            // ArrayList i ekrana yazdiriniz, list boyle olmali; A, L, C, E, F, B.
            list1.add("B");
            System.out.println(list1); // [A, C, E, F, B]
            list1.add(1, "L");
            System.out.println(list1); // [A, L, C, E, F, B]
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // SORU 2) set() methodu kullanarak, E yi D yapiniz.
            // ArrayList i ekrana yazdiriniz, list boyle olmali; A, L, C, D, F, B.
            list1.set(3, "D");
            System.out.println("CEVAP 2 : " + list1); // [A, L, C, D, F, B]
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // SORU 3) remove() methodu kullanarak, F yi siliniz.
            // ArrayList i ekrana yazdiriniz, list boyle olmali; A, L, C, D, B.
            // Remove un 2 yontemle kaldirilma yolu var. bunlari uygulayalim.
            // 1. yontem ;
            // list1.remove("F"); // bunu aktif edince index degistiginden dolayi bu sekild uygulamis olduk.
            // System.out.println("list1.remove("F") = " + list1.remove("F")); // list1.remove("F") = true
            // System.out.println(list1); // [A, L, C, D, B]
            // 2. yontem ;
            list1.remove(4);
            //System.out.println("list1.remove(4) = " + list1.remove(4)); // list1.remove(4) = F
            System.out.println("CEVAP 3 : " + list1); // [A, L, C, D, B]
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // SORU 4) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
            // ArrayList i ekrana yazdiriniz, list boyle olmali; A, B, C, D, L.
            Collections.sort(list1);
            System.out.println("CEVAP 4 : " + list1); // [A, B, C, D, L]
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // SORU 5) contains() methodu kullanarak, L nin list de var oldugunu ve M nin list de var olmadigini dogrulayiniz.
            boolean sonuc = list1.contains("L");
            boolean sonuc1 = list1.contains("M");
            System.out.println(sonuc); // true
            System.out.println(sonuc1); // false
            // 2. yol ;
            System.out.println(list1.contains("L")); // true
            System.out.println(list1.contains("M")); // false
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // SORU 6) get() methodu kullanarak istenen 2. indexi dondurur
            System.out.println("CEVAP 6 : " + list1.get(2)); // C
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // SORU 7) size() methodu kullanarak, list in kac eleman oldugunu ekrana yazdiriniz.
            System.out.println("CEVAP 7 : " + list1.size()); // 5
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // SORU 8) clear() methodu kullanarak, list deki tum elemanlari siliniz.
            list1.clear();
            System.out.println("CEVAP 8 : " + list1); // []
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // SORU 9) isEmpty() methodu kullanarak, list deki tum elemanlarin silindigini
            // dogrulayiniz
            System.out.println("CEVAP 9 : " + list1.isEmpty()); // true
            // Soru bitti fakat kalan methodu hatirlatma icin yaziyoruz...
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // SORU 10) equals() methodu iki ayri list te ki elamanlari kiyaslayip true veya false
            // dondurur..
            List<String> first = new ArrayList<>();
            List<String> second = new ArrayList<>();
            // iki bos list olusturup esit mi diye sorduk.
            // Bos oldugu icin bize true dondurdu...
            System.out.println("CEVAP 10 : " + first.equals(second)); // true
            // Sonraki adimda first list icine a harfi ekleyip sorunca false dondurdu.
            first.add("a"); // first'e a harfi ekledik.
            System.out.println(first.equals(second)); // false
            System.out.println(first); // [a]
            System.out.println(second);// []

    }

}
