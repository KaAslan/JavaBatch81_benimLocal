package JavaBatch81QA.calisilanlar_KDinlenenler.day09_ternary;

public class ternaryCozum8 {
    public static void main(String[] args) {
        /*
        Ekranda Ne Goruruz ?
            Soru1 : int y = 8;
            (y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y);

            Soru2 : int y = 12;
                (y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y);

            Soru3 : int y = 5;
            (y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y);
         */

        int y = 8;

        System.out.println((y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y));

        y = 12;
            System.out.println((y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y));

        y = 5;
        System.out.println((y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y));


    }
}
