package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class K_elementAlArrayOlustur {
    public static void main(String[] args) {

        // kullaniciya kac elementlik bir array olusturacagini sorun
        // array'i olusturup elementleri kullanicidan alip, array'e atayin

        Scanner scan=new Scanner(System.in);
        System.out.println("ne kadar uzunlukta bir array olsuturmak istersiniz?");
        int arrUzunluk=scan.nextInt();

        int[] olusturulanArr=new int[arrUzunluk];

        for (int i = 0; i <arrUzunluk ; i++) {
            System.out.println("array icin sayilari giriniz");
            olusturulanArr[i]=scan.nextInt();
        }
        System.out.println("olusturulan arr : " + Arrays.toString(olusturulanArr));

    }
}
