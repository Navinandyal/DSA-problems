/*
GCD of Two Numbers

https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
https://takeuforward.org/plus/dsa/problems/gcd-of-two-numbers?source=strivers-a2z-dsa-track

*/
import java.util.Scanner;

class program4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the number: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(gcd(n1,n2));
    }

    static int gcd(int n1,int n2){
        return n2==0?n1:gcd(n2,n1%n2);
    }
}