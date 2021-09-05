package innerClasses;

public class OutterClass {
    class innerClass {
        public void display() {
            System.out.println("Thid is a inner class method");
        }
    }

    void outerClassMethod() {
        System.out.println("In the outer Class Method");

        class MethodLocalClass {
            void localInnerMethod() {
                System.out.println("In the method local class : Method");
            }
        }
        MethodLocalClass mlc = new MethodLocalClass();
        mlc.localInnerMethod();
    }
}
