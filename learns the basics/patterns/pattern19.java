/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
E 
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
 */
import java.util.Scanner;


class pattern19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter The Value For N:");
        N=sc.nextInt();

        pattern(N);
    }

    static void pattern(int N){
        for(int i=1;i<=N*2;i++){
            if(i<=N){
                for(int j=N-i;j>=0;j--)
                    System.out.print("*");
                for(int j=1;j<=i*2-2;j++)
                    System.out.print(" ");
                for(int j=N-i;j>=0;j--)
                    System.out.print("*");
                System.out.println();
            }else{
                for(int j=1;j<=i-N;j++)
                    System.out.print("*");
                for(int j=1;j<=2*(2*N-i);j++)
                    System.out.print(" ");
                for(int j=1;j<=i-N;j++)
                    System.out.print("*");
                System.out.println();
            }
        }   
        for(int i=1;i<=N*2;i++){
            int stars= (i<=N)?N-i+1:i-N;
            int spaces=2*(N-stars);

            for(int j=1;j<=stars;j++)
                System.out.print("*");
            for(int j=1;j<=spaces;j++)
                System.out.print(" ");
            for(int j=1;j<=stars;j++)
                System.out.print("*");
            System.out.println();
            
        }   
    }
}