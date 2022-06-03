package surasura.chapter9.list9_15;

public class Main {
    public static void main(String[] args) {
        Car car;
        car = new Car();
        car.speedUp(100000);    /* 時速10万km加速?! */
        car.speedDown(-40);     /* 時速マイナス40km減速?!　*/

        /* 速度 = 100040と表示される */
        System.out.println("速度 = " + car.getSpeed());
    }
}
