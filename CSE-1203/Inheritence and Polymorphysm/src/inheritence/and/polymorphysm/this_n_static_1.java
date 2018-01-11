
package inheritence.and.polymorphysm;

class Foo{
    private
        int i=4;
        static double k=0;//the value of static variable doesn't change with differnt function calling. so, here it was used to count the number of calling class foo by it's object..
    public
        void setI(int i)
        {
            //i=5; 
            System.out.println("i of this class what assigned early (not the i got by function parameter) - "+this.i);
            System.out.println("i of this class what got by function parameter - "+i);
            this.i=i; //this.i  indicates i variable of this function. without using this line program shows i=4. here i is the value got by function parameter
        }
        int getI()
        {
            return i;
        }
        
        static void setK()
        {
            ++Foo.k;
        }
        double getK()
        {
            return k;
        }
}

public class this_n_static_1 {
    public static void main(String[] args)
    {
        Foo f1=new Foo();
        Foo f2=new Foo();
        f1.setK();
        System.out.println("k in f1.getK = "+f1.getK());
        f2.setK();
        System.out.println("k in f2.getK = "+f2.getK());
        f2.setK();
        System.out.println("k in f1.getK = "+f1.getK());
        System.out.println("k in f2.getK = "+f2.getK());
        //f1.setK();
        f1.setI(3);
        
        //System.out.println(f1.getK());// counts the number of calling setK() function
        
        
        f2.setI(5);
        System.out.println("i in f1.getI() = "+f1.getI());
        System.out.println("i in f2.getI() = "+f2.getI());
        System.out.println("i in f1.getI() = "+f1.getI());

    }
}
