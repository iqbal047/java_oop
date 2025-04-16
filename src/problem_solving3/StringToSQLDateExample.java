package problem_solving3;

import java.sql.Date;

public class StringToSQLDateExample {
    public static void main(String[] args) {
        String str = "2025-03-31";
        Date date = Date.valueOf(str); // Converting string into SQL date
        System.out.println(date);
    }
}
