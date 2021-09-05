public class controlFlowStatements {
    public static void main(String[] args) {
        // if_then();
        // nested_if();
        // ternaryOperator();
        switch_statement();
    }

    public static void print(String a) {
        System.out.println(a);
    }

    public static void printInt(int a) {
        System.out.println(a);
    }

    public static void if_then() {
        int testscore = 76;
        String grade;

        if (testscore >= 90) {
            grade = "A";
        } else if (testscore >= 80) {
            grade = "B";
        } else if (testscore >= 70) {
            grade = "C";
        } else if (testscore >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        print("Grade = " + grade);
    }

    public static void nested_if() {
        int i = 50;

        if (i == 50) {
            print("i is 50");
            if (i < 75) {
                print("i is smaller than 75");
                if (i < 55) {
                    print("i is also smaller than 55");
                }
            }
        }
    }

    public static void ternaryOperator() { // ? Syntax = condition ? true : false
        int a = 1;
        int b = 2;
        int result;

        result = a < b ? a : b;

        printInt(result);
    }

    public static void switch_statement() {
        int month = 6;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                break;

            case 2:
                monthString = "February";
                break;

            case 3:
                monthString = "March";
                break;

            case 4:
                monthString = "April";
                break;

            case 5:
                monthString = "May";
                break;

            case 6:
                monthString = "June";
                break;

            case 7:
                monthString = "July";
                break;

            case 8:
                monthString = "August";
                break;

            case 9:
                monthString = "September";
                break;

            case 10:
                monthString = "October";
                break;

            case 11:
                monthString = "November";
                break;

            case 12:
                monthString = "December";
                break;

            default:
                monthString = "Inavlid Number";
                break;
        }

        print(monthString);
    }
}
