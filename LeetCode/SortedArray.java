class Solution {
    public int[] sortArray(int[] nums) {
           divide(nums,nums.length);
        
    }
    public static void merge(int[]nums,int a[],int b,int l,int r)
    {
		int i,j,k=0;
		for(i=0,k=0;i<l&&j<r;)
		{
			if(a[i]<b[j]) nums[k++]=a[i++];
			else nums[k++]=b[j++];
		}
		while(i<l)
		{
			nums[k++]=a[i++];
		}
		while(j<1)
		{
			nums[k++]=b[j++];
		}

    } 
    public static divide (int nums[],int n)
    {
        if(n<2)return;
		int l=n/2;
		int r=n-l;
		int a[];
		int b[];
		for(int i=0;i<l;i++)
			a[i]=nums[i];
		for(int j=0;j<r;j++)
		{
			b[i]=nums[l+j];
		}
		divide(a,l);
		divide(b,r);
		sum(nums[],a,b,l,r);
		
    }
}