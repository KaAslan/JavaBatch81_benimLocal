package Odev_Paylasim;

import java.util.Arrays;

public class soru3_list_hocaCozum {
    public static void main(String[] args) {

         /*   "Integer sayılardan oluşan bir diziyi parametre olarak alan
                ve dizide 7 rakamı  var ise  "Boom!" ifadesini;
            aksi takdirde  "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".

         Örnek çıktı:
                [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
                [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
                [2, 55, 60, 97, 86] ➞ "Boom!"

      */

        int [] arr={2, 55, 60, 9, 86};

        Boom(arr);
        System.out.println((Boom(arr)));


        }

    private static String Boom(int[] arr) {
        return Arrays.toString(arr).contains("7") ? "Boom!"
                : "dizide yedi rakamı yok";
    }


}


