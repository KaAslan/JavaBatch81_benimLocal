package JavaBatch81QA.day17_NestedForLoop;

import java.util.Scanner;

public class K09_WhileLoopSifre {
    public static void main(String[] args) {
        /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa     “Sifre basari ile tanimlandi”,
        sartlari saglamazsa       “Islem basarisiz,Lutfen yeni bir sifre girin”         yazdirin
        ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin

        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan=new Scanner(System.in);

        String sifre="";
        boolean sifreKontrol=false;
        int kontrolSayi=0;

        while (!sifreKontrol) {
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <='Z'){
                kontrolSayi++;}
            else {
            System.out.println("Ilk harf buyuk harf olmali");
        }

        if (sifre.charAt(sifre.length()-1) >= 'a' && sifre.charAt(sifre.length()-1)<= 'z'){
        kontrolSayi++;
        }else{
            System.out.println("Son harf kucuk harf olmali");
        }

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        }else{
            kontrolSayi++;
        }

        if (sifre.length() >= 8){
            kontrolSayi++;
        }else{
            System.out.println("Sifre en az 8 karakter olmali");
        }

        if (kontrolSayi==4){
            System.out.println("Sifre basari ile tanımlandi");
            sifreKontrol=true;
        }else{kontrolSayi=0;}

        }








    }

}
