package JavaBatch81QA.day17_NestedForLoop;

public class K02_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen sayiya gore carpim tablosu olusturun

        input 3 se
        1 2 3
        2 4 6
        3 6 9

         */

        int verilenSayi=3;

        for (int i = 1; i <=verilenSayi ; i++) {

            for (int j =1; j <= verilenSayi; j++) {
                System.out.print(i*j + " ");

            }
            System.out.println("");
        }
    }
}
