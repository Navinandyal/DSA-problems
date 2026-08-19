/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
 */
import java.util.Scanner;


class pattern13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter The Value For N:");
        N=sc.nextInt();

        pattern(N);
    }

    static void pattern(int N){
        int n=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++)
                System.out.print(n+++" ");
            System.out.println();
        }   
    }
}