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
 * cl
 * ass Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.jdbc.Driver");
 * 
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * St
 * Satement st = con.createStatement();
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
 * type is void
 * 2. it havae setBlob(,Blob) method for Blob data type its return type is void
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
 * ps.setString(1, s1);//return void
 * ps.setBlob(2, fis);//return void
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
 * 
 * 
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
 * 
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

// ###############
// #######...Example-1...###############################
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
 * Q WHAT IS DELIMTIER ?
 * ans -> for change the end poit of query we use DELIMETER.
 * 
 * Q how to create DELIMITER ?
 * ans -> DELIMITER // (// double shlash is the delimeter know our qurey will
 * end with //)
 * 
 * Q what we can use at place of DELIMITER ?
 * ans -> we can use any character like DELIMITER & ,DELIMITER * ,DELIMITER A
 * MANY MORE.
 * 
 * Q where we first here about DELIMITER ?
 * ans -> we first here it about DELIMI
 * TER in java StringTokenizer class because
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
 * 
 * 
 * /*
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

// **********************April_2nd**********************
// ######################...Example-1...###############################
/*
 * Q 1.wtire a command for show all procedure ?
 * show procedure status;
 * R //in mysql
 * mysql> SHOW PROCEDURE STATUS;
 * 
 * Q 2.How to delte procedure ?
 * ans = drop procedure PROCEDURE_NAME;
 * 
 * Q 3.IS we can delete mullitiple procedure ;
 * ans = no we cant delete mulltiple procedure.
 * 
 * Q 4. how to create Procedure and call procedure?
 * mysql> DELIMITER //
 * mysql> create procedure p2()
 * -> BEGIN
 * -> select * from login;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * (p2 is the procedure name )
 * query for call procedure
 * mysql> call p1;
 * +-------+-------+
 * | UNAME | UPASS |
 * +-------+-------+
 * | bbb | 222 |
 * | adg | 1 |
 * | adg | 1 |
 * | ram | 111 |
 * | sita | 222 |
 * | gita | 333 |
 * +-------+-------+
 * 6 rows in set (0.00 sec)
 * 
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * Q 5. write a procedure for mulltiple select Query ?
 * ans =
 * mysql> DELIMITER //
 * mysql> create procedure p3()
 * -> BEGIN
 * -> select * from login;
 * -> select * from login;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql> DELIMITER ;
 * mysql> call p3;
 * 
 * +-------+-------+
 * | UNAME | UPASS |
 * +-------+-------+
 * | bbb | 222 |
 * | adg | 1 |
 * | adg | 1 |
 * | ram | 111 |
 * | sita | 222 |
 * | gita | 333 |
 * +-------+-------+
 * 6 rows in set (0.00 sec)
 * 
 * +-------+-------+
 * | UNAME | UPASS |
 * +-------+-------+
 * | bbb | 222 |
 * | adg | 1 |
 * | adg | 1 |
 * | ram | 111 |
 * | sita | 222 |
 * | gita | 333 |
 * +-------+-------+
 * 6 rows in set (0.01 sec)
 * 
 * Query OK, 0 rows affected (0.01 sec)
 * note =1 .we dont write parenthsis with p3 pecause it does not
 * parmeter so we can use diractly without parnethesis
 * 2. above two queris is showing because our procedure have two show all queris
 * 
 * 
 * Q 6. what is getMoreResults() method it ?
 * Ans = it is the method of Statement its return type is boolean
 * it return true when more ResultSet is are present otherwise it return falses
 * 
 * Q 7. how to declare or set variable in mysql ?
 * ans = set @VARIAABE_NAME=VALUE_ANY;
 * mysql> set @a=10;
 * Query OK, 0 rows affected (0.00 sec)
 * 
 * if we try below query it will give error
 * mysql> set @s;
 * ERROR 1064 (42000): You have an error in your SQL syntax; check the manual
 * that corresponds to your MySQL server version for the right syntax to use
 * near '' at line 1
 * 
 * Q 8.Write a query for see variable value;
 * ans = select @VARIABLE_NAME;
 * mysql> select @a;
 * +------+
 * | @a |
 * +------+
 * | 10 |
 * +------+
 * 1 row in set (0.00 sec)
 * 
 * Q 9.create procedure with parameter which take input from user and call it ?
 * ans = in below procedure IN mean to take input from user and x is a variable
 * 
 * mysql> DELIMITER //
 * mysql> create procedure p5(IN x varchar(30))
 * -> BEGIN
 * -> select * from login where UNAME =X;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * mysql> call p5('bbb');
 * +-------+-------+
 * | UNAME | UPASS |
 * +-------+-------+
 * | bbb | 222 |
 * +-------+-------+
 * 1 row in set (0.00 sec)
 * 
 * Query OK, 0 rows affected (0.00 sec)
 * 
 * Q 10. is we can use WildCardCharacter in procedure parameter in java program
 * ?
 * ans = yes we can use
 * CallableStatement
 * cs=CONNECTION_OBJECT.prepareCall("{call PROCEDUR_NAME(?)}");
 * 
 * Q 11. Create procedure for insert data in table throw user ?
 * mysql> DELIMITER //
 * mysql> create procedure p6(IN x varchar(30),IN y varchar(30))
 * -> BEGIN
 * -> insert into login values(x,y);
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql>
 * mysql> DELIMITER ;
 * mysql> CALL P6('BHOLA','NATH');
 * Query OK, 1 row affected (0.01 sec)
 * mysql> SELECT * FROM LOGIN ;
 * +-------+-------+
 * | UNAME | UPASS |
 * +-------+-------+
 * | bbb | 222 |
 * | adg | 1 |
 * | adg | 1 |
 * | ram | 111 |
 * | sita | 222 |
 * | gita | 333 |
 * | BHOLA | NATH |
 * +-------+-------+
 * 7 rows in set (0.00 sec)
 * 
 * Q 12.write a procedeure for fetch output from procedure ?
 * mysql> DELIMITER //
 * mysql> create procedure p7(OUT x int )
 * -> BEGIN
 * -> SET X=10;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql> call p7(@y);
 * -> //
 * Query OK, 0 rows affected (0.00 sec)
 * 
 * mysql> select @y;
 * +------+
 * | @y |
 * +------+
 * | 10 |
 * +------+
 * 1 row in set (0.00 sec)
 * note= we create y because we have to output from procedure
 * OUT MEAN output from procedure
 * 
 * 
 * Q 13. what is getInt() method ?
 * ans = getInt() method is CallableStatement method its return type is int
 * it can be call using CallableStatement Object
 * 
 * 
 * Q 14. Addition of two number using procedure and return there result ?
 * ans =
 * mysql>
 * mysql> DELIMITER //
 * mysql> create procedure p8(IN x int , IN y int ,OUT z int)
 * -> BEGIN
 * -> set z=x+y;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql> DELIMITER ;
 * mysql> call p8(10,30,@z);
 * Query OK, 0 rows affected (0.00 sec)
 * 
 * mysql> select @z;
 * +------+
 * | @z |
 * +------+
 * | 40 |
 * +------+
 * 1 row in set (0.00 sec)
 * 
 * Q 15. what is the meaning of IN and OUT in procedure ?
 * ans = IN mean taking input from user and OUT mean output from procedure.
 * 
 * Q 16.which method is use fetch int type data from procedure ?
 * ans = int getInt(); method will use
 * 
 * Q 17.when we use getMoreResults() method ?
 * ans =if multiple ResultSet is created when we execute procedure in this case
 * we use getMoreResults() method .
 * 
 * Q 18. if procedure does not have parameter then is we need to write
 * parnethesis
 * in java program ?
 * ans = no we dont need parenthesis if procedure does not have parameter .
 * 
 * Q 19. is we can delete multiple procedure seprate from comma ?
 * ans = NO , we cant delete mulltiple procedute from separete using comma if
 * try it will give error .
 * 
 * 
 * Q 20 . how to delete variable ?
 * ans =set @VARIABLE_NAME=NULL;
 * 
 * Q 21 .write a query for delete mulltipe procedure ?
 * ans =
 * 
 * Q 22. WRITE THE DIFFRENCE BETWEEN executeQuery() and getResultSet() ?
 * ans = executeQuery()
 * 1. belongs to Statement and
 * and for its chlid interface
 * 2. it can executeQuery it self.
 * 3. it return boolean .
 * 4. it use for execute select
 * query .
 * 
 * getResultSet()
 * 
 * 1. belongs to Statement .
 * 2. it can not executeQuery it self.
 * 3. return ResultSet.
 * 4. it use for get ResultSet
 */

// ######################...Example-2..###############################
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p3()}");
 * ResultSet rs = cs.executeQuery();
 * while (rs.next()) {
 * System.out.println(rs.getString(1) + "....." + rs.getString(2));
 * }
 * while ((rs.next())) {
 * 
 * System.out.println(rs.getString(1) + "....." + rs.getString(2));
 * }
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * }
 */
/*
 * out put
 * bbb.....222
 * adg.....1
 * adg.....1
 * ram.....111
 * sita.....222
 * gita.....333
 * // table data only single time show but we write two query in procedure
 * reason is both the querys ResultSet is difrent and in above exampe we work on
 * single query resultSet
 * 
 * see below example for proper work
 */
// ######################...Example-3...###############################
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p3()}");
 * ResultSet rs = cs.executeQuery();
 * while (rs.next()) {
 * System.out.println(rs.getString(1) + "....." + rs.getString(2));
 * }
 * cs.getMoreResults();
 * System.out.println(rs.getString(1));
 * ResultSet rs2 = cs.getResultSet();
 * 
 * while (rs2.next()) {
 * System.out.println(rs2.getString(1) + "....." + rs2.getString(2));
 * }
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * }
 */
/*
 * out put
 * bbb.....222
 * adg.....1
 * adg.....1
 * ram.....111
 * sita.....222
 * gita.....333
 * bbb.....222
 * adg.....1
 * adg.....1
 * ram.....111
 * sita.....222
 * gita.....333
 * 
 * Q. when will java.sql.SQLException: Operation not allowed after ResultSet
 * // closed comes ?
 * ans=
 * 
 * I guess after while(rs2.next())
 * you are
 * trying to
 * access something
 * from rs1.But it's
 * already closed
 * since you
 * reexecuted statement
 * to get
 * rs2 from
 * it.Since you didn't
 * close it, I beleive it's
 * used again below.
 */
// ######################...Example-4...###############################
/*
 * first we create new procedure
 * mysql> DELIMITER //
 * mysql> create procedure p4()
 * -> BEGIN
 * -> select * from login;
 * -> select * from login;
 * -> select * from login;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 */
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p4()}");
 * ResultSet rs = cs.executeQuery();
 * while (rs.next()) {
 * System.out.println(rs.getString(1) + "......" + rs.getString(2));
 * }
 * 
 * while (cs.getMoreResults())
 * 
 * {
 * ResultSet rs2 = cs.getResultSet();
 * while (rs2.next()) {
 * System.out.println(rs2.getString(1) + "........" + rs2.getString(2));
 * }
 * }
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * }
 */
/*
 * output=
 * bbb......222
 * adg......1
 * adg......1
 * ram......111
 * sita......222
 * gita......333
 * bbb........222
 * adg........1
 * adg........1
 * ram........111
 * sita........222
 * gita........333
 * bbb........222
 * adg........1
 * adg........1
 * ram........111
 * sita........222
 * gita........333
 * 
 * 
 */

// ######################...Example-5...###############################
/*
 * Question is in above question first loop is complisory or not see below
 * example
 * if we not write first loop it will show only two query data one querys data
 * will miss
 * because when we use getMoreResults() method it will point the next ResultSet
 * there fore one resultSet is missed.
 * 
 * 
 */
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p4()}");
 * ResultSet rs = cs.executeQuery();
 * 
 * while (cs.getMoreResults())
 * 
 * {
 * ResultSet rs2 = cs.getResultSet();
 * while (rs2.next()) {
 * System.out.println(rs2.getString(1) + "........" + rs2.getString(2));
 * }
 * }
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * }
 */

/*
 * output
 * bbb........222
 * adg........1
 * adg........1
 * ram........111
 * sita........222
 * gita........333
 * bbb........222
 * adg........1
 * adg........1
 * ram........111
 * sita........222
 * gita........333
 */

// ######################...Example-6...###############################
// for remove above problem we use doWhile loop
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p4()}");
 * ResultSet rs = cs.executeQuery();
 * 
 * do
 * 
 * {
 * ResultSet rs2 = cs.getResultSet();
 * while (rs2.next()) {
 * System.out.println(rs2.getString(1) + "........" + rs2.getString(2));
 * }
 * } while (cs.getMoreResults());
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * }
 */
/*
 * out put
 * bbb........222
 * adg........1
 * adg........1
 * ram........111
 * sita........222
 * gita........333
 * bbb........222
 * adg........1
 * adg........1
 * ram........111
 * sita........222
 * gita........333
 * bbb........222
 * adg........1
 * adg........1
 * ram........111
 * sita........222
 * gita........333
 */

