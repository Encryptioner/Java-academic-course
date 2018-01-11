
package various_class_1;

//import java.math.*;

public class Class_n_Object {
    public static void main(String[] args)
    {
        circle c1=new circle(3);
        circle c2=new circle();
        circle c3=new circle(5);
        
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c3.area());
        
    }
}
class circle
{
    private
        int r;
    public  
        circle()
        {
            r=1;
        }
        circle(int x)
        {
            r=x;  
        }
        double area()
        {
            return (Math.PI*r*r);
        }
    
}