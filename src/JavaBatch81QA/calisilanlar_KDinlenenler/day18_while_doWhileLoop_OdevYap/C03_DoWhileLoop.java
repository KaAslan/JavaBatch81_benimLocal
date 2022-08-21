package JavaBatch81QA.calisilanlar_KDinlenenler.day18_while_doWhileLoop_OdevYap;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
    /*
     while loop'da once kontrol edip sonra islem yaptigimiz icin
     islem bittikten sonra loop'un kirilmasi icin bir kez daha basa donmemiz gerekiyor
     bu durumda fazladan bir islem yapiliyor
     */

        System.out.print("while ile  :");
        int sayi = 7;
        while (sayi < 10) {
            System.out.print(" "+sayi);
            sayi++;
        }

        /*
         do-while loop ile calistigimizda bu dezavantaj ortadan kalkar
         */

        System.out.println("");
        System.out.print("do while ile :");



        sayi = 7;
        do {
            System.out.print(" "+sayi);
            sayi++;
        } while (sayi < 10);


    }
}
