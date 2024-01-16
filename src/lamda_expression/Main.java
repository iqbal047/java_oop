package lamda_expression;

public class Main {
    public static void main(String[] args) {

        Playable playable = (int a, int b) -> {
            if(a>b)
                System.out.println("Max: "+a);
            else
                System.out.println("Max: "+b);
        };
        playable.maxNumber(22, 44);

    }
}
