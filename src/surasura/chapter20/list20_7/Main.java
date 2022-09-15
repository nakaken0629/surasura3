package surasura.chapter20.list20_7;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "orange", "strawberry");

        /* toListを使った例 */
        List<String> resultList1 = list.stream().collect(toList());
        System.out.println("resultList1 = " + resultList1);

        /* joiningを使った例 */
        String resultList2 = list.stream().collect(joining(" - ", "< ", " >"));
        System.out.println("resultList2 = " + resultList2);
    }
}
