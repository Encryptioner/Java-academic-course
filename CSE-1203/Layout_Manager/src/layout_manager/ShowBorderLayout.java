
package layout_manager;

import javax.swing.*;
import java.awt.BorderLayout;

/**
 *
 * @author Ankur
 */
public class ShowBorderLayout extends JFrame{

    /**
     *
     */
    public ShowBorderLayout()
    {
        //setLayout(new BorderLayout(75,70));// BorderLayout(horizontal(x) space between borders ,vertical(y) space between borders)
        setLayout(new BorderLayout(15,20));

        // Add buttons to the frame
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton(""), BorderLayout.WEST);
        //add(new JButton("West"), BorderLayout.WEST);//Doesn't add extra BOrder
        add(new JButton("North"), BorderLayout.NORTH);//If we skip this line North's place doesn't become empty
        add(new JButton("Center"), BorderLayout.CENTER);//If we skip this line Center's place become empty
    }
    
    public static void main(String[] args)
    {
        ShowBorderLayout frame1=new ShowBorderLayout();
        frame1.setTitle("My Window");
        frame1.setSize(400,200);
        frame1.setLocationRelativeTo(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        
    }
}


