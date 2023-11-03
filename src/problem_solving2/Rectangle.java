package problem_solving2;

public class Rectangle extends Shape {
//dim1, dim2

    Rectangle(double dim1, double dim2){
        super(dim1,dim2);

    }

    @Override
    void area() {
        double result = dim1 * dim2;
        System.out.println("Rectangle area : " + result);
    }
}
