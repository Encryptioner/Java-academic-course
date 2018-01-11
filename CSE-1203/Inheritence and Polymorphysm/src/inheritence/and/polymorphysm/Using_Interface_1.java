
package inheritence.and.polymorphysm;


interface Edible{
public abstract String howToEat();
}

public class Using_Interface_1 {
    public static void main(String[] args) 
    {
        Object[] objects=new Object[3];
        Tiger t=new Tiger();
        objects[0]=new Tiger();
        objects[1]=new Chicken();
        objects[2]=new Apple();
        for (Object object : objects) {
            if (object instanceof Edible) {
                System.out.println(((Edible) object).howToEat());
            }
        }
    }
}

class Animal{}

class Tiger extends Animal {
}

class Chicken extends Animal implements Edible{
    @Override  
    public String howToEat(){
    return "Chicken: Fry it";
    }
}

abstract class Fruit implements Edible{}

class Apple extends Fruit{
    @Override
    public String howToEat(){
    return "Fruit: Make apple cider";
    }
}
class Orange extends Fruit{
    @Override
    public String howToEat(){
    return "Orange: Make orange juice";
    }
}
