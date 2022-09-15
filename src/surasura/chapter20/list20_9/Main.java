package surasura.chapter20.list20_9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "orange", "strawberry");
        long count = list.stream().count();
        System.out.println("count = " + count);
    }
}
