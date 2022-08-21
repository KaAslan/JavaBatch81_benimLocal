package JavaBatch81QA.day22_multiDimensionalArrays_;

import java.util.Arrays;
import java.util.Scanner;

public class MdaOdevSorularCozumler6 {
    public static void main(String[] args) {


        /*
        Soru 6)
        Verilen bir Array’den istenen degere esit olan elamanlari kaldirip,
        kalanlari yeni bir Array olarak yazdiran bir method yaziniz.
         */

        int [] inputArr={1,6,9,5,46,5,6,12,4,6,1,7,8};

        elemanSilYeniArrayYap(inputArr);






    }

    private static void elemanSilYeniArrayYap(int[] inputArr) {
        System.out.println(Arrays.toString(inputArr));
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen silmek istediginiz sayiyi giriniz");
        int silinecekEleman= scan.nextInt();
        int silinecekElemanSayisi=0;



        for (int i = 0; i <inputArr.length ; i++) {
            if (inputArr[i]==silinecekEleman){
                silinecekElemanSayisi++;
            }
        }

        int[]yeniArr=new int[inputArr.length-silinecekElemanSayisi];

        int yeniArrIndexSayisi=0;
        if(silinecekElemanSayisi>0) {
            for (int i = 0; i < inputArr.length; i++) {
                if (inputArr[i] != silinecekEleman) {
                    yeniArr[yeniArrIndexSayisi] = inputArr[i];
                    yeniArrIndexSayisi++;
                }
            }

            System.out.println("silmek isteginiz " + silinecekEleman + " silindi" +
                    "\neski arrayde " + silinecekElemanSayisi+ " tane vardi"+
                    "\neski array : " + Arrays.toString(inputArr) +
                    "\nyeni array : " + Arrays.toString(yeniArr));
        }else{
            System.out.println("silmek istediginiz sayiyi bulamadik");
        }
    }


}
