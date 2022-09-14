package surasura.chapter19.list19_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /* List<Integer> list = new ArrayList<>()と同等の処理 */
        Supplier<List<Integer>> supplier = ArrayList::new;
        List<Integer> list = supplier.get();
        Collections.sort(list, Integer::compare);
        System.out.println(list);
    }
}
