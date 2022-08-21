package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

public class ternaryCozum1 {
    public static void main(String[] args) {

        /*
        Soru1 : int y = 112;
                System.out.println( (y > 5) ? (“Inek”) : (“Koyun”) );

            Soru2 : int y = 112;
            System.out.println((y < 91) ? 9 : 11);

            Soru3 : int y = 1;
            int z = 1;
            int a = y<10 ? y++ : z++;
            System.out.println(y + “,” + z + “,” + a);

         */

       int y = 112;
        System.out.println( (y > 5) ? ("Inek") : ("Koyun") );

        y = 112;
        System.out.println((y < 91) ? 9 : 11);

        y = 1;
        int z = 1;
        int a = y<10 ? y++ : z++; /// a= y=2
        System.out.println(y + ","+ z + "," + a);
                         //2 ,      1    ,      1



    }
}
