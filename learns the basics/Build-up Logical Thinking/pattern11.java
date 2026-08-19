/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1
 */
import java.util.Scanner;


class pattern11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter The Value For N:");
        N=sc.nextInt();

        pattern(N);
    }

    static void pattern(int N){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==1)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }

        
    }
}