
package various_class_1;

//import java.util.Scanner;

public class Current_Time {
    public static void main(String[] args)
    {
        long total1=System.currentTimeMillis();
        long total=System.currentTimeMillis()/1000;//so when was the second = 0 ??
        System.out.println("Total Second = "+total);
        int sec=(int)total%60;
        long tmin=total/60;
        int min=(int)tmin%60;
        long thour=tmin/60;
        int hour=(int)(thour%24)+6;
        //int hour=(int)(thour%24)-8;
        System.out.println("Time = "+thour+" : "+tmin+" : "+total1);
        System.out.println("Current Time = "+hour+" : "+min+" : "+sec);//gives accurate time+2 hr
        
    }
    
}
