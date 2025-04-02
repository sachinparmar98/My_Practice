/*
 * Q write a comand for set classpath for run jdbc file
 * ans -> set classpath= adress where the file store then \(shlash) then
 * conector name then .jar;.;%class path%
 * note => conector store where your jdbc file is stored
 */
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
// **********************Day_2_April_1st**********************

// ######################...Example-1...###############################
/*
 * BELOW QUESTION ARE BELONGS TO MYSQL AND jdbc
 * Q write a query for show all databases ?
 * ans ->show databases;
 * 
 * Q write a query for delete table ?
 * ans -> drop table TABLE_NAME;
 * 
 * Q write a query for delete particular data in tabel ?
 * ans -> delete from TABLE_NAME where UNAME='ram';
 * 
 * Q write a Query for delete multiple table ?
 * ans -> drop table TABLE_NAME,TABLE_NAME,TABLE_NAME;
 * 
 * Q write a query for decribe a table?
 * ans -> desc TABLE_NAME;
 * 
 * Q write a query for insert multiple data inside the table?
 * ans -> insert into TABLE_NAME ('ram','111'),('sita','222'),('gita','333');
 * 
 * Q WHAT IS DELIMETER ?
 * ans -> for change the end poit of query we use DELIMETER.
 * 
 * Q how to create DELIMETER ?
 * ans -> DELIMETER // (// double shlash is the delimeter know our qurey will
 * end with //)
 * 
 * Q what we can use at place of DELIMETER ?
 * ans -> we can use any character like DELIMETER & ,DELIMETER * ,DELIMETER A
 * MANY MORE.
 * 
 * Q where we first here about DELIMETER ?
 * ans -> we first here it about DELIMETER in java StringTokenizer class because
 * we use there Delimeter for sepration like space , (coma ),& many more
 * 
 * 
 * Q write a query end with DELMITER &?
 * ans -> first we havae to create DELIMETER
 * mysql>DELIMETER &
 * mysql> select * from TABLE_NAME &( know anperson is the ending point)
 * 
 * Q is function and procedure are same ?
 * ans -> no function and procedure are diffrent .
 * 
 * Q what is store procedure ?
 * ans -> store procedure is a group of sql statement that perform a particular
 * task .
 * 
 * Q explain the benfits of store procedure ?
 * ans -> it help saving time
 * 
 * Q why we use store procedure ?
 * ans -> if you have multiple or very long query(around one page) and this
 * querys need you have multiple time soo you write this query and execute again
 * write and execute same query because you need this is space consuming and
 * time consuming process if you wirte all those query you needed in a store
 * procedure then you can essily call using only procedure name like a functionn
 * in c and like a method in java.
 * 
 * if particular querys is used multiple time then in this case we use
 * procedure.
 * if call long query mulltiple time it will time taking soo we can use
 * procedure
 * 
 * Q how to create procedure ?
 * ans -> first we change DELIMETER
 * mysql> DELIMETER //
 * >create procedure p1()
 * >BEGIN
 * >select * from login;
 * > END //
 * qery ok,0 row affected (0.03sec)
 * 
 * Q how to call procedure ?
 * ans -> call PRCEDURE_NAME() END_WITH_DELIMETER what ever you crate like call
 * p1()//
 * 
 * Q why we change the DELIMETER ?
 * ans -> if we dont change DELIMETER then when we use query and use ;(semicolon
 * ) first time our query will excecuted because ; is ending point there for we
 * use DELIMETER and write multiple querys in procedure
 * example
 * mysql> DELIMETER //
 * >create procedure p1()
 * >BEGIN
 * >select * from login;(if we dont change DELIMETER then this query will be
 * executed )
 * > END //
 * qery ok,0 row affected (0.03sec)
 * 
 * 
 * Q what is CallableStatement ?
 * ans -> CallableStatement is an public interface it is the child interface of
 * PreparedStatement
 * 
 * Q what is the benfits of CallableStatement ?
 * ans -> it reduse network trafcking
 * improve performance.
 * improve redablity
 * 
 * Q Why we use CallableStatement ?
 * ans -> because it execute query diractly (confirm it)
 * 
 * Q what is Blob in java ?
 * ans -> it is an public interface .
 *
 * Q what is Blob in sql ?
 * ans -> Blob is an data type in sql .
 * 
 * Q how many types Blob are ?
 * ans -> there are four types of Blob
 * Type Maximum Storing Capacity
 * 1 TinyBlob 255 bytes
 * 2 Blob 64 kb
 * 3 MediumBlob 16 mb
 * 4 LongBlob 4 gb
 * 
 * 
 * Q write the diffrence between setBinaryStream() and setBlob() method ?
 * ans ->
 * 
 * Q write Query for delete table data ?
 * ans -> delete from TABLE_NAME;
 * 
 * Q can we use multilpe query in procedure ?
 * ans -> yes we can use multiple query inside procedure .
 * 
 * Q why we use CallableStement over PreparedStatement ?
 * ans ->
 * 
 * Q what is the full form of Blob ?
 * ans -> Binary large Object .
 * 
 * Q what is the diffrence between PreparedStatement and CallableStatement ?
 * ans ->
 * 
 * Q how to execute store procedure inside inside java program ?
 * ans-> CallableStatement cs =con .prepareCall("{call PROCEDUR_NAME()}");
 * 
 * Q how to create CallableStatement Object ?
 * ans -> CallableStatement cs =con .prepareCall();
 * 
 * Q what is the return type of Blob length() method ?
 * ans-> long
 * 
 * Q
 * ->
 */
