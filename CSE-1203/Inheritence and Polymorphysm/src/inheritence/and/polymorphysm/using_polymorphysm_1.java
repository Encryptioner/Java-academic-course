
package inheritence.and.polymorphysm;


public class using_polymorphysm_1 
{
    public static void main(String[] args)
    {
        polymorphysm_outside_main p = new polymorphysm_outside_main();
        p.classCall();
        //m(new GraduateStudent());//only this line print student. graduate goes to it's extends and got toString(). so it doesn't go to person. if it doesn't get  toString() in student it will go to person.
                                //if it also doesn't get  toString() it will print inheritence.and.polymorphysm.GraduateStudent@15db9742 from object class
        //m(new Student());//only this line print student. student has it's own toString().
        //m(new Person());//only this line print person. person has it's own toString().
        //m(new Object());//only this line print java.lang.Object@15db9742 from object class
    }
    public static void m(Object x)
    {
        System.out.println(x.toString());
    }
}

class polymorphysm_outside_main
{
    public void classCall()
    {
        m(new GraduateStudent());//output same as declaration in main
        m(new Student());
        m(new Person());
        m(new Object());
    }
    public static void m(Object x)
    {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student{}

class Student extends Person
{
    public String toString()
    {
        return "student";
    }
}

class Person extends Object
{
    public String toString()
    {
        return "person";
    }
}