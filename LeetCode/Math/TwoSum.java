import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
		Map <Integer,Integer>m= new HashMap<>();
		
		
		for(int i=0;i<nums.length;i++)
		{ Integer Complementindex=m.get(nums[i]);
	if(Complementindex!=null)return new int[]{i,Complementindex};
		  m.put( target-nums[i],i);
		}
		return nums;
        
    }
}