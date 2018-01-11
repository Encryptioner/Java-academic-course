
package panels;

import java.awt.*;
import javax.swing.*;


public class Making_Panels extends JFrame{
        ////
    public Making_Panels()
    {
        JPanel p1=new JPanel();
        for(int i=1;i<=9;i++)
        {
            p1.add(new JButton(""+i));
        }
        p1.add(new JButton(""+0));
        
        JPanel p3=new JPanel();
        p3.add(new JButton("START"));
        p3.add(new JButton("STOP"));
        
        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(3,0));
        p2.add(new JTextField("Time To Display Here"));
        p2.add(p1);
        p2.add(p3);
        setLayout(new GridLayout(1,2));
        add(new JLabel("Food to be placed here"));
        add(p2);
    }
    
    public static void main(String[] args) {
        
        Making_Panels frame=new Making_Panels();
        
        frame.setTitle("MY Test Frame");
        frame.setSize(380,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
    }
    
}
