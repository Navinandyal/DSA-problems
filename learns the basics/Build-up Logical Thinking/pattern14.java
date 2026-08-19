/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
A
AB
ABC
ABCD
ABCDE
 */
import java.util.Scanner;


class pattern14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter The Value For N:");
        N=sc.nextInt();

        pattern(N);
    }

    static void pattern(int N){
        for(int i=1;i<=N;i++){
            char ch='A';
            for(int j=1;j<=i;j++)
                System.out.print(ch+++" ");
            System.out.println();
        }   
    }
}