// ######################...Example-7...###############################
// CREATE JAVA PROGARAM USING PROCEDURE TAKE INPUT FROM USER
// FIRST WE WILL CREATE PROCEDURE ACCORDING OUR NEED
/*
 * ans = in below procedure IN mean to take input from user and x is a variable
 * 
 * mysql> DELIMITER //
 * mysql> create procedure p5(IN x varchar(30))
 * -> BEGIN
 * -> select * from login where UNAME =X;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * mysql> call p5('bbb');
 * +-------+-------+
 * | UNAME | UPASS |
 * +-------+-------+
 * | bbb | 222 |
 * +-------+-------+
 * 1 row in set (0.00 sec)
 * 
 * Query OK, 0 rows affected (0.00 sec)
 */
/*
 * import java.sql.*;
 * 
 * import javax.swing.tree.ExpandVetoException;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * String s1="bbb";
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p5('"+s1+"')}");
 * 
 * ResultSet rs = cs.executeQuery();
 * while (rs.next()) {
 * System.out.println(rs.getString(1) + "........" + rs.getString(2));
 * }
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // out put = bbb........222
 * }
 */
// ######################...Example-8...###############################
// USING PROCEDURE WITH WILD CARD CHARACTER IN JAVA PROGRAM
/*
 * import java.sql.*;
 * 
 * import javax.swing.tree.ExpandVetoException;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p5(?)}");
 * cs.setString(1, "bbb");
 * ResultSet rs = cs.executeQuery();
 * while (rs.next()) {
 * System.out.println(rs.getString(1) + "........" + rs.getString(2));
 * }
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // out put = bbb........222
 * }
 */
// ######################...Example-9...###############################
/*
 * INSERT DATA IN TABLE USING PROCEDURE
 * FIRST WE WILL CREATE PROCEDURE
 * mysql> DELIMITER //
 * mysql> create procedure p6(IN x varchar(30),IN y varchar(30))
 * -> BEGIN
 * -> insert into login values(x,y);
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql>
 * mysql> DELIMITER ;
 * mysql> CALL P6('BHOLA','NATH');
 * Query OK, 1 row affected (0.01 sec)
 */
/*
 * import java.sql.*;
 * 
 * import javax.swing.tree.ExpandVetoException;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p6(?,?)}");
 * cs.setString(1, "SACHIN");
 * cs.setString(2, "parmar");
 * cs.executeUpdate();
 * System.out.println("data inserted");
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }}
 */
/**
 * output =
 * mysql> select * from login;
 * +--------+--------+
 * | UNAME | UPASS |
 * +--------+--------+
 * | BHOLA | NATH |
 * | SACHIN | parmar |
 * +--------+--------+
 */

// ######################...Example-10...###############################
// write A PROGRAM FOR FETCH OUT FROM PROCEDURE
// FIRST WE HAVE TO CREATE PROCEDURE;
/*
 * mysql> DELIMITER //
 * mysql> create procedure p7(OUT x int )
 * -> BEGIN
 * -> SET X=10;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql> call p7(@y);
 * -> //
 * Query OK, 0 rows affected (0.00 sec)
 * 
 * mysql> select @y;
 * +------+
 * | @y |
 * +------+
 * | 10 |
 * +------+
 * 1 row in set (0.00 sec)
 * note= we create y because we have to output from procedure
 * OUT MEAN output from procedure
 * 
 * NOTE = IF PROCEDURE HAVE parameter any type IN ,OUT we havae to wrtite it
 * when we call
 * we can see below example we use wildcard character for OUT PARMAETER
 * 
 * 
 * if procedure return any out put and we exexuteQuery the we dont need
 * ResultSet for fetch that out put
 * we can diractly fetch using CallableStatement Object firdt we have to
 * executeQuery()
 * we use below method
 * int getInt(1);
 * CallableStatement_object.getInt(Column_number);
 */
/*
 * import java.sql.*;
 * 
 * import javax.swing.tree.ExpandVetoException;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p7(?)}");
 * cs.executeQuery();
 * 
 * System.out.println(cs.getInt(1));
 * 
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // output 10
 * // we use getInt() method because procedure return int
 * if it return varchar() then we use getString() method
 * }
 */
// ######################...Example-11...###############################
/*
 * // write a program of procedure that take input from user and return there
 * addition using procedure
 * // FIRST WE HAVE TO CREATE PROCEDURE
 * mysql>
 * mysql> DELIMITER //
 * mysql> create procedure p8(IN x int , IN y int ,OUT z int)
 * -> BEGIN
 * -> set z=x+y;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql> DELIMITER ;
 * mysql> call p8(10,30,@z);
 * Query OK, 0 rows affected (0.00 sec)
 * 
 * mysql> select @z;
 * +------+
 * | @z |
 * +------+
 * | 40 |
 * +------+
 * 1 row in set (0.00 sec)
 * 
 * NOTE = we use three (3) in getInt() parameter because procedure 3rd parameter
 * is output type
 */
/*
 * import java.sql.*;
 * 
 * import javax.swing.tree.ExpandVetoException;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p8(?,?,?)}");
 * cs.setInt(1, 50);
 * cs.setInt(2, 50);
 * cs.executeQuery();
 * 
 * System.out.println(cs.getInt(3));
 * 
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * 
 * }
 * // output 100
 * }
 * 
 */

// **********************April_3rd**********************
// ######################...Example-1...###############################
/*
 * 
 * 
 * Q 1.it is nessesary load and register the Driver ?
 * ans = if use ConnectionPool the we have to no need to load and register the
 * Driver because that time we dont use DriverManager .
 * 
 * Q 2.What is ConnectionPool ?
 * ans = Connection pool is group of mulltiple ready to use Connection Objects.
 * 
 * 
 * Q 3. Explain Connection pool in brief ?
 * ans =a jdbc connection pool is group of reusable Connection objct for a
 * particular database because create each time new physical connection is time
 * consuming the server mentance a pool of avilabe connection to incress
 * performancce when an application request a connection it obtains one from the
 * pool. when an application close a connection the connection is return to the
 * pool .
 * the properties of connection pool
 * can variy with diffrent databse venders(venders mean provider like
 * mysql,oracle ,monodb)
 * 
 * some common properties
 * the dataBase name (url),user
 * 
 * 
 * Name,user password
 * 
 * 
 * Q 4.why we use connection pool?
 * ans = if our appliction mulltiple time conectivity to database then this case
 * each time new Connection will create this process is very time taking and
 * resource consuming processs and our performance wiil also down to there for
 * we use connection pool becaues they have mulltiple ready to use Connection
 * object
 * when we need Connection Object it will return object form connection pool and
 * after end of our requirment it return to Connection pool.
 * 
 * 
 * Q 5.how connection pool useful?
 * ans = it incress over all performance of out application because we dont need
 * to create mulltiple time Connection object and dont need to close it .
 * 
 * Q 6. what is MysqlConnectionPoolDataSource ?
 * ans = MysqlConnectionPoolDataSource is an class that implemets java.sql.
 * DataSource interface ,it providing a way to obtain database Connection from a
 * pool .it store in com.mysql.jdbc.jdbc2.optional.*;
 * 
 * Q 7.where the ("com.mysql.jdbc.Driver" ) and
 * ("com.mysql.jdbc.jdbc2.optional.*") package are stored ?
 * ans = both package are stored inside the Connector.
 * 
 * Q 8. write the methods of MysqlConnectionPoolDataSource class ?
 * ans = 1. setURL("jdbc:mysql:///DATABASE_NAME");
 * 2. setUser("MYSQL_USER_NAME");
 * 3. setPassword("MYSQL_PASSWORD");
 * 
 * 
 * Q 9. IN which package MysqlConnectionPoolDataSource is stored ?
 * ans = MysqlConnectionPoolDataSource is stored in
 * com.mysql.jdbc.jdbc2.optional.*;
 * 
 * 
 * Q 10. where Driver class is store ?
 * ans = it store inside the connector .
 * 
 * Q 11. if procedure is not exist and we try to drop it what happen ?
 * ans = mysql> drop procedure p1;
 * ERROR 1305 (42000): PROCEDURE iclass.p1 does not exist
 * note = iclass is the database name and p1 is procedure name that is not exist
 * 
 * 
 * Q 12. why back \\ shlash not work in DELIMITER ?
 * ans = Avoid using backslash (\) as a delimiter because it is an escape
 * character in MySQL
 * 
 * Q 13. can we use select and not select query in single procedure ?
 * ans = YES ,we can use it see below
 * mysql> DELIMITER //
 * mysql> create procedure p11(IN X VARCHAR(30), IN Y VARCHAR(30))
 * -> BEGIN
 * -> insert into login values(X,Y);
 * -> select * from login ;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql> DELIMITER ;
 * mysql> call p11('gita','mohan');
 * +--------+--------+
 * | UNAME | UPASS |
 * +--------+--------+
 * | bbb | 222 |
 * | adg | 1 |
 * | adg | 1 |
 * | ram | 111 |
 * | sita | 222 |
 * | gita | 333 |
 * | BHOLA | NATH |
 * | SACHIN | parmar |
 * | gita | mohan |
 * +--------+--------+
 * 9 rows in set (0.01 sec)
 * 
 * Query OK, 0 rows affected (0.02 sec)
 * 
 * Q 14. can we call one procedure from other procedure ?
 * ans = YES ,we can call ;
 * mysql> DELIMITER //
 * mysql> create procedure p13(IN X VARCHAR(30), IN Y VARCHAR(30))
 * -> BEGIN
 * -> CALL P11(X,Y);
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql> DELIMITER ;
 * mysql> CALL P13('KAKA','MAMA');
 * +--------+--------+
 * | UNAME | UPASS |
 * +--------+--------+
 * | bbb | 222 |
 * | adg | 1 |
 * | adg | 1 |
 * | ram | 111 |
 * | sita | 222 |
 * | gita | 333 |
 * | BHOLA | NATH |
 * | SACHIN | parmar |
 * | gita | mohan |
 * | KAKA | MAMA |
 * +--------+--------+
 * 10 rows in set (0.00 sec)
 * 
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * Q 15. write a query for a particular column data ?
 * ans = select COLUMN_NAME TABLE_NAME;
 * mysql> select UNAME from login ;
 * +--------+
 * | UNAME |
 * +--------+
 * | bbb |
 * | adg |
 * | adg |
 * | ram |
 * | gita |
 * | KAKA |
 * +--------+
 * 10 rows in set (0.00 sec)
 * 
 * Q 16. write a query that show particular column data for particular user ?
 * ans = select PARTICULAR_COLUMN_NAME from TABLE_NAME where
 * USER_COLUMN_NAME='PARTICULAR_USER_NAME';
 * mysql> select UPASS from login where UNAME='bbb';
 * +-------+
 * | UPASS |
 * +-------+
 * | 222 |
 * +-------+
 * 1 row in set (0.00 sec)
 * 
 * Q 17. write s procedure to copy password in a variabe and return it in form
 * of output ?
 * mysql> DELIMITER //
 * mysql> create procedure p14(IN X VARCHAR(30), OUT Y VARCHAR(30))
 * -> BEGIN
 * -> select UPASS into Y from login where UNAME=X;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql> DELIMITER ;
 * mysql> CALL P14('bbb',@c);
 * Query OK, 1 row affected (0.00 sec)
 * 
 * mysql> select @c;
 * +------+
 * | @c |
 * +------+
 * | 222 |
 * +------+
 * 1 row in set (0.00 sec)
 * note we create c variabe because we are reciving password from procedure
 * 
 * Q 18. is we can use MysqlConnectionPoolDataSource class without using the
 * class path ?
 * ans = NO , we cant use it because its store in Connector there for we have to
 * set path for connector .
 * 
 * 
 * Q 19. which method is use if we want to fetch varchar() type data from
 * procedure ?
 * ans = we will use getString() method its return type is String.
 * 
 * Q 20 . what happen when we use recursion in procedure ?
 * IT FIRST SHOWING DATA THEN IT IS GIVING ERROR
 * mysql> DELIMITER //
 * mysql> create procedure c1()
 * -> BEGIN
 * -> SELECT * FROM LOGIN ;
 * -> CALL C2();
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * mysql> DELIMITER //
 * mysql> create procedure c2()
 * -> BEGIN
 * -> call c1();
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * ans =mysql> CALL C1();
 * +--------+--------+
 * | UNAME | UPASS |
 * +--------+--------+
 * | bbb | 222 |
 * | adg | 1 |
 * | adg | 1 |
 * | ram | 111 |
 * | sita | 222 |
 * | gita | 333 |
 * | BHOLA | NATH |
 * | SACHIN | parmar |
 * | gita | mohan |
 * | KAKA | MAMA |
 * +--------+--------+
 * 10 rows in set (0.00 sec)
 * 
 * ERROR 1456 (HY000): Recursive limit 0 (as set by the max_sp_recursion_depth
 * variable) was exceeded for routine c1
 * 
 * 
 * Q 21. merge more then one procedure create java program ?
 */
// ######################...Example-2...###############################
/*
 * WRITE A PROGRAM FOR CONNECTION POOL
 * 
 * some daoubt about below example
 * 1 .we should close conncetion or not in below example
 * ans = if we dont close it will proper work ;
 * 2 . try to use ResultSet after conncetion close ;
 * ans it will give Exception can not use peration afeter ResultSet close
 */

// import java.sql.*;
// import com.mysql.cj.jdbc.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// MysqlConnectionPoolDataSource mcpds = new MysqlConnectionPoolDataSource();
// mcpds.setURL("jdbc:mysql:///iclass");
// mcpds.setUser("root");
// mcpds.setPassword("root");
// Connection con = mcpds.getConnection();
// Statement st = con.createStatement();
// ResultSet rs = st.executeQuery("select * from login");
// while (rs.next()) {
// System.out.println(rs.getString(1) + "....." + rs.getString(2));
// }
// con.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }
// out put = aaa 111

