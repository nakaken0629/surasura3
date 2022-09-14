package surasura.chapter15.list15_5;

public class Example03 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        System.out.println("メインスレッドを終了します。");
    }
}