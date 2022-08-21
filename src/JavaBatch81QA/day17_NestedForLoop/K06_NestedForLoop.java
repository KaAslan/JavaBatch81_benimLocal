package JavaBatch81QA.day17_NestedForLoop;



public class K06_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen string'i asagidaki gibi yazdiran bir program yazalim
        input= Deniz
        D
        De
        Den
        Deni
        Deniz
         */

        String input="Kadriye";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.charAt(j-1));
            }
            System.out.println("");

        }



    }
}
