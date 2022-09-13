package surasura.chapter10.list10_9;

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
}