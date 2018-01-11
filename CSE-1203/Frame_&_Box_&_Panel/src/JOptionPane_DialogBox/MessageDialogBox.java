
package JOptionPane_DialogBox;

import javax.swing.JOptionPane;

public class MessageDialogBox {
    public static void main(String[] args)
    {
        //JOptionPane.showMessageDialog(null,"write a text");
        JOptionPane.showMessageDialog(null,"Welcome to CSE","My Dialzzzzzzzzzzog Box",JOptionPane.ERROR_MESSAGE);
        String s=JOptionPane.showInputDialog(null,"Enter an integer");
        int i=Integer.parseInt(s);
        String s1="You have entered : "+i;
        JOptionPane.showMessageDialog(null,s1,"Integer input ",JOptionPane.DEFAULT_OPTION);
        
    }
}
