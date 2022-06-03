package surasura.chapter9.list9_28;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* コレクションにオブジェクトを用意する */
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Truck());
        cars.add(new LongDriveTruck());

        /* コレクション内のオブジェクトを１つずつ処理する */
        for(Car car : cars) {
            System.out.println(car.getCarType());
        }
    }
}
