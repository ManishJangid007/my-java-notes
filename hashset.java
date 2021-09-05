import java.util.HashSet;
import java.util.Set;

public class hashset { // hashset only accepts unique values
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();

        hashset.add("A");
        hashset.add("B");
        hashset.add("C");
        hashset.add("C");

        System.out.println(hashset);

        System.out.println("Set Contains C or not? " + hashset.contains("C"));

        hashset.remove("A");
        System.out.println("Set after removing A : " + hashset);

        for (String item : hashset) {
            System.out.println(item);
        }
    }
}
