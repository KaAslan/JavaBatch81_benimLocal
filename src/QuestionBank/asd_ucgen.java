package QuestionBank;

public class asd_ucgen {
    public static void main(String[] args) {
        /*4----
      1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
                       i           satir sayisi /yukseklik
                      1          1
                       2         12
                        3        123                             __|_____
                        4        1234                            __|_____
                        5        12345                           __|_____
                        6        123456
                        7        1234567
                        8        12345678
                        9        123456789
                         0       12345678910

*/
        int satirSayisi=10;
        int sutunSayisi=10;

        for (int i = 1; i < satirSayisi; i++) {  // satr sayisi belirler yukseklik
            for (int j = 1; j < sutunSayisi; j++) { // sutun sayisi yada satirda ne yazacagi
                if (j<=i) {                     // satirda ne yazacagi kosul
                    System.out.print(j+"");
                }
            }
            System.out.println("");

        }


    }
}
