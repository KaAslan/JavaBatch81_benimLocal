package JavaBatch81QA.day21_Arrays;

import java.util.Arrays;

public class K_arraydeArananHarfKacTane {
    public static void main(String[] args) {

        // Verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        // bir method olusturun

        String cumle= "Nerede o 'hello world' yazdiramayan ogrenciler?";

       char istenenHarf ='e';

        arrraydeHarfKacDefaKullanildi(cumle,istenenHarf);







    }

    private static void arrraydeHarfKacDefaKullanildi(String cumle, char istenenHarf) {

        String arrCumle[] = cumle.split("");
        int sayac=0;
        String stringHarf=""+istenenHarf;

      System.out.println(Arrays.toString(arrCumle));

        for (int i = 0; i <arrCumle.length ; i++) {
            if (arrCumle[i].equals(stringHarf)){
                sayac++;
            }
        }
        System.out.println(stringHarf + " harfi cumlede "+ sayac +" defa kullanilmis");


    }
}
