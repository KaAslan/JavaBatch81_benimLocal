package JavaBatch81QA.day21_Arrays;

import java.util.Scanner;

public class K_arraydeVarMiyokMu {
    public static void main(String[] args) {
        /*
        Verilen array'de istenen bir elementin var olup olmadigini true/false yazdirarak
         gosteren bir method olusturun
         */

        int[] verilenArr={1,9,6,4,8,23,50,12,7};

        arraydeVarMiYokMu(verilenArr);

    }

    private static void arraydeVarMiYokMu(int[] verilenArr) {

        Scanner scan=new Scanner(System.in);
        System.out.println("kontrol etmek isteginiz sayiyi giriniz");
        int istenenElement=scan.nextInt();

        boolean warMi=false;
        for (int i = 0; i < verilenArr.length; i++) {
            if (istenenElement == verilenArr[i]) {
                warMi = true;

                break;
            }
        }
        System.out.println(warMi);









    }
}
