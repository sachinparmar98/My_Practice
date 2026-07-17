class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();
		int result=0,left=0,right=0;
		char arr[]=s.toCharArray();
		for(;right<arr.length;right++)
		{
			
			int index=map.getOrDefault(arr[right],-1);
			if(index!=-1)
			{
			 result=Math.max(result,right-1-left+1);
			 left=index+1;
		}
		map.put(arr[right],right);
		
		}
		return Math.max(result,right-1-left+1);
    }
