package surasura.chapter10.list10_20;

public class Main {
    public static void main(String[] args) {
        Car car = new Truck();
//        Truck truck1 = car; /* コンパイルエラー */
        Truck truck2 = (Truck) car;
    }
}
