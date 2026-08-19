/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
A
BB
CCC
DDDD
EEEEE
 */
import java.util.Scanner;


class pattern16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter The Value For N:");
        N=sc.nextInt();

        pattern(N);
    }

    static void pattern(int N){
        char ch='A';
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++)
                System.out.print(ch);
            System.out.println();
            ch++;
        }   
    }
}