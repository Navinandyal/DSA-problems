/*
	
Check if String is Palindrome or Not

https://www.geeksforgeeks.org/problems/check-palindrome--141628/1
https://www.geeksforgeeks.org/problems/palindrome-string0817/1
https://takeuforward.org/plus/dsa/problems/check-if-string-is-palindrome-or-not-?source=strivers-a2z-dsa-track
https://leetcode.com/problems/valid-palindrome/description/

*/
import java.util.Scanner;

class program6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the String: ");
        String str=sc.nextLine();
        System.out.print(isPalindrome(0,str.toLowerCase()));
    }

    static boolean isPalindrome(int i,String str){
        if(i>=str.length()/2)return true;
        if(str.charAt(i)!=str.charAt(str.length()-i-1))return false;
        return isPalindrome(i+1,str);
    }
}