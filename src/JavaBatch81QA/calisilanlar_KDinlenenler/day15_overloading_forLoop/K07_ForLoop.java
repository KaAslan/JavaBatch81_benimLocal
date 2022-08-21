package JavaBatch81QA.calisilanlar_KDinlenenler.day15_overloading_forLoop;

public class K07_ForLoop {
    public static void main(String[] args) {


        K06_StringTerseCevirme.tersYazdir("VELİ");

        // 100'den 1'e kadar(sinirlar dahil)
        // 8 ile bolunebilen sayilari yazdirin


        for (int i = 100   ;    i >0    ;    i--) {
            if (i%8==0) {
                System.out.print( i+", ");
            }

        }






    }
}
