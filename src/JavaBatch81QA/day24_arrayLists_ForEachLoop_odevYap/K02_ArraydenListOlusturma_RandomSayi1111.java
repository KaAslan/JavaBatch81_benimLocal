package JavaBatch81QA.day24_arrayLists_ForEachLoop_odevYap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class K02_ArraydenListOlusturma_RandomSayi1111 {
    public static void main(String[] args) {


        /*

        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olsuturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
        tahmin hakkı 10 tane olsun.

         */


        Random rnd=new Random();
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();

        while(sayiListesi.size()<200){  //--> index 0 dan basladigi icin <200. <=200 olsa 201 sayi olurdu
            //sayiListesi.size()<200) -->200 sayi tut aklinda
            sayi= rnd.nextInt(1000);  // rnd.nextInt(); o ile 1 arasinda sayi uret
                        // rnd.nextInt(int bound) 0 ile sinira kadar uretir

            if(!sayiListesi.contains(sayi)){
                    sayiListesi.add(sayi);
            }

        }
        System.out.println(sayiListesi);

        boolean bildiMİ=false;
        int tahminSayisi=1;
        Scanner scan=new Scanner(System.in);

        while (!bildiMİ){  /// bildiMİ==true demek parantez ici
            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi= scan.nextInt();
           if (tahminSayisi==10){
               if (!bildiMİ){
                   System.out.println("tebrikler 10 tahminde bildiniz");
                   break;
               }else{
                   System.out.println("malasef 10 tahminde bilemediniz");
                   break;
               }
           }


           if (sayiListesi.contains(sayi)) {
                System.out.println("Tebrikler  " + tahminSayisi + " adet tahminde listeden bir sayi buldunuz");
                bildiMİ=true;
            }else{
                System.out.println(tahminSayisi + " adet sayi soylediniz ama hic biri listede yok");
                tahminSayisi++;
            }
        }














    }
}
