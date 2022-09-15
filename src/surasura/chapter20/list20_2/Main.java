package surasura.chapter20.list20_2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("apple", "orange", "strawberry");
        list.stream().map(s -> "[" + s + "]")
                .forEach(System.out::println);
    }
}
