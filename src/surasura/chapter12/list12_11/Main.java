package surasura.chapter12.list12_11;

public class Main {
    public static void main(String[] args) {
        /* TelevisionクラスもRadioクラスもPowerableインターフェイスを
         * 実装しているので、Powerable型の変数に代入できる
         */
        Powerable television = new Television();
        Powerable radio = new Radio();
        /* テレビのスイッチを操作する */
        boolean result1 = television.powerOn();
        television.powerOff();
        /* ラジオのスイッチを操作する */
        boolean result2 = radio.powerOn();
        radio.powerOff();
    }
}