// ######################...Example-3...###############################
/*
 * write a program that use procedure program that execute select and non select
 * QUERY
 * 
 * FIRST WE HAVE TO CREATE PROCEDURE
 * > CREATE PROCEDURE P1(IN X varchar(30),IN Y varchar(30))
 * -> BEGIN
 * -> insert into login values (X,Y);
 * -> select * from login ;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * 
 */
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call P1(?,?)}");
 * cs.setString(1, "ram");
 * cs.setString(2, "krishna");
 * ResultSet rs = cs.executeQuery();
 * while (rs.next()) {
 * System.out.println(rs.getString(1) + "......" + rs.getString(2));
 * }
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // out put ram......krishna (because tabel have only this data )
 * 
 * }
 */
// ######################...Example-4...###############################
/*
 * mysql> CREATE PROCEDURE P2(IN X varchar(30),IN Y varchar(30))
 * -> BEGIN
 * -> select * from login ;
 * -> insert into login values (X,Y);
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * Note = in above procedure insert query is escond there for our program
 * insert data is not show because first abve procedure select qery execute
 * hogi to uska result set phla hee ban jay ga islya then isert query hogi
 * insert hona sa phla he select query execute ho chuki ha isliya insert wala
 * data show nhai hoga
 */
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call P2(?,?)}");
 * cs.setString(1, "sita");
 * cs.setString(2, "gita");
 * ResultSet rs = cs.executeQuery();
 * while (rs.next()) {
 * System.out.println(rs.getString(1) + "......" + rs.getString(2));
 * }
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * 
 * }
 */
/*
 * output
 * ram......krishna
 * aaa......111
 * bbb......222
 * ram......krishna
 */
// ######################...Example-5...###############################
/*
 * WRITE A PROGRAM with help of procedure that return paritcular user password
 * 
 * mysql> DELIMITER //
 * mysql> CREATE PROCEDURE P3(IN X varchar(30))
 * -> BEGIN
 * -> select UPASS FROM LOGIN WHERE UNAME=X;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql> DELIMITER ;
 * mysql> CALL P3('aaa');
 * +-------+
 * | UPASS |
 * +-------+
 * | 111 |
 * +-------+
 * 1 row in set (0.00 sec)
 * 
 * Query OK, 0 rows affected (0.00 sec)
 * 
 * 
 * 
 * note = in below example if we dont use rs.next() then we get bleow exception
 * java.sql.SQLException: Before start of result set
 * at
 * com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:130)
 * at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:98)
 * at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:90)
 * at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:64)
 * at com.mysql.cj.jdbc.result.ResultSetImpl.checkRowPos(ResultSetImpl.java:528)
 * at com.mysql.cj.jdbc.result.ResultSetImpl.getString(ResultSetImpl.java:874)
 * at Classjdbc.main(Classjdbc.java:1888)
 * 
 * reason becuse result set create hua ha
 * ha isliya rs.next() kerna hoga jo bhi result create hua uski first row ko
 * point kerna ka liya .
 */
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call P3(?)}");
 * cs.setString(1, "aaa");
 * ResultSet rs = cs.executeQuery();
 * rs.next();
 * System.out.println(rs.getString(1));
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * 
 * }
 */
// ######################...Example-6...###############################
/*
 * koi bhi value tab print hoti ha jab hum usa print kerwata ha
 * 
 * END' at line 3
 * mysql> DELIMITER //
 * mysql> create procedure p4(IN x varchar(30),OUT y varchar(30))
 * -> BEGIN
 * -> select UPASS into y from login where UNAME=x;
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * mysql> CALL P4('aaa',@x);
 * Query OK, 1 row affected (0.00 sec)
 * 
 * mysql> select @x;
 * +------+
 * | @x |
 * +------+
 * | 111 |
 * +------+
 * 1 row in set (0.00 sec)
 */
/*
 * import java.sql.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call P4(?,?)}");
 * cs.setString(1, "aaa");
 * ResultSet rs = cs.executeQuery();
 * 
 * System.out.println(cs.getString(2));
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // first parameter for input type and second parameter for output type
 * // output= 111
 * }
 */
// ****************************APRIL-4th*********************************
// ######################...Example-1...###############################
/*
 * Q1.HOW TO CRATE FUNCTION IN MYSQL ?
 * ANS .mysql>DELIMITER //
 * mysql> create function f1(x int ,y int) returns int DETERMINISTIC
 * -> begin
 * -> return x+y ;
 * -> end //
 * Query OK, 0 rows affected (0.01 sec)
 * Q 1.5= how to call function in mysql?
 * mysql> select f1(10,20);
 * +-----------+
 * | f1(10,20) |
 * +-----------+
 * | 30 |
 * +-----------+
 * 1 row in set (0.01 sec)
 * 
 * 
 * 
 * Q2.WHY WE USE DETERMINISTIC IN FUNCTION ?
 * ANS .
 * 
 * Q3 .WHY WE CANT CREATE cube NAME PROCEDURE IN MYSQL?
 * ANS .
 * 
 * Q4. HOW TO CALL FUNCTION IN JAVA PROGRAM ?
 * ANS . CallableStatement cs = con.prepareCall("{?=call FUCTION_NAME(?,?)}");
 * 
 * Q5 . IS WE CAN USE DOUBLE QOUTES IN STRING IN MYSQL LIKE concat
 * ("hi....","my name is ram") ?
 * ANS .
 * 
 * q 6. HOW TO CREATE FUCTION FOR VARCHAR() TYPE IN MYSQL ?
 * ANS .mysql>DELIMITER //
 * mysql> create function f2(x varchar(30)) returns varchar(30) DETERMINISTIC
 * -> BEGIN
 * -> RETURN 'HI....';
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * q7 . HOW TO CALL varchar type function in mysql ?
 * ans . mysql> DELIMITER ;
 * mysql> SELECT F2('RAM');
 * +-----------+
 * | F2('RAM') |
 * +-----------+
 * | HI.... |
 * +-----------+
 * 1 row in set (0.00 sec)
 * 
 * Q 8 . WRITE THE DIFFERNCE BETWEEN function and procedure ?(search it )
 * ans .
 * function
 * 1.function are designed to encapsulate or transformastion and return the
 * results.
 * 
 * procedure
 * 1.procedure are focused to data manipulation and processing .
 * 
 * Q 9 what is Properties class ?
 * ans .
 * 
 * q10 what is the benfits of Properties class ?
 * ans = man lijiya apna connection ka code 1000 places per likha or ab huma
 * security and any purpose sa user name and password ko change kerna ha too ab
 * huma 1000 file ma manully change kerna ha this process is very lengthy and
 * time taking if by mistake we forget to change in any file the our application
 * not work proper and also we have to complie those 1000 files
 * BUT if we use property class we have to change in single place inside the
 * Properties class and we dont nedd to compile java file because we made change
 * in properties file
 * 
 */
// ######################...Example-2...###############################
// write a program using procedure that use INOUT
/*
 * first we have to create procedure
 * mysql> DELIMITER //
 * mysql> create procedure p21(INOUT x int)
 * -> BEGIN
 * -> set x=x +x;
 * -> END //
 * Query OK, 0 rows affected (0.02 sec)
 * 
 * mysql> call p21(@a)//
 * Query OK, 0 rows affected (0.00 sec)
 * mysql> select @a;
 * +------+
 * | @a |
 * +------+
 * | NULL |
 * +------+
 * 1 row in set (0.00 sec)
 * mysql> set @a=10;
 * Query OK, 0 rows affected (0.00 sec)
 * 
 * mysql> call p21(@a);
 * Query OK, 0 rows affected (0.00 sec)
 * 
 * mysql> select @a;
 * +------+
 * | @a |
 * +------+
 * | 20 |
 * +------+
 * 1 row in set (0.00 sec)
 */
/*
 * import java.sql.*;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call p21(?)}");
 * cs.setInt(1, 100);
 * cs.executeQuery();
 * System.out.println(cs.getInt(1));
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * // out put =200
 * }
 * }
 */
// ######################...Example-3...###############################
// WRITE A PROGRAM FOR PROCEDURE THAT RETURN THE CUBE IN JAVA
/*
 * note we can not create procedure with cube name it will give error
 * there for we create with cube1 name .
 * 
 */
/*
 * import java.sql.*;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String ar[]) {
 * 
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{call cube1(?)}");
 * cs.setInt(1, 2);
 * cs.executeQuery();
 * System.out.println("cube is =" + cs.getInt(1));
 * con.close();
 * 
 * 
 * catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * //output =cube is=8
 */
// ######################...Example-4...###############################
//
/*
 * how to create function in mysql and use in java program
 * mysql>DELIMITER //
 * mysql> create function f1(x int ,y int) returns int DETERMINISTIC
 * -> begin
 * -> return x+y ;
 * -> end //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 */
/*
 * import java.sql.*;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String ar[]) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{?=call f1(?,?)}");
 * cs.setInt(2, 100);
 * cs.setInt(3, 200);
 * cs.executeQuery();
 * System.out.println(cs.getInt(1));
 * con.close();
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 */
// out put =0
// this program is giving this out put is not according to our expectasion there
// for this program is not complete

// Q .WHAT WE HAVE TO DO TO MAKE WORKABLE
// Q WHY IT IS WORK ONLY IN execute ?

// ######################...Example-4...###############################
// NEXT STEP OF ABOVE EXAMPLE
/*
 * import java.sql.*;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String ar[]) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{?=call f1(?,?)}");
 * cs.setInt(2, 100);
 * cs.setInt(3, 200);
 * cs.registerOutParameter(1, Types.INTEGER);
 * cs.executeQuery();
 * System.out.println(cs.getInt(1));
 * con.close();
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 */
/*
 * // Q why executeQuery use kerna per NullPointerException aa rahi ha ?
 * // Ans.
 * java.lang.NullPointerException
 * at com.mysql.cj.jdbc.CallableStatement.getInt(CallableStatement.java:1284)
 * at Classjdbc.main(Classjdbc.java:2141)
 * 
 * note = there for we use execute method ?
 * see below example
 * 
 * uuuu
 */
// ######################...Example-4...###############################
// next Step of above example
/*
 * import java.sql.*;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String ar[]) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{?=call f1(?,?)}");
 * cs.setInt(2, 100);
 * cs.setInt(3, 200);
 * cs.registerOutParameter(1, Types.INTEGER);
 * cs.execute();
 * 
 * System.out.println(cs.getInt(1));
 * con.close();
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * //out put =300
 * }
 */
// ######################...Example-4...###############################
// create function using varchar and use in java program
/*
 * mysql>DELIMITER //
 * mysql> create function f2(x varchar(30)) returns varchar(30) DETERMINISTIC
 * -> BEGIN
 * -> RETURN 'HI....';
 * 
 * -> END //
 * Query OK, 0 rows affected (0.01 sec)
 * 
 * mysql> DELIMITER ;
 * mysql> SELECT F2('RAM');
 * +-----------+
 * | F2('RAM') |
 * +-----------+
 * | HI.... |
 * +-----------+
 * 1 row in set (0.00 sec)
 */
/*
 * import java.sql.*;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String ar[]) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * CallableStatement cs = con.prepareCall("{?=call f2(?)}");
 * cs.setString(2, "ram ji");
 * cs.registerOutParameter(1, Types.VARCHAR);
 * cs.execute();
 * 
 * System.out.println(cs.getString(1));
 * con.close();
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // out put =HI....
 * 
 * }
 */

// ######################...Example-4...###############################
// crate java jdbc conectivity program with the help of Properties class ?
/*
 * first we have to create Properties class file
 * then we have to save this file with .properties extension .
 * note yadi humna properties class ma data double cote an ander likha to
 * double cote ma hee ayga or without double cote ma likha to data without
 * double cote ma ayga meanss simpe jasa likha ga wasa hee ayga
 * aaa.properties (save file )
 * write inside the file below two line
 * un=ramji
 * up=111
 */
/*
 * import java.io.*;
 * import java.util.*;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String[] args) throws Exception {
 * Properties p = new Properties();
 * FileInputStream fis = new FileInputStream("aaa.properties");
 * p.load(fis);
 * System.out.println(p.getProperty("un"));
 * System.out.println(p.getProperty("up"));
 * }
 * // out put =ram ji
 * // 111
 * }
 */
// ######################...Example-4...###############################
// WRITE A PROGRAM TO SHOW ALL TABLE DATA
/*
 * import java.sql.*;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String ar[]) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * Statement st = con.createStatement();
 * ResultSet rs = st.executeQuery("select * from login ");
 * while (rs.next())
 * System.out.println(rs.getString(1) + "\t" + rs.getString(2));
 * con.close();
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // output
 * // ram krishna
 * // aaa 111
 * // bbb 222
 * // ram krishna
 * // sita gita
 * 
 * }
 */

// ######################...Example-4...###############################
// WRITE A PROGRAM FOR STEP 2 FOR Properties class
/*
 * aaa.properties
 * URL=jdbc:mysql:///iclass
 * un=root
 * up=root
 * 
 * note if properties file ma koi field ma data nhi liha too below exception
 * aygi
 * java.sql.SQLException: The url cannot be null
 * at java.sql.DriverManager.getConnection(DriverManager.java:649)
 * at java.sql.DriverManager.getConnection(DriverManager.java:247)
 * at Classjdbc.main(Classjdbc.java:2344)
 */
