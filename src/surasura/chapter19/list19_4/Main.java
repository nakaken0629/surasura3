package surasura.chapter19.list19_4;

import java.util.function.DoubleFunction;

public class Main {
    public static void main(String[] args) {
        /* DoubleFunction<Double>はdoubleを返すラムダ式を表す型 */
        DoubleFunction<Double> f = (double r) -> Math.PI * r * r;
        System.out.println(f.apply(5));
    }
}
