package surasura.chapter14.list14_7;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        RuntimeExceptionExample example = new RuntimeExceptionExample();
        example.method1();
    }

    public void method1() {
        method2();
    }

    public void method2() {
        throw new MyRuntimeException();
    }
}