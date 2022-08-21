package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;

public class K09_binarySearch {
    public static void main(String[] args) {

            int[] arr={5,4,3};

            int aranacakEleman=6;
            int aranacakEleman2=-5;



            Arrays.sort(arr); /// SIRALADIM NATURAL ORDERA GORE
        System.out.println(Arrays.toString(arr)); // [3, 4, 5]


        System.out.println(Arrays.binarySearch(arr,aranacakEleman)); // -4 ---> eksi yok oldugunu gosterir. 4 olsaydı kacinci sırada olurdu
        System.out.println(Arrays.binarySearch(arr,aranacakEleman2)); //-1 ----> EKSİ YOK OLDUGUNU, 1 OLSAYDI KACINCI SIRA OLURDU GOSTERİR

    }
}
