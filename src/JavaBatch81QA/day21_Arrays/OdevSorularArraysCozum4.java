package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OdevSorularArraysCozum4 {

    /*
    SORU 4
    Kullanicidan bir array'in
    boyutunu ve tum elementlerini alarak bir array olusturup,
    bu arrayi bize donduren bir method olsuturun
     */
    public static void main(String[] args) {


        
        
        int[]arr=arrOlustur();

        System.out.println("olusturulan arr : " + Arrays.toString(arr));
        

    }

    private static int[] arrOlustur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen arrayin uzunlugunu giriniz");
        int uzunluk= scan.nextInt();

        int []arr=new int[uzunluk];

        int sayac=1;
        while (sayac<=uzunluk) {
            System.out.println("Lutfen arraye eklemek icin " + sayac+" inci elementi giriniz");
            int element= scan.nextInt();
            arr[sayac-1]=element;
            sayac++;
        }
        return  arr;
    }
}
