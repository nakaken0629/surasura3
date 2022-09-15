package surasura.chapter20.list20_1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        int nums[] = {1, 2, 3, 4};
        var s1 = Arrays.stream(nums); /* 配列から取得 */
        var s2 = IntStream.range(1, 5); /* 1から5までの数列から取得 */
        var s3 = Files.lines(Path.of("mytext.txt")); /* mytext.txtファイルから取得 */
        var s4 = new Random().ints(); /* 乱数から取得 */
    }
}
