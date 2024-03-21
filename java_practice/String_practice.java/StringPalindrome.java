class StringPalindrome
{
public static void main(String ar[])
{
String s1=ar[0];
char s2[]=s1.toCharArray();
String s3="";

for(int i=s2.length-1;i>=0;i--)
{
s3=s3+s2[i];
}
if(s1.equals(s3))
{
System.out.println("string is palindrome");
}
else
{
System.out.println("string is not palindrome");
}

}


}