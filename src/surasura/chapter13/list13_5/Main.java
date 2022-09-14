package surasura.chapter13.list13_5;

public class Main {
    public static void main(String[] args) {
        /* パソコンを倉庫に預ける */
        ComputerWarehouse computerWarehouse = new ComputerWarehouse();
        Computer computer = new Computer();
        computerWarehouse.stock(computer);

        /* 自動車を倉庫に預ける */
        CarWarehouse carWarehouse = new CarWarehouse();
        Car car = new Car();
        carWarehouse.stock(car);

        /* パソコンを倉庫から取り出す */
        Computer computer2 = computerWarehouse.leave();

        /* 自動車を倉庫から取り出す */
        Car car2 = carWarehouse.leave();
    }
}
