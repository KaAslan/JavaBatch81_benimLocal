package QuestionBank;

public class swtichStamentQB_Q1 {
    public static void main(String[] args) {

        /*
        Use switch statement to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others
         */

        String month="March";
        String month1=month.toLowerCase();

        switch (month1){

            case "december" :
            case "january" :
            case "february" :
                System.out.println("winter");
                break;

            case "march" :
            case "april" :
            case "may" :
                System.out.println("Spring");
                break;

            case "september" :
            case "october" :
            case "november" :
                System.out.println("fall");
                break;

            case "june" :
            case "july" :
            case "august" :
                System.out.println("summer");
                break;

            default:
                System.out.println("opssss something went wrong");
                break;

        }


    }
}
