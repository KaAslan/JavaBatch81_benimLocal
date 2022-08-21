package JavaBatch81QA.calisilanlar_KDinlenenler.day04_DataCasting;

public class C004_decrement_eksiltme {
    public static void main(String[] args) {

        // cok kullanilmaz
        int numA=2;
        numA=numA-3;
        //bunun yerine
        numA-=3; // numA yi 3 eksilt

        // cok kullanilmaz acemi isi
        int numB=20;
        numB=numB/5;
        //yerine veya
        numB/=5;

        int numD=7;
        numD--;

    }
}
