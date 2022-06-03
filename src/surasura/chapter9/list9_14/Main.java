package surasura.chapter9.list9_14;

public class Main {
    public static void main(String[] args) {
        Car car;
        car = new Car();
        car.speedUp(40);        /* 時速40km加速する */
        car.speedDown(10);      /* 時速10km減速する　*/

        /* 速度 = 30と表示される */
        System.out.println("速度 = " + car.getSpeed());
    }
}
