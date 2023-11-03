package problem_solving2;

public class Circle extends Shape{
  //dim1,dim2
    // area = 3.1416 * r *r

    Circle(double r){
        super(r,r);
    }


    @Override
    void area() {
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle area : " + result);
    }
}
