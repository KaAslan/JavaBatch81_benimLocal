package JavaBatch81QA.calisilanlar_KDinlenenler.day06_Concatenation;

public class C03_RelationalOperatorsNotlar {

    public static void main(String[] args) {

        /*
        ==  Cift esittir isareti / karsilastirma (Comperison) operatoru

              boolean sonuc1 = 5+2 == 7; -->> sonuc1 degeri true olur
              boolean sonuc2 = 5*2 == 15;  -->> sonuc2 degeri false olur
         */




        /*
        != Esit degildir isareti

        boolean sonuc1= 5+2 != 7;   -->  sonuc1 degeri false olur

        System.out.println(5*2 != 15);  ---> true yazdirir (   5x2 15e esit degildir dimi?  )

        */
//*****  boolean bir variable veya sonucun basına ! koyarsak tersini alir
        //System.out.println(!(3*5>7)); ----> true ama unlem isaretinden dolayi false dondurur.



        /*
        > Buyuktur , Buyuk veya esittir

            boolean sonuc1= 5+2 >= 7;   ---> sonuc1 degeri true olur
System.out.println(5*2 > 15);     -----> false yazdirir
         */




        /*
        < Kucuktur , Kucuk veya esittir

        boolean sonuc1= 5+2 < 7;  ---->  sonuc1 degeri false olur
        System.out.println(5*2 < 15); -----> true yazdirir
         */




        /*
        && AND (ve) isareti && isareti ile birlestirilen tum ifadeler
        dogru ise sonuc true olur.
        Diger tum durumlarda false doner. ( && operatoru mukemmeliyetcidir )

        boolean sonuc1= (5+2 == 7) && (4+3 !=5) ;  ---> sonuc1 degeri true olur
System.out.println(5*2 != 15) && (5>7)       ---->false yazdirir
         */





        /*
        ||  OR (veya) isareti || isareti ile birlestirilen tum ifadeler
        yanlis ise sonuc false olur.

        Diger tum durumlarda truee doner. ( || operatoru iyimserdir )

        boolean sonuc1= (5+2 == 7) || (4+3 !=5) ;  ---->sonuc1 degeri true olur
        System.out.println( 5*2 == 15) || (5>7) ------> false yazdirir

         */







    }
}
