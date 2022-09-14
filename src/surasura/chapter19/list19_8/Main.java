package surasura.chapter19.list19_8;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        /* Comparator<Integer>は、List.sortメソッドの引数で要求されるラムダ式の型 */
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2) * -1;
        System.out.println(comparator.compare(1, 2));
    }
}
