package surasura.chapter20.list20_5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("apple", "orange", "strawberry");
        list.stream().sorted((a, b) -> b.length() - a.length())
                .forEach(System.out::println);
    }
}
