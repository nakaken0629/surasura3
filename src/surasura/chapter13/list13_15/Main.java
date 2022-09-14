package surasura.chapter13.list13_15;

public class Main {
    public static void main(String[] args) {
        /* CarクラスがStockableインターフェイスを実装すると
         * コンパイルエラーはなくなる */
        Warehouse<Car> carWarehouse = new Warehouse<>();
        Car car = new Car();
        carWarehouse.stock(car);
        System.out.println("名前=" + carWarehouse.getItemName());
    }
}
