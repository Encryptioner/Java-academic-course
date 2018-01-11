//in same package using same class in different program shows error like A,B
package inheritence.and.polymorphysm;

public class Overloading_Method_1
{
    public static void main(String[] args)
    {
        B2 b=new B2();
        //b.p(10.0);//for public void p(double i                            )
        b.p(10);//for public void p(double i).. it will not print anything as sended value isn't double
    }
}
class A2
{
    //public void p(int i){} 
     public void p(int i){
         System.out.println("Inside A2");
     }
}

class B2 extends A2
{
    //Method p() is overloaded
    public void p(double i)//same function name but differnt type of variable. this function runs by overloading 
    {
        System.out.println("Inside B3");
    }

}