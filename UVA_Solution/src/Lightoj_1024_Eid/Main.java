//Memory limit exceeded
package Lightoj_1024_Eid;//this line should be ommited while submission

import java.util.Scanner;
import java.math.BigInteger;

public class Main {//main class name should be main
    static BigInteger lcm(int a,BigInteger b)
    {       
        BigInteger A,v,t,l;
        A=BigInteger.valueOf(a);        
        
        v=A.multiply(b);
        while(!A.equals(BigInteger.ZERO))
        {
            t=A;
            A=b.mod(A);
            b=t;
        }
        l=v.divide(b);
        return l;
    }
        
     public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int i,j,a,num,t,c;
        BigInteger l;
        
        t=input.nextInt();
        
        for(i=1;i<=t;i++)
        {
            num=input.nextInt();
            a=input.nextInt();
            
            l=BigInteger.valueOf(a);
            
            for(j=2;j<=num;j++)
            {
                a=input.nextInt();
                l=Main.lcm(a, l);
            }
            System.out.println("Case "+i+": "+l);
        }
     }
}
