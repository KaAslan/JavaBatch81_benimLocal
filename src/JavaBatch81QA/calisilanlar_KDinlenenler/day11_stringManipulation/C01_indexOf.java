package JavaBatch81QA.calisilanlar_KDinlenenler.day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {


        String str="Java ogrenmek cok guzel";
        //Verilen bir String de herhangi bir string veya charin ilk kullanildigi
        //indexi bize dondurur.

        System.out.println('g'); //g
        System.out.println("r"); //r
        System.out.println(str.indexOf("j"));  // -1 ---> yoksa negatif dondurur ki biz olmöadigini anlayalim

        System.out.println(str.indexOf("mek"));  // 10


        // eger istedigimiz indexten sonrasini kontrol etmek istyersek
        // o zaman ayni metodu 2 parametreli olarak kulllanabiliriz

        System.out.println(str.indexOf("g",6)); // --> 6. indexten sonra g ara
                                                             // sonucu bize 6 verir. 6. indexten itibaren old. icin
                                                            //6. indexten baslayip sonrasina bakacak
        System.out.println(str.indexOf("g",6+1)); // o yuzden 6+1 yazilmali
                                                            // 18

    // yukaridaki str da 2. ve3. e'nin indexlerini bulun
       // 2.ci e'yi bulabilmek icin 1.inci e"nin indexine ihtiyacim var.

        int ilkE=str.indexOf("e");
        int ikinciE=str.indexOf("e",ilkE+1);

        System.out.println("ilk e nin indexi : " + ilkE);
        System.out.println("ikinci e nin indexi : " + ikinciE);
        // eger 2.e varsa 3.e'nin olup olmadigini
        //ve varsa index'ini yazdiralim

        if (ikinciE==-1){
            System.out.println("verilen str da 2.e yok");

        }else{
            int ucuncuE=str.indexOf("e",ikinciE+1);
            if (ucuncuE==-1){
                System.out.println("verilen str da ucuncu E yok");
            }else{
                System.out.println("verilen str da 3. E nin indexi " + ucuncuE);
            }
        }



    }
}
