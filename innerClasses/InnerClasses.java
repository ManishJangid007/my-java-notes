package innerClasses;

public class InnerClasses {
    public static void main(String[] args) {
        OutterClass.innerClass in = new OutterClass().new innerClass();
        in.display();

        OutterClass outerClass = new OutterClass();
        outerClass.outerClassMethod();
    }
}
