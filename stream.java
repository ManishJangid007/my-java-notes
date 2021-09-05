import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);

        // List<Integer> squareList = new ArrayList<>(); // Stream List before java 8
        // for (Integer i : numberList) {
        // squareList.add(i * i);
        // }

        List<Integer> squareList = numberList.stream().map(x -> x * x).collect(Collectors.toList()); // New way of
                                                                                                     // stream List
        System.out.println("List of squared numbers : " + squareList);

        // Set<Integer> squareSet = new HashSet<>(); // Stream Set before java 8
        // for (Integer i : numbersList) {
        // squareList.add(i * i);
        // }

        Set<Integer> squareSet = numberList.stream().map(x -> x * x).collect(Collectors.toSet()); // New way of
                                                                                                  // stream Set
        System.out.println("Set of squared numbers : " + squareSet);

        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Scala");

        // List<String> filterResult = new ArrayList<>();
        // for (String s : filterResult) {
        // if (s.startsWith("P")) {
        // filterResult.add(s);
        // }
        // }

        List<String> filterResult = languages.stream().filter(s -> s.startsWith("P")).collect(Collectors.toList());
        System.out.println("Languages Starting with 'P' : " + filterResult);

        List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
        System.out.println("Languages sorted alphabetically : " + sortedList);

        // demonstration of forEach method
        System.out.println("Printing all elements one by one : ");
        numberList.stream().map(x -> x * x).forEach(y -> System.out.println("Element is : " + y));

        // demonstration of reduce method
        int sum = numberList.stream().reduce(0, (ans, i) -> ans + i);
        System.out.println("Sum of all element in the numberlist : " + sum);

    }
}
