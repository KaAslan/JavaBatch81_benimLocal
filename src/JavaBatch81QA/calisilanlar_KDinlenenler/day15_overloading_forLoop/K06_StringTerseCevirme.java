package JavaBatch81QA.calisilanlar_KDinlenenler.day15_overloading_forLoop;

public class K06_StringTerseCevirme {
    public static void main(String[] args) {

        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun

        String input="elma yedi, geldi";

        tersYazdir(input);



    }

    public static void tersYazdir(String input) {

        String terstenYzilanKelime=""; // forlooptan alacagimiz her bir harfi koymak icin kap/kutu yaptik

        for (int i = input.length()-1; i >= 0; i--) {
            terstenYzilanKelime+=input.substring(i,i+1); // alması gereken son harfi aliyor

        }
        System.out.println(terstenYzilanKelime);

































    }
}