// ######################...Example-2...###############################
// show all data of table using Statement
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String ar[]) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * Statement st = con.createStatement();
 * ResultSet rs = st.executeQuery("select * from login");
 * while (rs.next()) {
 * System.out.println(rs.getString(1) + "\t" + rs.getString(2));
 * }
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * // out put all data will be displayed on cmd
 * }
 * }
 */
// ######################...Example-3...###############################
// show all data of table using PreparedStatement
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * 
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * PreparedStatement ps = con.prepareStatement("select * from login");
 * ResultSet rs = ps.executeQuery();
 * while (rs.next())
 * System.out.println(rs.getString(1) + "\t" + rs.getString(2));
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // output all data will be display
 * }
 */
// ######################...Example-4...###############################
/*
 * show all data of table using CallableStatement interface
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p1()}");
 * ResultSet rs = cs.executeQuery();
 * while (rs.next())
 * 
 * {
 * System.out.println(rs.getString(1) + "\t" + rs.getString(2));
 * 
 * }
 * } catch (Exception e) {
 * System.out.println(e.getMessage());
 * }
 * }
 * // all data of table will be show on database
 * }
 */
// ######################...Example-5...###############################
// store image inside the data base using setBinaryStream(int
// ,java.io.InputStream) method its return type is void
/*
 * import java.sql.*;
 * import java.io.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * File f = new File("A.png");
 * FileInputStream fis = new FileInputStream(f);
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * PreparedStatement ps =
 * con.prepareStatement("insert into login2 values(?,?)");
 * ps.setString(1, "sachin");
 * // ps.setBlob(2,fis);
 * // void setBinaryStream(int, java.io.InputStream);
 * ps.setBinaryStream(2, fis);
 * ps.executeUpdate();
 * System.out.println("data inserted");
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * //output image will be insertd in our database
 * }
 */
// ######################...Example-6...###############################
// know we want to store vedio ,mp4 in out database
/*
 * import java.sql.*;
 * import java.io.*;
 * 
 * class Classjdbc {
 * public static void main(String... a) {
 * try {
 * File f = new File("v.mp4");
 * FileInputStream fis = new FileInputStream(f);
 * String s1 = "sachin vedio";
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * PreparedStatement ps =
 * con.prepareStatement("insert into login2 values(?,?)");
 * ps.setString(1, s1);
 * ps.setBinaryStream(2, fis);
 * ps.executeUpdate();
 * System.out.println("data inserted ");
 * con.close();
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // com.mysql.cj.jdbc.exceptions.MysqlDataTruncation: Data truncation: Data
 * too
 * // long for column 'UIMG' at row 1
 * // because table login2 second colun datatype is too small for vedio size
 * there
 * // for exception is coming
 * }
 */
// ######################...Example-7...###############################
// storing vedio in database using PreparedStatement
// know we will create new table -
// create table login3 (UNMAE varchar(30),UMP4 longblob); inside mysql
/*
 * import java.sql.*;
 * import java.io.*;
 * 
 * class Classjdbc {
 * public static void main(String... a) {
 * try {
 * File f = new File("v.mp4");
 * FileInputStream fis = new FileInputStream(f);
 * String s1 = "sachin vedio";
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * PreparedStatement ps =
 * con.prepareStatement("insert into login3 values(?,?)");
 * ps.setString(1, s1);
 * ps.setBinaryStream(2, fis);
 * ps.executeUpdate();
 * System.out.println("data inserted ");
 * con.close();
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * //out put vedio will be store in our data base sucessfully
 * }
 */

/*
 * >>>>>>>>>>IMPORTANT NOTE<<<<<<<<<<<<<<<<<<
 * if we get PacketTooBigexception and our data is not inserted in data base
 * because default packet capacity of mysql is less (the default packet value of
 * mysql is according the RAM of system )
 * know you have to maully incress the capacity of packet follow below steps
 * step 1 open c drive -> program files -> mysql -> mysql server-> my (my is a
 * file open it in notepad++ its extension show in notepad is .ini)
 * step 2 inside my file we see [mysld] and below its port =3306 we hava to
 * write max_allowed_packet=500M and save it see below code
 * [mysld] (this alredy writen in my.ini file)
 * max_allowed_packet=500M ( we can change 500M our need less or more)
 * port=3306(this already writen in my.ini file)
 * 
 * 
 * 
 * $$$NOTE==> After above change exception is not coming but our data is not
 * storing in database soo you have to restart your mysql service
 * for restart mysql service you have go to task manager there you can restart
 * mysql service
 */
// ######################...Example-8...###############################
// fetch vedio from datbase
/*
 * import java.io.*;
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String arg[]) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * PreparedStatement ps = con.prepareStatement("select * from login3");
 * ResultSet rs = ps.executeQuery();
 * if (rs.next()) {
 * String s1 = rs.getString(1);
 * Blob b1 = rs.getBlob(2);
 * byte b[] = new byte[(int) b1.length()];// we type cast because Blob length()
 * method return type is long
 * // we can only pass int type in array size;
 * b = b1.getBytes(1, (int) b1.length());
 * FileOutputStream fos = new FileOutputStream("sachin.mp4");
 * fos.write(b);// write(byte[])
 * fos.close();
 * }
 * con.close();
 * System.out.println("data fetched"); // and
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // output it will worked know vedio will be save in our folder sachin.mp4
 * name
 * }
 */

// ######################...Example-9...###############################
// ######################...Example-10...###############################
// **********************Day_3_2nd_April**********************
