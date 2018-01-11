
package GUI_Class;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.*;

public class Color_n_Font_Class extends JFrame{
    public Color_n_Font_Class(){
        
        JPanel p1=new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT,2,2));
        
        JButton jbtLeft=new JButton("Left");
        JButton jbtRight=new JButton("Right");
        JButton jbtCenter=new JButton("Center");
        jbtLeft.setBackground(Color.WHITE);
        jbtLeft.setForeground(Color.GREEN);
        jbtRight.setToolTipText("Right Button");//??
        
        p1.add(jbtLeft);
        p1.add(jbtRight);
        p1.add(jbtCenter);
        p1.setBorder(new TitledBorder("Three Buttons"));//import javax.swing.border.TitledBorder;
        
        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(1,3,5,5));
        JLabel jlblRed=new JLabel("Red");
        JLabel jlblOrange=new JLabel("Orange");
        
        //Font myFont=new Font("Arial",Font.BOLD,20);
        Font myFont=new Font("Arial",Font.BOLD+Font.ITALIC,20);
        
        //Border myBorder=new LineBorder(Color.BLACK,15);
        Border myBorder=new LineBorder(Color.BLACK,15);
        jlblRed.setFont(myFont);
        jlblRed.setBorder(myBorder);
        jlblRed.setForeground(Color.RED);
        
        jlblOrange.setBackground(Color.ORANGE);//No output of this line
        jlblOrange.setBorder(myBorder);
        
        p2.add(jlblRed); p2.add(jlblOrange);
        
        setLayout(new GridLayout(2,1,5,5));//divide frame for two panel
        add(p1);
        add(p2);
    }
        
        public static void main (String[] args){
        Color_n_Font_Class frame=new Color_n_Font_Class();
        
        frame.setTitle("MY Test Frame");
        frame.setSize(280,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
    }
}
