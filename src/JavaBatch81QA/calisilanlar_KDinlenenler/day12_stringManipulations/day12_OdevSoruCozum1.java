package JavaBatch81QA.calisilanlar_KDinlenenler.day12_stringManipulations;

public class day12_OdevSoruCozum1 {
    public static void main(String[] args) {

        /*
         Soru 1
    String methodlarini kullanarak "  Java ogrenmek 123 Cok guzel@"
     String’ini ---->“Java ogrenmek cok guzel"<-- sekline getirin
         */

        String verilenCumle="  Java ogrenmek123 Cok guzel@  ";

        verilenCumle=verilenCumle.trim();
        verilenCumle=verilenCumle.replaceAll("\\d",""); //Java ogrenmek Cok guzel@
        verilenCumle=verilenCumle.replace("@","");//Java ogrenmek Cok guzel
        verilenCumle=verilenCumle.replace("C","c");
        System.out.println(verilenCumle);

    }
}
