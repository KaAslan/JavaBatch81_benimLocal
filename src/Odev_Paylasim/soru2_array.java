package Odev_Paylasim;

import java.util.Arrays;
import java.util.Scanner;

public class soru2_array {
    public static void main(String[] args) {
         /*
        Verilen bir array'den istenen degere esit olan elemanlari kaldırıp,
        kalanlari yeni bir Array olarak yazdiran bir method yaziniz.
         */


        int verilenArr[]={ 69,69,78,120,5,69,23,69,100};



        Scanner scan=new Scanner(System.in);
        System.out.println(Arrays.toString(verilenArr));
        System.out.println("Lutfen silmek istedginiz degeri giriniz");
        int silinecekEleman= scan.nextInt();

        arraydenSil(verilenArr,silinecekEleman);

    }

    private static void arraydenSil(int[] verilenArr, int silinecekEleman) {

        int silinecekElemanSayisi=0;
        for (int i = 0; i < verilenArr.length; i++) {
            if (silinecekEleman==verilenArr[i]){
                silinecekElemanSayisi++;
            }
        }

        int[] yeniArr=new int[verilenArr.length-silinecekElemanSayisi];

        int yeniArrIndex=0;
        for (int i = 0; i < verilenArr.length; i++) {
            if (silinecekEleman!=verilenArr[i]){
                yeniArr[yeniArrIndex]=verilenArr[i];   // yeni arr icin index yapmak lazim
                yeniArrIndex++;
            }
        }
        System.out.println("girdiginiz degerden " + silinecekElemanSayisi + " tane sildik. " +
               "\nArrayin silinmis hali : " + Arrays.toString(yeniArr));



    }
}
