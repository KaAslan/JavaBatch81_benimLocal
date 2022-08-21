package Odev_Paylasim;

import java.util.ArrayList;
import java.util.List;

public class soru5_fibonacci_sorusu {
    public static void main(String[] args) {


        /*
      verilen bir sayidan kucuk tum fibonacci sayilarini bir liste olarak olusturup yazdirin
     */
        /*
        Fibonacci Dizisi, her sayının kendisinden bir önceki sayı
        ile toplanması ile elde edilen sayılar serisidir.
        {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, …}
     a   1       2   5
      b      1     3    8
c --> cop     2a
         */


        int verilenSayi=50;
        List<Integer> sayilarList=new ArrayList<>();


        int ilkSayi=0;
        int ikincisayi=1;
        int cop=0;

        for (int i = 1; i <=verilenSayi ; i++) {
            cop=ilkSayi+ikincisayi;
            sayilarList.add(cop);
            ilkSayi=cop;

        }

        System.out.println(sayilarList);



    }
}
