/*
Reverse Integer

https://leetcode.com/problems/reverse-integer/description/
https://www.geeksforgeeks.org/problems/reverse-digit0316/1
https://takeuforward.org/plus/dsa/problems/reverse-a-number?source=strivers-a2z-dsa-track


*/
import java.util.Scanner;

class program2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the number: ");
        int n=sc.nextInt();
        System.out.println(reverseDigits(n));
    }

    static int reverseDigits(int n){
        long num=n,rev=0;
        while(num!=0){
            rev= (rev*10)+num%10;
            num/=10;
        }
        return (int)rev;
    }
}