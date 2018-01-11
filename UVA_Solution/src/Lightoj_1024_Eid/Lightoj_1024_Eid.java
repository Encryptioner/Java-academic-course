
package Lightoj_1024_Eid;

import java.util.Scanner;
import java.math.BigInteger;

public class Lightoj_1024_Eid {
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
                l=Lightoj_1024_Eid.lcm(a, l);
            }
            System.out.println("Case "+i+": "+l);
        }
     }
}
