
package JOptionPane_DialogBox;

import javax.swing.JOptionPane;

public class ConfirmDialogBox {
    public static void main(String[] args)
    {
        int option=0;
        option=JOptionPane.showConfirmDialog(null,"continue");
        
        System.out.println(option);//Yes=0, No=1, Cancel=2

    }
    
}
