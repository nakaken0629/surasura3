package surasura.chapter9.list9_27;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.getCarType());

        Car car2 = new Truck();
        System.out.println(car2.getCarType());

        Car car3 = new LongDriveTruck();
        System.out.println(car3.getCarType());
    }
}
