package interface_demo2;

public class C implements A, B{

    @Override
    public void play() {
        System.out.println("Hello I am from C");
    }
}
