public  class ToLowerCase {

    
    public static void main(String[] args)   
        {
            int x[]={-1,4,1,9,6,7,0,4};
            buyChoco(x );
        } 
        public static void buyChoco(int[] prices)
              {
          for(int i=0;i<prices.length;i++)
          {
            boolean isSorted=true;
            for(int k=1;k<prices.length;k++)
            {
                   if(prices[k-1]>prices[k])
                   {
                    int temp =prices[k-1];
                    prices[k-1]=prices[k];
                         prices[k]=temp;
                         isSorted=false;   
                }
                

            }
            if(isSorted)break;
          }
               for(int i: prices)
               {
                System.out.println(i);
               }

            }   
}