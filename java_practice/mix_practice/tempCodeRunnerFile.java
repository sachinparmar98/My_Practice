class GrowableArray
{
    public static void main(String ar[])
    {
        int  x[]=new int[10];
        for(int i=0;i<10;i++)
        x[i]=i;
        for(int i:x)
        System.out.println(i);

    }
}