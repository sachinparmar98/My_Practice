// class X
// { void do1(){}}
// class Y extends X
// {
	// void do2(){}
// }
// class test12
// {
	// public static void main(String ar[])

	// {
		// X x1=new X();
		// X x2=new Y();
		// Y y1=new Y();
		// ((Y)x2).do2();
		
// }}
        //  ABOVE WORKED 
		 //(Y)x2.do2();  NOT WORKED
		 
		 

  //  
  // class test12
  // {
	  // test12()
	  // {
		  // main("hi");
	  // }
	  // public static void main(String ar[])
	  // {
		  // System.out.println("2");
	  // }
	  // public static void main(String ar)
	  // {
		  // System.out.println("3"+ar);
	  // }
  // }
  // OUTPUT=2
  
  
  // class test12
  // {
	  // public static void main(String ar[])
	  // {
		  // int i,j;
		  // for(i=1;i<=5;i++)
		  // {
			 // for (j=1;j<=20;j<<=1)
			 // {
				 // System.out.print("*");
			 // }
			 // System.out.println();
		  
	  // }
	  // }
  // }
  //output
// *****
// *****
// *****
// *****
// *****

 // class test12
  // {
	  // public static void main(String ar[])
	  // {
		  // int i,j,k=0;
		  // for(i=1;i<=11;i++)
		  // {k=1;
			 // for (j=1;j<=k;j++)
			 // {
				 // int x=(j<6)?(k++):(k--);
				 // System.out.print(k-x+" ");
			 // }
			 // System.out.println();
		  
	  // }
	  // }
  // }
  // output
// 1 1 1 1 1 -1
// 1 1 1 1 1 -1
// 1 1 1 1 1 -1
// 1 1 1 1 1 -1
// 1 1 1 1 1 -1
// 1 1 1 1 1 -1
// 1 1 1 1 1 -1
// 1 1 1 1 1 -1
// 1 1 1 1 1 -1
// 1 1 1 1 1 -1
// 1 1 1 1 1 -1



 // class test12
  // {
	  // public static void main(String ar[])
	  // {
		  // int i,j;
		  // for(i=1;i<=11;i++)
		  // {
			 // for (j=1;j<=11;j++)
			 // {  if((i^j)<=7)
				 // System.out.print("* ");
			     // else 
					 // System.out.print("  ");
			 // }
			 // System.out.println();
		  
	  // }
	  // }
  // }
  
// * * * * * * *
// * * * * * * *
// * * * * * * *
// * * * * * * *
// * * * * * * *
// * * * * * * *
// * * * * * * *
              // * * * *
              // * * * *
              // * * * *
              // * * * *
  
  // class test12
  // {
	  // public static void main(String ar[])
	  // {
		  // int x=11;
		  // for(int i=1;i<=10;i++)
		  // {
			   // if(x++<=15 & x++<=20)x--;
		  // }
		  // System.out.println(x);
	  // }
  // }
  
  // output 
  // 26