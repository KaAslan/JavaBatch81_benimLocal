package JavaBatch81QA.day42_abstractClass_interfaces;

public interface I02_Interfaces {
   int SAYI=30;
   String ISIM="Yildiz Koleji";
    /*
     Interface bir class degildir

     Abstract class'lar java'da abstraction(Soyutlastirma / Kural koyma)
     islevini yapiyordu
     Ancak abstract bir class'da abstract olmayan method'lar da olabilir
          bu da full abstraction yapmaya izin vermez

     Eger Java'da icinde hic concrete method olmasin
     dedigimiz bir class olusturmak istiyorsaniz
     bunu class degil Interface yapmalisiniz.

     1- INTERFACE'LERDE CONCRETE METHOD OLMAZ

     2- Interface'lar full abstraction yaptigindan Interface'lerden obje olusturulamaz

       Hatirladiginiz gibi Interface olan List'den direk obje olusturamiyorduk
       List<String> liste = new List<>();  calismaz
       Bunun yerine constructor'i List'in child'i olan ArrayList'den seceriz
       List<String> liste = new ArrayList<>();

    3- Class'larda bir child birden fazla parent edinemez
       Ancak Interface'lerde concrete method olmadigindan
       biz her methodu child class'da override etmek zorundayiz,

       Override ederken kimin soyledigini override ettigimizin onemi yok
    4- Interface'ler neyin yapilmasi gerektigini soyler
       ama nasil yapilacagina karismaz
     */

   //    void vitess();  // aslinda bunu interface de java otomatik olarak public abstract void vites(); kabul eder
   //    public void akuu(); // public abstract akuu();
   //    abstract void tekerr(); // --> public abstract void tekerr();
    //    public abstract void motorr();

    /*
    biz public yada abstract keywordunu yazsakta yazmasakta java hep public abstract kabul eder
         */

    //    int SAYI1=40;                      // hepsi static
    //    public int SAYI2=40;                //hepsi final
    //    public static int SAYI3=40;         //hepsi public kabul eder java
    //    public static final int SAYI4=40;


}
