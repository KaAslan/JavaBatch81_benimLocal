package JavaBatch81QA.calisilanlar_KDinlenenler.day12_stringManipulations;

public class C04_substring {
    public static void main(String[] args) {

        String str= "Java cok yasa";

        System.out.println(str.substring(3,4)); // a ---> 3.indexi al ve 4.index dahil degil

        System.out.println(str.substring(5,7)); // co   --> 5.indexten basla 7ye kadar al. 7 dahil degil

        System.out.println(str.substring(6,6)); // ""   -->6.indexten 6.indexe kadar. en son 6 dahil degil diyor
                                                        // hiclik olur


        System.out.println("====");

        // System.out.println(str.substring(6,2)); // exception --> rutime error verir- calistantiktan sonra
    }
}
