
package panels;

import java.awt.*;
import javax.swing.*;

public class Panels {
    public static void main(String[] args) {//BorderLayout is better than GridLayout
        // TODO code application logic here
        JFrame frame= new JFrame();
        
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
        p2.setLayout(new BorderLayout());
        p2.add(new JTextField("Time To Display Here"),BorderLayout.NORTH);
        p2.add(p1,BorderLayout.CENTER);
        p2.add(p3, BorderLayout.SOUTH);
        //p2.add(new JButton(""), BorderLayout.EAST);
        //p2.add(new JButton(""), BorderLayout.WEST);
   
        frame.add(p2,BorderLayout.CENTER);
        frame.add(new JButton("Food to be placed here"),BorderLayout.WEST);
        
        frame.setTitle("MY Test Frame");
        frame.setSize(380,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
    }
    
}
