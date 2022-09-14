package surasura.chapter17.list17_7;

public class Main {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;
        System.out.println(
                "クラス名　　：" + carClass.getName() + "¥n" +
                        "親クラス名　：" + carClass.getSuperclass().getName() + "\n" +
                        "フィールド数：" + carClass.getDeclaredFields().length + "\n" +
                        "メソッド数　：" + carClass.getDeclaredMethods().length
        );
        Class<SuperCar> superCarClass = SuperCar.class;
        System.out.println(
                "クラス名　　：" + superCarClass.getName() + "\n" +
                        "親クラス名　：" + superCarClass.getSuperclass().getName() + "\n" +
                        "フィールド数：" + superCarClass.getDeclaredFields().length + "\n" +
                        "メソッド数　：" + superCarClass.getDeclaredMethods().length
        );
    }
}
