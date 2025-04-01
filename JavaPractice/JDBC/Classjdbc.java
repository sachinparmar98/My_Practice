
// ######################...Example-1...###############################
// import java.sql.*;

// class insertData1 {
// public static void main(String[] args) {
// try {
// Class.forName("com.mysql.jdbc.Driver");

// Connection con = DriverManager.getConnection("jdbc:mysql:///SchoolManagment",
// "root", "root");
// Statement st = con.createStatement();
// String q = "insert into login values('bbb','222')";
// st.executeUpdate(q);
// System.out.println("data insertion is done");
// con.close();
// } catch (Exception e) {
// System.out.println(e);
// }
// }

// }

// **********************Day_1_31st_March******************

// ######################...Example-1...###############################
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.jdbc.Driver");
 * 
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * // Statement st = con.createStatement();
 * String q = "insert into login values('bbb','222')";
 * st.executeUpdate(q);
 * System.out.println("data insertion is done");
 * con.close();
 * } catch (Exception e) {
 * System.out.println(e);
 * }
 * }
 * 
 * }
 */
/*
 * output = > data inserted
 */

// ######################...Example-2...###############################
// insert data in file
/*
 * import java.io.*;
 * class Classjdbc
 * {
 * public static void main(String ar[])throws IOException
 * {
 * FileOutputStream fos=new FileOutputStream("abc.txt");
 * // if file is not present in System it will crate it if file is exist then
 * data will store in file
 * String s="My name is sachin ";
 * int i=0;
 * while(i<s.length())
 * {
 * fos.write(s.charAt(i++));
 * }
 * fos.close();
 * }
 * }
 */
/* out put=> file abc.txt will create and Strng data store inside it` */

// ######################...Example-3...###############################
/*
 * import java.io.*;
 * class Classjdbc {
 * public static void main(String ar[]) throws Exception {
 * FileOutputStream fos = new FileOutputStream("abc.txt", true);// if we pass
 * true because if dont pass true and we
 * // insert new data in file old data will be overide soo we want old data and
 * also new data there for we use true
 * String s = "My name is  sachin parmar ";
 * int i = 0;
 * while (i < s.length()) {
 * fos.write(s.charAt(i++));
 * }
 * fos.close();
 * }
 * 
 * }
 */
/* out put= all data inserted */

// ######################...Example-4...###############################
// for read data from file we take input from file soo we use FileInputStream
/*
 * import java.io.*;
 * class Classjdbc
 * {
 * public static void main(String ...a)
 * {
 * try
 * {
 * FileInputStream fis=new FileInputStream("abc.txt");
 * int i=fis.read();//read() method return type is int
 * while(i!=-1)//in java files ending point is -1
 * {
 * System.out.print((char)i);// we type cast because we want it in form of
 * character
 * i=fis.read();
 * }
 * fis.close();
 * }
 * catch(Exception e)
 * {
 * e.printStackTrace();//printStackTrace () return type is void
 * //if write inside in Sop it will give error void type not allowed here
 * }
 * }
 * }
 */
/* output=>My name is sachinMy name is sachin parmar */

// ######################...Example-5...###############################
/*
 * 1.know we want to store audio ,vedio, image in our data base
 * 2.it can not be store diractly in database ther for we have to convert it
 * first in another form
 * 3. for store images in database we have to use Blob data type
 * 4. Blob = Binary Large Object
 * 5. when we want sotore image it can be store in any folder but we have to
 * give its path
 * 6. if we dont want to give path then we store inside our program file folder
 * 7. Statement interface does not provid faclity to store Blob data type .
 * 8. PreparedStatement interface provide faclity to store Blob data type.
 */
/*
 * import java.sql.*;
 * import java.io.*;
 * 
 * class Classjdbc {
 * public static void main(String ar[]) {
 * try {
 * File f = new File("A.png");
 * FileInputStream fis = new FileInputStream(f);
 * String s1 = "sachin";
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * 
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * Statement st = con.createStatement();
 * // st.executeUpdate("insert into login values('"+s1+"','"+fis+"')");
 * // 1.above line throws exceptions because table login column size is very
 * less copare to storing data
 * // 2.com.mysql.cj.jdbc.exceptions.MysqlDataTruncation: Data truncation: Data
 * too
 * // long for column 'UPASS' at row 1
 * st.executeUpdate("insert into login2 value ('" + s1 + "','" + fis + "')");
 * //1.useing above line data will be insert in form of in first column sachin
 * in second column class@haxadecimalNumber
 * //2.class@hexadecimalNumber is meaning less how can we fetch image from this
 * so we use PreparedStatement
 * System.out.println("data insertion is done");
 * con.close();
 * } catch (Exception e) {
 * System.out.println(e);
 * }
 * 
 * }
 * }
 */
// ######################...Example-6...###############################
/*
 * 1.PreaparedStatement hava setString(,"") method for String type itsb return
 * type is String
 * 2. it havae setBlob(,Blob) method for Blob data type its return type is Blob
 * 
 */
/*
 * import java.io.*;
 * import java.net.ConnectException;
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * File f = new File("A.png");
 * FileInputStream fis = new FileInputStream(f);
 * String s1 = "sachin parmar";
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * PreparedStatement ps =
 * con.prepareStatement("insert into login2 values(?,?) ");
 * ps.setString(1, s1);//return String
 * ps.setBlob(2, fis);//return Blob
 * ps.executeUpdate();
 * System.out.println("data inserted");
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * 
 * }
 * }
 * //out put data insertd in data base
 */
