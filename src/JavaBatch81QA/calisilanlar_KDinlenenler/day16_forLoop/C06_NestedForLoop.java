package JavaBatch81QA.calisilanlar_KDinlenenler.day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

         /*
    Bazen tek değişken sorunu cozmeye yetmez

    *
    * *
    * * *
    * * * *
    * * * * *
     */

        // 3 tane yan yana * yaz

        for (int i = 1; i <= 3; i++) {
            System.out.print("* ");

        }

        System.out.println();

        //4 tane yan yana * yaz

        for (int i = 1; i <= 4; i++) {
            System.out.print("* ");

        }

        System.out.println("");
        System.out.println("");


        // bu tur durumlarda ic ice (nested Loop ) kullanmak gerekir
          /*
    Bazen tek değişken sorunu cozmeye yetmez

    *
    * *
    * * *
    * * * *
    * * * * *
     */

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
}