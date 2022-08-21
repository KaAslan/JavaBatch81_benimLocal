package JavaBatch81QA.day32_stringBuilder;

public class notlarStringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java Candir");
        //ilk kurulumda en fazla capacity bunda olur +16 karakter yeri ekler
        StringBuilder sb3=new StringBuilder(10);



        sb1.length(); // varolan karakter sayisini doner
        sb1.capacity(); // girebilecegimiz karakter sayisi doner

        sb1.append("app"); //append metodunda indexe gore ekle yoktur.sona ekler
        sb1.append(5);// ne tur eklenirse eklensin string strong old icin stringe donusturur
        sb1.append(2.4);
       // capacity baslangicta belirtilmezse 16 karakterlik bir yer yapar.
        //deklare edersek istedigimiz karakter sayisina gore capacity yapar.
        //hafiza yonetimi icin Sb capacity onemlidir.
        sb1.insert(1,"ekle"); // istenen indexe ekleme yapar.


            sb1= new StringBuilder("application");// yeni deger atama

        sb1.reverse(); // --> tersine cevir.
        System.out.println(sb1);


        //String bir inputu / variable'i StringBUilder yapmak icin
        String input="   Deneyerek gorelim";
        sb1.append(input); // String ifadeyi StringBuildera ekledi. Ya da yeni sb olusturup parametre olarak Stringi yazabilirz.
        System.out.println(sb1); //noitacilppA   Deneyerek gorelim
        sb1.reverse();
        System.out.println(sb1); // milerog kereyeneD   Application --> tersineCevrildi
        sb1.toString(); // string ifade doner. string builderin kendisini donusturmez

        String str1= sb1.toString(); //Stringi SBYE donusturme

        int sayi=12314;
        sb1.append(sayi);   // int sayi sb1'e eklendi.   SADECE SONA EKLER

        String isim="ali";
        //***************
        sb1.append(isim,2,4);//--> isim variable'nin 2.index ve 4. index arasini sona ekleme yapar.


        System.out.println(sb1);

        //___________________C04_______________________

        sb1.substring(0,3);// string doner. SringBuilder'i degistirmez cunku String immutable
                            //   sout icinde yazmaliyiz ya da atama yapmaliyiz
        System.out.println(sb1); // milerog kereyeneD   Application12314

        sb1.subSequence(0,3); // char sequence döner buda SringBuilder'i degistirmez. atama yapmaliyiz
            // subSequence ile substring farki ne ? cok bri fark yok


//_______________C05__________________
        sb1.indexOf("app"); // int doner. index olarak yerini doner
        sb1.indexOf("e",10); // 10dan sonra e ara

        sb1.lastIndexOf("a",5);  // int doner. index olarak yerini doner
        sb1.lastIndexOf("a",5); // 5 ten basa dogru 'a' ara

        sb1.compareTo(sb2); // 35 dondu. iki SB kiyasla.
        //2 StringBuilder’in tum karakterlerinin esitligini
        //kontrol eder. (0 ise esit)
        // degilse harflerin asci degerleri arasindaki farki verir. Sonraki degerleri kontrol etmez

        System.out.println(sb1.equals(sb2)); // false dondu. string deki .equals metodu gibi degildir


          //  ------------------C06--------------------
        //String metodlari SB de kullanabilirz ama String in immutable old. unutma

        sb1.replace(0,1,"A"); // verilen index araligini "A" ya degistirir.
        System.out.println(sb1);

//--------------------C07---------------
        sb1.delete(0,20); // .delete () parametre olarak baslangic indexi ve bitis indexi yazilir.
        // verilen index araligini siler SB DONER
        sb1.deleteCharAt(0); // girilen index sil --SB DONER
        System.out.println(sb1);

//--------------------C08----------------------


        StringBuilder sb8=new StringBuilder("Java");
        StringBuilder sb9=new StringBuilder("Jave");
        String str="Java";

        System.out.println( sb1.equals(str)); // false verir. farkli 2 obje
        // SET SİLER VE YERİNE EKLER. INSERT SAGA KAYKIL DER
        sb1.setCharAt(3,'k'); // StringBuilder’da istenen index’deki
        //karakteri istedigimiz karakter yapar.
        System.out.println("sb1asd " + sb1);

        sb1.trimToSize(); // StringBuilder’in capacity ile length’ini esitler.

        sb8.compareTo(sb9); // 2 StringBuilder’in tum karakterlerinin esitligini kontrol eder. (0 ise esit)

        System.out.println(sb8.compareTo(sb9)); // -4 ( 2 harfin ascii kodlari arasindaki fark)

        /*
         StringBuilder sb8=new StringBuilder("Java");   -->
        StringBuilder sb9=new StringBuilder("Jave");  -->son harf fakli
        compareTo metodu 2 SB'i bastan baslayarak harf harf karsilastirir. ilk harfler ayni ise 2ye gecer.
        2. harf ayni ise 3. harfe gecer. ilk farkli olan harfe kadar gider.
        farkli olan 2 harfin ascii kodlari arasindaki farki verir.

        eger hic farkli harf yoksa sonuc olarak sıfır(0) dondurur. AYNI İSE SIFIR

         */

        //-------------------------OOP CONCEPT--------------------------
        // GUNCEL HAYATİN JAVADA KOPYA EDİLİSİDİR:)
        // kimlerin nereye erisebilecegini 2 yolla belirleriz.
        //  1- Access Modifier     1- Private   2- Default    3- Protected      4- Public
            //PRIVATE - sadece olusturuldugu class uyeleri ulasabilir.

            // DEFAULT - (yazmasakta java oto atar) Icınde old. packagedakiler ulasabilir.
            // variable basinda DEFAULT yazmaz, yazmaya gerek yok.

            //PROTECTED -  class uyeleri, package ve bizim clasimizin child classlari ulasir.
            // baska package altindaki bu classin child classi olmayanlar ulasamaz

            // PUBLIC  - Herkes ulasabilir.

        //* classlar sadece public ve default olabilir.

        //-------------------ENCAPSULATION(DATA HIDING)-----------------


     }

}
