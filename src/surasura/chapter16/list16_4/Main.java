package surasura.chapter16.list16_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 10;
        Integer value = Integer.valueOf(i);     /* 基本型をラッパークラスでラップ */
        list.add(value);
    }
}