// ######################...Example-7...###############################
/*
 * step 1 Know we want to read our image from database
 * getString(); return type is String
 * getBlob(); return type is Blob data type
 * 
 */
/*
 * import java.io.*;
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * PreparedStatement ps = con.prepareStatement("select * from login2");
 * ResultSet rs = ps.executeQuery();// return type is ResultSet
 * if (rs.next()) {
 * System.out.println(rs.getString(1)); // return type is String
 * System.out.println(rs.getBlob(2));// return type is Blob data type
 * }
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * //output =>sachin parmar
 * //com.mysql.cj.jdbc.Blob@60dcc9fe
 * // above out put is meaning less for us because we cant fetch image from
 * Blob@hexadecimalNumber
 * }
 */
// ######################...Example-8...###############################
/*
 * 1. we can create only int size array
 * 2. byte[] getBytes(long pos, int length)
 */
/*
 * //import java.net.ConnectException;
 * //import java.sql.Blob;
 * //import java.sql.DriverManager;
 * //import java.sql.PreparedStatement;
 * 
 * import java.io.*;
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * PreparedStatement ps = con.prepareStatement("select * from login2");
 * ResultSet rs = ps.executeQuery();
 * 
 * if (rs.next()) {
 * String s1 = rs.getString(1);
 * Blob b1 = rs.getBlob(2);
 * byte b[] = new byte[(int) b1.length()];// Blob class overiding length()
 * method return type is long
 * b = b1.getBytes(1, (int) b1.length());// we type cast here because getBytes
 * method first parameter is
 * // long type and second parameter is int type and length() method
 * // return type is long there for we cast in int
 * FileOutputStream fos = new FileOutputStream("A1.png");// it will create
 * a1.png image in our program file
 * // folder
 * fos.write(b);
 * fos.close();
 * 
 * }
 * System.out.println("image fetched from database");
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // output we can see A1.png image in our program file folder
 * }
 */
// ######################...Example-9...###############################
/*
 * import java.io.*;
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * PreparedStatement ps = con.prepareStatement("select * from login2");
 * ResultSet rs = ps.executeQuery();
 * 
 * if (rs.next()) {
 * String s1 = rs.getString(1);
 * Blob b1 = rs.getBlob(2);
 * byte b[] = new byte[(int) b1.length()];
 * // b = b1.getBytes(1, (int) b1.length()); //WORKED
 * // b = b1.getBytes(0, (int) b1.length());//NOT WORKED this line will throw
 * // java.sql.SQLException: "pos" argument can not be < 1.
 * // note => first parameter of getBytes(long,int) must be 1(one) or
 * // more then 1(one )but it can not be less then zero
 * // because negative size array is not possible
 * // b = b1.getBytes(1, (int) b1.length() - 200);// NOT PROPER WORKED MENAS
 * SOME
 * // DATA OF IMAGE WILL BE LOST means image size ma sa jitna minus kera ga utna
 * // data will be lost
 * b = b1.getBytes(100, (int) b1.length());// this line will throw exception
 * // java.sql.SQLException: "pos" +
 * // "length" arguments can not be larger than the BLOB's length.(it means
 * // ArrayIndexOutOfBoundsException)
 * // because second parameter of getBytes ()method can not be more
 * // then length() for understnad this concept see below example
 * 
 * // b = b1.getBytes(100, (int) b1.length() - 100);// NOT WORKED image will be
 * // corupt because it is unable to
 * // find starting point of image
 * // b = b1.getBytes(1, (int) b1.length() + 200);// java.sql.SQLException:
 * "pos" +
 * // "length" arguments can not
 * // be larger than the BLOB's length.(it means
 * // ArrayIndexOutOfBoundsException)
 * // reason because how can be length of image greater then
 * // its actual size assume if image size is 500 then how
 * // could it be 500+200 its not possible there for Exception
 * // is arrived
 * // note => we can decresss size of image but we cant incresse it here size
 * means
 * // kb,mb,gb(storage size)
 * FileOutputStream fos = new FileOutputStream("A4.png");
 * fos.write(b);
 * fos.close();
 * 
 * }
 * System.out.println("image fetched from database");
 * con.close();
 * } catch (Exception e) {
 * System.out.println(e);
 * }
 * }
 * // output we can see A1.png image in our program file folder
 * }
 */
// ######################...Example-10...###############################
/*
 * class D {
 * public static void main(String ar[]) {
 * String s1 = "0123456789";
 * // String s1 = "myname isram";
 * System.out.println(s1.substring(0));
 * System.out.println(s1.substring(1));
 * System.out.println(s1.substring(4, 9));// first parameter ma joo bhi pass
 * kera ga us index sa start
 * // hoga or jo second parameter ma value pass ki ha us index-1 tak ka
 * // substring return ho jay ga(index will start at 0)
 * // System.out.println(s1.substring(4,20));//Exception in thread "main"
 * // java.lang.StringIndexOutOfBoundsException: String index out of range: 20
 * // System.out.println(s1.substring(4, 3));// Exception in thread "main"
 * // java.lang.StringIndexOutOfBoundsException:
 * // String index out of range: -1
 * // because second parameter cant be less then first and array can be
 * // negative size it thorw exception negativeAarraySizeExceptoin
 * // int x[] = new int[-1];//Exception in thread "main"
 * // java.lang.NegativeArraySizeException
 * System.out.println(s1.substring(0, 9));
 * }
 * 
 * }
 */
/*
 * 
 * myname isram
 * yname isram
 * me is
 * myname is
 * 0123456789
 * 123456789
 * 45678
 * 012345678
 */
// **********************Day_2_1st_April**********************
// **********************Day_3_2nd_April**********************
