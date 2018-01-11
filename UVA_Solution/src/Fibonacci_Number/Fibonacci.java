/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci_Number;//not ok for big number

import java.util.Scanner;

public class Fibonacci {

    // O(log2 n)
    public static int Fibonacci(int n) {

        int num = Math.abs(n);
        if (num == 0) {
            return 0;
        }
        else if (num <= 2) {
            return 1;
        }

        int[][] number = { { 1, 1 }, { 1, 0 } };
        int[][] result = { { 1, 1 }, { 1, 0 } };

        while (num > 0) {
            if (num%2 == 1) result = MultiplyMatrix(result, number);
            number = MultiplyMatrix(number, number);
            num/= 2;
        }
        return result[1][1]*((n < 0) ? -1:1);
    }

    public static int[][] MultiplyMatrix(int[][] mat1, int[][] mat2) {
        return new int[][] {
                { mat1[0][0]*mat2[0][0] + mat1[0][1]*mat2[1][0], mat1[0][0]*mat2[0][1] + mat1[0][1]*mat2[1][1] },
                { mat1[1][0]*mat2[0][0] + mat1[1][1]*mat2[1][0], mat1[1][0]*mat2[0][1] + mat1[1][1]*mat2[1][1] }
        };
    }

    public static void main(String[] args) {
        //System.out.println(Fibonacci(25));
        Scanner input=new Scanner(System.in);
        int i,n;
        while(1==1)
        {
            n=input.nextInt();
            System.out.println("The Fibonacci number for "+n+" is "+Fibonacci(n));
        }
    }
}
