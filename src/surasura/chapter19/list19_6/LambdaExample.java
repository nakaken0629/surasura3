package surasura.chapter19.list19_6;

public class LambdaExample {
    public static void main(String[] args) {
        System.out.println("mainメソッドを開始しました");
        new Thread(() -> {
            System.out.println("ラムダ式の処理を開始しました");
            for (int i = 1; i <= 3; i++) {
                System.out.println(i);
            }
            System.out.println("ラムダ式の処理を終了しました");
        }).start();
        System.out.println("mainメソッドを終了しました");
    }
}