package surasura.chapter20.list20_6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("apple", "orange", "strawberry");
        list.stream()
                .filter(s -> s.length() >= 6)
                .map(s -> "[" + s + "]")
                .sorted((a, b) -> b.length() - a.length())
                .forEach(System.out::println);
    }
}
