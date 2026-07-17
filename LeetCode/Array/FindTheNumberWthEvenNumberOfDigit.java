public class FindTheNumberWthEvenNumberOfDigit {
    public static void main(String args[])
    {
        int x[]={112,12,2,1212,121,12,22212,2121212,8,88,};
        System.err.println(findNumbers(x));
    }
     public static  int findNumbers(int[] nums)
     {
         int c=0;
         for(int i:nums)
         {
            if((int)(Math.log10(i)+1)%2==0)c++;
         }
         return c;
     }
}

