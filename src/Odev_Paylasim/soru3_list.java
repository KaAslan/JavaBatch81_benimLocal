package Odev_Paylasim;

import java.util.Arrays;

public class soru3_list {
    public static void main(String[] args) {

         /*   "Integer sayılardan oluşan bir diziyi parametre olarak alan
                ve dizide 7 rakamı  var ise  "Boom!" ifadesini;
            aksi takdirde  "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".

         Örnek çıktı:
                [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
                [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
                [2, 55, 60, 97, 86] ➞ "Boom!"

      */

            int [] verilenArr={2, 55, 60, 97, 86};

            boolean boom=yediVarMiHadi(verilenArr);
    }

    private static boolean yediVarMiHadi(int[] verilenArr) {
        boolean boomMu=false;

        String sayilarStr=Arrays.toString(verilenArr);

        sayilarStr=sayilarStr.replaceAll("\\D","");

        if (sayilarStr.contains("7")) {
            System.out.println("Boom!");
            boomMu=true;

        }else {
            System.out.println("dizide 7 rakamı yok");
            boomMu=false;
        }
        return boomMu;
    }
}
