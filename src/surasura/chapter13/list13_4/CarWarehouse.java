package surasura.chapter13.list13_4;

/* 自動車専用倉庫クラス */
public class CarWarehouse {
    private Car item;

    /* 自動車を預かる */
    public void stock(Car item) {
        this.item = item;
    }

    /* 自動車を取り出す */
    public Car leave() {
        Car item = this.item;
        this.item = null;
        return item;
    }
}