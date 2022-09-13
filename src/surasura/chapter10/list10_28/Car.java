package surasura.chapter10.list10_28;

class Car {
    private int speed;

    void speedUp(int value) {
        this.speed += value;
        /* 安全装置（最高速度に値をそのまま指定） */
        if (this.speed >= 180) {
            this.speed = 180;
        }
    }
}
