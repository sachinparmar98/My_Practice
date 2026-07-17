
//we will Rotate Array Kth times  
class Solution {
    public void rotate(int[] nums, int k) {
             
               int n=nums.length;
               k%=n;
                
              reverse (nums,0,n-k-1);
              reverse (nums,n-k, n-1);
              reverse (nums,0,n-1);
	 
    }
   public void reverse(int nums[],int start,int end)
   {
	   while(start<end  )
	   {
          
		   int swap=nums[start];
		   nums[start]=nums[end];
		   nums[end]=swap;
	   start++;end--;
     
       }
   
     
    
     
     
    }
}