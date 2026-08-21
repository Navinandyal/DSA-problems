/*
	
Fibonacci Number

https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1
https://www.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1
https://www.geeksforgeeks.org/problems/check-if-the-number-is-fibonacci4654/1
https://www.geeksforgeeks.org/problems/nth-even-fibonacci-number1119/1
https://www.geeksforgeeks.org/problems/nth-fibonacci-number-using-bigintegers/1
https://takeuforward.org/plus/dsa/problems/fibonacci-number?source=strivers-a2z-dsa-track
https://leetcode.com/problems/fibonacci-number/

*/
import java.util.Scanner;

class program7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the number: ");
        int n=sc.nextInt();
        System.out.print(fib(n));
    }

    static int fib(int n){
        if(n<=0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }
}