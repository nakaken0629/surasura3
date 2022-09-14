package surasura.chapter17.list17_4;

public class Main {
    public static void main(String[] args) {
        /* これは正しい */
        Class<Car> carClass1 = Car.class;

        /* TeacherクラスはCarクラスと継承関係がないのでコンパイルエラー */
//        Class<Teacher> carClass2 = Car.class;
    }
}
