package JavaBatch81QA.day42_abstractClass_interfaces;

public interface I03_Interfaces {

     int SAYI=20;

     /* int sayi;
        interface'lerde tum variable'lar public static ve final'dir
        dolayisiyla sonradan deger atama sansimiz yoktur
        bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz

        Bir interface bir class'i parent edinemez
      */

    /*
       Interface icerisindeki her method
       public ve abstract  ozelliklerine sahiptir

       abstract bir method'un body'si olmasi mumkun degildir
       Java sonradan developer'larin istegi uzerine
       kismi bir update yapmistir.

       Bir interface'e sonradan bir abstract method eklerseniz
       o interface'i daha once implement etmis tum class'lara gidip
       hepsinde yeni eklenen method'u override etmeniz gerekir
       Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir.

       Bunun icin Java Java8'den itibaren
       interface'lere sonradan body'si olan method eklenmesine izin vermistir.

       Bu method'larin body'si olsa da Interface'in yapisi geregi
       bu method'lara concrete denmez
       body'si olan bu method'lar istisna olarak kabul edilebilir.
     */

    // void yakit();  //--> interface'de bu sekilde yazimi kabul ediyor. kendisi bunu abstract ve public kabul ediyor

    // public void motor();  //--> bunu da kabul ediyor. public silinebilir diyor.
    // public abstract void teker(); //--> public ve abstract silinebilir diyor

     /*
     public void aku(){} --> method bodysi olunca kabul etmiyor
      static public void aku(){} --> kabul ediyor static yazinca
      */

     /*
     java boyle bir sistem gelistirmis. eger interface'e sonradan bir method eklemek istyorsan
     ve bunun eski sistemi bozmasini istemiyorsan o zaman boyle yapabilirsin demis.
     bunun icin DEFAULT yada STATIC keywordu kullanilir.

     static public void aku(){}
*/











}
