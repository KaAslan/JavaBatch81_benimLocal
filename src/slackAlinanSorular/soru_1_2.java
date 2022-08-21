package slackAlinanSorular;

public class soru_1_2 {
    public static void main(String[] args) {

        /*
         Aşağıdaki piramit deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    yukseklik: 7
    Beklenen Çıktı:
          *             1             *******  7             1     i1
         ***            3             ******   6             3     i2
        *****           5             *****    5             5     i3
       *******          7             ****     4             7      i4
      *********         9             ***      3             9      i5
     ***********        11            **       2             11     i6
    *************       13            *        1             13     i7

    int elmasEn=elmasYukseklik*2-1
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



    }

}
