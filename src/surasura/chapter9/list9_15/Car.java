package surasura.chapter9.list9_15;

/* speedフィールドがカプセル化と公開メソッドを用意したCarクラス */
class Car {
    /* スピードを保存するフィールド */
    private int speed;

    /* スピードを取得するメソッド */
    int getSpeed() {
        return this.speed;
    }

    /* スピードを上げるメソッド */
    void speedUp(int value) {
        this.speed += value;
    }

    /* スピードを下げるメソッド */
    void speedDown(int value) {
        this.speed -= value;
    }
}
