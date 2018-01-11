
package JOptionPane_DialogBox;

import javax.swing.JOptionPane;

public class InputDialogBox {
    public static void main(String[] args)
    {
        String option1=JOptionPane.showInputDialog("Enter a value : ");
        int data=Integer.parseInt(option1);

        System.out.println(data);
        System.out.println(option1);//works appropriately without previous two line but can't be printed data in message box
        
        
        //Message Dialog Box
        
        
        JOptionPane.showMessageDialog(null," ERROR !! ");

        
    }
    
}
