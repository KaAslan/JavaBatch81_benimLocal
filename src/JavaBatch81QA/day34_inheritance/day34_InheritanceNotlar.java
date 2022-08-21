package JavaBatch81QA.day34_inheritance;

public class day34_InheritanceNotlar {

    // parent class <--> super class
    // child class <--> sub class
    //IS-A ( ) & HAS-A ( ) Relationship

    // child classin 1 parenti olur. ve zincirleme asagi yada yukari devam eder.
    //child class --> parent class--> grand parent-->grand grand parent

     /*
       Single Inheritance;
    Java Single Inheritance kabul eder.
     Bir child class’in sadece bir tane parent class’i olabilir .
*/

    /*
    Multilevel Inheritance;
    Java Inheritance zincirini kabul eder. Bir child class’in sadece bir tane parent class’i olabilir
(ve onun parent class zinciri).
     */

    /*
    Hierarchical Inheritance
Birden fazla class ayni class’i parent olarak kullanabilir.
yani farkli 3 child classin 1 tane parent classi olabilir. 3 farkli class extends --> 1 class
     */


    //Inheritance - bir sayfayi baska bir sayfaya extend etme
        // child class parent classtaki ozellelliklere dogustan sahiptir.
        // parent class ta olmayan ozelliklere sahip olabilirler.
        // parent classta var olan bazı özellikleri kendileri icin update edebilirler

    //bir class'dan olusturulan objeler baglanti yapilan class'a gore farkli ozellikler gosterebilir.
    //Java'da inheritance, bir objenin/class’in baska bir objenin/class’in tüm özelliklerini ve
    //davranışlarını elde ettiği bir mekanizmadır.

    // Inheritance variable'dan cok methodlarla ilgilidir.
    // *** child classlar ozelliklerini inherit etmek istedikleri classi kendilerine parent edinirler.
    // child classtan , hangi classın parent class olacagi belirlenir.
    // bir classi parent edinmek icin extends keyword kullanilir.
    // class declaration satirinda ---> public class Isci extends Personel


    //  BİR CLASS BASKA BİR CLASSI PARENT EDINDIGINDE,
    //1. PARENT CLASSINDAKİ TUM OZELLİKLERE (variable + method) OTO. OLARAK SAHİP OLUR
    //2. PARENT CLASSTAKİ OZELLİKLERDEN BAZİLARİNİ KENDİNE UYARLAYABİLİR.(VARİABLE METHOD UPDATE)
    // 3. PARENT CLASSTA OLMAYAN BAZİ YENİ OZELLİKLER OLUSTURABİLİR.
    // NOT. child class, parent classdaki ozelliklerden hicbirini reddedemez ama degistirebilir.


    /*
    EXTEND KEYWORD-- bir classi parent edinmek icin EXTEND keyword kullanilir.

    --> extend edildikten sonra, extend edinilen(bulunulan) sayfadan obje uretilir.
    -> objeyi, obje olusturdugumuz class adi (icinde bulundugumuz)ile yapariz.(ONCEDEN SOURCE CLASS ADI İLE OBJE YAPIORDUK)
     otomatik olarak extend keyword ile parent classin ozelliklerini(variable,method) alir.

                                package day34_inheritance;
           Class Declaration--> public class Isci extends Personel {
           Main method-->       public static void main(String[] args) {

OBJ. DECLARATION-->***   Isci isci1=new Isci();
                         Isci1.maas=20;
                         isci1.maasHesapla();           }

            // Eger parent class olacak sekilde tasarladigimiz class varsa, veya ileride bu clasi
            parent yapmak isteyenler olabilir diyorsaniz o zaman variable ve methodlarin Access
            modifierini ******  PROTECTED  ****** yapariz.
            PROTECTED-- sadece inheritance icin vardir.************(Encapsulationda private yapariz getter setter ile ulasiriz)
            Parent classlarda olusturulan variable ve methodlarin access modifierini PROTECTED
            yaparak o variable ve methodlari sadece child classlarin kullanimina acariz.


            --> ENCAPSULATIONda(getter setter) variable ve methodlari PRIVATE yaparken
            ---> INHERITANCE icin variable ve methodlari PROTECTED yapariz. ayrica INSTANCE variable/method kullaniriz
            --> parent classta private variable ya da method yaparsak, child classta o variable/methodu goremeyiz.
            --> ayni sekilde parent ve child class farkli package'larda ise
            parent class'daki default access modifieri olan class uelerini child classdan kullanamayiz.

            Inheritance sayesinde yazılan bir code’un tekrar tekrar
            kullanılabilmesi (reusability) mümkün olur.

            Geneli kapsayan class uyeleri parent class’a,
            daha spesifik olanlar ise child class’larda olusturulur.

            NOT 1: Child classlar public ve protected data’lari problemsiz bir sekilde inherit edebilir.
            NOT 2: Private data’lar inherit edilemez.
            NOT 3: Default data’lar child ve parent ayni package’da olduklari zaman inherit edilebilirler.
            NOT 4: Static Methods veya variable’lar inherit edilemezler.

            Inheritance’in faydalari nelerdir?
            1: Tekrarlardan kurtuluruz
            2: Daha az kod yazarak islemlerimizi yapabiliriz
            3: Kolayca update yapabiliriz
            4: Application’in bakimi ve surdurulmesi (maintenance) kolaylasir

            Nicin Inheritance kullaniriz ?
               Inheritance sayesinde parent olarak tanimlanan
                class(ve onun parent class’larindaki) protected/public
                class uyelerini kullanabiliriz(reusability).


            TUM CLASSLARIN BABASI OBJECT CLASSDIR
            Java’da, butun class’lar Object Class’dan inherit ederler
        Object Class butun class’larin parent’idir ve Object Class parent’i olmayan tek class’dir.




     */

}















