package JavaBatch81QA.calisilanlar_KDinlenenler.day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {
        /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur

        Eger birden fazla satir ayni if sartina baglanmis ise mutlaka {} kullanmaliyiz.
         */



        int sayi=20;

        if(sayi>0) // ; konulursa kod  bitmiş demektir alt satırlara bağlamaz
            System.out.println("sayi pozitif"); /// if sonc cumlesi bu olur(if'e baglidir) ama alttaki satir if'e gore calismaz
            System.out.println("pozitif kalacaktir"); // ifden bagimsiz bir kod blogu suan
            System.out.println("Ucuncu satir");// her zaman çalişir

        if (sayi%2==0)
            System.out.println("sayi cift");  //if'e bagli sonuc kodu ama suslü parantez yok. boyle olunca sadece ilk satir
                                               // if'e baglidir
            System.out.println("cift kalacaktir");// her zaman çalişir


        if (sayi%5==0)
            System.out.println("Sayi 5'in tam kati");// değere bağlı

    }
}
