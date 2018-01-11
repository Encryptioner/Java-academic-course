
package GUI_Class;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Graphic_Class {
    public Graphic_Class()
    {
        JFrame frame=new JFrame();
        frame.setSize(700, 600);
        frame.setLocation(20,30);
        /*frame.setResizable(false);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*JPanel panel=new JPanel();
        JLabel Banner=new JLabel("Banner");
        frame.add(Banner);
        System.out.println(Banner.getGraphics()); 
        
        JOptionPane.showMessageDialog(null,"Delay");//this line is necessary. why?
        /*panel.getGraphics().fillRect(100,200,300,200);
        panel.getGraphics().drawLine(100, 500, 300, 300);//1st 2 int is co-ordinate (x,y) where y = -(y) in general geometric diagram
        //frame.getGraphics().drawLine(0, 0, 300, 300);//in drawline (0,0) co-ordinate is location co-ordinate.
        Component add = frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        JPanel panel=new JPanel()
        {
            public void paintCoponent(Graphics g)
            {
                super.paintComponent(g);
                g.drawLine(100, 500, 300, 300);
                //g.fillRect(100,200,300,200);
            }
        };
        panel.setLayout(null);
        frame.add(panel);
        //frame.validate();//because calling panel after setvisible was called
        //frame.repaint();
        frame.setResizable(false);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    public static void main (String[] args){
        new Graphic_Class();
        
        /*JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        JLabel Banner=new JLabel("Banner");
        frame.add(Banner);
        System.out.println(Banner.getGraphics()); 
        
        frame.setSize(700, 600);
        frame.setLocation(20,30);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JOptionPane.showMessageDialog(null,"Delay");//this line is necessary. why?
        panel.getGraphics().fillRect(100,200,300,200);
        panel.getGraphics().drawLine(100, 500, 300, 300);//1st 2 int is co-ordinate (x,y) where y = -(y) in general geometric diagram
        //frame.getGraphics().drawLine(0, 0, 300, 300);//in drawline (0,0) co-ordinate is location co-ordinate.
        Component add = frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        
    }
}
