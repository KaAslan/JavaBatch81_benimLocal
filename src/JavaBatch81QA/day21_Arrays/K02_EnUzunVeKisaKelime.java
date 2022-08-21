package JavaBatch81QA.day21_Arrays;

public class K02_EnUzunVeKisaKelime {
    public static void main(String[] args) {

        // Soru 2-
        // Verilen String bir array’de
        // en uzun ve en kisa String’leri yazdiran bir method olusturun RETURN TYPE ISTEMİYOR YANLIS OLDU

            String [] hayvanlar={"tavsan","at","serce","kartal","kaplan","bukalemun"};

            enUzunEnKisaStringBul(hayvanlar);

        System.out.println(enUzunEnKisaStringBul(hayvanlar));


    }

    private static String enUzunEnKisaStringBul(String[] hayvanlar) {

        String enUzunString =hayvanlar[0];
        String enKisaString =hayvanlar[0];

        for (int i = 1; i < hayvanlar.length; i++) {

            if (hayvanlar[i].length()>enUzunString.length()){
                enUzunString=hayvanlar[i];
            }
            if (hayvanlar[i].length()< enKisaString.length()){
                enKisaString=hayvanlar[i];
            }
        }
                return ("en kisa string : "+ enKisaString +"\nen uzun string :"+ enUzunString);


    }
}
