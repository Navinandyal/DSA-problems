/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
1        1
12      21
123    321
1234  4321
1234554321
 */
import java.util.Scanner;


class pattern12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter The Value For N:");
        N=sc.nextInt();

        pattern(N);
    }

    static void pattern(int N){
        for(int i=1;i<=N;i++){

            for(int j=1;j<=i;j++)
                System.out.print(j);

            for(int j=1;j<=2*N-2*i;j++)
                System.out.print(" ");
            
            for(int j=i;j>=1;j--)
                System.out.print(j);
            System.out.println();
        }   
    }
}