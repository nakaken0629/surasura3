package surasura.chapter14.list14_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FinallyExample {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = format.parse("19XX/12/26");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("この文字列は、日付に変換することができません。");
        } finally {
            System.out.println("最後に必ず実行されます。");
        }
    }
}