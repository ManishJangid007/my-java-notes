import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // adding elements
        list.add("A");
        System.out.println(list);

        list.add("B");
        System.out.println(list);

        list.addLast("C");
        System.out.println(list);

        list.addFirst("D");
        System.out.println(list);

        list.add(2, "E");
        System.out.println(list);

        // removing elements
        System.out.println("Removing Elements");

        list.remove("B");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}
