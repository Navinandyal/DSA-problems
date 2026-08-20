/*
Check for Prime Number


https://takeuforward.org/plus/dsa/problems/check-for-prime-number?source=strivers-a2z-dsa-track
https://www.geeksforgeeks.org/problems/prime-number2314/1

*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class program7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the number: ");
        int n=sc.nextInt();
        System.out.print(isPrime(n));
    }

    static boolean isPrime(int n){

        int num=n;
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}