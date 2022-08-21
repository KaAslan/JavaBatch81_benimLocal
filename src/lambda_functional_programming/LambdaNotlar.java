package lambda_functional_programming;

public class LambdaNotlar {
    // -------------------- DAY1----------------------------------------
    /*
    structural eski java kodlari, functional lambda kodlari
    Lambda java kodlarinin daha basitlestirilmis hali diyebiliriz.
    Lambda da var olan methodlar sayesinde kodları uzun uzun yazmaya gerek kalmiyor.
    Lambda da hard coding yoktur. ozellikle basit kodlar icin kullanilir
    Lambda’lar öncelikle kod miktarını azaltmak, daha sade, açık ve az kod yazmamızı sağlarlar.



   1) .stream() --> akışa sokma metodu.--> (list.stream().forEach(t-> System.out.print(t +" ")); <--
   forEach(t-> .. t (degisken)variable'ni al ve kullan)
    t --> burda lamda expression'dir
    .stream()'den sonra nokta koyarak stream() metodu ile kullanabilecegimiz metodlari gorebilirz.

   2)  .stream().forEach(t-> ...) ==> akısa giren her bir elemani al ve islemi uygula


     .stream neler ile kullanilabilir? sadece list ile mi ? --> collection dedigimiz yapilarla



   3)  .stream().filter(t-> .....) ==> listin elemanlarini filtreye sokma
    list.stream().filter(t->t%2==0).forEach(t-> System.out.println(t+" "));

    4) .map() --> //Elemanlarin degerleri degisecekse .map() metodu kullanilir.
            list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print( t+" " ));
        Map, stream içerisinde erişilen her bir nesneye özgü işlemler yapmamızı sağlar.
        Örneğin elinizde rakamlar olan bir liste var map ile her rakamın karesini alabilir
        veya farklı matematiksel işlemler yapabilirsiniz.

    5).distinct() --> tekrarsiz(eşsiz) olanlari al.(distinct kelime anlami belirgin demek)

    6).reduce(identity 0,(t,u)->t+u); --> gelen coklu elementi, tek bir elemente dusurme. reduce() de t,u yani 2 degisken yazilir.
    t =0 baslangic degeri oluyor. o yuzden 0sıfır yazilir.
        ilk once 0 - t'ye deger olarak atanir.
        sonra u'ya koddan gelen kodlar atanir.
        t boylece her seferinde t artarak devam eder.

        .reduce() Bir veri setinde sırayla işlem yapmak istiyorsanız ve
        bir önceki yaptığınız işlemi de dahil etmek istiyorsanız
        reduce metodunu kullanabilirsiniz

        atomic yapı--> her class icin bir amac -- her amac icin bir method
        page object model

    7) sorted()-- natural ordera gore sıralama- sorted() parantez icinde Comparator (Kıyaslayici) kullanilabilir.sort parantez icinde Comparator yaz sonra nokta

    8)filter() filtreleme filter(t-> t......) filter icine && ile daha cok secenek filtre eklenebilir.

    Integer minValue=list.stream().distinct().sorted().filter(t -> t%2==0).filter(t-> t>7).reduce(Integer.MAX_VALUE,(t,u) -> t<u ? t : u);
        System.out.println("minValue : " + minValue);

     list.stream().distinct().sorted().filter(t ->   t%2==0    &&   t>7  ).reduce(Integer.MAX_VALUE,(t,u) -> t<u ? t : u);
     yukarıdaki gibi de olur. filter() icine && ile filtre cogaltilabilir.

     9).sorted(Comparator.reverseOrder()) --> sort sirala komutudur.parantez icine Comparator yazip noktaya basarsak kullanilabilecek methodlar cikar.
     Lambda da tersten sıralama(buyuktyen kucuge)  metodu budur. normal sort() kucukten buyuge siralar

     10) .findFirst() - siralamada ilk olani doner.
     .findFirst() oncesinde sort(Comparator.ReserveOrder) yaparsak bize en buyuk yani natural ordera gore en sondakini doner

     11).get() --> kod satirindan gelen degeri almak icin kullanilir.

     12)collect(Collectors.toList()) --> collect kodu topla demektir. hepsini bir yere topla.
        Collectors.toList() --> bunu demezsek gelen degerler bosta kalir. toList listeye topla

        AraNotlar
    1)  t-> "Logic" , (t, u)-> "Logic" (t-> bunun ardina bir islem koyuyoruz yani logic.bu yapiya lamda expression denir)
        Bu yapıya "Lambda Expession"

    2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama ONERİLMEZ
       "Lambda Expession" yerine "Method Reference" tercih edilir.

    3) "Method Reference" kullanımı ------->>>>>> Class Name :: Method Name --->DİKKAT methodIsımden sonra parantez yok cunku :: kullandik.
    Eger classAdi.methodAdi yazsaydik () koyardı.

     Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
       Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
                                                                                 System.out::print


     13) anyMatch() herhangi bir eslesiyor mu
        allMatch(t->t.length()<12) --> hepsinin uzunlugu 12'den kucuk mu
        noneMatch(t-> t.startsWith("X") || t.startsWith("x") -hicbiri eslesmiyorsa

    14)IntStream.range(7,101) 7 dahil 101 haric araligi al
    IntStream.range(7,101).reduce(Math::addExact).getAsInt();

    15)getAsInt() int olarak al

    16)sum() topla

    Pojo
    Plain Old Java Object





     */
}
