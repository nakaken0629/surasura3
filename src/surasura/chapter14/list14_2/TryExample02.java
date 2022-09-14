package surasura.chapter14.list14_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TryExample02 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        String[] dates = new String[2];
        dates[0] = "1984/12/26";
        dates[1] = "19xx/12/26";
        try {
            String stringDate = dates[2];
            Date date = format.parse(stringDate);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("この文字列は、日付に変換することができません。");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("範囲外の要素が指定されました。");
        }
    }
}