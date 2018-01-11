/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Event_driven_programming;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Action_Events_1 {
    
    public static void main(String[] args) {
        
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    JButton btnOK=new JButton("OKK");
    JButton btnCancel=new JButton("Cancel");
    JComboBox box= new JComboBox();
    
    panel.add(box);
    panel.add(btnOK); 
    panel.add(btnCancel);
    frame.add(panel);
    
    Listener listener=new Listener();
    
    box.addActionListener(listener);
    btnOK.addActionListener(listener);
    btnCancel.addActionListener(listener);
   
    
    frame.setSize(600, 500); 
    //frame.setBackground(Color.black);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(
      JFrame.EXIT_ON_CLOSE);
    
}   
}

class Listener implements ActionListener{
     
public void actionPerformed(ActionEvent e){
    
    System.out.println("The "+e.getActionCommand()+" is clicked");
    
}
}

