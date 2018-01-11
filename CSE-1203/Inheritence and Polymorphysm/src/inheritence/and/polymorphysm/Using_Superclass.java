package inheritence.and.polymorphysm;

public class Using_Superclass 
{
    public static void main(String[] args) 
    {
        Subclass s = new Subclass();
        /*s.printMethod(); 
        Superclass s2 = new Superclass();
        s2.printMethod(); */
    }

}

class Superclass 
{
    Superclass()
    {
        System.out.println("\nInside super");
    }
    Superclass(int x)
    {
        System.out.println("Inside super x");
    }
    public void printMethod()
    {
        System.out.println("Printed in Superclass.");
    }
}

//Here is a subclass, called Subclass, that overrides printMethod():
class Subclass extends Superclass
{
    public Subclass()
    {
        super(20); //first line in the subclass constructor. call Superclass(int x)
        System.out.println("Inside sub");
    }
    public void printMethod()
    {
        super.printMethod();
        //printMethod();
        System.out.println("Printed in Subclass");
    }
}

