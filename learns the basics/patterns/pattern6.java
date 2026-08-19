/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
12345
1234
123
12
1
 */
import java.util.Scanner;


class pattern6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter The Value For N:");
        N=sc.nextInt();

        pattern(N);
    }


    static void pattern(int N){
        for(int i=N-1;i>=0;i--){
            for(int j=0;j<=i;j++)
                System.out.print(j+1);

            System.out.println();
        }
    }
}