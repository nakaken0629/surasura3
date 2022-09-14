package surasura.chapter19.list19_10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = Arrays.asList(1, 3, 2, 4);
        Collections.sort(list, Integer::compare);
        System.out.println(list);
    }
}
