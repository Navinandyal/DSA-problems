/*
	
highest occurring element in an array

https://takeuforward.org/plus/dsa/problems/highest-occurring-element-in-an-array?source=strivers-a2z-dsa-track
*/
import java.util.*;

class program2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the array size: ");
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
            nums[i]=sc.nextInt();
        System.out.println(freqFun(nums));
    }

    static int freqFun(int[] nums){
        int[] freq=new int[10001];
        for(int n:nums)
            freq[n]++;
        int res=0;
        int maxFreq = 0;
        for(int i=0;i<freq.length;i++){
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                res = i;
            }
        }
    
        return res;
    }
}