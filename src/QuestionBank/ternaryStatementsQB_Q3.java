package QuestionBank;

public class ternaryStatementsQB_Q3 {
    public static void main(String[] args) {


/*

            Use ternary to print
        a) "Round up by last digit" and print the rounded value
        if the last digit of an integer is greater than or equal to 5

        b) "Round down by last digit" and print the rounded value
        if the last digit of an integer is less than 5

        For example; 127 will be rounded up and the value will be 130
        125 will be rounded up and the value will be 130
        123 will be rounded down and the value will be 120
 */

        int sayi=124;

        String sonDeger=    sayi%10>=5        ?  "uste yuvarla " + ((sayi/10)+1)*10       : "alta yuvarla "+ (sayi-(sayi%10)) ;

        System.out.println(sonDeger);


    }
}
