
package jframe;
import javax.swing.*;
import java.awt.*;

public class JBtton_1 
{
    public static void main(String[] args)
    {
        JButton jbtn=new JButton();
        System.out.println(jbtn instanceof JButton);
        System.out.println(jbtn instanceof AbstractButton);
        System.out.println(jbtn instanceof JComponent);
        System.out.println(jbtn instanceof Container);
        //System.out.println(jbtn instanceof Window);
        System.out.println(jbtn instanceof Component);
        //System.out.println(jbtn instanceof Font); //show wrong as jbutton is not an instanceof fot
        System.out.println(jbtn instanceof Object);
    }
}
