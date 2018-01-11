
package lab;

public class Overriding_Method_2 
{
    public static void main(String[] args)
    {
        GeometricObject cir=new Circle(5);
        GeometricObject rec=new Rectangle(3,4);
        
        cir.setColor("RED");
        //cir.setFilled(true);//if this line is used will print filled
        cir.setFilled(false);//if this line is used will print not filled
        System.out.println(+cir.getArea() + " and color= " +cir.getColor());
        System.out.println("rect = "+rec.getArea());
        System.out.println("overriden in toString() - "+cir.toString());

        if(cir.isFilled())
        {
            System.out.println("Filled");
        }
        else
        {
            System.out.println("Not Filled");}
        }
    
        //System.out.println("overriden in toString() - "+cir.toString());
    }

    class GeometricObject
    {
        private String color="White";
        private boolean filled;
        
        public String getColor()
        { 
            return color;
        }
        public void setColor(String color)
        {
            this.color=color;
        }
        public boolean isFilled()
        {
            return filled;
        }
        public void setFilled(boolean filled)
        {
            this.filled=filled;
        }
        @Override
        public String toString()
        {
            return "color = "+color+"\nfilled = "+filled;
        }
        public double getArea()
        {
            return 0;
        }
 
    }

    class Circle extends GeometricObject
    {
        private double radius;
        public Circle(){};
        
        public Circle(double radius)
        {
            this.radius=radius;
        }
        @Override
        public double getArea()
        {
            return Math.PI*radius*radius;
        }
        @Override
        public String toString()
        {
            return super.toString()+"\nRadius = "+radius;
        }
    }
    class Rectangle extends GeometricObject
    {
        private double width=5;//if we assign width=5 the program show same output. it indicates the
        private double length;
        public Rectangle(){};
        public Rectangle(double width, double length)
        {
            System.out.println("width in class = "+this.width);//it indicates that "this." ponter indicates width of this class what assigned early 
            this.width=width;
            this.length=length;
        }
        @Override
        public double getArea()
        {
            return width*length;
        } 
 }
 
