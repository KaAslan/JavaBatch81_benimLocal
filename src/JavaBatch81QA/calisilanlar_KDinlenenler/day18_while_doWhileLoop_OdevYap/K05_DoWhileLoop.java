package JavaBatch81QA.calisilanlar_KDinlenenler.day18_while_doWhileLoop_OdevYap;

public class K05_DoWhileLoop {
    public static void main(String[] args) {


        /*
        Soru 1 )
        9 den 190 e kadar
        7 nin kati olan tum tamsayilari ekrana yazdiriniz.

         */

        int ilkSayi=9;
        int sonSayi=190;

        int saymaAraci=ilkSayi;

        System.out.println("********** DO WHİLE İLE****************");
        System.out.println("7 ile tam bolunebilen sayilar : ");

        do {
            if (saymaAraci%7==0){
                System.out.print(saymaAraci+" ");

            }
            saymaAraci++;
        }while(saymaAraci<=sonSayi);


        System.out.println("");
        System.out.println();
        System.out.println("**********  WHİLE İLE****************");
        System.out.println("7 ile tam bolunebilen sayilar : ");

        ilkSayi=9;
        sonSayi=190;
        saymaAraci=ilkSayi;
        while (saymaAraci<=sonSayi){

            if (saymaAraci%7==0){
            System.out.print(saymaAraci+" ");
            }
            saymaAraci++;
        }



    }
}
