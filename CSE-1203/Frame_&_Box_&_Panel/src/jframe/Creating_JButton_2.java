

package jframe;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Creating_JButton_2 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("My Window");
        frame.setSize(700,500);
        frame.setLocation(0,500);
        
        Container container=frame.getContentPane();
        container.add(new JButton("OK"));
        
        JComboBox box= new JComboBox();
        container.add(box);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
