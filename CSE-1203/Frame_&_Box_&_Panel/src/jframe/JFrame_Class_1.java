
package jframe;

import javax.swing.JFrame;
import javax.swing.*;


public class JFrame_Class_1 {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("My Window");
        frame.setSize(700,300);//tiny frame without this line
        frame.setLocation(300,300);//location is not necessary as it can positioned by mouse
        
        JLabel text=new JLabel("I am Ankur");
        frame.getContentPane().add(text);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close when X isclicked

    }
}

