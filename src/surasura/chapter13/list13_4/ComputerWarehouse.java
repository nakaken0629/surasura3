package surasura.chapter13.list13_4;

/* パソコン専用倉庫クラス */
public class ComputerWarehouse {
    private Computer item;

    /* パソコンを預かる */
    public void stock(Computer item) {
        this.item = item;
    }

    /* パソコンを取り出す */
    public Computer leave() {
        Computer item = this.item;
        this.item = null;
        return item;
    }
}