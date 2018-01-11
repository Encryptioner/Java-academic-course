
package various_class_1;

//import java.util.*;
import java.util.Date;


public class Date_Class {
    public static void main(String[] args)
    {
        Date date=new Date();
        
        System.out.println(date.getTime());
        System.out.println(date.toString());
        System.out.println(date.clone());
        System.out.println(date.hashCode());
        System.out.println(date.toInstant());
        System.out.println(date.getTimezoneOffset());
        System.out.println(date.getDate());
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());
    }
    
}
