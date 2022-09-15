package surasura.chapter20.list20_11;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("apple", "orange", "strawberry");
        boolean isMatch =
                list.stream().anyMatch(s -> s.startsWith("o"));
        System.out.println(isMatch ? "Matched!" : "Unmatched!");
    }
}
