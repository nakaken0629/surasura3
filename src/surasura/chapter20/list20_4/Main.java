package surasura.chapter20.list20_4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("apple", "orange", "strawberry");
        list.stream().filter(s -> s.length() >= 6)
                .forEach(System.out::println);
    }
}
