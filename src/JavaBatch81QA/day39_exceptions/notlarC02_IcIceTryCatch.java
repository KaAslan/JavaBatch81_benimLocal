package JavaBatch81QA.day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class notlarC02_IcIceTryCatch {
    public static void main(String[] args) {

        int k;
        try {
            FileInputStream fis=new FileInputStream("src/day39_exceptions/Notlar.java");

        while ((k=fis.read()) != -1) {
            System.out.println((char) k);
        }

        } catch (FileNotFoundException e) {//FileNotFoundException daha dar oldugu icin once yazilmali
            System.out.println("Dosya bulunamadi veya bozuk");
        } catch (IOException e) { // IOException e daha genel genis oldu icin FileNotFoundException e dan sonra olmali
        System.out.println("Dosyadan bilgiler okunamadi");
    }
//IOException icinde FileNotFoundException vardir o yuzden sira onemlidir.

    }

}
