package jframe;

import javax.swing.JFrame;
import javax.swing.*;

class CustomeFrame extends JFrame{//JFrame class is built in. we don't have any need to define it
    
public CustomeFrame(){
    
    this.setTitle("******MY Window ******");
    //setTitle("******MY Window ******");//gives same output without this in all position
    this.setLocation(200, 100);
    this.setSize(500, 400);
    this.setVisible(true);
    JLabel text=new JLabel("I am Ankur");
    this.getContentPane().add(text);
    this.setVisible(true);
}
}
public class extendedJFrame {

public static void main(String[] args) {

     CustomeFrame frame=new CustomeFrame();
     CustomeFrame frame1=new CustomeFrame();
     
     JFrame frmMain = new JFrame ("Calendar"); //Create frame, No Use of setTitle
     frmMain.setSize(330, 375);
     frmMain.setResizable(false);
     frmMain.setVisible(true);
    }
}