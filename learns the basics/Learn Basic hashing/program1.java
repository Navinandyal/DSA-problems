/*
	
Counting Frequencies of Array Elements

https://takeuforward.org/plus/dsa/problems/counting-frequencies-of-array-elements?source=strivers-a2z-dsa-track

*/
import java.util.*;

class program1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a the array size: ");
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
            nums[i]=sc.nextInt();
        for (List<Integer> pair : freqFun(nums)) {
            System.out.println(pair);
}
    }

    static List<List<Integer>> freqFun(int[] nums){
        Map<Integer,Integer> freq=new HashMap<>();

        for(int n:nums){
            if(freq.containsKey(n))
                freq.put(n,freq.get(n)+1);
            else 
                freq.put(n,1);
        }


        List<List<Integer>> res=new ArrayList<>();
        for(int n:freq.keySet()){
            List<Integer> pair=new ArrayList<>();
            pair.add(n);
            pair.add(freq.get(n));
            res.add(pair);
        }
        return res;

    }
}