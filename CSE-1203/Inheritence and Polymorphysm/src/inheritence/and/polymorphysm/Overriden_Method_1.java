//in same package using same class in different program shows error
package inheritence.and.polymorphysm;

public class Overriden_Method_1 
{
    public static void main(String[] args)
    {
        B3 b=new B3();
        b.p(10);
    }

}
class A3
{
    //public void p(int i){}
    public void p(int i){
         System.out.println("Inside A2");
     }
}

class B3 extends A3
{
//overridden method
    @Override//overriden notation added by suggestion of netbean
    public void p(int i)//same function name and same type of variable. this function runs by overriding
    {
        System.out.println("Inside B3");
    }
}
