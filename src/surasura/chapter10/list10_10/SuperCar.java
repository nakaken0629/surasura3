package surasura.chapter10.list10_10;

class SuperCar extends Car {
    /* スピードを上げるメソッド */
    @Override
    void speedUp(int value) {
        this.speed += value;
        /* 安全装置（最高速度） */
        if (this.speed >= 300) {
            this.speed = 300;
        }
    }

    /* スピードを下げるメソッド */
    @Override
    void speedDown(int value) {
        value *= 1.1; /* ブレーキ性能を10%向上 */
        super.speedDown(value);
    }
}
