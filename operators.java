public class operators {
    public static void main(String[] args) {
        // arithmetic();
        // unary();
        // prepost();
        // relational();
        // conditional();
        bitwise();
    }

    public static void arithmetic() { // They are used between variable
        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
        original_result = result;
    }

    public static void unary() { // They are used with single variable
        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }

    public static void prepost() { // Difference Between post (i++) increment or pre (++i) increment
        int i = 3;
        i++;
        // print 4
        System.out.println(i);

        ++i;
        // print 5
        System.out.println(i);

        // print 6
        System.out.println(++i);

        // print 6
        System.out.println(i++);

        // print 7
        System.out.println(i);
    }

    public static void relational() { // Equalit, Relational and Conditional Operator
        int value1 = 1;
        int value2 = 2;

        if (value1 == value2) {
            System.out.println("value1 == value2");
        }

        if (value1 != value2) {
            System.out.println("value1 != value2");
        }

        if (value1 > value2) {
            System.out.println("value1 > value2");
        }

        if (value1 < value2) {
            System.out.println("value1 < value2");
        }

        if (value1 <= value2) {
            System.out.println("value1 <= value2");
        }
    }

    public static void conditional() { // Conditional Operators (AND,OR)
        int value1 = 1;
        int value2 = 2;

        if ((value1 == 1) && (value2 == 2)) {
            System.out.println("Value1 is 1 AND value2 is 2");
        }
        if ((value1 == 1) || (value2 == 1)) {
            System.out.println("Value1 is 1 OR value2 is 1");
        }
    }

    public static void bitwise() { // Bitwise Operator (0101)
        int a = 5;
        int b = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));
    }
}