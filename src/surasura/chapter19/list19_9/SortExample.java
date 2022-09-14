package surasura.chapter19.list19_9;

import java.util.Arrays;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 2, 8);
        list.sort((o1, o2) -> o1.compareTo(o2) * -1);
        System.out.println(list);
    }
}