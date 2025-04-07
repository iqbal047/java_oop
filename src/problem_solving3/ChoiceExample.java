package problem_solving3;

import java.awt.*;

public class ChoiceExample {
    //How to dropdown in AWT program in java
    ChoiceExample(){
        Frame f= new Frame();
        Choice c=new Choice();
        c.setBounds(100,100, 75,75);
        c.add("Item 1 by Iqbal");
        c.add("Item 2 by Nawsish");
        c.add("Item 3 by Riaj");
        c.add("Item 4");
        c.add("Item 5");
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new ChoiceExample();
    }
    }
