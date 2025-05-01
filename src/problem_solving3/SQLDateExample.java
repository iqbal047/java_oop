package problem_solving3;

public class SQLDateExample {
    //53. How to print date and time in java Program
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        System.out.println(date);
    }
}
