/*
Print n to 1 Without Loop

https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1
https://takeuforward.org/plus/dsa/problems/print-n-to-1-using-recursion?source=strivers-a2z-dsa-track


*/
import java.util.Scanner;

class program2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the number: ");
        int n=sc.nextInt();
        print(n);
    }

    static void print(int n){
        if(n<1)return;
        else{
            System.out.print(n+" ");
            print(n-1);
        }
    }
}