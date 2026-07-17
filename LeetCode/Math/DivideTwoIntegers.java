class Solution {
    public int divide(int dividend, int divisor) {

        int x=(dividend/divisor);
       
    
        if(dividend== -2147483648 && divisor ==1)return -2147483648;
      else   if(x==-2147483648)return 2147483647;
        return x;


    }
}