
class Solution {
	public static void main(String ar[])
	{
		Solution s=new Solution();
		int x[]=s.plusOne(new int[]{1,2,3,4,5});
		for(int k:x)
			System.out.print("\t"+k);
	}
    public int[] plusOne(int[] digits)
	{
           while(int i=digits.length-1;i>=0;i--)
		   {
			   if(digits[i]==9)digits[i]=0;
			   else
			   {
				   digits[i]++;
				   return digits;
			   }
				   
		   }
		   int x[]= new int[digits.length+1];
			   x[0]=1;
			   return x;
    }
}