package QuestionBank;

public class ternaryStatementsQB_Q1 {
    public static void main(String[] args) {

        /*
        Use ternary to print "Valid Password"
        if the password has at least 8 characters different from space characters.
        "Invalid Password" if the password has less than 8 characters different from space character
        */


        String password="abc321 ";

        String gecerliSifre = password.replaceAll("\\n","").length() >7  ?
                "Valid Password" :  "Invalid Password"  ;

        System.out.println(gecerliSifre);









    }
}
