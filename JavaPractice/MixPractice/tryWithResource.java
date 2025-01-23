import java.io.*;
// ......................STEP-1.................
// class tryWithResource {
// public static void main(String ar[]) throws Exception {
// String s1 = "ram";
// FileWriter fw = new FileWriter("abc.txt", true);
// int i = 0;
// while (i < s1.length()) {
// fw.write(s1.charAt(i));
// i++;

// }
// System.out.println("data inserted");

// fw.close();
// }

// }

// /*
// *
// * op data inserted
// *
// */
// ......................STEP-2.................
import java.io.*;

// class tryWithResource {
// public static void main(String ar[]) throws ClassNotFoundException,
// IOException {
// String s1 = "sachin parmar";
// FileWriter fw;
// try {
// fw = new FileWriter("abc.txt", true);
// int i = 0;
// while (i < s1.length()) {
// fw.write(s1.charAt(i));
// i++;

// }
// System.out.println("data inserted");
// System.out.println(10 / 0);
// } finally {
// fw.close();
// }

// }

// }

// // Demo2.java:23: error: variable fw might not have been initialized
// // fw.close();

// ......................STEP-3.................
import java.io.*;

// class tryWithResource {
// public static void main(String ar[]) throws ClassNotFoundException,
// IOException {
// String s1 = "sachin parmar";
// FileWriter fw = null;
// try {
// fw = new FileWriter("abc.txt", true);
// int i = 0;
// while (i < s1.length()) {
// fw.write(s1.charAt(i));
// i++;

// }
// System.out.println("data inserted");
// System.out.println(10 / 0);
// } finally {
// fw.close();
// }

// }

// }
// // data inserted
// // Exception in thread "main" java.lang.ArithmeticException: / by zero
// // at Demo3.main(Demo3.java:19)

// ......................STEP-4.................

import java.io.*;

// class tryWithResource {
// public static void main(String ar[]) throws ClassNotFoundException,
// IOException {
// String s1 = "sachin parmar";

// try {
// FileWriter fw = new FileWriter("abc.txt", true);
// int i = 0;
// while (i < s1.length()) {
// fw.write(s1.charAt(i));
// i++;

// }
// System.out.println("data inserted");
// System.out.println(10 / 0);
// } finally {
// fw.close();
// }

// }

// }
// // Demo4.java:23: error: cannot find symbol
// // fw.close();
// // ^
// // symbol: variable fw
// // location: class Demo4
// // 1 error

// ......................STEP-5.................

import java.io.*;

// class tryWithResource {
// public static void main(String ar[]) throws ClassNotFoundException,
// IOException {
// String s1 = " mr. sachin parmar";

// try (FileWriter fw = new FileWriter("abc.txt", true);) {

// int i = 0;
// while (i < s1.length()) {
// fw.write(s1.charAt(i));
// i++;

// }
// System.out.println("data inserted");

// }
// }
// }

// /*
// *
// * insise try parameter is try with resourcce Declaration
// *
// */

// ......................STEP-6.................

import java.io.*;

// class tryWithResource {
// public static void main(String ar[]) throws ClassNotFoundException,
// IOException {
// String s1 = " practice hard ";

// try (FileWriter fw = new FileWriter("abc.txt", true);) {

// int i = 0;
// while (i < s1.length()) {
// fw.write(s1.charAt(i));
// i++;

// }
// System.out.println("data inserted");
// System.out.println(10 / 0);

// }
// }
// }

// /*
// *
// *
// * data inserted
// * Exception in thread "main" java.lang.ArithmeticException: / by zero
// * at ResourceDeclarationStep5.main(ResourceDeclarationStep5.java:19)
// *
// */

// ......................STEP-7.................

import java.io.*;
// class tryWithResource
// {
// public static void main(String ar[])throws ClassNotFoundException,IOException
// {
// String s1=" practice hard ";

// try(FileWriter fw=new FileWriter("abc.txt",true);)
// {

// int i=0;
// while(i<s1.length())
// {
// fw.write(s1.charAt(i));
// i++;

// }
// System.out.println("data inserted");
// System.out.println(10/0);

// }
// finally
// {
// System.out.println("finally block");
// }
// }
// }

// /*

// data inserted
// finally block
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at ResourceDeclarationStep6.main(ResourceDeclarationStep6.java:19)

// */

// ......................STEP-8.................
// import java.io.*;
// class tryWithResource
// {
// public static void main(String ar[])throws ClassNotFoundException,IOException
// {
// String s1=" practice hard ";

// try(FileWriter fw=new FileWriter("abc.txt",true);)
// {

