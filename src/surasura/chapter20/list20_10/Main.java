package surasura.chapter20.list20_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        long sum = Arrays.stream(list).sum();
        System.out.println("sum = " + sum);
    }
}
