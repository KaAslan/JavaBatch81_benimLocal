package slackAlinanSorular;

public class soru4 {
    public static void main(String[] args) {
        /*4----1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910

*/



        int satirSayisi=10;
        int sutunSayisi=10;

        for (int i = 1; i < satirSayisi; i++) {  // satr sayisi belirler
            for (int j = 1; j < sutunSayisi; j++) { // sutun sayisi yada satirda ne yazacagi
                if (j<=i) {                     // satirda ne yazacagi kosul
                    System.out.print(j+"");
                }
            }
            System.out.println("");

        }


    }
}
