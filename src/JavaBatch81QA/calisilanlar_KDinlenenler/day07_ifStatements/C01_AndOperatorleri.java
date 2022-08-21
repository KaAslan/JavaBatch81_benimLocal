package JavaBatch81QA.calisilanlar_KDinlenenler.day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;

        System.out.println("biz anlayalim : " + (a>b));

        System.out.println(a>0 && b<20 && c>=b); // true

        System.out.println(a<0 && b<20 && c>=b);// false



        /*
        Java and operatoru konusunda bize iki secenek sunar

        && kullanirsak, ilk false buldugunda, artik sonucun false olacagini bilir
        ve geriye kalan sartlari incelemez

        & kullanirsak tum sartlari kontrol eder sonra sonucu belirler

        bu calisma usulunden dolayi & operatoru, && operatorune gore daha yavas olabilir.
         */
        System.out.println(a<0 & b<20 & c>=b); // false --> aradaki fark && ile --> & false da
        // olsa tum sartlari inceler. && ilk false bulunca diger sartlara bakmaz.
        // o yuzden && daha hizlidir. & daha yavastir

    }
}
