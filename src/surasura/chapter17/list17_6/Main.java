package surasura.chapter17.list17_6;

public class Main {
    public static void main(String[] args) {
        try {
            /* 書籍ではデフォルト名前空間にCarとSuperCarが所属しているが、
             * このサンプルでは別の名前空間に所属しているため、
             * パッケージ名を含めた完全なクラス名を指定している。
             */
            Class<?> carClass = Class.forName("surasura.chapter17.list17_6.Car");
            Class<?> superCarClass = Class.forName("surasura.chapter17.list17_6.SuperCar");
        } catch (ClassNotFoundException e) {
            /* クラスが見つからなかったときの処理 */
            System.out.println("クラスが見つかりませんでした");
        }
    }
}
