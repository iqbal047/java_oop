package problem_solving3;

import java.awt.*;

public class TextAreaExample {
    //How to add text area program in java
    TextAreaExample(){
        Frame f= new Frame();
        TextArea area=new TextArea("Welcome to TechIqbal");
        area.setBounds(10,30, 300,300);
        f.add(area);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new TextAreaExample();
    }
}
