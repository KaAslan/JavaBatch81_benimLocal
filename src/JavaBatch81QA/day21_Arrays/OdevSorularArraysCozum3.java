package JavaBatch81QA.day21_Arrays;

public class OdevSorularArraysCozum3 {
    public static void main(String[] args) {
        /*
        SORU 3
    Verilen bir array'in
    istenen bir elemani icerip icermedigini kontrol edip ,
    bize true false sonucu
    donen bir method olusturun
         */


        int []arr={1,3,5,3,8,9,12};
        int istenen=12;

        boolean varMi=istenenVarMiArrde(arr,istenen);

        System.out.println(varMi);

    }

    private static boolean istenenVarMiArrde(int[] arr, int istenen) {
        boolean varMi=false;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==istenen) {
                varMi=true;
            }
        }
        return  varMi;
    }
}
