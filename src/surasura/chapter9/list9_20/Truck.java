package surasura.chapter9.list9_20;

public class Truck extends Car {
    private int payload = 0;

    /* 荷物（ペイロード）の確認 */
    int getPayload() {
        return this.payload;
    }

    /* 荷物（ペイロード）を載せる */
    void addPayload(int value) {
        this.payload += value;
    }

    /* 荷物（ペイロード）を下ろす */
    void deletePayload(int value) {
        this.payload -= value;
    }
}
