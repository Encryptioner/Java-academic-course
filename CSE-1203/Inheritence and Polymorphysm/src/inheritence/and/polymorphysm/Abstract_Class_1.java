/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritence.and.polymorphysm;

public class Abstract_Class_1 
{
    public static void main(String[] args)
    {
        GeometricObject cir=new Circle(5);
        //Circle cir=new Circle(5);//gives same output 
        GeometricObject rec=new Rectangle(3,4);
        
        cir.setColor("RED");
        //cir.setFilled(true);//if this line is used will print filled
        cir.setFilled(false);//if this line is used will print not filled
        System.out.println(+cir.getArea() + " and color= " +cir.getColor());
        System.out.println("rect="+rec.getArea());

        if(cir.isFilled())
        {
            System.out.println("Filled");
        }
        else
        {
            System.out.println("Not Filled");}
        }
    }

    abstract class GeometricObject
    //class GeometricObject
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
        public abstract double getArea();
 
    }

    class Circle extends GeometricObject
    {
        private double radius;
        public Circle(){};
        
        public Circle(double radius)
        {
            this.radius=radius;
        }
        public double getArea()
        {
            return Math.PI*radius*radius;
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
        public double getArea()
        {
            return width*length;
        } 
 }
 
