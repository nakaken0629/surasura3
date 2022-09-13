package surasura.chapter10.list10_29;

class Car {
    /* MAX_SPEEDという定数を準備する */
    private static final int MAX_SPEED = 180;
    private int speed;

    void speedUp(int value) {
        this.speed += value;
        /* 安全装置（最高速度を定数で指定する） */
        if (this.speed >= MAX_SPEED) {
            this.speed = MAX_SPEED;
        }
    }
}

