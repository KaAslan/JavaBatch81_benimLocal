package JavaBatch81QA.day17_NestedForLoop;

public class K01_ForLoop {
    public static void main(String[] args) {
        /*
        Verilen stringdeki kullanılan harfleri
        tekrarsiz olarak yazdırıp
        kelimede kullanilan farklı harf sayisini veren bir metod yapın

         */

        String input="kadriyEE";
       tekrarsizYaparcik(input);


    }

    private static void tekrarsizYaparcik(String input) {
        int farkliHarfAdedi=0;
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W","").toLowerCase();

        benzersizInput+=islenecekKelime.substring(0,1);

        for (int i = 1; i < islenecekKelime.length(); i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                benzersizInput+=islenecekKelime.substring(i,i+1);
                farkliHarfAdedi++;
            }

        }
        System.out.println("girilen cumle/kelime tekrarsiz yazilis : " + benzersizInput+
                "\nfarkli harf sayisi : " +(farkliHarfAdedi+1));

    }
}
