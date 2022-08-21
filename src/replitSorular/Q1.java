package replitSorular;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

/*
Ask user Name, Surname and credit card numbers
than convert it to special form.
(Initials for name and surname should be uppercase)
(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

Input :
John White 1234234534561478
Output :  Name : J*** W****
CCN : **** **** **** 1478
 */


        Scanner scan=new Scanner(System.in);
        System.out.println("Please write your name");
        String name=scan.nextLine().toLowerCase();

        System.out.println("Please write your surname");
        String surname= scan.nextLine().toLowerCase();

        System.out.println("Please write your credit card number");
        String creditNo= scan.nextLine();

        System.out.println(creditNo.replaceAll(" ","").length());

        if (creditNo.replaceAll(" ","").length()!=16) {
            System.out.println("invalid credit number");
        }else {

            System.out.println("Name :  " +
                    name.substring(0, 1).toLowerCase() + name.substring(1).replaceAll("\\w", "*") +
                    " " + surname.substring(0, 1).toUpperCase() + surname.substring(1).replaceAll("\\w", "*") +
                    "\n" + "CCN  :  " + "**** **** **** " + creditNo.substring(creditNo.length()-4) );
        }





    }
}
