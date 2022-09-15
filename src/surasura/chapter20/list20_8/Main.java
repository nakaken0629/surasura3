package surasura.chapter20.list20_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("apple", "orange", "strawberry");
        Optional<String> s = list.stream().findFirst();
        System.out.println("s = " + s.get());
    }
}
