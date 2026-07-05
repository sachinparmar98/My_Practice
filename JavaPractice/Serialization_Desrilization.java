//SERIALIZATION ANE DESERILIZATION




//........... Step 1 .. store data in a file


//import java.io.FileNotFoundException;
//import java.io.IOException ;
//class Serialization_Desrilization
//import java.io.FileOutputStream;
//{
//public static void main(String ar[])throws FileNotFoundException,IOException
//{
//FileOutputStream fos=new FileOutputStream("ss.txt");
//fos.write('a');
//fos.close();
//System.out.println("data inserted");
//
//}
// .......Step 2 .. fatch data from file  file
 
 //import java.io.FileNotFoundException;
//import java.io.IOException ;
//import java.io.FileInputStream;
//class Serialization_Desrilization
//{
//public static void main(String ar[])throws FileNotFoundException,IOException
//{ FileInputStream fis =new FileInputStream("ss.txt");
//      char c=(char)fis.read();
// 	fis.close();
//System.out.println(c);
//
//}
//}

//....steps for serilization ....

//
//class Employee
//{
//	int id;
//	String name;
//	Employee(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//}
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.IOException ;
//import java.io.FileNotFoundException;
//
//class Serialization_Desrilization
//{
//	public static void main(String ar[])throws IOException,FileNotFoundException
//	{
//		Employee e1=new Employee(111,"aaa");
//       FileOutputStream fos =new FileOutputStream("ss,txt");
//	   ObjectOutputStream oss=new ObjectOutputStream(fos);
//	    oss.writeObject(e1);
//		fos.close();
//		oss.close();
//		System.out.println("data insert ");
//	}
//}
//
//output =Exception in thread "main" java.io.NotSerializableException: Employee
 

//..........Example for Object serilization............

//mport java.io.*;
//lass Employee implements Serializable
//
//	int id;
//	String name;
//	Employee (int id,String name)
//	{this.id=id;
//	this.name=name;}
//
//
//class Serialization_Desrilization
//{
//	 public static void main(String ar[])throws IOException
//	 {
//		 Employee e1=new Employee(111,"abc");
//         FileOutputStream fos =new FileOutputStream("ss.txt");
//           ObjectOutputStream oos=new ObjectOutputStream(fos);		
//		 oos.writeObject(e1);
//		 oos.close();
//		 fos.close();
//		 System.out.println("data insertion is done");
//		 }
//}

//....example for desirialization
//import java.io.*;
//class Serialization_Desrilization
//{
//	public static void main(String ar[])throws IOException,FileNotFoundException,ClassNotFoundException
//	{
//	
//  FileInputStream fis=new FileInputStream("ss.txt");
//ObjectInputStream oos=new ObjectInputStream(fis);
//
//    Employee e=(Employee)oos.readObject();
//	System.out.println(e);
//	fis.close();
//	oos.close();
//	}
//}

//...step if trying to access object more then stored in a file
//import java.io.*;
//class Serialization_Desrilization
//{
//	public static void main(String ar[])throws FileNotFoundException,IOException,ClassNotFoundException
//	{
//		FileInputStream fis=new FileInputStream("ss.txt");
//		ObjectInputStream oos=new ObjectInputStream(fis);
//		
//		Employee e1=(Employee)oos.readObject();
//        Employee e2=(Employee)oos.readObject();
//		System.out.println(e1);
//		System.out.println(e2);
//	}
//}
//Exception in thread "main" java.io.EOFException
//import java.io.*;
//class Employee implements Serializable
//{
//	int id;
//	String name;
//	Employee (int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//	public String  toString()
//	{
//		return "id="+id+"\tname="+name;
//	}
//}
// class Serialization_Desrilization 
// {
//	 public static void main(String ar[])throws FileNotFoundException,IOException
//	 {
//		 Employee e1=new Employee(111,"aaa");
//		 Employee e2=new Employee(222,"bbb");
//		 Employee e3=new Employee(333,"ccc");
//		 Employee e4=new Employee(444,"ddd");
//		 Employee e5=new Employee(555,"eee");
//		 
//		 FileOutputStream fos=new FileOutputStream("ss.txt");
//		 ObjectOutputStream oos=new ObjectOutputStream(fos);
//		      oos.writeObject(e1);
//		      oos.writeObject(e2);
//		      oos.writeObject(e3);
//		      oos.writeObject(e4);
//		      oos.writeObject(e5);
//                 System.out.println("data inserted know do your work");
//fos.close();
//oos.close();				 
// }}


//   Desiralization above Objects
//import java.io.*;
//class Serialization_Desrilization
//{
//	public static void main(String ar[])throws FileNotFoundException,IOException,ClassNotFoundException
//	{
//		FileInputStream fis=new FileInputStream("ss.txt");
//		ObjectInputStream oos=new ObjectInputStream(fis);
//		Employee e1=(Employee)oos.readObject();
//		Employee e2=(Employee)oos.readObject();
//		Employee e3=(Employee)oos.readObject();
//		Employee e4=(Employee)oos.readObject();
//		Employee e5=(Employee)oos.readObject();
//		
//        System.out.println(e1);
//        System.out.println(e2);
//        System.out.println(e3);
//        System.out.println(e4);
//        System.out.println(e5);
//	//	Employee e6=(Employee)oos.readObject();
//
//		System.out.println("data fatch");
//		fis.close();
//		oos.close();
//	}
//}


//know we want above program dinamic
//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
//import java.io.IOException;
//import java.io.FileNotFoundException;
//
//class Serialization_Desrilization
//{
//	public static void main(String ar[])throws FileNotFoundException,IOException,ClassNotFoundException
//	{
//		FileInputStream fis=new FileInputStream("ss.txt");
//		ObjectInputStream oos=new ObjectInputStream(fis);
//		try
//		{while(true)
//			{
//			Employee e=(Employee)oos.readObject();
//            System.out.println(e);			
//		}
//		fis.close();
//		oos.close();
//		
//		}
//		catch(Exception e)
//		{}
//		System.out.println("Data fetched know are you happy ");
//	}
//}

class Serialization_Desrilization
{  
 static int c,i;
 @Override
	public void finalize()
	{
		System.out.println("finalize Called ="+(++c)+"\tI ="+i);
	}
	public static void main(String ar[])
	{
		 for( i=1;i<2147483647;i++)
		 {
			 new Serialization_Desrilization();
			 System.gc();
		
		
		 }
	}
}