/*
 * import java.io.FileInputStream;
 * import java.sql.*;
 * import java.util.Properties;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String ar[]) {
 * try {
 * Properties p = new Properties();
 * FileInputStream fis = new FileInputStream("aaa.properties");
 * p.load(fis);
 * String s1 = p.getProperty("URL");
 * String s2 = p.getProperty("un");
 * String s3 = p.getProperty("up");
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection(s1, s2, s3);
 * Statement st = con.createStatement();
 * ResultSet rs = st.executeQuery("select * from login ");
 * while (rs.next())
 * System.out.println(rs.getString(1) + "\t" + rs.getString(2));
 * con.close();
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // out put
 * // ram krishna
 * // aaa 111
 * // bbb 222
 * // ram krishna
 * // sita gita
 * }
 */
// ######################...Example-4...###############################
// another overload getConnection(two parameter) mehthod of Connection class
/*
 * aaa.properties
 *
 * un=root
 * up=root
 * 
 * if we write like above we get below exception so we have to modify
 * properties file like below two line
 * aaa.properites
 * User=root
 * Password=root
 * 
 */
/*
 * import java.io.FileInputStream;
 * import java.sql.*;
 * import java.util.Properties;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String ar[]) {
 * try {
 * Properties p = new Properties();
 * FileInputStream fis = new FileInputStream("aaa.properties");
 * p.load(fis);
 * 
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", p);
 * Statement st = con.createStatement();
 * ResultSet rs = st.executeQuery("select * from login ");
 * while (rs.next())
 * System.out.println(rs.getString(1) + "\t" + rs.getString(2));
 * con.close();
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * // java.sql.SQLException: Access denied for user 'SHIVA'@'localhost' (using
 * // password: NO)
 * // at
 * //
 * com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:130)
 * // at
 * // com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(
 * SQLExceptionsMapping.java:122)
 * }
 * // out put
 * // ram krishna
 * // aaa 111
 * // bbb 222
 * // ram krishna
 * // sita gita
 * 
 */

// ****************************APRIL-5th*********************************
// ######################...Example-1...###############################
/*
 * Q1 .what is Transaction mangement in jdbc ?
 * ans . Transaction represent a single unit of work .
 * 
 * real life example ATM
 * if ATM ma ak bhi step wrong hoti ha too huma double sa card insert kerna
 * padta ha process again start kerni hoti ha
 * 
 * Q 2 What is ACID property ?
 * ans .
 * 
 * Q 3 . Transaction managment defination ?
 * ans .Transaction managment is useful when we need to ensure that a group of
 * sql
 * statement are executed together as a unit it allow you to either comit
 * all of the statement or rollback all of the statements if an erro oucrs
 * 
 * Q4 what is autoCommit() in msql ?
 * ans . autoCommit() in mysql is by default true .
 * 
 * Q5 . which autoCommit mode is use in Transaction managment example ?
 * ans . autoCommit mode is use false in Transaction management example .
 * 
 * 
 * 
 */
// ######################...Example-2...###############################
// program for reason why need Transaction managment STEP 1
/*
 * mysql> create table emp (uname varchar(30), ubalance int);
 * Query OK, 0 rows affected (0.06 sec)
 * mysql> select * from emp;
 * Empty set (0.01 sec)
 * 
 * 
 * mysql> insert into emp values("ram",50000),("sita",10000);
 * Query OK, 2 rows affected (0.01 sec)
 * Records: 2 Duplicates: 0 Warnings: 0
 * 
 * mysql> select * from emp;
 * +-------+----------+
 * | uname | ubalance |
 * +-------+----------+
 * | ram | 50000 |
 * | sita | 10000 |
 * +-------+----------+
 * 2 rows in set (0.00 sec)
 */
/*
 * import java.sql.*;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String ar[]) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * Statement st = con.createStatement();
 * st.executeUpdate("update emp set ubalance =ubalance-10000 where uname='ram'"
 * );
 * st.executeUpdate("update emp set ubalance =ubalance+10000 where uname='sita'"
 * );
 * 
 * System.out.println("amount transfer");
 * con.close();
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * // output = amout transfer
 * // mysql> select * from emp;
 * // +-------+----------+
 * // | uname | ubalance |
 * // +-------+----------+
 * // | ram | 40000 |
 * // | sita | 20000 |
 * // +-------+----------+
 * // 2 rows in set (0.00 sec)
 * }
 * }
 */
// ######################...Example-3...###############################
/*
 * import java.sql.*;
 * 
 * public class Classjdbc {
 * 
 * public static void main(String ar[]) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
 * "root");
 * Statement st = con.createStatement();
 * st.executeUpdate("update emp set ubalance =ubalance-10000 where uname='ram'"
 * );
 * System.out.println(10 / 0);
 * st.executeUpdate("update emp set ubalance =ubalance+10000 where uname='sita'"
 * );
 * 
 * System.out.println("amount transfer");
 * con.close();
 * 
 * } catch (Exception e) {
 * e.printStackTrace();
 * }}
 * }
 */ // java.lang.ArithmeticException: / by zero
/*
 * mysql> select * from emp;
 * +-------+----------+
 * | uname | ubalance |
 * +-------+----------+
 * | ram | 30000 |
 * | sita | 20000 |
 * +-------+----------+
 * 2 rows in set (0.00 sec)
 * 
 * above example ma problem ya ha amount debit too ho gay ram ka balance sa but
 * sita ka balance ma credit nahi h
 * note know we want if first query is execute then second query also have
 * execute yadi pahli execute ho gai ha or dusri nahi hoti ha too rollback ho
 * jana chhiya matlab first qery ms jo update hua tha vo nahi hona chahiya
 */
// ######################...Example-4...###############################
// STEP 1 FOR SQL transaction
/*
 * first we delete login all data
 * select * from emp;
 * +-------+----------+
 * | uname | ubalance |
 * +-------+----------+
 * | ram | 30000 |
 * | sita | 20000 |
 * +-------+----------+
 * 2 rows in set (0.00 sec)
 * 
 * mysql> delete from login;
 * Query OK, 5 rows affected (0.01 sec)
 * 
 * mysql> select * from login ;
 * Empty set (0.00 sec)
 */

// import java.sql.*;

// public class Classjdbc {

// public static void main(String ar[]) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
// "root");
// Statement st = con.createStatement();
// con.setAutoCommit(false);
// st.executeUpdate("insert into login values ('ram','111')");

// System.out.println("data insert ");
// con.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }
/*
 * out put
 * data insert
 * know we check in mysql
 * 
 * mysql> select * from login ;
 * Empty set (0.00 sec)
 * 
 * program bol raha data insertd but sql ma show nahi ho rha ha why
 * note = setAutoCommit(false) kerna per data insert nahi hoge kyo ki query
 * execute hona ka liya commit true hona chahiya or humna false ker diya islya
 */

// ######################...Example-5...###############################
// STEP 2 code is not working because autocommit mode is false
// if auto commit mode is false or disabled then not data changes in database

// import java.sql.*;

// public class Classjdbc {

// public static void main(String ar[]) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
// "root");
// Statement st = con.createStatement();
// con.setAutoCommit(false);
// int x = st.executeUpdate("insert into login values ('ram','111')");
// if (x != 0)

// System.out.println("data insert " + x);
// else
// System.out.println("data not insert ");

// con.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }
/**
 * out put
 * data insert
 * mysql> select * from login ;
 * Empty set (0.00 sec)
 * 
 * mean data store nahi hua ha
 * note = matlab x ma kuch na kuch store hua ha data sa base sa zero ka alwawa
 * or kuch return ho too ya mat samazh lena data insert hua ha
 */

// ######################...Example-6...###############################
// Step 3 data is inserted because after queris execution we use commit()
// method that commit the queris there changes is occurs in data base

// import java.sql.*;

// public class Classjdbc {

// public static void main(String ar[]) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
// "root");
// Statement st = con.createStatement();
// con.setAutoCommit(false);
// int x = st.executeUpdate("insert into login values ('ram','111')");
// con.commit();
// if (x != 0)

// System.out.println("data insert ");
// else
// System.out.println("data not insert ");

// con.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }
// OUTPUT=> data insert
// lets check in mysql
// mysql> select * from login;
// +-------+-------+
// | UNAME | UPASS |
// +-------+-------+
// | ram | 111 |
// +-------+-------+
// 1 row in set (0.00 sec)

// ######################...Example-7...###############################
// if exception is ocurs the

// import java.sql.*;

// public class Classjdbc {

// public static void main(String ar[]) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
// "root");
// Statement st = con.createStatement();
// con.setAutoCommit(false);
// boolean b = false;
// try {
// st.executeUpdate("update emp set ubalance =ubalance-10000 where
// uname='ram'");
// System.out.println(10 / 0);
// st.executeUpdate("update emp set ubalance =ubalance+10000 where
// uname='sita'");
// con.commit();
// b = true;
// } catch (Exception e) {
// con.rollback();
// }
// if (b) {
// System.out.println("amount transfer");

// } else
// System.out.println("amount not transfer");
// {
// }
// con.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }

// }
/*
 * first we check table data then run program
 * mysql> select * from emp;
 * +-------+----------+
 * | uname | ubalance |
 * +-------+----------+
 * | ram | 30000 |
 * | sita | 20000 |
 * +-------+----------+
 * 
 * 
 * 
 * 2 rows in set (0.00 sec)
 * 
 * know we run program
 * OUTPUT=> amount not transfer
 * know we check in database
 * 
 * mysql> select * from emp;
 * +-------+----------+
 * | uname | ubalance |
 * +-------+----------+
 * | ram | 30000 |
 * | sita | 20000 |
 * +-------+----------+
 * 2 rows in set (0.00 sec)
 * 
 * REASON =because exception is ocuurs then catch block execute and the
 * rollback() method is execute there for data not modify
 * 
 * 
 */

// ######################...Example-8...###############################
// import java.sql.*;

// public class Classjdbc {

// public static void main(String ar[]) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
// "root");
// Statement st = con.createStatement();
// con.setAutoCommit(false);
// boolean b = false;
// try {
// st.executeUpdate("update emp set ubalance =ubalance-10000 where
// uname='ram'");

// st.executeUpdate("update emp set ubalance =ubalance+10000 where
// uname='sita'");
// con.commit();
// b = true;
// } catch (Exception e) {
// con.rollback();
// }
// if (b) {
// System.out.println("amount transfer");

// } else
// System.out.println("amount not transfer");
// {
// }
// con.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }

// }
/*
 * OUTPUT => amount transfer
 * 
 * mysql> select * from emp;
 * +-------+----------+
 * | uname | ubalance |
 * +-------+----------+
 * | ram | 20000 |
 * | sita | 30000 |
 * +-------+----------+
 * 2 rows in set (0.00 sec)
 * REASON because no excaption is comming code work is normal code
 */
// ######################...Example-9...###############################
// import java.sql.*;

// public class Classjdbc {

// public static void main(String ar[]) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
// "root");
// Statement st = con.createStatement();
// con.setAutoCommit(false);
// boolean b = false;
// try {
// st.executeUpdate("update emp set ubalance =ubalance-10000 where
// uname='ram'");
// System.out.println(10 / 0);
// st.executeUpdate("update emp set ubalance =ubalance+10000 where
// uname='sita'");
// con.commit();
// b = true;
// } catch (Exception e) {

// }
// if (b) {
// System.out.println("amount transfer");

// } else
// System.out.println("amount not transfer");
// {
// }
// con.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }

// }
/*
 * OUTPUT=> amount not transfer
 * mysql> select * from emp;
 * +-------+----------+
 * | uname | ubalance |
 * +-------+----------+
 * | ram | 20000 |
 * | sita | 30000 |
 * +-------+----------+
 * 2 rows in set (0.00 sec)
 * 
 * data base has no change
 */

// ######################...Example-10...###############################
// import java.sql.*;

// public class Classjdbc {

// public static void main(String ar[]) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
// "root");
// Statement st = con.createStatement();
// con.setAutoCommit(false);
// boolean b = false;
// try {
// st.executeUpdate("update emp set ubalance =ubalance-10000 where
// uname='ram'");
// // System.out.println(10 / 0);
// st.executeUpdate("update emp set ubalance =ubalance+10000 where
// uname='sita'");
// con.commit();
// b = true;
// } catch (Exception e) {
// // con.rollback();
// }
// if (b) {
// System.out.println("amount transfer");

// } else
// System.out.println("amount not transfer");
// {
// }
// con.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }

// }
/*
 * OUTPUT=>amount transfer
 * mysql> select * from emp;
 * +-------+----------+
 * | uname | ubalance |
 * +-------+----------+
 * | ram | 10000 |
 * | sita | 40000 |
 * +-------+----------+
 * 2 rows in set (0.00 sec)
 * 
 * if we are using rollback or not usingrollback out put is same then what is
 * difrence useing it or not using it
 */

// ######################...Example-11...###############################

// import java.sql.*;

// public class Classjdbc {

// public static void main(String ar[]) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
// "root");
// Statement st = con.createStatement();
// con.setAutoCommit(false);
// int x, y;
// try {
// x = st.executeUpdate("update emp set ubalance =ubalance-10000 where
// uname='ram'");

