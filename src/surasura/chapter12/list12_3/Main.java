package surasura.chapter12.list12_3;

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("車は最大" + car.getMaxPerson() + "人");
        SuperCar superCar = new SuperCar();
        System.out.println("スーパーカーは最大" + superCar.getMaxPerson() + "人");
    }
}
