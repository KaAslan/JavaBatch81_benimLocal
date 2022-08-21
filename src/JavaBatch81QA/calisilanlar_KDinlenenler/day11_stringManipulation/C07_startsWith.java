package JavaBatch81QA.calisilanlar_KDinlenenler.day11_stringManipulation;

public class C07_startsWith {
    public static void main(String[] args) {


        String input="Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J")); // True
        System.out.println(input.startsWith("")); // True
        System.out.println(input.startsWith("gun",5)); //True --> 5. index ve sonrasi "gun" ile mi basliyor.
                                                                    // 5 dahil

        System.out.println(input.startsWith("gun",6)); // false







    }
}
