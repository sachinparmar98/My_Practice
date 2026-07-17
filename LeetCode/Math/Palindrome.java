
class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int s=0;
        while(x!=0)
        {
          s=s*10+x%10;
          x/=10;
        }
        if(n<0)
        {
            s*=-1;
        }
        if(s==n)
        return true;
        return false;
    }
}