// y = st.executeUpdate("update emp set ubalance =ubalance+10000 where
// uname='sita'");
// con.commit();

// } catch (Exception e) {
// con.rollback();
// }
// if (x != 0 && y != 0) {
// System.out.println("amount transfer");

// } else
// System.out.println("amount not transfer");
// {
// }
// con.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }

// }
/*
 * ERROR =>
 * Classjdbc.java:2948: error: variable x might not have been initialized
 * if (x != 0 && y != 0) {
 * ^
 * Classjdbc.java:2948: error: variable y might not have been initialized
 * if (x != 0 && y != 0) {
 * ^
 * 2 errors
 * 
 * REASON is because local varible has does not default value and we initilize
 * those varibale inside try block if exception is genrate our variable will not
 * initilize there for erroe is coming
 */

// ######################...Example-12...###############################

// import java.sql.*;

// public class Classjdbc {

// public static void main(String ar[]) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con = DriverManager.getConnection("jdbc:mysql:///iclass", "root",
// "root");
// Statement st = con.createStatement();
// con.setAutoCommit(false);
// int x = 0, y = 0;
// try {
// x = st.executeUpdate("update emp set ubalance =ubalance-10000 where
// uname='ram'");

// y = st.executeUpdate("update emp set ubalance =ubalance+10000 where
// uname='sita'");
// con.commit();

// } catch (Exception e) {
// con.rollback();
// }
// if (x != 0 && y != 0) {
// System.out.println("amount transfer");

// } else
// System.out.println("amount not transfer");
// {
// }
// con.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }

// }
/*
 * amount is trsansfer
 * mysql> select * from emp;
 * +-------+----------+
 * | uname | ubalance |
 * +-------+----------+
 * | ram | 0 |
 * | sita | 60000 |
 * +-------+----------+
 * 2 rows in set (0.00 sec)
 * and we run program again
 * mysql> select * from emp;
 * +-------+----------+
 * | uname | ubalance |
 * +-------+----------+
 * | ram | -10000 |
 * | sita | 70000 |
 * +-------+----------+
 * 2 rows in set (0.00 sec)
 * 
 * note => which example is best boolean type and above int type
 * ans=> if mysql ma koi problem a rahi ha or first query na zero retun kiya and
 * second walin na 1 return ker diya too amount transfer nahi hoga ya mysql ka
 * correspond problem ha
 * or yadi boolean wala example hota too ak query ka case ma 1 or dusri query ka
 * case ma zero mill jata then true mil jata uska bad amount transfer ho jata jo
 * ki amount transfer hua nahi ha
 * 
 * there for int wala aproch best ha
 * 
 */
// ************************APRIL 6th*************************** */
// ........................EXAMPLE 1 ......................................
/*
 * Q1.
 * ANS.
 * Q1.
 * ANS.
 * Q1.
 * ANS.
 * Q1.
 * ANS.
 * Q1.
 * ANS.
 * Q1.
 * ANS.
 * Q1.
 * ANS.
 * Q1.
 * ANS.
 * Q1.
 * ANS.
 * Q1.
 * ANS.
 * Q1.
 * ANS.
 * Q1.
 * ANS.
 * 
 */
// ........................EXAMPLE 2.......................................
// getConnection() method

// import java.sql.*;
// class Classjdbc {
// public static void main(String[] args) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// Statement st = con.createStatement();
// ResultSet rs = st.executeQuery("select * from login");
// if (rs.next()) {
// System.out.println(rs.getString(1) + "\t" + rs.getString(2));

// }
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }
// // output ram 111
// }

// ........................EXAMPLE 3.......................................
// step 1 for store CLOB TYPE DATA IN DATA BASE
// FIRST WE HAVE TO CREATE CLOB TYPE TABLE
/*
 * mysql> create table emp1 (Fname varchar(30),Fdata Clob);
 * ERROR 1064 (42000): You have an error in your SQL syntax; check the manual
 * that corresponds to your MySQL server version for the right syntax to use
 * near 'Clob)' at line 1
 * 
 * NOTE = ERROR IS coming because CLOB provide a tag for its place see below
 * 
 * mysql> create table emp1 (Fname varchar(30),Fdata TEXT);
 * Query OK, 0 rows affected (0.03 sec)
 */
// import java.sql.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {

// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// PreparedStatement st = con.prepareStatement("insert into emp1 valuse(?,?)");
// st.setString(1, "java file");
// st.setClob(2, "ram");
// st.executeUpdate();
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }

// }
/*
 * Classjdbc.java:3153: error: no suitable method found for setClob(int,String)
 * st.setClob(2, "ram");
 * ^
 * method PreparedStatement.setClob(int,Clob) is not applicable
 * (argument mismatch; String cannot be converted to Clob)
 * method PreparedStatement.setClob(int,Reader) is not applicable
 * (argument mismatch; String cannot be converted to Reader)
 * Note: Some messages have been simplified; recompile with -Xdiags:verbose to
 * get full output
 * 1 error
 * 
 * 
 * because setClob() method second parameter is Reader type
 */

// ........................EXAMPLE 4.......................................
/*
 * import java.sql.*;
 * 
 * import java.io.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * FileReader fr = new FileReader("NumberClass.java");
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Connection con =
 * DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
 * PreparedStatement st = con.prepareStatement("insert into emp1 values(?,?)");
 * st.setString(1, "java file");
 * st.setClob(2, fr);
 * st.executeUpdate();
 * System.out.println("data inserted");
 * con.close();
 * } catch (
 * 
 * Exception e) {
 * e.printStackTrace();
 * }
 * }
 * 
 * }
 */
/*
 * OUTPUT => DATA INSERTED
 * LETSCHECK IN MYSQL
 * mysql> select * from emp1;
 * +-----------+----------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -------------------------+
 * | Fname | Fdata
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * |
 * +-----------+----------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * -------------------------+
 * | java file | // class NumberClass
 * // {
 * // public static void main (String ...ar)
 * // {
 * // Number x[]={10,20,30,40,50,10.8};
 * // for(Number i:x)
 * // {
 * // System.out.print(i+" ");
 * // }
 * 
 * // }
 * // }
 * 
 * // ....................................
 * // class NumberClass
 * // {
 * // public static void main (String ...ar)
 * // {
 * // //Object x[]={10,20,30,40,50,false};
 * // //Object x[]={10,20,30,40,50,"ram"};
 * // Object x[]={10,20,30,40,50,'a'};
 * // for(Object i:x)
 * // {
 * // System.out.print(i+" ");
 * // }
 * 
 * // }
 * // }
 * 
 * // /*
 * // All worked
 * 
 * //
 */

// .............................
// class NumberClass {
// public static void main(String... ar) {
// Number x[] = { 10, 20, 30, 40, 50, false };
// Number x1[] = { 10, 20, 30, 40, 50, 'A' };
// Number x2[] = { 10, 20, 30, 40, 50, "ram" };
// for (Number i : x) {
// System.out.print(i + " ");
// }

// }
// }

// /*
// * NumberClass2.java:5: error: incompatible types: boolean cannot be
// * converted to Number
// * Number x[]={10,20,30,40,50,false};
// * ^
// * NumberClass2.java:6: error: incompatible types: char cannot be
// * converted to Number
// * Number x1[]={10,20,30,40,50,'A'};
// * ^
// * NumberClass2.java:7: error: incompatible types: String cannot be
// * converted to Number
// * Number x2[]={10,20,30,40,50,"ram"};
// * ^
// * 3 errors
// *
// *
// * see example NumberClass3 for above error soution
// */
// |+-----------+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+1

// row inset (0.00 sec)

// ........................EXAMPLE 5.......................................
// HOW TO FETCH DATA FROM MYSQL

// import java.sql.*;
// import java.io.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// PreparedStatement st = con.prepareStatement("select * from emp1");
// ResultSet rs = st.executeQuery();
// if (rs.next()) {
// System.out.println(rs.getString(1));
// System.out.println(rs.getClob(2));
// }
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }}
// out put
// java file
// com.mysql.cj.jdbc.Clob@3b07a0d6
// above output is useless for us there for we use diffrent way

// ........................EXAMPLE 6.......................................

// import java.sql.*;
// import java.io.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// PreparedStatement st = con.prepareStatement("select * from emp1");
// ResultSet rs = st.executeQuery();
// if (rs.next()) {
// Clob c = rs.getClob(2);
// int r = c.getCharacterStream();
// int x = r.read();
// while (x != -1) {
// System.out.print((char) x);
// x = r.read();
// }
// }
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }
// }
/*
 * Classjdbc.java:3375: error: incompatible types: Reader cannot be converted to
 * int
 * int r = c.getCharacterStream();
 */
// ........................EXAMPLE 7.......................................

// import java.sql.*;
// import java.io.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// PreparedStatement st = con.prepareStatement("select * from emp1");
// ResultSet rs = st.executeQuery();
// if (rs.next()) {
// Clob c = rs.getClob(2);
// Reader r = c.getCharacterStream();
// int x = r.read();
// while (x != -1) {
// System.out.print((char) x);
// x = r.read();
// }
// }
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }
// }
/*
 * OUTPUT
 * // class NumberClass
 * // {
 * // public static void main (String ...ar)
 * // {
 * // Number x[]={10,20,30,40,50,10.8};
 * // for(Number i:x)
 * // {
 * // System.out.print(i+" ");
 * // }
 * 
 * // }
 * // }
 * 
 * // ....................................
 * // class NumberClass
 * // {
 * // public static void main (String ...ar)
 * // {
 * // //Object x[]={10,20,30,40,50,false};
 * // //Object x[]={10,20,30,40,50,"ram"};
 * // Object x[]={10,20,30,40,50,'a'};
 * // for(Object i:x)
 * // {
 * // System.out.print(i+" ");
 * // }
 * 
 * // }
 * // }
 * 
 * // /*
 * // All worked
 * 
 * //
 */

// .............................
// class NumberClass {
// public static void main(String... ar) {
// Number x[] = { 10, 20, 30, 40, 50, false };
// Number x1[] = { 10, 20, 30, 40, 50, 'A' };
// Number x2[] = { 10, 20, 30, 40, 50, "ram" };
// for (Number i : x) {
// System.out.print(i + " ");
// }

// }
// }

// /*
// * NumberClass2.java:5: error: incompatible types: boolean cannot be
// * converted to Number
// * Number x[]={10,20,30,40,50,false};
// * ^
// * NumberClass2.java:6: error: incompatible types: char cannot be
// * converted to Number
// * Number x1[]={10,20,30,40,50,'A'};
// * ^
// * NumberClass2.java:7: error: incompatible types: String cannot be
// * converted to Number
// * Number x2[]={10,20,30,40,50,"ram"};
// * ^
// * 3 errors
// *
// *
// * see example NumberClass3 for above error soution
// */

// ........................EXAMPLE 8.......................................
// HOW TO FETCH DATA INSIDE THE FILE
// data will be corupt

// import java.sql.*;
// import java.io.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// PreparedStatement st = con.prepareStatement("select * from emp1");
// ResultSet rs = st.executeQuery();
// if (rs.next()) {
// Clob c = rs.getClob(2);
// Reader r = c.getCharacterStream();
// FileWriter f = new FileWriter("copy.java");
// int x = r.read();
// while (x != -1) {
// f.write(x);
// x = r.read();
// }
// }
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }
// }
/*
 * output program wiil proper work
 * but when we open our file copy.java nothing will show inside it because our
 * data is courupt because we dont colse file see below example
 * 
 * 
 */
// ........................EXAMPLE 9.......................................

// import java.sql.*;
// import java.io.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {
// FileWriter f = new FileWriter("copy1.java");
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// PreparedStatement st = con.prepareStatement("select * from emp1");
// ResultSet rs = st.executeQuery();
// if (rs.next()) {
// Clob c = rs.getClob(2);
// Reader r = c.getCharacterStream();

// int x = r.read();
// while (x != -1) {
// f.write(x);
// x = r.read();
// }
// }
// f.close();
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }
// }
// data will be show int copy1.java file

// ........................EXAMPLE 10.......................................
// we use Clob getSubString() method
// import java.sql.*;
// import java.io.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {
// FileWriter f = new FileWriter("copy1.java");
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// PreparedStatement st = con.prepareStatement("select * from emp1");
// ResultSet rs = st.executeQuery();
// if (rs.next()) {
// Clob c = rs.getClob(2);
// String s = c.getSubString(1, (int) c.length());//all data show on cmd
// System.out.println(s);
// }
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }

// // out put = all data of file show on cmd
// }

// ........................EXAMPLE 11.......................................
// program for if file have 800 character and we want to display starting 500
// character
// in this case we use getSubString(); method of Clob interface
// import java.sql.*;
// import java.io.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {
// FileWriter f = new FileWriter("copy1.java");
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// PreparedStatement st = con.prepareStatement("select * from emp1");
// ResultSet rs = st.executeQuery();
// if (rs.next()) {
// Clob c = rs.getClob(2);
// String s = c.getSubString(0, (int) c.length());
// System.out.println(s);
// }
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }

// }
/*
 * D:\Mr.Sachin's data\GitDemo\My_Practice\JavaPractice\JDBC>java Classjdbc
 * java.sql.SQLException: CLOB start position can not be < 1
 * at
 * com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:130)
 * at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:98)
 * at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:90)
 * at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:64)
 * at com.mysql.cj.jdbc.Clob.getSubString(Clob.java:90)
 * at Classjdbc.main(Classjdbc.java:3584)
 * 
 * because statrting point can not be less then 1 is
 * 
 */

