package Exception;

public class SimpleException {
    public static void main(String[] args) {
        int data = 100 / 0; // divide by 0
        System.out.println(data);

        String a = null; // null value
        System.out.println(a.charAt(0));
    }
}
