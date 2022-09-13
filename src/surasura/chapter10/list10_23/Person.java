package surasura.chapter10.list10_23;

class Person {
    private static int count = 0; /* これは静的フィールド */
    private String name; /* これは通常のフィールド */

    /* これは静的メソッド */
    static void setCount(int count) {
        Person.count = count;
    }

    /* これは通常のメソッド */
    void setName(String name) {
        this.name = name;
    }
}