// // ........................EXAMPLE 12.......................................
// import java.sql.*;
// import java.io.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {
// FileWriter f = new FileWriter("copy1.java");
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// PreparedStatement st = con.prepareStatement("select * from emp1");
// ResultSet rs = st.executeQuery();
// if (rs.next()) {
// Clob c = rs.getClob(2);
// Reader r = c.getCharacterStream();

// String s = c.getSubString(1, (int) c.length() - 100);
// System.out.println(s);
// }

// f.close();
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }
// // out put => file ending some data will be not display because we -100
// }

// ........................EXAMPLE 13.......................................
// import java.sql.*;
// import java.io.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {
// FileWriter f = new FileWriter("copy1.java");
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// PreparedStatement st = con.prepareStatement("select * from emp1");
// ResultSet rs = st.executeQuery();
// if (rs.next()) {
// Clob c = rs.getClob(2);
// Reader r = c.getCharacterStream();

// String s = c.getSubString(100, (int) c.length());
// System.out.println(s);
// }

// f.close();
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }
// }
/*
 * java.sql.SQLException: CLOB start position + length can not be > length of
 * CLOB
 * at
 * com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:130)
 * at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:98)
 * at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:90)
 * at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:64)
 * at com.mysql.cj.jdbc.Clob.getSubString(Clob.java:98)
 * at Classjdbc.main(Classjdbc.java:3701)
 * 
 * 
 * because the addition of parameter of getSubString() method can not be greater
 * then datas length
 * 
 * 
 */
// ........................EXAMPLE 14.......................................

// import java.sql.*;
// import java.io.*;

// class Classjdbc {
// public static void main(String[] args) {
// try {
// FileWriter f = new FileWriter("copy1.java");
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
// PreparedStatement st = con.prepareStatement("select * from emp1");
// ResultSet rs = st.executeQuery();
// if (rs.next()) {
// Clob c = rs.getClob(2);
// Reader r = c.getCharacterStream();

// String s = c.getSubString(100, (int) c.length() - 100);
// System.out.println(s);
// }

// f.close();
// con.close();
// } catch (

// Exception e) {
// e.printStackTrace();
// }
// }

// // out put show it will work proper
// }

// ........................EXAMPLE 15.......................................

// import java.sql.*;
// import java.io.*;

// class Classjdbc {
//     public static void main(String[] args) {
//         try {

//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con = DriverManager.getConnection("jdbc:mysql:///iclass?user=root&Password=root");
//             PreparedStatement st = con.prepareStatement("select * from emp1");
//             st1.setClob(2, fr);

//             ResultSet rs = st.executeQuery();
//             if (rs.next()) {
//                 Clob c = rs.getClob(2);
//                 String s1 = c.getSubString(1, 200);
//                 String s2 = c.getSubString(201, 400);
//                 String s3 = c.getSubString(401, 232);
//                 // String s4 = c.getSubString(401, 1000);// give error
//                 System.out.println(s1);
//                 System.out.println("\n\n...................................");
//                 System.out.println(s2);
//                 System.out.println("\n\n...................................");
//                 System.out.println(s3);
//                 System.out.println("\n\n...................................");
//                 System.out.println(c.length());
//             }

//             con.close();
//         } catch (

//         Exception e) {
//             e.printStackTrace();
//         }
//     }

//     // out put show it will work proper
// }

// ........................April 7th .......................................
/*
 * Q1 .what is Savepoint in jdbc?
 * ans .
 * public interface java.sql.Savepoint {
 * public abstract int getSavepointId() throws java.sql.SQLException;
 * public abstract java.lang.String getSavepointName() throws
 * java.sql.SQLException;
 * }
 * 
 * Q what is save point in mysql?
 * ans .
 * 
 */
// ........................EXAMPLE 1.......................................
// import java.sql.*;

// class Classjdbc {
//     public static void main(String ar[]) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con = DriverManager.getConnection("jdbc:mysql:///iclass?user=root&password=root");
//             Statement st = con.createStatement();
//             con.setAutoCommit(false);
//             try {
//                 st.executeUpdate("update emp set ubalance=ubalance-50000 where uname='gita'");
//                 st.executeUpdate("update emp set ubalance=ubalance+50000 where uname='ram'");
//                 st.executeUpdate("update emp set ubalance=ubalance-10000 where uname='ram'");
//                 st.executeUpdate("update emp set ubalance=ubalance+10000 where uname='sita'");
//                 con.commit();
//             } catch (Exception e) {
//                 // con.rollback();
//                 e.printStackTrace();

//             }
//             con.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

// }
// ........................EXAMPLE 2.......................................
//WHAT HAPPEN IF WE CALL rollback after commit()
// import java.sql.*;

// class Classjdbc {
//     public static void main(String ar[]) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con = DriverManager.getConnection("jdbc:mysql:///iclass?user=root&password=root");
//             Statement st = con.createStatement();
//             con.setAutoCommit(false);
//             try {
//                 st.executeUpdate("update emp set ubalance=ubalance-50000 where uname='gita'");
//                 st.executeUpdate("update emp set ubalance=ubalance+50000 where uname='ram'");
//                 st.executeUpdate("update emp set ubalance=ubalance-10000 where uname='ram'");
//                 st.executeUpdate("update emp set ubalance=ubalance+10000 where uname='sita'");
//                 con.commit();
//                 con.rollback();
//             } catch (Exception e) {

//             }
//             con.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

// }

//program wiil compile and run proper 
//note = rollback() will not work after commit().

// ........................EXAMPLE 3.......................................

// import java.sql.*;

// class Classjdbc {
//     public static void main(String ar[]) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con = DriverManager.getConnection("jdbc:mysql:///iclass?user=root&password=root");
//             Statement st = con.createStatement();
//             con.setAutoCommit(false);
//             Savepoint sp = null;
//             try {
//                 st.executeUpdate("update emp set ubalance=ubalance-50000 where uname='gita'");
//                 st.executeUpdate("update emp set ubalance=ubalance+50000 where uname='ram'");
//                 sp = con.setSavepoint();
//                 st.executeUpdate("update emp set ubalance=ubalance-10000 where uname='ram'");
//                 System.out.println(10 / 0);
//                 st.executeUpdate("update emp set ubalance=ubalance+10000 where uname='sita'");
//                 con.releaseSavepoint(sp);
//             } catch (Exception e) {
//                 con.rollback(sp);
//             }
//             con.commit();
//             con.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

// }
// ........................EXAMPLE 4.......................................

import java.sql.*;

