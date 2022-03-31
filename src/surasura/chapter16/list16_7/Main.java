package surasura.chapter16.list16_7;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("foo.txt")) {
            while (true) {
                int data = reader.read();
                if (data < 0) {
                    break;
                }
                /* ここに入力されたデータを操作する処理 */
                System.out.print((char) data);
            }
        } catch (IOException e) {
            /* ここにエラー時の処理 */
            System.out.println(e);
        }
    }
}
