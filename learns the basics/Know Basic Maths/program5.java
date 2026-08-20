/*
Check if the Number is Armstrong

https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
https://takeuforward.org/plus/dsa/problems/check-if-the-number-if-armstrong?source=strivers-a2z-dsa-track
https://leetcode.com/problems/armstrong-number/description/

*/
import java.util.Scanner;

class program5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the number: ");
        int n=sc.nextInt();
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n){
        long res=0,num=n;
        while(num!=0){
            int ld=(int)num%10;
            res+=ld*ld*ld;
            num/=10;
        }
        return n==res;
    }
}