package JavaBatch81QA.day36_inheritanceDataTypeKullanimi;

public class day36_inheritanceDataTypeKullanimiNotlar {
    /*
    Bir obje olusturuken Data turu ve constructor ayni class'dan ise direk o clasaa gidiyorduk.
    ordaki variable ve metodlari kullaniyorduk

    BMuhasebe isc1=new DIsci(); ---> OLURSA ONCELİKLE BMuhaseve classina gider.
    --> burda biz isci olusturuyoruz new DIsci(); ama Bmuhasebe classindan tanımliyoruz. iscinin
    muhasebe classindaki ozellliklerini istiyorum

    BMuhasebe isc1=new DIsci();
    *** EGer data turu ve constructor farkli ise;
    obje constructorin oldugu classin objesidir.
    ancak, bizden istenen
    Isci classindaki spesifik ozellikler degil
    bir iscinin muhasebe classindaki tum calisanlarla beraber sahip old. genel ozellikleri isteriz.

    BMuhasebe isc1=new DIsci();
    isc1.gunlukMesai; --> isci classinda gunlukMesai olsa bile, BMuhasebe classina gidecek ordakini verecek
    İsc1.sigorta()--> Bmuhasebe classinda yok ve parentin dan gidip alacak

        **objec olusturugumuz classta yani data turu olan classta aradigimiz variabşe veya metod yoksa parenta gider
         amaaaaa parent da yoksa CTE verir

         List<String> list1=new LinkedList<>();
         Deque<String> list1=new LinkedList<>();
        Queue<String> list1=new LinkedList<>();
            Hepsi LİnkedLİst olsada
            list1 list gibi davranir
            List2 Deque gi davraniz
            List3 Queue gibi davranir.

        --------> OVERRIDING<---------------------

   OOVERRIDING -- child classtaki bir metodun
   parent classtaki ayni isimdeki metodu
   etkisiz hale getirerek
   kendisinin spesifik ozelligini ortaya cikarmasidir

    Overridingi nerede dikkate aliyoruz?
    bir obje olusturulurken data turu ve constructor farkli ise

    eger bir obje olusturulurken data turu ve constructor farkli ise
    objenin ozelliklerini belirlerken 3 konuya dikkat cekmeliyiz

    1. obje constructor'ın oldugu classta olusur
    
    2. objenin ozelliklerini aramaya data turunun oldugu classdan baslar
    bu classta aranan ozellik yoksa parent class'lara bakilir.
    orada bulamazsak CTE verir.

    eger aranan ozellik variable ise bulunan ilk degeri yazar.

    3. aranan ozellik metod ise;
        BMuhasebe yh1=new yanHizmetliler();
        - aramaya Bmuhasebe classindan baslar
        - aranan ozellik variable ise bulunan ilk variable yazilir
        - aranan ozellik metod ise degeri yazdirmadan once override edilmis mi diye
        kontrol etmeliyiz.(etkisiz hale getirilmişmi)
        eger OVERRIDE edilmisse en guncel degeri yazar

        aranan metod objenin olusturuldugu sayfada varsa (yani method override edlmiş)
        objenin olusturuldugu sayfadan metodu calistirir.

        Overriding, aranan ozellik metod ise java objenin data type ı neyse o classa gider, arar ve
        sayfalari asagi dogru arar.(asagi dogru arama sadece overriding de olur.)
         eger constructorun oldusturuldugu sayfada metodu bulursa onu yazar.


     */
}
