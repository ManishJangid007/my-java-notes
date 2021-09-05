import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) { // it sort the values based on data type
        TreeSet<String> treeset = new TreeSet<>();

        treeset.add("B");
        treeset.add("A");
        treeset.add("C"); // true at this point
        treeset.add("C"); // false at this point

        System.out.println(treeset);

        // Output [A, B, C]
    }
}
