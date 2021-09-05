package StaticNestedClasses;

public class OutterClass {
    static int outerStaticMember = 10;
    int instanceMember = 20;
    private static int outerPrivateMember = 30;

    static class StaticNestedClass {
        void display() {
            System.out.println("static member of outer class = " + outerStaticMember);
            System.out.println("private static member of outer class = " + outerPrivateMember);
            // System.out.println("non static member of outer class = " + instanceMember);
        }
    }
}
