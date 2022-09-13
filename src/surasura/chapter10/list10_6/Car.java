package surasura.chapter10.list10_6;

class Car {
    private int speed;

    /* 独自コンストラクターを定義する。
    これによりデフォルトコンストラクターは用意されなくなる */
    Car(int speed) {
        this.speed = speed;
    }
}