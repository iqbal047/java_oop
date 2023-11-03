package problemSolving;

public class Box {
    double height,weight,depth;       //instance variable

    Box(double h, double w, double d){
        height = h;
        weight = w;
        depth = d;
    }

    void displayVol(){
        double vol = height * weight * depth;

        System.out.println("Volume is : " + vol);



//        System.out.println("Height = "+ height);
//        System.out.println("Weight = "+ weight);
//        System.out.println("Depth = "+ depth);
    }
}
