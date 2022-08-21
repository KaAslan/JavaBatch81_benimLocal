package JavaBatch81QA.calisilanlar_KDinlenenler.day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str= "1Bu2gu3n Ja*va- cok g3uz/el";

        // str'i Bugun Java cok guzel haline getirin
        // replaceAll() deki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir
        // butun sayilari sil
        // butun ozel karakterleri sil

        // tum ozel karakterleri silelim dedigimizde space'ler de siliniyor
        // space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        // bir string koyalim
        // "qazwsx"

        str=str.replace(" ","qazwsx");// bosluklar yerine "qazwsx" koyduk. bosluklari
                                                     // korumak icin
        System.out.println(str);

        str=str.replaceAll("\\W",""); // istenmeyen ozel karakterlerden kurtulduk
        System.out.println(str); // 1Bu2gu3nJavacokg3uzel

        str=str.replaceAll("\\d",""); //---> rakamlardan kurtulduk

        // istenmeyen ozel karakter ve sayilardan kurtulduk
        // simdi space'leri geri getirelim
        str=str.replace("qazwsx"," ");// --> tüm "qazwsx" yerine space-leri koy
        System.out.println(str);



    }



}
