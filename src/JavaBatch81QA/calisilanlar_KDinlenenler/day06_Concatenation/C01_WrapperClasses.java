package JavaBatch81QA.calisilanlar_KDinlenenler.day06_Concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
        wrapper classs javanin hazir metodlari kullanabilmemiz icin primitive data turlerinin herbiri icin actigi classlardir.

         */

            String str="Java ile hayat ne guzel";
            System.out.println(str.toUpperCase()); // JAVA İLE HAYAT NE GUZEL

            boolean guzelMi= true;
            /*
            guzelMİ. yazdigimizda hic bir metod gelmiyor cunku boolean primitive oldugundan
            hazir metodu bulunmuyor. bunun yerine b buyuk yazinca cikiyor.

            int --> Integer
            char --> Character
            digerleri primitive data turu ile ayni, sadece bas harfleri buyuk
             */


            Boolean guzelMii=true;
            guzelMii.toString();

        System.out.println(Short.MIN_VALUE);  //-32768  MIN.VALUE --> ile datalarin min degerini gorebiliriz
        System.out.println(Short.MAX_VALUE );      // 32767

        String ogrNo="123456";

        /*
        kullanicidan bir sifre isteyin.
        eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim. (hoca cozmedi)

                 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");

        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);
        //Integer.parseInt()  String olarak tanımlanmış tamsayıları Integer
        // veri tipine dönüştürmek için kullanılır

        System.out.println("girilen sifre: "+ sifre );
        System.out.println("Integer sifre (matematiksel sayi integer): "+ sifreSayi);

        System.out.println("****************");
        System.out.println("girilen sifrenin 3 fazlasi: "+ (sifre+3) ); // 125003
        System.out.println("Integer sifre (matematiksel sayi integer)'nin 3 fazlasi : "+ (sifreSayi+3)); //125003

        /*
        wrapper classlar ileride kullanabilecegimiz pek cok faydali hazir metod icerir.

         */




    }
}
