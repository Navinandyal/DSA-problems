/*
Factorial of a given number

https://www.geeksforgeeks.org/problems/factorial5739/1
https://takeuforward.org/plus/dsa/problems/factorial-of-a-given-number-i?source=strivers-a2z-dsa-track

*/
import java.util.Scanner;

class program4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the number: ");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }

    static int fact(int n){
        if(n<=1)return 1;
        else return n*fact(n-1);
    }
}