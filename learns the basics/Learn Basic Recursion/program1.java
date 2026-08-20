/*
Count all Digits of a Number

https://www.geeksforgeeks.org/problems/count-total-digits-in-a-number/1
https://takeuforward.org/plus/dsa/problems/count-all-digits-of-a-number?source=strivers-a2z-dsa-track


*/
import java.util.Scanner;

class program1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the number: ");
        int n=sc.nextInt();
        System.out.println(digitsCount(n));
    }

    static int digitsCount(int n){
        int count=0,num=n;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
}