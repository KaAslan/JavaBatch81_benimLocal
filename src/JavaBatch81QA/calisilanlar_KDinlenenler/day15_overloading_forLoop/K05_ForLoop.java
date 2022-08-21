package JavaBatch81QA.calisilanlar_KDinlenenler.day15_overloading_forLoop;

public class K05_ForLoop {
    public static void main(String[] args) {
        // 1'den 5 e kadar(5 dahil) olan tamsayilari toplayalim

        int toplam=0;
        for (int i = 1; i <6 ; i++) {
            toplam+=i;
        }
        System.out.println("1'den 5e kadar toplam " + toplam);

        // 10 dahil - 20 dahil aradaki sayilari toplayin

        int toplam1=0;
        for (int i = 10; i <21 ; i++) {
            toplam1+=i;
        }
        System.out.println("10-20 arasi toplam :  " + toplam1);

        // 30 dagil 50 dahil, aradaki cift sayilari toplayin

        int ciftlerToplam=0;
        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                ciftlerToplam+=i;}
        }

        System.out.println("30-50 arasi ciftler toplam : " +ciftlerToplam);

        // 1500 ile 1600 (sinirlar dahil) arasinda 7 ile bolunebilen sayilari toplayin





    }
}
