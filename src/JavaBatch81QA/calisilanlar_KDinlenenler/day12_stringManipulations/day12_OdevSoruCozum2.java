package JavaBatch81QA.calisilanlar_KDinlenenler.day12_stringManipulations;

public class day12_OdevSoruCozum2 {
    public static void main(String[] args) {

        /*
        Soru 2
        String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        String str 1 = $13 99
        String str 2 = $10 55

        ipucu -- Double parseDouble() methodunu kullanabilirsiniz
         */


        String str1 = "$13.99";
        String str2 = "$10.55";



        //System.out.println(str1+str2);
        str1=str1.replace("$","");
        str2=str2.replace("$","");

        double sayi1=Double.parseDouble(str1); // String olan sayiyi double'a donusturduk
        double sayi2=Double.parseDouble(str2);
        double toplam=sayi1+sayi2;
        System.out.println("Toplam =  $" + toplam);

        String toplaStringSonuc=String.valueOf(toplam); // --> double sayiyi Stringe cevirdim
        System.out.println("String olarak toplam : $"+ toplaStringSonuc);

        String string1 = "13.99";  // "ali"
        String string2 = "10.55"; // "veli"

        double string1Double=Double.parseDouble(string1);
        System.out.println("string olan : " + str1 + "\ndouble olan : "+ string1Double);

        // turu double olan sayiyi nasil stringe cevirim

        String dooubledanString=String.valueOf(string1Double);
        System.out.println("doubledan string : " + dooubledanString);








    }
}
