package JavaBatch81QA.day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {


        int sayilar[]={1,2,3,4,5,6,7};

        // array'in tamamini yazdiralim  ( ARRAY OLARAK YAZDIRMA
        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5, 6, 7]

        // array'in tum ELEMENTLERİNİ yazdirin ( ARAYİN İCERİGİNİ YAZMA)
        // TUM ELEMENTLERİ YAZDIRIN DERSE FOR LOOP İLE YAZDIRILIR
        for (int i = 0; i < sayilar.length ; i++) {
            System.out.print(sayilar[i] + " ");
        }





        System.out.println("");
        System.out.println("*******************");
        System.out.println("son elementteki virgulu silmek");



        for (int i = 0; i < sayilar.length; i++) {
            if (i< sayilar.length-1){
                System.out.print(sayilar[i] + ", ");
            } else {
                System.out.print(sayilar[i]);
            }
        }
    }
}
