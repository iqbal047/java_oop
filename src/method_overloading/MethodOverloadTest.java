package method_overloading;

public class MethodOverloadTest {
    public static void main(String[] args) {

        MethodOverload ob = new MethodOverload();

        ob.add();
        ob.add(5,10);
        ob.add(6.5,5.5);
        ob.add(5,10,20 );
    }
}
