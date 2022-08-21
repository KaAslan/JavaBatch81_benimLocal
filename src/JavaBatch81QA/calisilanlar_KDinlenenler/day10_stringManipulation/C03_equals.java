package JavaBatch81QA.calisilanlar_KDinlenenler.day10_stringManipulation;

public class C03_equals {
    public static void main(String[] args) {

        String str1= "Ali Can";
        String str2 = "Ali CAN" ;
        String str3 = "Ali Can" + "";
        String str4 = "Ali Can";
        String str5=new String("Ali Can");

        System.out.println(str1==str2); // false

        System.out.println(str1==str3);   //false
        System.out.println(str1.equals(str3));  //true

        System.out.println(str1==str5);    // false
        System.out.println(str1.equals(str5));  //true

        /*
        Stringlerde ayn,i String olsa bile == her zaman calismaz
        emin olmak isterseniz .equal() metodunu kullanmalisiniz

        equals() kullandigimizda dikkat edecegimiz tek sey metinlerin birebir ayni olmasidir.
        */

        System.out.println(str1.equals(str4)); // true



    }
}
