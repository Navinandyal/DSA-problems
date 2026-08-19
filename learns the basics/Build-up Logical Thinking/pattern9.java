/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
    * 
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */
import java.util.Scanner;


class pattern9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter The Value For N:");
        N=sc.nextInt();

        pattern(N);
    }


    static void pattern(int N){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i*2-1;j++)
                System.out.print("*");

            System.out.println();
        }
        for(int i=N;i>0;i--){
            for(int j=N;j>i;j--)
                System.out.print(" ");
            for(int j=1;j<=i*2-1;j++)
                System.out.print("*");
            
            System.out.println();
        }


        //optimal
        for(int i=1;i<=N*2;i++){
            int row=(i<=N)?i:2*N-i+1;
            for(int j=1;j<=N-row;j++)
                System.out.print(" ");
            for(int j=1;j<=2*row-1;j++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}