package Odev_Paylasim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class soru6_array {
    public static void main(String[] args) {

        /*
        1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.
        2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
        3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.

        Örneğin;
        ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
        ("merhaba dünya", "dünya") ➞ "merhaba"
         */

        String cumle="bugün hava çok güzel";
        String cikacakKelime="çok";



       String cumleSon= cumledenKelimeSil(cumle,cikacakKelime);
       System.out.println(cumleSon);

   }

    private static String cumledenKelimeSil(String cumle, String cikacakKelime) {
        String cumlerArr[]=cumle.split(" ");
        List<String> cumleList=new ArrayList<>();
        Collections.addAll(cumleList,cumlerArr);
        cumleList.remove(cikacakKelime);

        String cumleSon="";
        for (String each:cumleList
             ) {cumleSon+=each+" ";
        }
        return cumleSon;
    }

}
