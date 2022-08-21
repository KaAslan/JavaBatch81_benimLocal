package JavaBatch81QA.day21_Arrays;

public class OdevSorularCozum3 {
    public static void main(String[] args) {
        /*
         Soru 3
    Verilen bir array'in istenen bir elemani
    icerip icermedigini kontrol edip,
    bize   true   veya     false
    sonucu donen bir method olusturun

         */

        int [] verilenArr={5,9,5,15,25,78,63};
        int istenenEleman=3;

        boolean varMi=arraydeVarMi(verilenArr,istenenEleman);

        System.out.println(varMi);





    }

    private static boolean arraydeVarMi(int[] verilenArr, int istenenEleman) {
        boolean varMi=false;

        for (int each:verilenArr
             ) {
            if (each==istenenEleman){
                varMi=true; break;
            }else varMi=false;
        }
        return varMi;
    }
}
