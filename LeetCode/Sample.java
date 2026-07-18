class Sample
{
    public static void main(String args[])
    {
         
                  System.out.println(countEven(40));
    }
    public static int countEven(int num) {
        int reNum=0,count=0;
        
        if(num>9){
         reNum=num-num%10;
         count= reNum/10*5-1;
       }
       else
       {
        reNum=1;
       }
       for(int i=reNum;i<=num;i++)
       {
        int sum=0;
       int temp=i;
        while(temp!=0)
        {
            sum+=temp%10;
            temp/=10;
        }
        if(sum%2==0)count++;
       } 
       return count;
    }
}