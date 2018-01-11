
package GUI_Class;

import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;

public class Using_Paint_Component {
    public static void main(String[] args) {
        
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        frame.add(new NewPanel());
        
        frame.setSize(400, 300); 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class NewPanel extends JPanel{//Nothing written. so it is private
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawLine(100,80,50,50);
    g.drawString("Banner", 100, 40);
    g.drawRoundRect(150,100,200,60,20,12);//(x, y, w, h, aw, ah);
    g.fillRoundRect(150,100,200,60,20,12);//(x, y, w, h, aw, ah);
    //g.setBackground(Color.ORANGE);
    g.drawOval(200, 180, 100, 60);
    g.fillOval(200, 180, 50, 60);
    /*
    drawArc(x, y, w, h, angle1, angle2);
    fillArc(x, y, w, h, angle1, angle2);
    int[] x = {40, 70, 60, 45, 20};
    int[] y = {20, 40, 80, 45, 60};
    g.drawPolygon(x, y, x.length);
    g.fillPolygon(x, y, x.length);

    */
    }
}
