/*
Sum of First N Numbers

https://www.geeksforgeeks.org/problems/reverse-coding2452/1
https://takeuforward.org/plus/dsa/problems/sum-of-first-n-numbers?source=strivers-a2z-dsa-track


*/
import java.util.Scanner;

class program3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the number: ");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }

    static int sum(int n){
        if(n<1)return 0;
        else return n+sum(n-1);
    }
}