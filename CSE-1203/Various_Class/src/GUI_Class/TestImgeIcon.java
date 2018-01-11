
package GUI_Class;

import javax.swing.*;
import java.awt.*;

class TestImageIcon extends JFrame{
    private ImageIcon usIcon=new ImageIcon("G:\\Administrator\\My_Codes\\Java Files\\NetBeans\\Various_Class\\src\\GUI_Class\\T-1.PNG");
    private ImageIcon usIcon1=new ImageIcon("G:\\Administrator\\My_Codes\\Java Files\\NetBeans\\Various_Class\\src\\GUI_Class\\T-2.PNG");
    private ImageIcon usIcon2=new ImageIcon("G:\\Administrator\\My_Codes\\Java Files\\NetBeans\\Various_Class\\src\\GUI_Class\\T-3.PNG");
    private ImageIcon usIcon3=new ImageIcon("G:\\Administrator\\My_Codes\\Java Files\\NetBeans\\Various_Class\\src\\GUI_Class\\T-4.PNG");

    public TestImageIcon(){                                                                                                                                                                                   
        setLayout(new GridLayout(1,4,5,5));
        add(new JLabel(usIcon));
        add(new JLabel(usIcon1));
        add(new JLabel(usIcon2));
        add(new JLabel(usIcon3));
}
    public static void main (String[] args){
        TestImageIcon frame=new TestImageIcon();
        
        frame.setTitle("MY Test Frame");
        frame.setSize(800,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
    }

}
