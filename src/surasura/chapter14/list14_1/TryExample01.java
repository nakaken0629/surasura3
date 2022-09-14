package surasura.chapter14.list14_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TryExample01 {

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = format.parse("19XX/08/21");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("この文字列は、日付に変換できません。");
        }
    }
}