package JavaBatch81QA.calisilanlar_KDinlenenler.day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // verilen bir pozitif tam sayinin
        // pozitif tam bolenlerini yazdiralim

        int input=120;
        for (int i = 1; i <=input ; i++) {
            if (input%i==0){
                System.out.print(i + " ");
            }
        }
    }
}
