package varargs_method;

public class AddDemo {

    int sum = 0;
    void add(int ... num){
        int sum = 0;
        for(int x : num){
            sum = sum + x;
        }
        System.out.println(sum);
    }

}
