package JavaBatch81QA.day21_Arrays;

public class OdevSorularArraysCozum2 {
    public static void main(String[] args) {
        /*
        SORU 2
    Verilen String bir array'de
    en uzun ve          en kisa Stringleri
    yazdiran bir method olusturun
         */

        String []arr={"ali","veli","huseyin","hasan","abdurrahman"};

        enUzunEnKisaYazdirArrde(arr);




    }

    private static void enUzunEnKisaYazdirArrde(String[] arr) {

        String enUzun=arr[0];
        String enKisa=arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()>enUzun.length()) {
                enUzun=arr[i];
            }

            if (arr[i].length()<enKisa.length()) {
                enKisa=arr[i];
            }
        }
        System.out.println("-->en kisa : " + enKisa  + "\n-->en uzun : " + enUzun);





    }
}
