package JavaBatch81QA.day17_NestedForLoop;

public class K03_NestedForLoop  {
    public static void main(String[] args) {

        /*
          verilen yukseklik ve boy degerine gore
          *'lardan olusan bir dikdortgen olusturalim
          yukseklik :3  boy:4
          * * * *
          * * * *
          * * * *
         */

        int yukseklik=8;  // dış loop
        int boy=4;      // ic loop


        for (int i = 1; i <= yukseklik; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }



    }
}
