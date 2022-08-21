package JavaBatch81QA.day17_NestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen input'a gore
        * lardan olusan asagidaki sekli olusturun
        input=4
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */

        // artan kismi nested forloop ile yapalim

        int input=5;

        for (int i = 1; i <=input ; i++) { // burdaki i bize satır sayisini verir.
            // bu yuzden inner loop i'ye kadar olur
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


        for (int i = input-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }



    }
}