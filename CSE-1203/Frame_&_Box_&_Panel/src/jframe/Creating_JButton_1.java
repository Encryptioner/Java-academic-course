
package jframe;

//import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
//import javax.swing.*;

/*class CreatingFrame extends JFrame
{
    public CreatingFrame()
    {
        JFrame frame=new JFrame("Test Frame");
        frame.setTitle("My Window");
        frame.setSize(400,300);
        frame.setLocation(50,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}*/

public class Creating_JButton_1 {
    public static void main(String[] args)
    {
        //CreatingFrame frame=new CreatingFrame();
        JFrame frame=new JFrame("Test Frame");
        frame.setTitle("My Window");
        JButton btnOK=new JButton("OK");
        JButton btnO=new JButton("o");
        frame.add(btnOK);
        frame.add(btnO);
        JPanel panel=new JPanel();
        panel.setLayout(null);
        
        JButton btn=new JButton("OK");
        
        btn.setSize(5, 10);
        btn.setLocation(9,15);
        //btn.setBounds(5,10,5,15);
        panel.add(btn);
        frame.add(panel);
        frame.setSize(400,300);
        frame.setLocation(50,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /*private static class Jbutton {

        public Jbutton() {
            JButton btn=new JButton();
        }
    }*/
}
