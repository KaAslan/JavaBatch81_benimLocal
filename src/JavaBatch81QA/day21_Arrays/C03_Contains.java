package JavaBatch81QA.day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        // Soru 3- Kulanicidan aldiginiz bir ismin,verilen array’de olup olmadigini kontrol edip,
        // bize true veya false sonucu donen bir method olusturun.  --->>>> RETURN TYPE OLMALI

        String [] isimler= {"Basak", "Nurullah", "Fatih","Adem","Enes"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananIsim=scan.nextLine();

        boolean sonuc= contains(isimler,arananIsim);

        if (sonuc){
            System.out.println("Girilen isim listede var");
        } else {
            System.out.println("girilen isim listede yok");
        }
    }
    public static boolean contains(String[] isimler, String arananIsim) {
        boolean sonucMethod=false; //BURDA YENİ sonucMethod variable ı olusturduk cunku main deki sonuc variable ile ayni scope degil
//true ya da false nasıl karar verecegiz, eğer array deki her isme bakıp
// bu isimlerden herhangi biri aranan isme esit ise o zaman sonuc true olacak

        //hic birisi esit degil ise zaten false idi, false devam edecek.

        for (int i = 0; i < isimler.length ; i++) { // for loop umuzu olusturduk, isimler. length e kadar.
            if (isimler[i].equalsIgnoreCase(arananIsim)){  //eğer isimler equalsignorecase (buyuk kucuk bakma)
                // (esitse aranan isimlerden birine)
                sonucMethod=true; //eğer aranan isimlerde var ise sonucumuzu true döndür


                //sonucu yazdirmak icin main methoda git ve sout u oraya yazdir.

                //her seferinde ayni islemi yapiyoruz, elemanları bir bir aliyoruz,
                // kontrol ediyoruz, isimize yariyor ise
                //onu bir yere deger olarak atiyoruz

                //array de contains methodu yoktur. bir array de ihtiyacızınız olursa contains
                // methodunu ekleyebilirsiniz
                //bunu da contains methodu olusturup üzerine gelince more seceneginden method
                // olusturmayi secerek yapabilirz.
            }
        }

        return sonucMethod;
    }









}
