package surasura.chapter20.list20_12;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("apple", "orange", "strawberry");
        list.stream()
                .forEach(s -> System.out.println("要素の内容 = " + s));
    }
}
