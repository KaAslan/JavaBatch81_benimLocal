package QuestionBank;

public class ternaryStatementsQB_Q2 {
    public static void main(String[] args) {

        /*
        Use ternary to print
        a) "Isosceles Triangle" if two sides of a triangle are equal in length.
        b) "Equilateral Triangle" if all sides of a triangle are equal in length.
        c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied

         */

        int side1=5;
        int side2=5;
        int side3=6;

       String triangle=   side1==side2 && side2==side3     ?  "ikizKenar ucgen"    : "eskenar ucgen"   ;

        System.out.println(triangle);
    }}
