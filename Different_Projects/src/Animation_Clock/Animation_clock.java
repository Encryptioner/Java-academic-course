
package Animation_Clock;

import javax.swing.*;
import javax.swing.Timer;

import java.math.*;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;


public class Animation_clock 
{
    public static void main(String[] args)
    {
	JFrame frame=new JFrame();
	ClockAnimation clock=new ClockAnimation();
	//StillClock clock=new StillClock();
	frame.add(clock,BorderLayout.CENTER);
	frame.setSize(600, 500); 
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(
	      JFrame.EXIT_ON_CLOSE);
    }
}

class StillClock extends JPanel{
	int seconds; int minutes; int hours;
	StillClock(){
		setCurrentTime();
	}
 protected void paintComponent(Graphics g){
	System.out.println("inside paintComponent\n");
	
    super.paintComponent(g);
    
	//seconds=10; minutes=35; hours=5;
    int radius=(int)(Math.min(getWidth()/2, getHeight()/2)*.8);
    int xCenter=(int)(getWidth()/2);
    int yCenter=(int)(getHeight()/2);
    System.out.println(xCenter+" "+yCenter);
    g.fillOval(xCenter-radius,yCenter-radius,2*radius,2*radius);
    Font myFont=new Font("Arial",Font.BOLD,15);
    g.setColor(Color.cyan);
    g.setFont(myFont);
    g.drawString("12", xCenter-5, yCenter-radius+15);
    g.drawString("3", xCenter+radius-15, yCenter);
    g.drawString("6", xCenter-10, yCenter+radius-10);
    g.drawString("9", xCenter-radius+10, yCenter);
   
   //hands for second
    int sHand=(int)(radius*.8);
    int xSeconds= (int)(xCenter+ sHand*(Math.sin(seconds*2*Math.PI/60)));
    int ySeconds= (int)(yCenter- sHand*(Math.cos(seconds*2*Math.PI/60)));
    g.drawLine(xCenter,yCenter,xSeconds,ySeconds);
    
  //hands for minute
    g.setColor(Color.yellow);
    int mHand=(int)(radius*.66);
    int xMinutes= (int)(xCenter+ mHand*(Math.sin((minutes+seconds/60.0)*2*Math.PI/60)));
    int yMinutes= (int)(yCenter- mHand*(Math.cos((minutes+seconds/60.0)*2*Math.PI/60)));
    g.drawLine(xCenter,yCenter,xMinutes,yMinutes);
    
  //hands for minute
    g.setColor(Color.red); 
    int hHand=(int)(radius*.5);
    int xHours= (int)(xCenter+ hHand*(Math.sin((hours+minutes/60.0)*2*Math.PI/12)));
    int yHours= (int)(yCenter- hHand*(Math.cos((hours+minutes/60.0)*2*Math.PI/12)));
    g.drawLine(xCenter,yCenter,xHours,yHours);
    g.drawString(hours+":"+minutes+":"+seconds,xCenter-30, yCenter+radius+25 );
    
    
}
 public void setCurrentTime(){
		System.out.println("Inside func settime");
		Calendar calendar=new GregorianCalendar();
		this.hours=calendar.get(calendar.HOUR_OF_DAY);
		this.minutes=calendar.get(calendar.MINUTE);
		this.seconds=calendar.get(calendar.SECOND);
		
	}
	
}

class ClockAnimation extends StillClock{
	public ClockAnimation(){
		//setCurrentTime();
		Timer timer=new Timer(1000, new TimerListener());
		timer.start();
		//repaint();
	}	
//}

class TimerListener  implements ActionListener{
	public void actionPerformed(ActionEvent e){
		//System.out.println("Inside action set time");
		setCurrentTime();
		System.out.println("Sec="+seconds+" Min="+minutes+" Hour="+hours);
		repaint();
		//System.out.println("After repaint");
	}	
}
}