package surasura.chapter11.list11_5;

class MyClassA {
    /* private宣言されたフィールド */
    private int fieldA = 0;

    /* private宣言されたメソッド */
    private void methodA() {
        System.out.println("do methodA");
    }

    /* 同じクラスに属するフィールドやメソッド */
    void callSample() {
        System.out.println(this.fieldA); /*フィールドの参照 */
        this.methodA(); /* メソッドの呼び出し */
    }
}
