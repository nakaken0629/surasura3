package surasura.chapter10.list10_14;

class Car {
    protected int speed;

    /* finalを付けてオーバーライドを禁止する */
    final void initialize() {
        this.speed = 0;
    }
}
