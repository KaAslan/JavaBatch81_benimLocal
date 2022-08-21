package slackAlinanSorular;

public class soru_1 {
    public static void main(String[] args) {

        /*
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *

         */


        int satirYukselik=7;

        for (int i = 1; i <=satirYukselik ; i++) {
            for (int j = i; j <=satirYukselik ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <i*2-1 ; k++) {

                System.out.print("*");
            }

            System.out.println("");
        }

        /*

        **              2           ***********     11              i1     7
        ***             3            *********      9               i2
        ****            4             *******       7               i3
        *****           5              *****        5               i4
        ******          6               ***         3               i5
        *******         7                *          1               i6

         */

        for (int i = satirYukselik-1; i >=1 ; i--) {

            for (int j = satirYukselik+1; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k =1; k <2*i ; k++) {
                System.out.print("*");
            }
            System.out.println("");

        }
//   https://www.youtube.com/watch?v=Rz2biaQ1Gjk







    }
}
