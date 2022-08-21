package JavaBatch81QA.calisilanlar_KDinlenenler.day10_stringManipulation;

public class C01_charAt {

    public static void main(String[] args) {


        String str= "Java ogrenmek ne guzel";

        System.out.println(str.charAt(0));  // ilk harfi yazdirir. J

        System.out.println(str.toUpperCase().charAt(7));  // R

        System.out.println(str.charAt(21)); // l  son harf(str.length-1)

        System.out.println(str.charAt(22)); // StringIndexOutOfBoundsException     String index out of range: 22  HATA MESAJI

        /*
        Son harfi bulmak icin str'in uzunlugunun 1 eksigini gireriz.
        eger inndex olarak uzunlugu veya daha büyük bir sayiyi girersek Java EXCEPTION verir.


         */

        // charAt() metodu kullandıgımızda sonuc char olacagi icin artik manipulation yapamyiz.
        // Ornegin. str.charAt().toUpperCase ----->>>> OLMAZ. YAPAMAYİZ
        //  String metodlarindan kullanmamiz gereken bir metod varsa chatAt()'den once kullanmaliyiz









    }
}
