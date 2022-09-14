package surasura.chapter19.list19_5;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("ラムダ式の処理を開始しました");
            for (int i = 1; i <= 3; i++) {
                System.out.println(i);
            }
            System.out.println("ラムダ式の処理を終了しました");
        };
        runnable.run();
    }
}