class Classjdbc {
    public static void main(String ar[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///iclass?user=root&password=root");
            Statement st = con.createStatement();
            con.setAutoCommit(false);
            Savepoint sp = null;
            try {
                st.executeUpdate("update emp set ubalance=ubalance-50000 where uname='gita'");
                st.executeUpdate("update emp set ubalance=ubalance+50000 where uname='ram'");
                sp = con.setSavepoint();
                st.executeUpdate("update emp set ubalance=ubalance-10000 where uname='ram'");
                System.out.println(10 / 0);
                st.executeUpdate("update emp set ubalance=ubalance+10000 where uname='sita'");
                con.releaseSavepoint(sp);
            } catch (Exception e) {
                con.rollback(sp);
            }
            con.commit();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// ........................EXAMPLE 5.....................................
// top 50 dbms question
/*

 * Database Basic Interview Questions
 * Understanding fundamental concepts forms the foundation for more advanced
 * topics and helps you answer questions with confidence. In this section, we'll
 * cover key areas such as defining what a database is, understanding different
 * types of databases, like relational and non-relational, and explaining basic
 * operations like CRUD (Create, Read, Update, Delete.
 * 
 * These basic questions are crucial for demonstrating your foundational
 * knowledge and setting a strong base for tackling more complex topics during
 * your interview.
 * 
 * 1. What is a Database Schema and Why is It Important?
 * A database schema is a blueprint or architecture of how data is organized in
 * a database. It defines the tables, the fields in each table, and the
 * relationships between fields and tables.
 * 
 * A schema is important because it provides a clear structure for the data,
 * ensuring consistency, clarity, and integrity. It helps developers and
 * database administrators understand how data is connected and how to retrieve
 * and manipulate it efficiently.
 * 
 * 2. Explain the Difference Between a Primary Key and a Foreign Key.
 * Primary Key: Uniquely identifies each record in a table and ensures data
 * integrity. Each table can have only one primary key, and it ensures that each
 * record in the table is unique.
 * Foreign Key: A foreign key, on the other hand, links one table to another by
 * referencing the primary key in the related table. This relationship helps
 * maintain referential integrity between the tables, ensuring that the link
 * between them is valid and that the data is consistent.
 * 3. What is CRUD Operations?
 * CRUD stands for Create, Read, Update, Delete, which are the four fundamental
 * operations in database management:
 * 
 * Create: Use the INSERT INTO statement to add new records to a table.
 * Read: Use the SELECT statement to retrieve data from a table.
 * Update: Use the UPDATE statement to modify existing records.
 * Delete: Use the DELETE FROM statement to remove records.
 * 4. What are the Different Types of Joins and How do They Work?
 * Inner Join: Retrieves records with matching values in both tables.
 * Left Join (Left Outer Join): Retrieves all records from the left table and
 * matched records from the right table. Unmatched records from the right table
 * will be NULL.
 * Right Join (Right Outer Join): Retrieves all records from the right table and
 * matched records from the left table. Unmatched records from the left table
 * will be NULL.
 * Full Join (Full Outer Join): Retrieves records when there is a match in
 * either left or right table. Unmatched records from both tables will be NULL.
 * 5. How to Ensure Data Integrity in a Relational Database?
 * Ensuring data integrity involves using constraints and rules:
 * 
 * 
 * Primary Keys: To ensure unique records.
 * Foreign Keys: To enforce relationships between tables.
 * Unique Constraints: To ensure all values in a column are distinct.
 * Not Null Constraints: To prevent empty fields.
 * Check Constraints: To validate data against defined rules.
 * Transactions: To guarantee the successful execution of a group of operations.
 * 6. Explain the Difference Between OLTP and OLAP Databases.
 * OLTP (Online Transaction Processing): Databases designed for managing
 * transaction-oriented applications. They are optimized for a large number of
 * short online transactions (insert, update, delete). Example: Retail sales
 * systems.
 * OLAP (Online Analytical Processing): Databases designed for querying and
 * reporting, often used for data analysis and business intelligence. They are
 * optimized for read-heavy operations on large volumes of data. Example: Data
 * warehousing.
 * 7. What are the ACID Properties in a Database and Why are They Important?
 * ACID properties ensure reliable transaction processing, guarantee data
 * reliability and integrity in databases.
 * 
 * Atomicity: Ensures that all operations within a transaction are completed
 * successfully; otherwise, the transaction is aborted.
 * Consistency: Ensures that a transaction brings the database from one valid
 * state to another.
 * Isolation: Ensures that transactions are executed independently without
 * interference.
 * Durability: Ensures that the results of a transaction are permanently stored
 * in the database, even in case of a system failure.
 * 8. Describe the Process of ETL (Extract, Transform, Load).
 * ETL is a process used to move data from various sources into a data
 * warehouse:
 * 
 * Extract: Collecting data from different source systems.
 * Transform: Converting the extracted data into a suitable format or structure
 * for querying and analysis. This might involve cleaning the data, removing
 * duplicates, and ensuring data consistency.
 * Load: Inserting the transformed data into the target data warehouse or
 * database.
 * 9. What is a Data Warehouse and How is it Different from a Traditional
 * Database?
 * A data warehouse is a central repository for storing large volumes of data
 * from multiple sources, designed for query and analysis rather than
 * transaction processing. It supports complex queries, data mining, and
 * business intelligence.
 * Unlike traditional databases optimized for day-to-day operations and
 * transaction processing (OLTP), data warehouses are optimized for read-heavy
 * operations, historical data analysis, and large-scale data aggregation
 * (OLAP).
 * 10. How to Handle Data Migration Between Different Databases?
 * Steps for Data Migration:
 * 
 * Planning: Assess the source and target databases, and create a detailed
 * migration plan.
 * Mapping: Define how data from the source will map to the target database,
 * including any transformations needed.
 * Extracting: Extract data from the source database.
 * Transforming: Convert the data to match the target schema, clean, and
 * validate it.
 * Loading: Load the transformed data into the target database.
 * Testing: Verify the migration to ensure data integrity and consistency.
 * Monitoring: Monitor the new system to ensure it is functioning correctly.
 * 11. What is a Relational Database and How does it Differ from a NoSQL
 * Database?
 * A relational databases uses structured tables to store data, with predefined
 * schemas and relationships (usually using SQL). It ensures data integrity
 * through ACID properties and is suitable for complex queries and transactions.
 * 
 * A NoSQL database, on the other hand, is designed for unstructured or
 * semi-structured data and can store data in various formats like key-value
 * pairs, documents, or graphs. NoSQL databases are often more flexible and
 * scalable, suitable for big data and real-time web applications, but they
 * might not provide the same level of ACID compliance as relational databases.
 * 
 * 12. Explain the Importance of Data Normalization.
 * Data normalization is the process of organizing data to minimize redundancy
 * and improve data integrity. It involves dividing a database into smaller
 * tables and defining relationships between them. Normalization is important
 * because it:
 * 
 * Reduces data duplication.
 * Ensures data consistency.
 * Simplifies the structure, making it easier to maintain and update.
 * Improves query performance by eliminating unnecessary data.
 * 13. How to Perform Data Cleaning and Preprocessing?
 * Data Cleaning and Preprocessing in SQL can Involve Several Steps:
 * 
 * Removing duplicates: Use the DISTINCT keyword or ROW_NUMBER() window
 * function.
 * Handling missing values: Use functions like COALESCE to replace NULL values.
 * Correcting data types: Use the CAST or CONVERT functions.
 * Standardizing formats: Use string functions like LOWER, UPPER, TRIM, etc.
 * 14. What are the Common SQL Functions Used for Data Aggregation?
 * SUM(): Calculates the total sum of a numeric column.
 * AVG(): Calculates the average value of a numeric column.
 * COUNT(): Counts the number of rows that match a specified condition.
 * MIN(): Finds the minimum value in a column.
 * MAX(): Finds the maximum value in a column.
 * 15. Describe the Process of Connecting a Database to a Data Analysis Tool.
 * Connecting a database to a data analysis tool generally involves the
 * following steps:
 * 
 * Choose the Data Source: Select the type of database you want to connect to
 * (e.g., MySQL, PostgreSQL, SQL Server).
 * Install the necessary drivers: Ensure the data analysis tool has the correct
 * drivers to connect to the database.
 * Configure the Connection: Provide the connection details such as database
 * server address, port number, database name, username, and password.
 * Test the Connection: Verify that the connection settings are correct and that
 * the tool can successfully connect to the database.
 * Load Data: Import or query the data within the tool for analysis.
 * Analyze Data: Use the tool’s features to perform data analysis, create
 * visualizations, and generate reports.
 * Database Intermediate Interview Questions
 * This section covers moderately complex SQL topics like advanced queries,
 * multi-table joins, subqueries, and basic optimization techniques. These
 * questions help enhance skills for both database developers and
 * administrators, preparing us for more technical SQL challenges in the field.
 * 
 * 1. Explain the Concept of Database Transactions and Their Importance in
 * Application Development.
 * A database transaction is a sequence of operations performed as a single
 * logical unit of work. These operations must adhere to the ACID properties:
 * 
 * Atomicity: All operations must succeed or none are applied.
 * Consistency: Ensures the database remains in a valid state.
 * Isolation: Prevents interference from other concurrent transactions.
 * Durability: Guarantees the results are permanently stored.
 * Transactions are important in application development because they help
 * maintain data consistency, especially in scenarios involving multiple,
 * concurrent users. For example, if a transaction involves transferring money
 * from one bank account to another, it ensures that either both accounts are
 * updated correctly or neither is, preventing any inconsistency in the
 * financial records.
 * 
 * 2. How to Optimize Database Queries for Performance?
 * Optimizing database queries involves several strategies:
 * 
 * Indexing: Create indexes on columns that are frequently used in WHERE, JOIN,
 * and ORDER BY clauses to speed up data retrieval.
 * Avoiding Select : Only select the columns you need to reduce the amount of
 * data processed.
 * Query Refactoring: Rewrite complex queries for better performance, such as
 * breaking them into simpler subqueries or using joins efficiently.
 * Analyzing Execution Plans: Use tools to analyze and understand the query
 * execution plan, identifying bottlenecks.
 * Database Configuration: Ensure the database is configured correctly with
 * adequate resources (memory, CPU).
 * Archiving Old Data: Regularly archive or delete old, unused data to keep
 * tables manageable.
 * 3. What are Stored Procedures and When would we Use Them?
 * Stored procedures are precompiled collections of SQL statements stored in the
 * database. They :
 * 
 * Encapsulate complex SQL queries and business logic.
 * Improve performance by reducing network traffic (client-server round trips).
 * Enhance security by controlling access to data through parameterized queries.
 * Ensure consistency and reusability across multiple applications.
 * Stored procedures are particularly useful when performing repetitive tasks
 * such as data validation, business rule enforcement, or batch processing.
 * 
 * 4. Describe the Process of Database Normalization and Denormalization.
 * Normalization involves organizing database tables to reduce redundancy and
 * improve data integrity. It typically follows these steps:
 * 
 * First Normal Form (1NF): Ensure each table column contains atomic
 * (indivisible) values.
 * Second Normal Form (2NF): Ensure that all non-key columns are fully dependent
 * on the primary key.
 * Third Normal Form (3NF): Ensure that all columns are only dependent on the
 * primary key and not on other non-key columns.
 * Denormalization is the process of combining normalized tables to improve read
 * performance, often at the expense of write performance and increased
 * redundancy. Denormalization is used when read performance is critical, and
 * the application can handle data redundancy and potential update anomalies.
 * 
 * 5. How to Handle Concurrent Data Access and Prevent Deadlocks?
 * Handling concurrent data access and preventing deadlocks involves:
 * 
 * Locking Mechanisms: Using appropriate locking strategies (e.g., row-level
 * locks) to prevent conflicts.
 * Transaction Isolation Levels: Adjusting isolation levels (e.g., Read
 * Committed, Repeatable Read) to balance consistency and concurrency.
 * Deadlock Detection: Implementing deadlock detection mechanisms provided by
 * the database to automatically identify and resolve deadlocks.
 * Optimizing Transactions: Keeping transactions short and simple to reduce the
 * likelihood of deadlocks.
 * Ordering Access: Ensuring that transactions access resources in a consistent
 * order to minimize deadlock risk.
 * 6. Explain the Concept of Database Indexing and its Importance in Query
 * Performance.
 * Database indexing involves creating a data structure that improves the speed
 * of data retrieval operations on a table at the cost of additional writes and
 * storage space. Indexes are important because they:
 * 
 * Speed Up Queries: Significantly reduce the time required to retrieve data by
 * allowing the database to find rows more efficiently.
 * Support Sorting and Searching: Improve performance of operations involving
 * sorting and searching, such as ORDER BY and WHERE clauses.
 * Enhance Join Performance: Speed up joins between tables by quickly locating
 * matching rows.
 * 7. What are the Different types of Database Partitioning and When would we
 * Use Each Type?
 * Horizontal Partitioning: Divides a table into multiple tables with the same
 * structure, distributing rows based on a range or list of values. Used to
 * improve performance and manageability by spreading the data across multiple
 * storage locations.
 * Vertical Partitioning: Divides a table into multiple tables based on columns.
 * Commonly used to separate frequently accessed columns from less frequently
 * accessed ones, improving query performance for the former.
 * Range Partitioning: Divides data based on a range of values in a specific
 * column, useful for date-based partitions (e.g., monthly partitions).
 * Hash Partitioning: Distributes data across partitions using a hash function,
 * ensuring an even distribution of data. Used when data distribution needs to
 * be uniform.
 * List Partitioning: Divides data based on a predefined list of values, useful
 * for categorizing data into distinct groups.
 * 8. Describe the Role of a Data Lake in a Big Data Architecture.
 * A data lake is a centralized repository that allows us to store all your
 * structured and unstructured data at any scale. Data lakes are essential for
 * big data projects because they provide a flexible and cost-effective way to
 * manage and analyze vast amounts of data. In a big data architecture, a data
 * lake:
 * 
 * Stores Raw Data: Allows for the storage of raw, unprocessed data from various
 * sources.
 * Supports Multiple Data Types: Handles structured, semi-structured, and
 * unstructured data.
 * Enables Advanced Analytics: Facilitates data exploration, machine learning,
 * and advanced analytics.
 * Scales Easily: Provides scalable storage and processing power.
 * 9. How to Ensure Data Quality and Integrity During Data Ingestion?
 * Ensuring data quality and integrity during data ingestion involves:
 * 
 * Data Validation: Implementing validation checks to ensure data conforms to
 * predefined rules and formats.
 * Data Cleansing: Removing duplicates, correcting errors, and handling missing
 * values before data is ingested.
 * Schema Enforcement: Ensuring the incoming data matches the schema of the
 * target database or data warehouse.
 * Consistency Checks: Verifying data consistency across different data sources.
 * Error Handling: Implementing robust error handling mechanisms to address data
 * ingestion failures and anomalies.
 * Monitoring and Auditing: Continuously monitoring data ingestion processes and
 * maintaining audit logs to track data quality issues.
 * 10. What are the Common Data Storage Formats Used in Big Data Processing?
 * Common data storage formats in big data processing include:
 * 
 * CSV (Comma-Separated Values): Simple text format for tabular data.
 * JSON (JavaScript Object Notation): Lightweight data interchange format, good
 * for semi-structured data.
 * Parquet: Columnar storage format optimized for query performance and
 * efficient storage.
 * Avro: Row-based storage format, excellent for data serialization.
 * ORC (Optimized Row Columnar): Columnar storage format that provides high
 * compression and fast query performance.
 * These formats are chosen based on factors like data structure, storage
 * efficiency, and read/write performance.
 * 
 * 11. How to Join Multiple Tables to Create a Comprehensive Dataset for
 * Analysis?
 * Joining multiple tables in SQL is typically done using different types of
 * joins:
 * 
 * Inner Join: Returns rows with matching values in both tables.
 * Left Join: Returns all rows from the left table and matched rows from the
 * right table, with NULL for unmatched rows.
 * Right Join: Returns all rows from the right table and matched rows from the
 * left table, with NULL for unmatched rows.
 * Full Outer Join: Returns rows when there is a match in either table, with
 * NULL for unmatched rows.
 * 12. Explain the Concept of Window Functions and Their Applications.
 * Window functions perform calculations across a set of table rows related to
 * the current row, unlike aggregate functions that group rows into a single
 * output row. They are used for
 * 
 * Ranking: Assigning ranks to rows (RANK(), DENSE_RANK()).
 * Running totals: Calculating cumulative sums (SUM() OVER).
 * Moving averages: Computing averages over a range of rows (AVG() OVER).
 * Lag/Lead: Accessing data from previous or subsequent rows.
 * 13. How to Handle Missing Data in a Database?
 * Handling missing data in a database can involve:
 * 
 * Ignoring: Skipping rows with missing values during analysis.
 * Imputing: Replacing missing values with a default value, mean, median, or a
 * value derived from other data.
 * Deletion: Removing rows or columns with a high percentage of missing values.
 * Using Placeholders: Marking missing values with a specific placeholder (e.g.,
 * NULL).
 * 14. Describe the Process of Feature Engineering using SQL.
 * Feature engineering involves creating new features or modifying existing ones
 * to improve the performance of machine learning models. Using SQL:
 * 
 * Aggregations: Creating summary features like total, average, count.
 * Transformations: Applying mathematical transformations (log, square root) to
 * existing features.
 * Bin/Group Data: Categorizing continuous variables into bins.
 * Date Features: Extracting parts of dates (year, month, day).
 * 15. What are the Performance Considerations When Qerying Large Datasets?
 * When querying large datasets, consider
 * 
 * Indexing: Ensure appropriate indexes are in place to speed up query
 * execution.
 * Partitioning: Use table partitioning to manage large tables more efficiently.
 * Query Optimization: Write efficient queries, avoid unnecessary calculations
 * and joins.
 * Avoiding Select : Select only necessary columns to reduce data volume.
 * Batch Processing: Process data in batches to avoid overloading the system.
 * Caching: Use caching mechanisms to store frequently accessed data.
 * Database Configuration: Ensure the database is properly configured with
 * adequate resources.
 * Database Advanced Interview Questions
 * Advanced database interview questions can be tough but are crucial for
 * demonstrating your expertise. These questions cover complex topics like
 * database optimization, complex SQL queries, data warehousing, and advanced
 * indexing techniques.
 * 
 * 1. How to Design a Database Schema for a Highly Scalable Web Application?
 * Designing a database schema for a highly scalable web application involves
 * several key considerations:
 * 
 * Normalization and Denormalization: Start with a normalized schema to reduce
 * redundancy and improve data integrity, then denormalize selectively for
 * read-heavy operations to improve performance.
 * Sharding: Distribute data across multiple database instances (shards) to
 * handle large volumes of data and high transaction rates.
 * Indexing: Create indexes on frequently queried columns to speed up data
 * retrieval.
 * Read/Write Separation: Use master-slave replication to separate read and
 * write operations, with writes going to the master and reads going to
 * replicated slaves.
 * Partitioning: Use horizontal or vertical partitioning to manage large tables
 * and improve query performance.
 * Caching: Implement caching strategies to reduce database load (e.g., using
 * Redis or Memcached).
 * Use of NoSQL: For certain use cases, consider NoSQL databases (e.g., MongoDB,
 * Cassandra) which can offer better scalability for specific data types and
 * access patterns.
 * 2. Explain the Use of Caching Strategies to Improve Database Performance.
 * Caching strategies improve database performance by storing frequently
 * accessed data in a temporary storage layer to reduce load on the database:
 * 
 * In-Memory Caching: Tools like Redis store data in memory for quick access,
 * reducing the need to query the database.
 * Query Caching: Cache the results of complex queries that don’t change often.
 * Page Caching: Cache entire web pages or parts of pages to avoid hitting the
 * database for every page load.
 * Object Caching: Cache objects in the application layer to avoid repeated
 * database calls.
 * Write-Through Cache: Data is written to both the cache and the database
 * simultaneously, ensuring consistency.
 * Write-Back Cache: Data is written to the cache first, then asynchronously to
 * the database, improving write performance but requiring mechanisms to ensure
 * eventual consistency.
 * 3. Describe the Process of Implementing Database Security and Encryption.
 * Implementing database security and encryption involves several steps:
 * 
 * Authentication and Authorization: Ensure strong authentication mechanisms are
 * in place and assign least privilege access to users.
 * Encryption in Transit: Use TLS/SSL to encrypt data transmitted between the
 * database and clients.
 * Encryption at Rest: Encrypt data stored on disk using database-native
 * encryption features or file system encryption.
 * Access Controls: Implement role-based access controls to restrict access to
 * sensitive data.
 * Audit Logs: Maintain audit logs of database access and changes to monitor
 * suspicious activities.
 * Data Masking: Mask sensitive data in non-production environments to protect
 * privacy.
 * Backup Security: Ensure backups are encrypted and stored securely.
 * 4. How to Handle Database Migrations in a Continuous Deployment Environment?
 * Handling database migrations in a continuous deployment environment involves:
 * 
 * Version Control: Use a version control system for database schema changes.
 * Migration Tools: Utilize migration tools (e.g., Flyway, Liquibase) to
 * automate the application of schema changes.
 * Backward Compatibility: Design migrations to be backward compatible to ensure
 * the application remains functional during the deployment.
 * Schema Versioning: Maintain schema versioning to track changes and allow
 * rollbacks if necessary.
 * Staging Environment: Test migrations in a staging environment before
 * deploying to production.
 * Transactional Migrations: Use transactions to apply migrations to ensure
 * atomicity and consistency.
 * Monitoring: Monitor the deployment for issues and have a rollback plan in
 * place.
 * 5. What Are the Best Practices for Database Testing and Ensuring Data
 * Consistency?
 * Best practices for database testing and ensuring data consistency include:
 * 
 * Unit Testing: Write unit tests for database functions and stored procedures.
 * Integration Testing: Test the database as part of the application integration
 * to ensure it works correctly with other components.
 * Data Validation: Validate data integrity constraints (e.g., foreign keys,
 * unique constraints).
 * Automated Testing: Use automated testing tools to run tests regularly.
 * Mock Databases: Use mock databases for testing to avoid affecting production
 * data.
 * Data Consistency Checks: Regularly check for data consistency using tools or
 * custom scripts.
 * Rollback Testing: Test rollback procedures to ensure that data can be
 * restored in case of a failed migration or update.
 * 6. Explain the Concept of Data Replication and Its Importance in a
 * Distributed Database System.
 * Data replication involves copying data from one database server to another to
 * ensure consistency and availability across distributed systems. Its
 * importance includes:
 * 
 * High Availability: Ensures that data is available even if one server fails.
 * Load Balancing: Distributes the load across multiple servers, improving
 * performance.
 * Disaster Recovery: Provides a backup in case of a data loss or corruption.
 * Geographical Distribution: Allows data to be closer to users in different
 * regions, reducing latency.
 * 7. How to Design a Database for High Availability and Disaster Recovery?
 * Designing a database for high availability and disaster recovery involves:
 * 
 * Replication: Implement master-slave or master-master replication to ensure
 * data redundancy.
 * Failover Mechanisms: Set up automatic failover to switch to a standby
 * database in case of a failure.
 * Regular Backups: Perform regular backups and store them securely.
 * Geographical Redundancy: Distribute data across multiple geographical
 * locations to protect against regional failures.
 * Monitoring: Continuously monitor database health and performance.
 * Disaster Recovery Plan: Develop and test a comprehensive disaster recovery
 * plan.
 * Use of Cloud Services: Leverage cloud database services that offer built-in
 * high availability and disaster recovery features.
 * 8. Describe the Architecture of a NoSQL Database and Its Use Cases.
 * NoSQL databases are designed to handle large volumes of unstructured or
 * semi-structured data. Common architectures include:
 * 
 * Document Stores: Store data as documents (e.g., JSON, BSON). Example:
 * MongoDB. Use cases: Content management, user profiles.
 * Key-Value Stores: Store data as key-value pairs. Example: Redis. Use cases:
 * Caching, session storage.
 * Column-Family Stores: Store data in columns rather than rows. Example:
 * Cassandra. Use cases: Time-series data, real-time analytics.
 * Graph Databases: Store data as nodes and edges. Example: Neo4j. Use cases:
 * Social networks, recommendation engines.
 * 9. What Are the Best Practices for Optimizing ETL Processes in a Large-Scale
 * Data Environment?
 * Best practices for optimizing ETL processes include:
 * 
 * Incremental Loading: Only process new or changed data to reduce load.
 * Parallel Processing: Use parallel processing to speed up ETL jobs.
 * Efficient Data Transformations: Optimize transformation logic to minimize
 * processing time.
 * Data Partitioning: Partition large datasets to improve performance.
 * Batch Processing: Process data in batches to manage resource usage.
 * Monitoring and Logging: Monitor ETL processes and maintain logs to identify
 * and resolve issues quickly.
 * Resource Allocation: Allocate sufficient resources (CPU, memory) to ETL
 * processes.
 * 10. How Do You Handle Real-Time Data Streaming and Processing?
 * Handling real-time data streaming and processing involves:
 * 
 * Streaming Frameworks: Use frameworks like Apache Kafka, Apache Flink, or
 * Apache Spark Streaming to process real-time data.
 * Data Ingestion: Ingest data from various sources (e.g., IoT devices, social
 * media) in real time.
 * Data Processing: Apply transformations, aggregations, and enrichments in real
 * time.
 * Low-Latency Storage: Store processed data in low-latency databases (e.g.,
 * Redis, Cassandra).
 * Scalability: Ensure the system can scale horizontally to handle varying data
 * loads.
 * Fault Tolerance: Implement fault-tolerant mechanisms to ensure continuous
 * data processing.
 * Monitoring: Continuously monitor the streaming process for performance and
 * errors.
 * Database Scenario-Based Interview Questions
 * Database scenario-based interview questions test how well we can solve
 * real-life problems. These questions are designed to challenge your ability to
 * apply theoretical knowledge to real-world problems and showcase your
 * problem-solving skills in managing and optimizing database systems.
 * 
 * 1. How to Design a Scalable and High-Performance Database for an E-Commerce
 * Application?
 * To design a scalable and high-performance database for an e-commerce
 * application:
 * 
 * Normalize the database to reduce redundancy and maintain integrity.
 * Sharding: Distribute data across multiple servers to manage high traffic and
 * storage.
 * Indexing: Optimize queries by indexing key fields like product names and user
 * IDs.
 * Caching: Use Redis or Memcached to store frequently accessed data.
 * NoSQL Databases: Leverage NoSQL solutions like MongoDB for flexibility in
 * specific use cases.
 * Cloud-based Services: Utilize scalable cloud platforms for efficient data
 * storage and management.
 * 2. How to Diagnose and Resolve Slow Database Queries?
 * Steps to diagnose and resolve slow queries:
 * 
 * Use tools like EXPLAIN to analyze query execution plans and identify
 * inefficiencies.
 * Ensure indexes are created on columns used in WHERE, JOIN, and ORDER BY
 * clauses.
 * Monitor server resources (CPU, memory, disk usage) to identify bottlenecks.
 * Rewrite and simplify complex queries to minimize joins and reduce data
 * retrieval volume
 * .
 * Optimize database configurations and consider upgrading hardware if needed.
 * 3. What Are the Key Steps for Migrating Data From On-Premise to a Cloud
 * Database?
 * To migrate data from an on-premise database to a cloud database:
 * 
 * Assessment: Evaluate the current schema, data volume, and compatibility with
 * the cloud database.
 * Cloud Selection: Choose a provider and database type that aligns with your
 * application needs.
 * Encryption: Secure data transfer using encryption protocols.
 * Migration Tools: Use cloud-native or third-party tools for efficient data
 * transfer.
 * Validation: Test the migration in a staging environment to detect and resolve
 * issues.
 * Scheduled Migration: Perform migration during off-peak hours to minimize
 * disruption.
 * Monitoring: Track the cloud database’s performance post-migration.
 * 4. How to Implement a Backup and Recovery Strategy for a Mission-Critical
 * Database?
 * Implementing a backup and recovery strategy for a mission-critical database
 * involves several critical steps.
 * 
 * Regularly schedule full and incremental backups to minimize data loss in case
 * of failures.
 * Store backups securely, both on-site and off-site or in the cloud, to protect
 * against physical disasters.
 * Utilize automated backup solutions to ensure consistency and reliability.
 * Test backup and recovery procedures regularly to verify their effectiveness.
 * Implement point-in-time recovery options to restore the database to a
 * specific point before an incident occurred.
 * Train staff on recovery processes to respond swiftly during emergencies.
 * 5. How to Ensure Data Consistency Across Multiple Distributed Databases?
 * Ensuring data consistency across multiple distributed databases requires
 * careful planning and implementation.
 * 
 * Employ distributed transaction management protocols that support ACID
 * (Atomicity, Consistency, Isolation, Durability) properties.
 * Implement data replication strategies with conflict resolution mechanisms to
 * synchronize data changes across databases.
 * Monitor and audit data consistency regularly using automated tools to detect
 * and resolve discrepancies promptly.
 * Design applications with eventual consistency in mind, where temporary
 * inconsistencies are acceptable and resolve over time based on application
 * requirements and use cases.
 * 6. How to Manage Database Schema Changes to Minimize Downtime and Avoid Data
 * Loss?
 * Managing database schema changes to minimize downtime and avoid data loss
 * involves several best practices.
 * 
 * Begin by thoroughly planning and testing schema changes in a development or
 * staging environment.
 * Use tools that support schema versioning and migration, allowing for rollback
 * capabilities if needed.
 * Implement changes during maintenance windows or off-peak hours to minimize
 * disruption to users.
 * Communicate changes effectively with stakeholders and ensure backup
 * procedures are in place before making any modifications.
 * Monitor the deployment closely and be prepared to quickly revert changes if
 * unforeseen issues arise to maintain data integrity.
 * 7. How to Design a Database for Real-Time Analytics on Transactional Data?
 * Designing a database for real-time analytics on transactional data involves
 * creating a hybrid architecture that supports both OLTP (Online Transaction
 * Processing) and OLAP (Online Analytical Processing) capabilities.
 * Use a real-time data streaming platform like Apache Kafka to capture and
 * ingest transactional data continuously.
 * Load data into a data warehouse optimized for analytics, using columnar
 * storage and indexing for fast query performance.
 * Implement caching mechanisms for frequently accessed analytical data.
 * Ensure the database schema is designed to handle complex queries and
 * aggregations efficiently.
 * Utilize in-memory databases or caching solutions for rapid data retrieval and
 * analysis.
 * 8. How to Secure Sensitive Data Within a Database?
 * Securing sensitive data within a database requires implementing robust
 * security measures. Start by using strong authentication and authorization
 * mechanisms to control access to sensitive data based on roles and privileges.
 * Encrypt sensitive data both at rest and in transit using encryption standards
 * like AES (Advanced Encryption Standard).
 * 
 * Implement data masking techniques to obfuscate sensitive information in
 * non-production environments. Regularly audit database access logs for
 * unauthorized activities and anomalies. Utilize database security features
 * such as fine-grained access controls, Transparent Data Encryption (TDE), and
 * key management services provided by cloud providers.
 * 
 * 9. How to Optimize a Complex SQL Query, and What Was the Outcome?
 * Optimizing Steps:
 * 
 * Analyze the execution plan to identify bottlenecks (e.g., missing indexes,
 * expensive joins).
 * Refactor queries to reduce the number of operations or simplify logic.
 * Create or modify indexes on frequently queried columns.
 * Optimize the schema design if necessary.
 * Outcome: Query execution time was reduced from several seconds to
 * milliseconds, resulting in improved application performance and user
 * experience.
 * 10. How to Implement a Logging Mechanism for Database Changes?
 * Implementing a logging mechanism for database changes involves using database
 * triggers to capture data manipulation language (DML) events such as INSERT,
 * UPDATE, and DELETE operations.
 * Store captured change data in dedicated audit tables within the database,
 * including details like timestamps, user IDs, and affected rows.
 * Use technologies like Apache Kafka for streaming change logs to external
 * systems for further analysis or archival purposes.
 * Ensure the logging mechanism is designed to be lightweight and efficient to
 * minimize impact on database performance.
 * Regularly review and analyze change logs to monitor database activity and
 * maintain data integrity.
 * Conclusion
 * This comprehensive guide to Database Interview Questions has covered a wide
 * range of essential topics, including SQL queries, database design principles,
 * optimization techniques, and practical, scenario-based challenges. These
 * questions provide a solid foundation to help you confidently prepare for your
 * interviews.
 * 
 * Remember, success in database interviews comes from understanding the core
 * concepts, practicing your problem-solving skills, and staying up-to-date with
 * the latest industry trends. Review these questions thoroughly, apply them to
 * real-world situations, and refine your answers through practice to stand out
 * as a strong candidate.
 * 
 * 
 */
// ........................EXAMPLE 6.......................................
// ........................EXAMPLE 7.......................................
// ........................EXAMPLE 8.......................................
// ........................EXAMPLE 9.......................................
