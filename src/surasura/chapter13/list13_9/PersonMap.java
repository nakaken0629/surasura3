package surasura.chapter13.list13_9;

import java.util.HashMap;

public class PersonMap<K, V> {
    /* 誌面では省略しましたが、組み込みのHashMapを使ってPersonMapクラスを実際に実装しています */
    private HashMap<K, V> persons = new HashMap<>();

    public void put(K k, V v) {
        persons.put(k, v);
    }

    public V get(K k) {
        return persons.get(k);
    }
}