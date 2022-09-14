package surasura.chapter12.list12_5;

class Main {
    public static void main(String[] args) {
        NormalCar normalCar = new NormalCar();
        System.out.println("車は最大" + normalCar.getMaxPerson() + "人");
        SuperCar superCar = new SuperCar();
        System.out.println("スーパーカーは最大" + superCar.getMaxPerson() + "人");
    }
}
