/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
ABCDE
ABCD
ABC
AB
A
 */
import java.util.Scanner;


class pattern15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter The Value For N:");
        N=sc.nextInt();

        pattern(N);
    }

    static void pattern(int N){
        for(int i=N;i>=1;i--){
            char ch='A';
            for(int j=i;j>=1;j--)
                System.out.print(ch+++" ");
            System.out.println();
        }   
    }
}