
package JOptionPane_DialogBox;

import javax.swing.JOptionPane;

public class SumInDialogBox {
    public static void main(String[] args)
    {
        String option1=JOptionPane.showInputDialog("Enter 1st value : ");
        int data1=Integer.parseInt(option1);

        System.out.println(data1);
        
        String option2=JOptionPane.showInputDialog("Enter 2nd value : ");
        int data2=Integer.parseInt(option2);

        System.out.println(data2);
        
        JOptionPane.showMessageDialog(null,"Sum of two value :\n\n      "+data1+" + "+data2+" = "+(data1+data2));
        JOptionPane.showMessageDialog(null,"Sum of two value :\n\n      "+data1+" + "+data2+" = "+(data1+data2),"SUM",JOptionPane.DEFAULT_OPTION);
        JOptionPane.showMessageDialog(null,"Sum of two value :\n\n      "+data1+" + "+data2+" = "+(data1+data2),"SUM",JOptionPane.ERROR_MESSAGE);
        
    }
    
}
