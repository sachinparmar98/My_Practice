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
 * Q 1.wtire a command for sow all procedure ?
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
 * Ans = it is the method of CallableStatement its return type is boolean
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
 * Q 20 . how to delete multiple procedure ?
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
 * // CallableStaement cs=con.prepareCall("{call p3()}");
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
 * consuming the serve mentance a pool of avilabe connection to incress
 * performancce when an application request a connection it obtains one from the
 * pool. when an application close a connection the connection is return to the
 * pool .
 * the properties of connection pool
 * can variy with diffrent databse venders(venders mean provider like
 * mysql,oracle ,monodb)
 * 
 * some common properties
 * the dataBase name (url),usetName,user password
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
 * 1 .we should close conncetion or not in below example ;
 * 2 . try to execute query after conncetion close ;
 */
/*
 * not working
 * 
 * import java.sql.*;
 * import com.mysql.jdbc.jdbc2.*;
 * 
 * class Classjdbc {
 * public static void main(String[] args) {
 * try {
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * MysqlConnectionPoolDataSource mcpds = new MysqlConnectionPoolDataSource();
 * mcpds.setURL("jdbc:mysql:///iclass");
 * mcpds.setUser("root");
 * mcpds.setPassword("root");
 * Connection con = mcpds.getConnection();
 * Statement st = con.createStatement();
 * ResultSet rs = mcpds.executeQuery("select * from login");
 * while (rs.next()) {
 * System.out.println(rs.getString(1) + "....." + rs.getString(2));
 * }
 * 
 * con.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * }
 */
/*
 * import com.mysql.jdbc.jdbc2.*;
 * ^
 * Classjdbc.java:1729: error: cannot find symbol
 * MysqlConnectionPoolDataSource mcpds = new MysqlConnectionPoolDataSource();
 * ^
 * symbol: class MysqlConnectionPoolDataSource
 * location: class Classjdbc
 * Classjdbc.java:1729: error: cannot find symbol
 * MysqlConnectionPoolDataSource mcpds = new MysqlConnectionPoolDataSource();
 * ^
 * symbol: class MysqlConnectionPoolDataSource
 * location: class Classjdbc
 * 3 errors
 */

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
 * reason becuse result set create hua ha only but vo abhi kisi ko point nahi
 * ker raha
 * ha isliya rs.next() kerna hoga first result ko point kerna ka liya .
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
// ######################...Example-7...###############################
// ######################...Example-8...###############################
// ######################...Example-9...###############################
