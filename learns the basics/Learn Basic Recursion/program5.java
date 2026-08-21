/*
Reverse an array

https://www.geeksforgeeks.org/problems/reverse-an-array/1
https://takeuforward.org/plus/dsa/problems/reverse-an-array?source=strivers-a2z-dsa-track

*/
import java.util.Scanner;

class program5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the size of array: ");
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
            nums[i]=sc.nextInt();
        revArray(0,nums);
        for(int n:nums){
            System.out.print(n+" ");
        }
    }

    static void revArray(int i,int[] nums){
        if(i>=nums.length/2)return;
        else{
            swap(nums,i,nums.length-i-1);
            revArray(i+1,nums);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}