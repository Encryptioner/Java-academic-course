/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layout_manager;

import javax.swing.*;
import java.awt.*;

public class ShowGridLayout extends JFrame{
    public ShowGridLayout(){
        
        //setLayout(new GridLayout(3,2,5,7)); 
        this.setLayout(new GridLayout(4,2,2,12));//GridLayout(int rows, int columns, int hGap, int vGap)
                
        //add(new JLabel("First Name"));
        add(new JTextField(8));
        //add(new JLabel("Middle Name\n(Optional)"));
        add(new JTextField(10));
        //add(new JLabel("Last Name"));
        add(new JTextField(8));
        //add(new JLabel("Password"));
        add(new JTextField(20));
    }
    
    public static void main (String[] args){
        ShowGridLayout frame=new ShowGridLayout();
        
        frame.setTitle("MY Test Frame");
        frame.setSize(280,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
    }
            
}
