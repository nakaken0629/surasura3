package surasura.chapter10.list10_27;

class Person {
    /* インスタンス数（静的フィールド） */
    private static int count = 0;

    /* 数を管理しながらインスタンスを作る静的メソッド */
    static Person createInstance() {
        Person.count += 1;
        return new Person();
    }
}