// int i=0;
// while(i<s1.length())
// {
// fw.write(s1.charAt(i));
// i++;

// }
// System.out.println("data inserted");
// System.out.println(10/0);

// }
// catch(Exception e)
// {
// System.out.println("Exception handled");
// }
// finally
// {
// System.out.println("finally block");
// }
// }
// }

// /*

// data inserted
// Exception handled
// finally block

// */

// ......................STEP-9.................

// jo resource try with resource declaration ma open ki ha usa hum close nhi ker
// sakta ha

// import java.io.*;
// class tryWithResource
// {
// public static void main(String ar[])throws IOException
// {
// String s1=" practice hard and smart ";

// try(FileWriter fw=new FileWriter("abc.txt",true);)
// {
// fw=new FileWriter("aaa.txt",true);

// int i=0;
// while(i<s1.length())
// {
// fw.write(s1.charAt(i));
// i++;

// }
// System.out.println("data inserted");

// }

// }
// }

// /*

// ResourceDeclarationStep8.java:12: error: auto-closeable resource fw may not
// be assigned
// fw=new FileWriter("aaa.txt",true);
// ^
// 1 error

// */

// ......................STEP-10.................

// jo resource try with resource declaration ma open ki ha usa hum close nhi ker
// sakta ha

// import java.io.*;
// class tryWithResource
// {
// public static void main(String ar[])throws IOException
// {
// String s1=" practice hard and smart ";
// FileWriter fw;
// try( fw=new FileWriter("abc.txt",true);)
// {

// int i=0;
// while(i<s1.length())
// {
// fw.write(s1.charAt(i));
// i++;

// }
// System.out.println("data inserted");

// }

// }
// }

// /*
// ResourceDeclarationStep9.java:10: error: <identifier> expected
// try( fw=new FileWriter("abc.txt",true);)
// ^
// 1 error

// because try ka ander file close ho jay gi too hum usa bhar too use ker hi nhi
// pay ga isliya

// */

// ......................STEP-11.................

// insert data one file to another file using resource declaration

// import java.io.*;
// class tryWithResource
// {
// public static void main(String ar[])throws FileNotFoundException ,IOException
// {

// try( FileWriter fw=new FileWriter("aaa.txt",true) ; FileReader fr=new
// FileReader("abc.txt"))
// {

// int i=fr.read();
// while(i!=-1)
// {
// fw.write((char)i);

// i=fr.read();

// }
// System.out.println("data copid");

// }

// }
// }

// /*

// ResourceDeclarationStep10.java:10: error: no suitable constructor found for
// FileReader(String,boolean)
// try( FileWriter fw=new FileWriter("aaa.txt",true) ; FileReader fr=new
// FileReader("abc.txt",true))
// ^
// constructor FileReader.FileReader(String) is not applicable
// (actual and formal argument lists differ in length)
// constructor FileReader.FileReader(File) is not applicable
// (actual and formal argument lists differ in length)
// constructor FileReader.FileReader(FileDescriptor) is not applicable
// (actual and formal argument lists differ in length)
// 1 error

// yadi FileReader fr=new fileReader("abc.txt",true) ma true pass kerna ka liya
// above error ayga

// output data copied

// */

// ......................STEP-12.................

// insert data one file to another file using resource declaration

// import java.io.*;
// class tryWithResource
// {
// public static void main(String ar[])throws FileNotFoundException ,IOException
// {
// FileWriter fw=new FileWriter("apl.txt",true) ;
// FileReader fr=new FileReader("abc.txt");
// try(fw ; fr )
// {

// int i=fr.read();
// while(i!=-1)
// {
// fw.write((char)i);

// i=fr.read();

// }
// System.out.println("data copid.....");

// }

// }
// }

// /*
// too solve the problem of readiblity form version 1.9 it provide faclity that
// we can
// declare the resources the out side ot try

// and pass the object in try parameter

// this example compile and run in java 1.9 and after java 1.9 version

// */

// ......................STEP-13.................

// import java.io.*;
// class tryWithResource
// {
// public static void main(String ar[])throws FileNotFoundException ,IOException
// {

// FileReader fr=new FileReader("abc.txt");
// try(fr)
// {}
// System.out.println("data copid.....");

// }
// }

// /*
// work in version 1.9 and greater

// */

// ......................STEP-14.................

// import java.io.*;
// class tryWithResource
// {
// public static void main(String ar[])throws FileNotFoundException ,IOException
// {

// FileReader fr=new FileReader("abc.txt");
// try(fr=new FileReader("abc.txt"))
// {}
// System.out.println("data copid.....");

// }
// }

// /*

// run in version 1.9
// */
