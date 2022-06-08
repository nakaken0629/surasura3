package surasura.chapter16.list16_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);                /* int型からIntegerクラスへのボクシング */
        int value = list.get(0);    /* Integerクラスからint型へのアンボクシング */
        System.out.println("value = " + value);
    }
}
