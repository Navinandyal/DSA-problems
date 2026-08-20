/*
Palindrome Number

https://www.geeksforgeeks.org/problems/palindrome0746/1
https://takeuforward.org/plus/dsa/problems/palindrome-number?source=strivers-a2z-dsa-track
https://leetcode.com/problems/palindrome-number/description/

*/
import java.util.Scanner;

class program3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the number: ");
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));
    }

    static boolean isPalindrome(int n){
        long num=n,rev=0;
        while(num!=0){
            rev= (rev*10)+num%10;
            num/=10;
        }
        return rev==n;
    }
}