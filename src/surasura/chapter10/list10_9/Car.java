package surasura.chapter10.list10_9;

class Car {
    protected int speed;

    /* スピードを上げるメソッド */
    void speedUp(int value) {
        this.speed += value;
        /* 安全装置（最高速度） */
        if (this.speed >= 180) {
            this.speed = 180;
        }
    }

    /* スピードを下げるメソッド */
    void speedDown(int value) {
        this.speed -= value;
        /* 安全装置（バック時） */
        if (this.speed <= -15) {
            this.speed = -15;
        }
    }
}
