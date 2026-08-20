/*
Print all Divisors

https://takeuforward.org/plus/dsa/problems/divisors-of-a-number?source=strivers-a2z-dsa-track
https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1

*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class program6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the number: ");
        int n=sc.nextInt();
        for (int divisor : getDivisors(n)) {
            System.out.print(divisor + " ");
        }
    }

    static ArrayList<Integer> getDivisors(int n){
        ArrayList<Integer> divisors=new ArrayList<>(); 
        int num=n;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                divisors.add(i);
                if(i!=num/i)
                    divisors.add(n/i);
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
}