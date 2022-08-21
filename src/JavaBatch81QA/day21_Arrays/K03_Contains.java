package JavaBatch81QA.day21_Arrays;

import java.util.Scanner;

public class K03_Contains {
    public static void main(String[] args) {

        // Soru 3- Kulanicidan aldiginiz bir ismin,
        // verilen array’de olup olmadigini kontrol edip,
        // bize true veya false sonucu donen bir method olusturun.


        String [] katilacaklarListesi={"Enes","Kagan","Zeynep","Hale"};

        String arananIsim="";



       // System.out.println(containsVarMi(katilacaklarListesi, arananIsim));


        boolean sonuc=containsVarMi(katilacaklarListesi,arananIsim);

        if (sonuc){
            System.out.println("Aradiginiz isim listede var" );
        }else {
            System.out.println("Malasef aradiginiz isim listede yok" );
        }



    }

    private static boolean containsVarMi(String[] katilacaklarListesi, String arananIsim) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen aramak istediginiz ismi yaziniz -----> : ");
        arananIsim=scan.next();

        boolean varMi=false;

        for (int i = 0; i < katilacaklarListesi.length; i++) {
                if (arananIsim.equalsIgnoreCase(katilacaklarListesi[i])) {
                    varMi=true;
                }
        }
        return varMi ;

    }
}
