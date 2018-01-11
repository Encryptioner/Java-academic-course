/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layout_manager;

import javax.swing.*;
import java.awt.FlowLayout; 

public class Flow_Layout extends JFrame{
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        //frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));//10 means horizontalgap and 20 means virtical gap
        //frame.setLayout(new FlowLayout(FlowLayout.RIGHT,10,20));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));//last line execute when all 3 line is wriiten
        frame.add(new JLabel("First Name"));
        frame.add(new JTextField(8));
        frame.add(new JLabel("MI"));
        frame.add(new JTextField(1));
        frame.add(new JLabel("Last Name"));
        frame.add(new JTextField(8));
        
        frame.setTitle("MY Test Frame");
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);

}
}


