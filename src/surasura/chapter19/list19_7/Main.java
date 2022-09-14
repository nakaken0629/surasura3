package surasura.chapter19.list19_7;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        /* Comparator<Integer>は、List.sortメソッドの引数で要求されるラムダ式の型 */
        Comparator<Integer> comparator = (Integer o1, Integer o2) -> {
            return o1.compareTo(o2) * -1;
        };
        System.out.println(comparator.compare(1, 2));
    }
}
