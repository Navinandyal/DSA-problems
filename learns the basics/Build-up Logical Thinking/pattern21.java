/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
*****
*   *
*   *
*   *
*****
 */
import java.util.Scanner;


class pattern21{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter The Value For N:");
        N=sc.nextInt();

        pattern(N);
    }

    static void pattern(int N){
        for(int i=1;i<=N;i++){            
            for(int j=1;j<=N;j++){
                if(i==1||i==N || j==1||j==N)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}