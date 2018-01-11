
package inheritence.and.polymorphysm;


public class Using_Super_2_herbert_4chapter
{
    public static void main(String args[])
    {
        //B subOb = new B(2);
        B subOb = new B(1,2);
        subOb.show();
    }
}

// Using super to overcome name hiding.
class A
{
    int i=5;
}
// Create a subclass by extending class A.
class B extends A {
    int i; // this i hides the i in A
    
    //B(int b)
    B(int a,int b)
    {
        super.i = a; // i in A//by super keyword we can access in member variable of base class directly
        i = b; // i in B
    }
    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}