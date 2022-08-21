package QuestionBank;

public class ternaryStatementsQB_Q4 {
    public static void main(String[] args) {

        /*
        Type Apex code by using nested ternary.
        Write a program
        to check if a year is a leap year or not.

        If the year is divisible by 100 then it must be divisible by 400.

        If a year is not divisible by 100 then it must be divisible by 4.
         */

        int yil=1990;

        String artikYilMi=yil%100==0 ? yil%400==0 ? "artik yil":"artik yil degil" : yil%4==0? "artik yil":"artik yil degil" ;

        System.out.println(artikYilMi);




    }
}
