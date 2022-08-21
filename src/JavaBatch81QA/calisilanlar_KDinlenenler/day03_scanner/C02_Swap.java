package JavaBatch81QA.calisilanlar_KDinlenenler.day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {

        /*
        Interview Question
        1 - Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir  program yaziniz
            Orn           : sayi1=10 ve sayi2= 30;
                kod calistiktan sonra
                sayi1=20 ve sayi2=10
         */

        int sayi1= 10;
        int sayi2=20;
        System.out.println("swaptan once sayi2 = " + sayi2);
        System.out.println("swaptan once sayi1 = " + sayi1);
        System.out.println("*******************************************");

        int sayi3=0; //gecici kovamiz

        //1 basamak sayi2 yi bos kovaya ata
        sayi3=sayi2;  //sayi3 20 oldu

        //2 basamak  1.sayiyi 2. sayiya atayacagiz
        sayi2=sayi1;  // sayi 2 10 oldu. sayi3 20 oldu

        //3 basamak bos kovayi sayi1 e ata
        sayi1=sayi3;

        System.out.println("swaptan once sayi3 = " + sayi3);
        System.out.println("swaptan once sayi2 = " + sayi2);
        System.out.println("swaptan once sayi1 = " + sayi1);









    }

}
