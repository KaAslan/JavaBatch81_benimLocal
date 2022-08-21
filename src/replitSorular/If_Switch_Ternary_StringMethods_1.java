package replitSorular;

import java.util.Scanner;

public class If_Switch_Ternary_StringMethods_1 {
    public static void main(String[] args) {

/*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
        IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
        BMI 18,5'in altındaysa zayıfsınız
        BMI 18,5 ile 25 arasında ise kilonuz idealdir
        BMI 25-30 arasındaysa şişmansınız
        BMI 30'dan büyük veya eşitse, obez

        Input:

        Output:

Agirlik : 71

Boy : 1,72

BMI : 23.99945916711736

Zayifsiniz.
 */


        Scanner sc=new Scanner(System.in);
        System.out.println(" lutfen vucut agırlıgınızı yazınız");
        double agirlik= sc.nextDouble();
        System.out.println("uzunlugunuzu m cinsinden giriniz");
        double uzunluk= sc.nextDouble();
        double vucutKitle=agirlik/(uzunluk*uzunluk);
        System.out.println(vucutKitle);

        if (vucutKitle<18.5){
            System.out.println("zayifsiniz");         }

        if (vucutKitle>=18.5&&vucutKitle<25)
            System.out.println("kilo ideal");

        if (vucutKitle>=25&&vucutKitle<30)
            System.out.println("sisman");

        if (vucutKitle>=30)
            System.out.println("obez");


    }
}
