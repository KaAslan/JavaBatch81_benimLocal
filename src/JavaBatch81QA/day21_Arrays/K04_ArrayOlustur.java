package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class K04_ArrayOlustur {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir array’in boyutunu
        // ve tum elementlerini alarak bir array olusturup,
        // bu array’i bize donduren bir method olusturun




        System.out.println(Arrays.toString(arrayOlustursana()));
    }

    private static int[] arrayOlustursana() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz arrayin uzunlugunu giriniz");
        int arrUzunluk=scan.nextInt();

        int olusturulanArr[]=new int [arrUzunluk];

        for (int i = 0; i < arrUzunluk; i++) {
            System.out.println(i + " inci index degerini giriniz");
             olusturulanArr[i]=scan.nextInt();
        }
            return olusturulanArr;
    }
}
