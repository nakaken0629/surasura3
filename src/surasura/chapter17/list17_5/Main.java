package surasura.chapter17.list17_5;

public class Main {
    public static void main(String[] args) {
        /* CarクラスのClassインスタンス */
        Car car = new Car();
        Class<? extends Car> carClass = car.getClass();

        /* SuperCarクラスのClassインスタンス */
        SuperCar superCar = new SuperCar();
        Class<? extends SuperCar> superCarClass = superCar.getClass();
    }
}
