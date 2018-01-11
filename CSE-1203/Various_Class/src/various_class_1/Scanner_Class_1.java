package various_class_1;

import java.util.Scanner;

public class Scanner_Class_1 {
    public static void main(String[] args)
    {    
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int intValue=input.nextInt();
        
        System.out.println("You Entered : "+intValue);//automatically generate a new line
        System.out.print("You Entered : "+intValue);
        System.out.print("You Entered : \n"+intValue);
        
        System.out.print("You Entered : %d is "+intValue);
        
        Scanner input2=new Scanner(System.in);
        
        System.out.print("\nEnter a line : ");       
        String strValue=input2.next();//print until whitespace 
        System.out.print("You Typed : "+strValue);
        
        Scanner input3=new Scanner(System.in);//input2 can't be new object as it initialized first
        
        System.out.print("\n\nEnter a line2 : ");       
        //String strValue=input2.next();//same variable name isn't accepted
        //String strValue=input.nextLine();//in another object with same variable name isn't accepted
        String strLine=input3.nextLine();//input2 doesn't run correctly
        System.out.println("You Typed2 : "+strLine);
        System.out.println("You Typed2 : ");
        Scanner input4=new Scanner(System.in);
        long lli=input4.nextLong();
        System.out.println("lli = "+lli);
        System.out.println("You Typed2 : ");
    }
}
