package JavaBatch81QA.calisilanlar_KDinlenenler.day06_Concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {

        /*
        Birden cok String’i + isareti ile topladiginizda Java bu String degiskenleri birlestirerek yeni
bir String olusturur
         */

        /*
        Not :
        Eger matematiksel bir islemin icinde String kullanilirsa, matematikteki oncelikler
        dikkate alinarak islem yapilir. Sira String ile toplamaya geldiginde toplama yerine
        Concatenation uygulanir
         */


        String a ="Hello";
        int b =2;
        int c= 3;
        System.out.println(a+b+c); //  Hello23
        System.out.println(c+b+a); //  5Hello
        System.out.println(a+(b+c)); //   Hello5
        System.out.println(a+(b*c)); //   Hello6


        String str1="Java";
        String str2="Guzeldir";
        int sayi1 =5;
        int sayi2=4;

        // yukaridaki variable'lari kullanaarak istenen metinleri yazidralim
        //Java Guzeldir 54

        System.out.println(str1 + " " + str2+ " "  + sayi1+sayi2); //Java Guzeldir 54
        System.out.println(str1 + " " + str2 + " "+ (sayi1+sayi2)); // Java Guzeldir 9
        System.out.println(sayi1 + sayi2 +" "+ str1); ////Java Guzeldir 54
        System.out.println(""+sayi1+sayi2+" "+ str2 ); // 54 Guzeldir

        str1.concat(str2); //JavaGuuzeldir
        System.out.println(str1.concat(str2));  //JavaGuuzeldir

        System.out.println(str1.concat(" ").concat(str2)); ////Java Guuzeldir



    }
}
