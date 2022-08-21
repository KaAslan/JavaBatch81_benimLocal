package JavaBatch81QA.day17_NestedForLoop;



public class K04_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen input'a gore *'lardan olusan bir ucgen olusturun
        ornek input =4 ise
                 *
                 * *
                 * * *
                 * * * *
        */

        int input=4;

        for (int i = 1; i <=input ; i++) { // satırın altta gecme durumunu ayarladi
            for (int j = 1; j <=i ; j++) {  // ic loop satirlari 'i' nin büyüklügü kadar yazdirdi.
                System.out.print("* ");
            }
            System.out.println("");
        }



    }
}
