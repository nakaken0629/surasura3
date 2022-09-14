package surasura.chapter19.list19_2;

import java.util.function.DoubleFunction;

public class Main {
    public static void main(String[] args) {
        /* DoubleFunction<Double>はdoubleを返すラムダ式を表す型 */
        DoubleFunction<Double> f = (r) -> {
            double s = Math.PI * r * r; /* Math.PIは円周率を表す定数 */
            return s;
        };
        System.out.println(f.apply(5));
    }
}
