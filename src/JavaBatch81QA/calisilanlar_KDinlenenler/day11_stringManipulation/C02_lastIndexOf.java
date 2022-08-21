package JavaBatch81QA.calisilanlar_KDinlenenler.day11_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";

        String kelime= "Java";

     /*
        verilen kelime icin asagıdaki sartlardan uygun olanı yazan bir program yazınız
            - verilen kelime cümlede yazılmamıs
            - verilen kelime cümlede sadece 1 kere kullanılmıs
            - verilen kelime cümlede birden fazla kullanılmıs
     */

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex= cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cümlede yazılmamıs");

        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cümlede sadece 1 kere kullanılmıs");
        }else{
            System.out.println("verilen kelime cümlede birden fazla kullanılmıs");
        }






    }
}
