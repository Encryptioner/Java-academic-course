
package Lightoj_1214_Large_Division;

import java.math.BigInteger;
import java.util.Scanner;

public class Main{
public static void main(String[] arg){
	
        Scanner input=new Scanner(System.in);
        int i,t,c=0,temp;
        BigInteger A,B,C,D,E;
        D=new BigInteger("0");
        E=new BigInteger("-1");
        //D=BigInteger.valueOf(c);
        
        t=input.nextInt();
        
        for(i=1;i<=t;i++)
        {
            A = input.nextBigInteger();
            B = input.nextBigInteger();
            
            temp=B.compareTo(D);
            if(temp<=0)
            {
                B=B.multiply(E);
            }
            
            C=A.mod(B);
            c++;
            System.out.print("Case "+c+": ");
            
            if(C.equals(D))
            {
                System.out.println("divisible");
            }
            else
            {
                System.out.println("not divisible");
            }
        } 
    }
}

