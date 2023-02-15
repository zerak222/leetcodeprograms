import java.lang.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) {
       
        int num[]= {1,1,1,1,1};
		int rSum[] = runningSum(num);
		System.out.println(Arrays.toString(rSum));
		
     }
	public static int[] runningSum(int[] nums) {
        int runningSum[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            runningSum[i]=sum(nums,i);
        }
		return runningSum;
    }
    public static int sum(int[] arr,int i){
        if(i==0){
            return arr[i];
        }
        return arr[i]+sum(arr,i-1);
    }
  
	
     
}   
	 

