
class Solution {
    public int[] plusOne(int[] digits)
	{
        int i=0;
        int s=0;
	if(digits[digits.length-1]<9) {
		digits[digits.length-1]+=1;
	        return digits;
	}
	
	else{
		while(i<digits.length)
		{
               s+=digits[i];
		}
		s+=1;
          while(i=digits.length-1>=0)
		  {
			  digits[i]=s%10;
			  s/=10;
		  }
                
				return digits;
		
	}   
    }
}