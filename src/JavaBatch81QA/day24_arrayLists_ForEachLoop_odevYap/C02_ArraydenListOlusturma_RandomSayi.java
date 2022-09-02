package JavaBatch81QA.day24_arrayLists_ForEachLoop_odevYap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma_RandomSayi {
    public static void main(String[] args) {

        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */


        Random rnd=new Random();
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();

        while(sayiListesi.size()<200){ //--> 200 tane oluncaya kadar 200 tane sayi uretip eklesin liste
                                    // -->sayiListesi.size()<=200 kucuk esittir olsaydi 201 sayi olurdu. cunku 0. index var
            sayi= rnd.nextInt(1000);// rnd.nextInt(); o ile 1000 arasinda sayi uret
            // rnd.nextInt(int bound) 0 ile sinira kadar uretir

            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }



        boolean bildiMi=false;
        int tahminSayisi=1;
        Scanner scan= new Scanner(System.in);

        while(!bildiMi){ // bildiMi==false/ calismasi icin true olsun, false olursa loop kırılsın

            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi=scan.nextInt();

            if (sayiListesi.contains(sayi)){
                System.out.println("Tebrikler " + tahminSayisi + " adet tahminde listeden bir sayi buldunuz");
                bildiMi=true;
            }else{
                System.out.println(tahminSayisi + " adet sayi soylediniz ama hic biri listede yok");
                tahminSayisi++;
            }
        }
    }
}
