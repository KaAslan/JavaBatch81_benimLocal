package JavaBatch81QA.calisilanlar_KDinlenenler.day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

            // //soru 6   - Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin
            int sayi = 10;
            char harf = 'a';
            String str= "banan";
            System.out.println(sayi+harf);
            System.out.println(str+harf);
            System.out.println(harf+2);
        /*
        1- char data türü işleme girdiği değişkenin türüne göre farklı davranabilir.
        eğer matematiksel işleme girdiği variable sayısal bir değerse sayı gibi davranır.
         sayı + harf variablei int old
         */
            System.out.println(""+sayi+harf);

        
    }
}
