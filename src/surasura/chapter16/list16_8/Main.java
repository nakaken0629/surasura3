package surasura.chapter16.list16_8;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("foo.txt");
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
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    /* closeの時のエラーは慣習的に無視をしてよい */
                }
            }
        }
    }
}
