import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) { // It sorts the keys
        TreeMap<Integer, String> treemap = new TreeMap<>();

        treemap.put(3, "A");
        treemap.put(2, "B");
        treemap.put(1, "C");

        System.out.println(treemap);
    }
}
