/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layout_manager;

import javax.swing.*;
import java.awt.FlowLayout;

public class ShowFlowLayout extends JFrame{
    public ShowFlowLayout()
            {
                setLayout(new FlowLayout(FlowLayout.LEFT,25,20));
                add(new JLabel("First Name"));
                add(new JTextField(8));
                add(new JLabel("Middle Name\n(Optional)"));
                add(new JTextField(10));
                add(new JLabel("Last Name"));
                add(new JTextField(8));
                System.out.println("\n");//doesn't work
                add(new JLabel("Password"));
                add(new JTextField(20));
            }
    
    public static void main(String[] args) {
        
        ShowFlowLayout frame=new ShowFlowLayout();
        
        frame.setTitle("MY Test Frame");
        frame.setSize(280,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
    }
}