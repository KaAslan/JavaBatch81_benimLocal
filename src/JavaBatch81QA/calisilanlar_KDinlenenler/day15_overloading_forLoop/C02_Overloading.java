package JavaBatch81QA.calisilanlar_KDinlenenler.day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*
        Java'da olusturdugumuz method'larin isminin yaptigi islev ile uyumlu olmasini isteriz
        mesela bir String'in bir bolumunu almak icin Java
        2 adet substring() method'u veya
        Verilen String'deki bazi parcalari yenileri ile degistirmek icin
        2 adet replace() method'u var

        Java ayni isimde birden fazla method varsa
        hangisinin kullanilacagina parametre sayisi(parantez icindekiler) ve
        parametrelerin data turune gore karar verir.
         */

        String str="Bu Java ogrenilecek, baska yolu yok";
        str.substring(2); // basladigi index ve sonrasini yazar.
        str.substring(2,4); //index 2 ve 4 arasini yazdirir. ama 4 dahil degil

        str.replace('c', 'v');
        str.replace("J","H");
        // str.replace(5,8); -- kabul etmez Java

        /*
        Ayni isimde ama farkli method'lari olusturmak icin
           degistirebilecegimiz seyler
           1- parametre sayisi
           2- ayni sayida parametreye sahip olsa bile, parametrelerin data turleri
           3- ayni sayida ve ayni data turunde parametreleri olan methodlarda
              parametrelerin siralanisi
         */
    }
}
