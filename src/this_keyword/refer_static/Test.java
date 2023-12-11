package this_keyword.refer_static;

public class Test {
    static int i = 10;
    public Test ()
    {
        System.out.println(this.i);
    }
    public static void main (String args[])
    {
        Test t = new Test();
    }
}
