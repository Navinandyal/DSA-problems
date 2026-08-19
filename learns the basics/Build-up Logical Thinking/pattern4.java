/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
1
22
333
4444
55555
 */
import java.util.Scanner;


class pattern4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter The Value For N:");
        N=sc.nextInt();

        pattern(N);
    }


    static void pattern(int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++)
                System.out.print(i+1);

            System.out.println();
        }
    }
}