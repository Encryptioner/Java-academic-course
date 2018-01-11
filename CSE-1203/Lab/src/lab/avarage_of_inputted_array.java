
package lab;

import java.util.Scanner;


public class avarage_of_inputted_array
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number of element in array : ");
        int n=input.nextInt();
        int i;
        double sum=0;
        double[] arrayValue=new double[n];
        
        System.out.println("Input "+n+" numbers in array : ");
        for(i=0;i<n;i++)
        {
            arrayValue[i]=input.nextDouble();
            sum+=arrayValue[i];            
        }
        
        double average=sum/n;
        //System.out.println("Number in array : "+n);   
        System.out.println("Sum of the number : "+sum);
        System.out.println("Avearage of the number : "+average);
                
    }
}
