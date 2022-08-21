package JavaBatch81QA.calisilanlar_KDinlenenler.day18_while_doWhileLoop_OdevYap;

public class OdevSorularCozumler1 {
    public static void main(String[] args) {
        /*
        Soru 1 ) While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.
         */


        int baslangic=3;
        int bitis=13;
        int sayi=baslangic;

        while (sayi<=13){
            if (sayi%2!=0){
                System.out.print(sayi+" ");
            }
            sayi++;
        }




    }
}
