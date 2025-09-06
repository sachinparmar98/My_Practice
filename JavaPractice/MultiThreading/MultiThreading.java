// ***********************************************************************************
// ***********************************DAY-1*****************************************
// **************************************************************************************
// ...EX-1............INSERT DATA IN QUEUE USING add(Object ) method............
// import java.util.concurrent.*;

// class MultiThreading {
// public static void main(String... ar) {
// LinkedBlockingQueue li = new LinkedBlockingQueue();
// li.add(10);
// li.add(20);
// li.add(30);
// li.add(50);
// li.add(50);
// System.out.println(li);
// }
// }
// OUTPUT = [10, 20, 30, 50, 50]

// ...EX-2..........INSERT DATA IN QUEUE USING offer(object) METHOD..........
// import java.util.concurrent.*;

// class MultiThreading {
// public static void main(String... ar) {
// LinkedBlockingQueue li = new LinkedBlockingQueue();
// li.offer(10);
// li.offer(20);
// li.offer(30);
// li.offer(50);
// li.offer(50);
// System.out.println(li);
// }
// }
// OUTPUT= [10, 20, 30, 50, 50]
// EX-3 INSERT DATA IN QUEUE USING put(Object) METHOD
// import java.util.concurrent.*;

// class MultiThreading {
// public static void main(String... ar) {
// LinkedBlockingQueue li = new LinkedBlockingQueue();
// li.put(10);
// li.put(20);
// li.put(30);
// li.put(50);
// li.put(50);
// System.out.println(li);
// }
// }
// ERROR= error: unreported exception InterruptedException; must be caught or
// declared to be thrown

// EX-4 ABOVE ERROR SOLUTION
// import java.util.concurrent.*;

// class MultiThreading {
// public static void main(String... ar) throws InterruptedException {
// LinkedBlockingQueue li = new LinkedBlockingQueue();
// li.put(10);
// li.put(20);
// li.put(30);
// li.put(50);
// li.put(50);
// System.out.println(li);
// }
// }
// OUTPUT = [10, 20, 30, 50, 50]
// //EX-5 IF WE INSERT DATA MORE THEN QUEUE CAPACITY USING add(Object) METHOD
// WHAT HAPPEN
// import java.util.concurrent.*;

// class MultiThreading {
// public static void main(String... ar) {
// LinkedBlockingQueue li = new LinkedBlockingQueue(3);
// li.add(10);
// li.add(20);
// li.add(30);
// li.add(50);
// li.add(50);
// System.out.println(li);
// }
// }

// it will throw below Exception
// Exception in thred "mai" java.lang.IllegalStateExceptio: Queue full

// EX-6 IF WE INSERT DATA MORE THEN QUEUE CAPACITY USING offer(Object) METHOD
// WHAT HAPPEN
// import java.util.concurrent.*;

// class MultiThreading {
// public static void main(String... ar) {
// LinkedBlockingQueue li = new LinkedBlockingQueue(3);
// li.offer(10);
// li.offer(20);
// li.offer(30);
// li.offer(50);
// li.offer(50);
// System.out.println(li);
// }
// }
// if queue is full then offer method will not insert remaning data
// OUTPUT= [10, 20, 30]
// EX-7 IF WE INSERT DATA MORE THEN QUEUE CAPACITY USING put(Object) METHOD WHAT
// HAPPEN
// import java.util.concurrent.*;

// class MultiThreading {
// public static void main(String... ar) throws InterruptedException {
// LinkedBlockingQueue li = new LinkedBlockingQueue(3);
// li.put(10);
// li.put(20);
// li.put(30);
// li.put(40);
// li.put(50);
// System.out.println(li);
// }
// }
// OUTPUT= it capacity is full put() method will wait for infinite time if any
// data is remove
// from queue it will insert data

// EX-8 IF WE WANT TO INSERT DATA AND wait for limited time then what we will do
// ANS= in this case we will used overloaded version of offer() method
// import java.util.concurrent.*;

// class MultiThreading {
// public static void main(String... ar) throws InterruptedException {
// LinkedBlockingQueue li = new LinkedBlockingQueue(3);
// li.offer(10);
// li.offer(20);
// li.offer(30);
// li.offer(40,1,TimeUnit.SECONDS);
// li.offer(50,5,TimeUnit.SECONDS);
// System.out.println(li);
// }
// }
// it will wait for 6 seconds then display below out put
// OUTPUT =[10, 20, 30]

// EX-9 using overloaded version of offer() method

// import java.util.concurrent.*;

// class MultiThreading {
// public static void main(String... ar) throws InterruptedException {
// LinkedBlockingQueue li = new LinkedBlockingQueue(3);
// li.offer(10);
// li.offer(20);
// li.offer(60);
// li.offer(40, 1, TimeUnit.SECONDS);
// li.offer(50);
// System.out.println(li);
// }
// }
// It will wait for 1 second and display below output
// OUTPUT= [10, 20, 60]
// EX-10 REMOVE DATA FROM QUEUE USING remove(Object) method

// import java.util.concurrent.*;

// class MultiThreading {
// public static void main(String... ar) {
// LinkedBlockingQueue li = new LinkedBlockingQueue();
// li.offer(10);
// li.offer(20);
// li.offer(30);
// li.offer(40);
// li.offer(50);
// System.out.println(li.remove(10));
// System.out.println(li.remove(10));
// System.out.println(li);
// }
// }
// if data is removed it will return true otherwise it will return false
// OUTPUT=
// true
// false
// [20, 30, 40, 50]
// EX-11 REMOVE DATA FROM QUEUE USING take(Object) method

// import java.util.concurrent.*;
//
// class MultiThreading {
// public static void main(String... ar) throws InterruptedException {
// LinkedBlockingQueue li = new LinkedBlockingQueue();
// li.offer(10);
// li.offer(20);
// li.offer(30);
// li.offer(40);
// li.offer(50);
// System.out.println(li.take());
// System.out.println(li.take());
// System.out.println(li);
// }
// }
// Its return type is Object when we call take() method it remove starting data
// of queue and return it otherwise
// OUTPUT =
// 10
// 20
// [30,40,50]

// wait for limited time

// import java.util.concurrent.*;

// class MultiThreading {
// public static void main(String... ar) {
// LinkedBlockingQueue li = new LinkedBlockingQueue(3);
// li.offer(10);
// li.offer(2);
// li.offer(30);
// // li.offer(40, 5, TimeUnit.SECONDS);
// // li.offer(50, 5, TimeUnit.SECONDS);
// System.out.println(li.remove(10));
// System.out.println(li.remove(10));
// System.out.println(li);
// }
// }
// ***********************************************************************************
// ***********************************DAY-2*****************************************
// **************************************************************************************

/*
 * NOTE-1=Thread is an public class store inside lang package.
 * NOTE-2 = Thread class implements with Runnable inteface
 * NOTE-3 = Runnable is an public inteface store in lang package.
 * NOTE-4 = Runnable is an functional interface it have single method and it is
 * abstract and its name
 * is public abstract void run();
 * 
 */
// ...EX-1..............STEP-1 TO CREATE Thread................
// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println(i);
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// A a1=new A();
// a1.start();
// }
// }
/*
 * 
 * //output = 1 to 10 number will be show in diffrent line
 * step-1 first we have to extends our class with Thread class
 * step-2 second we have to override public void run() method .
 * step-3 we have to call run() method.
 * step-4 run() method is call by public synchronize void start() method
 * step-5 start() method is call with our class object
 */
// ...EX-2..............STEP-2 TO CREATE Thread................

// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println("run method=>"+i);
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println("main method=>"+i);
// }
// A a1=new A();// this point we have only single thread its default thread its
// name main Thread
// a1.start();//this point second Thread will create
// }
// }
/*
 * out put
 * main method=>1
 * main method=>2
 * main method=>3
 * main method=>4
 * main method=>5
 * main method=>6
 * main method=>7
 * main method=>8
 * main method=>9
 * main method=>10
 * run method=>1
 * run method=>2
 * run method=>3
 * run method=>4
 * run method=>5
 * run method=>6
 * run method=>7
 * run method=>8
 * run method=>9
 * run method=>10
 * 
 * note => second Thread ka create hona sa pehla he main thread main method loop
 * ko execute ker degi to
 * second Thread create hona per koi fight hee nahi hogi there for output fix
 * hee ayga
 */

// ...EX-3..............STEP-3 TO CREATE Thread................

// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println("run method=>"+i);
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
//
// A a1=new A();// this point we have single Thread main thread
// a1.start();//this point second Thread will create know we have total two
// Thread
// for(int i=1;i<=10;i++)
// {
// System.out.println("main method=>"+i);
// }
// }
// }
/*
 * out put
 * main method=>1
 * main method=>2
 * run method=>1
 * run method=>2
 * run method=>3
 * run method=>4
 * run method=>5
 * run method=>6
 * main method=>3
 * run method=>7
 * main method=>4
 * main method=>5
 * main method=>6
 * main method=>7
 * main method=>8
 * run method=>8
 * run method=>9
 * main method=>9
 * run method=>10
 * main method=>10
 * 
 * NOTE=>aisa output isliya aa rha ha kyoki jab second thread create hui too
 * humara program ka pass
 * do thread ho jati ha main thred main method wala loop ko execute kerna chati
 * ha or second
 * thread run method wala loop ko execute kerna chati ha isliya dono pehla ma ka
 * liya fight hogi
 * islya output mix aya ha fight hona ka bad bhi dono loop complete execute hoga
 * 
 */

// ...EX-4..............WHAT HAPPEN IF OUR PROGRAM HAVE 3 THREAD................

// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=5;i++)
// {
// System.out.println("run method=>"+i);
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
//
// A a1=new A();
// A a2=new A();//this point we hava main thread
// a1.start();//we have total two thread
// a2.start(); // we have total three thread
// }
// }

/*
 * OUTPUT=
 * run method=>1
 * run method=>2
 * run method=>3
 * run method=>1
 * run method=>2
 * run method=>3
 * run method=>4
 * run method=>4
 * run method=>5
 * run method=>5
 * 
 * NOTE=> second and third thread ma conflict hoga isliya output mix aa rha ha
 */
// ...EX-5..............NORMAL PROGRAM................

// class A
// {
// public void show()
// {
// for(int i=1;i<=5;i++)
// {
// System.out.println("show method=>"+i);
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
//
// A a1=new A();
// A a2=new A();
// a1.show();
// a2.show();
// }
// }

/*
 * OUTPUT=
 * show method=>1
 * show method=>2
 * show method=>3
 * show method=>4
 * show method=>5
 * show method=>1
 * show method=>2
 * show method=>3
 * show method=>4
 * show method=>5
 * 
 * REASON=> because program ma single thread hee work ker rahi ha pehla
 * a1.show() execute hogi then
 * a2.show() execute hogi isliya out put fix he ayga
 * 
 * NOTE = when more then one tread simultanously work kerti ha too conflict hota
 * ha
 */

// ...EX-6..............NOT FIX OUTPUT................

// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=15;i++)
// {
// System.out.println("run method=>"+i);
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
//
// A a1=new A();
//
// a1.start();
// System.out.println("main method");
// }
// }
/*
 * OUTPUT=>
 * main method
 * run method=>1
 * run method=>2
 * run method=>3
 * run method=>4
 * run method=>5
 * 
 * NOTE => main method kabhi bhi aa sakta ha fix nahi ha
 */

// ***********************************************************************************
// ***********************************DAY-3*****************************************
// **************************************************************************************
// ...EX-1............if we call start() method two time with same
// object..................
// ANS= out put bhi ayga and Exception bhi ay gi
// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=10;i++)
// System.out.println("run method=>"+i);
// }
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// a1.start();
// }
// }
/*
 * OUTPUT=
 * run method=>1
 * Exception in thread "main" run method=>2
 * run method=>3
 * run method=>4
 * run method=>5
 * run method=>6
 * run method=>7
 * run method=>8java.lang.IllegalThreadStateException
 * 
 * run method=>9
 * at java.lang.Thread.start(Thread.java:710)
 * at MultiThreading.main(MultiThreading.java:505)
 * run method=>10
 */
// ....EX-(1.5)...........WHAT HAPPEN IF EXCEPTION COMES IN MAIN THREAD.........
// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=10;i++)
// System.out.println("run method=>"+i);
// }
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// System.out.println(10/0);
// System.out.println("main method");
// }
// }
/*
 * Output=
 * Exception in thread "main" run method=>1
 * run method=>2
 * run method=>3
 * run method=>4
 * run method=>5
 * java.lang.ArithmeticException: / by zerorun method=>6
 * 
 * run method=>7
 * at MultiThreading.main(MultiThreading.java:539)run method=>8
 * 
 * run method=>9
 * run method=>10
 * 
 */
// ...EX-2...........what happen if thred is complete then we call again start()
// with same object...................
// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=10;i++)
// System.out.println("run method=>"+i);
// }
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// try{Thread.sleep(200);}
// catch(Exception e){}
// a1.start();
// }
// }
/*
 * OUTPUT=
 * run method=>1
 * run method=>2
 * run method=>3
 * run method=>4
 * run method=>5
 * run method=>6
 * run method=>7
 * run method=>8
 * run method=>9
 * run method=>10
 * Exception in thread "main" java.lang.IllegalThreadStateException
 * at java.lang.Thread.start(Thread.java:710)
 * at MultiThreading.main(MultiThreading.java:508)
 */
// ...EX-3..........What happen if any thread is runnig and Exception in ocurs
// in main thread....................
// ANS= main thread remaining code will not execute but previous other runnig
// thread will
// complete execute see below
// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=10;i++)
// System.out.println("run method=>"+i);
// }
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// System.out.println(10/0);
// System.out.println("main method");
// }
// }
/*
 * OUTPUT=
 * Exception in thread "main" run method=>1
 * run method=>2
 * run method=>3
 * run method=>4
 * run method=>5
 * java.lang.ArithmeticException: / by zerorun method=>6
 * 
 * run method=>7
 * at MultiThreading.main(MultiThreading.java:539)run method=>8
 * 
 * run method=>9
 * run method=>10
 */
// ...EX-4...........if Exception is ocurs in thread it will complete or
// not...................
// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// if(i==5)
// throw new ArithmeticException();
// System.out.println("run method=>"+i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
//
// for(int i=1;i<=15;i++)
// {
// System.out.println("main method =>"+i);
// }
//
//
// }
// }
/*
 * OUTPUT=
 * main method =>1
 * run method=>1
 * main method =>2
 * run method=>2
 * main method =>3
 * main method =>4
 * main method =>5
 * main method =>6
 * main method =>7
 * run method=>3
 * run method=>4
 * main method =>8
 * main method =>9
 * main method =>10Exception in thread "Thread-0"
 * main method =>11
 * main method =>12
 * main method =>13
 * java.lang.ArithmeticExceptionmain method =>14
 * 
 * at A.run(MultiThreading.java:637)main method =>15
 */
// ...EX-5..............is we can start any Thread two times ................
// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println("run method=>"+i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// a1.stop();
// a1.start();
//
//
//
// }
// }

/*
 * output =Reason start ot stop ka bich ma koi time hee nahi mil raha ha isliya
 * koi output nahi ha
 * controe second start ka pass a jay ga or exception throw ho jay gi
 * Exception in thread "main" java.lang.IllegalThreadStateException
 * at java.lang.Thread.start(Thread.java:710)
 * at MultiThreading.main(MultiThreading.java:696)
 */
// ...EX-6..............................

// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println("run method=>"+i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// Thread.sleep(100);
//
// a1.stop();
//
// }
// }
/*
 * OUTPUT=
 * MultiThreading.java:725: error: unreported exception InterruptedException;
 * must be caught or declared to be thrown
 * Thread.sleep(100);
 * ^
 * Note: MultiThreading.java uses or overrides a deprecated API.
 * Note: Recompile with -Xlint:deprecation for details.
 * 1 error
 */
// ...EX-7..............suspend and resume method................
// class A extends Thread
// {
//
// public void run()
// {
// for(int i=1;i<=10000;i++)
// {
// System.out.println(i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// a1.suspend();
// try{
// Thread.sleep(2000);
//
// }
// catch(Exception e)
// {}
// a1.resume();
// }
// }
/*
 * out put=
 * 1 to 10000 print hoga bich ma 2 second ka liya wait kera ga
 */
// ...EX-7..............suspend and resume method and hidden concept
// ................
// class A extends Thread
// {
//
// public void run()
// {
// for(int i=1;i<=10000;i++)
// {
// System.out.println(i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// a1.suspend();
//
// System.out.println(".................");
// a1.resume();
// }
// }
/*
 * output
 * 
 * 1 to random number tak display hoga then cursor blink kera ga why ?
 */

// ...EX-7..............one more case in above example................
// class A extends Thread
// {
//
// public void run()
// {
// for(int i=1;i<=10000;i++)
// {
// System.out.println(i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// a1.suspend();
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// System.out.println(".................");
// a1.resume();
// }
// }
/*
 * output
 * 
 * 1 to random number tak display hoga then cursor blink kera ga why ?
 */
// ...EX-7..............overide the start() method ................
// class A extends Thread
// {
//
// public void start()
// {
// for(int i=1;i<=500;i++)
// {
// System.out.println(i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// for(int i=1;i<=500;i++)
// System.out.println(i);
//
// }
// }

/*
 * out put=
 * 1 to 500 then again 1 to 500
 * because class A ki start method call hogi or overiding start method normal
 * // method ki terah work kera gi
 */
// ...EX-7..............call multiple time overiding start() method with same
// object................
// class A extends Thread
// {
//
// public void start()
// {
// for(int i=1;i<=5;i++)
// {
// System.out.println(i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// a1.start();
// for(int i=1;i<=5;i++)
// System.out.println(i);
//
// }
// }
/*
 * OUTPUT=
 * 1 TO 5 THREE TIMES
 */
// ...EX-7..............what is the return type of super()................/
// answer = void
// class A extends Thread
// {
//
// public void start()
// {
// for(int i=1;i<=5;i++)
// {
// super().start();
// this().start();
// System.out.println(i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// a1.start();
// for(int i=1;i<=5;i++)
// System.out.println(i);
//
// }
// }
/*
 * ERROR
 * MultiThreading.java:903: error: call to super must be first statement in
 * constructor
 * super().start();
 * ^
 * MultiThreading.java:903: error: void cannot be dereferenced
 * super().start();
 * ^
 * MultiThreading.java:904: error: call to this must be first statement in
 * constructor
 * this().start();
 * ^
 * MultiThreading.java:904: error: void cannot be dereferenced
 * this().start();
 * ^
 * 4 errors
 */
// ...EX-7..............solution of above error................/
// answer = we need to use super keyword
// class A extends Thread
// {
//
// public void start()
// {
// for(int i=1;i<=5;i++)
// {
// super.start();
//
// System.out.println(i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// a1.start();
// for(int i=1;i<=5;i++)
// System.out.println(i);
//
// }
// }
/*
 * output=
 * 1
 * Exception in thread "main" java.lang.IllegalThreadStateException
 * at java.lang.Thread.start(Thread.java:710)
 * at A.start(MultiThreading.java:944)
 * at MultiThreading.main(MultiThreading.java:954)
 * 
 * 
 * REASON = becauese same object ka corresponding super.start() multiple time
 * call ho rahi ha isliya
 */
// ...EX-7..............singel time super call................/
// answer = we need to use super keyword
// class A extends Thread
// {
// public void start()
// {
// super.start();
// }
// public void run()
// {
// for(int i=1;i<=5;i++)
// {
//
//
// System.out.println(i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
//
// for(int i=1;i<=5;i++)
// System.out.println(i);
//
// }
// }

/*
 * OUTPUT=
 * 1 to 5 two times display hoga mix because main thread or second thread do
 * thread work ker rahi ha
 */

// ...EX-7..............create two thread ................/
// answer = we need to use super keyword
// class A extends Thread
// {
// public void run()
// {
// show();
// }
//
// public void show()
// {
// for(int i=1;i<=15;i++)
// {
//
//
// System.out.println(i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// A a2=new A();
// a1.start();
// a2.start();
//
//
//
// }
// }
/*
 * OUTPUT=
 * 
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 * 14
 * 15
 * 11
 * 12
 * 13
 */
// ...EX-7..............case 2 for above example ................/
// class A extends Thread
// {
// public void run()
// {
// show();
// }
//
// public void show()
// {
// for(int i=1;i<=15;i++)
// {
//
// try{Thread.sleep(100);}
// catch(Exception e){}
//
// System.out.println(i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// A a2=new A();
// a1.start();
// a2.start();
//
//
//
// }
// }
/*
 * output=
 * 1
 * 1
 * 2
 * 2
 * 3
 * 3
 * 4
 * 4
 * 5
 * 5
 * 6
 * 6
 * 7
 * 7
 * 8
 * 8
 * 9
 * 9
 * 10
 * 10
 * 11
 * 11
 * 12
 * 12
 * 13
 * 13
 * 14
 * 14
 * 15
 * 15
 */

// ...EX-7..............Solution of above exception................

// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=15;i++)
// {
// System.out.println("run method=>"+i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
// try{Thread.sleep(100);}catch(Exception e){}
// a1.start();
// for(int i=1;i<=15;i++)
// System.out.println("main method=>"+i);
// }
// }
/*
 * OUTPUT=
 * Exception in thread "main" run method=>1
 * run method=>2
 * run method=>3
 * run method=>4
 * run method=>5java.lang.IllegalThreadStateException
 * 
 * run method=>6
 * at java.lang.Thread.start(Thread.java:710)
 * run method=>7
 * at MultiThreading.main(MultiThreading.java:758)run method=>8
 * 
 * run method=>9
 * run method=>10
 * run method=>11
 * run method=>12
 * run method=>13
 * run method=>14
 * run method=>15
 */

// ...EX-8............IF WE CALL START METHOD MULTIPLE TIME INSIDE OVERIDING
// METHOD USING SUPER KEYWORD..................
// class A extends Thread
// {
// public void start()
// {
// super.start();
// super.start();
// }
// public void run()
// {
// for(int i=1;i<=15;i++)
// {
// System.out.println("run method=>"+i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.start();
//
// }
// }
/*
 * OUTPUT=
 * Exception in thread "main" run method=>1
 * run method=>2
 * run method=>3
 * run method=>4
 * run method=>5
 * java.lang.IllegalThreadStateExceptionrun method=>6
 * 
 * run method=>7
 * at java.lang.Thread.start(Thread.java:710)run method=>8
 * 
 * at A.start(MultiThreading.java:791)run method=>9
 * 
 * at MultiThreading.main(MultiThreading.java:805)run method=>10
 * 
 * run method=>11
 * run method=>12
 * run method=>13
 * run method=>14
 * run method=>15
 */
// ...EX-9.........WHAT HAPPEN IF WE CALL RUN METHOD
// DIRACTLY.....................
// IT WILL WORK LIKE A NORMAL METHOD
// class A extends Thread
// {
//
// public void run()
// {
// for(int i=1;i<=15;i++)
// {
// System.out.println(i);
// }}
// }
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// A a1=new A();
// a1.run();
// a1.run();
//
// }
// }

// ...EX-10............creat thread using Runnable interface..................
// class A implements Runnable
// {
// public void run()
// {
// for(int i=1;i<15;i++)
// {
// System.out.println(i);
// }
// }
// }
// class MultiThreading
// {
// static public void main(String ...a)
// {
// A a1=new A();
// a1.start();
// }
// }
/*
 * ERROR=
 * MultiThreading.java:1269: error: cannot find symbol
 * a1.start();
 * ^
 * symbol: method start()
 * location: variable a1 of type A
 * 1 error
 * 
 */
// ...EX-11.........above error solution.....................

// class A implements Runnable
// { @Override
// public void run()
// {
// for(int i=1;i<15;i++)
// {
// System.out.println(i);
// }
// }
// }
// class MultiThreading
// {
// static public void main(String ...a)
// {
// A a1=new A();
// Thread t1=new Thread(a1);
// t1.start();
// }
// }
/*
 * OUTPUT=
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 * 14
 */

// ...EX-12..............................
//
// class B
// {
//
// //public void show()
// //{
// // System.out.println(" B ram");
// //}
// }
// interface B2
// {
//
// public default void show()
// {
// System.out.println("B2 ram");
// }
// }
// class A extends B implements B2
// {
//
// }
// class MultiThreading
// {
// static public void main(String ...a)
// {
// B a1=new B();
// a1.show();
// }
// }
// ...EX-13..............................
// ...EX-14..............................
// *****************************************************************
// *********************Day-4*************************
// *****************************************************************

// ...EX-1.......clas B and class A both are child class of Object class -
// then which interface apply in below example
// ans = multilevel interface is applied
// class A
// {}
// class B extends A
// {
//
// }
// public class MultiThreading
// {
// public static void main(String ar[])
// {
//
// B b1=new B();
// System.out.println(b1.hashCode());
// }
//
// }
// output =unique decimal number

// ...EX-2.............creating two thread class Object......................
// class A implements Runnable
// {
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println(i);
// try{ Thread.sleep(100);}
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A();
// A a2=new A();
// Thread t1=new Thread(a1);//Runnable parmeter constructor
// Thread t2=new Thread(a2);//Runnable parmeter constructor
//
// t1.start();
// t2.start();
// }
// }
//
// output 1 t0 10 two times mix
// ...EX-3.......write a program for shared resources....................
// class A implements Runnable
// {
// public void run()
// {
// for(int i=1;i<=15;i++)
// {
// System.out.println(i);
// try{ Thread.sleep(100);}
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A();
//
// Thread t1=new Thread(a1);//Runnable parmeter constructor
// Thread t2=new Thread(a1);//Runnable parmeter constructor
//
// t1.start();
// t2.start();
// }

// output 1 to 15 two times mix ayga

// ...EX-4...........if we dont pass object in Thread class constructor
// parameter................
// class A implements Runnable
// {
// A()
// {
// Thread t1=new Thread();
// Thread t2=new Thread();
// t1.start();
// t2.start();
// }
// public void run()
// {
// for(int i=1;i<=11;i++)
// {
// System.out.println(i);
// try{ Thread.sleep(100);}
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A();
//
//
// }
// }
// output = blank screen becuse Thread class run() method is called

// ...EX-5........if ww want call class A run method ...................

// class A implements Runnable
// {
// A()
// { A a2 =new A();
// Thread t1=new Thread(a2);
// Thread t2=new Thread(a2);
// t1.start();
// t2.start();
// }
// public void run()
// {
// for(int i=1;i<=11;i++)
// {
// System.out.println(i);
// try{ Thread.sleep(100);}
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A();
//
//
// }
// }
// EXCEPTION=> Exception in thread "main" java.lang.StackOverflowError
// ...EX-6..........right program to call class A run() method .................
// class A implements Runnable
// {
// A()
// {
// Thread t1=new Thread(this);
// Thread t2=new Thread(this);
// t1.start();
// t2.start();
// }
// public void run()
// {
// for(int i=1;i<=12;i++)
// {
// System.out.println(i);
// try{ Thread.sleep(100);}
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A();
//
//
// }
// }
// output 1 to 12 two times mix ayga
// ...EX-7.........what happend if two different class extends with Thread class
// ..................
// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=11;i++)
// {
// System.out.println("class A="+i);
// try{ Thread.sleep(100);}
// catch(Exception e){}
// }
// }
// }class B extends Thread
// {
// public void run()
// {
// for(int i=1;i<=11;i++)
// {
// System.out.println("class B="+i);
// try{ Thread.sleep(100);}
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A();
// B b1=new B();
// a1.start();
// b1.start();
//
//
// }
// }
// output= 1 to 11 two times mix ayga
// ...EX-8......isplay out put according to class name.....................
// class A extends Thread
// {
//
// String s;
// A (String s)
// {
// this.s=s;
// }
// public void run()
// {
// for(int i=1;i<=11;i++)
// {
// System.out.println(s+"="+i);
// try{ Thread.sleep(100);}
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A("A");
// A a2=new A("B");
//
// a1.start();
// a2.start();
//
//
// }
// }
// output= 1 to 11 two times mix ayga
// ...EX-9........step-1 to create thread using annonymous inner class
// ...................
// class A
// {
//
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A(){
// public void show()
// {
// System.out.println("ram");
// }
// }.show();
//
//
//
// }
// }
/*
 * MultiThreading.java:1607: error: incompatible types: void cannot be converted
 * to A
 * }.show();
 * ^
 * 1 error
 */
// ...EX-10......step-2 to create thread using annonymous inner
// class.....................
// class A
// {
//
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A(){
// public void show()
// {
// System.out.println("ram");
// }
// };
// a1.show();
// System.out.println("ram ji");
//
//
//
// }
// }
/*
 * MultiThreading.java:1634: error: cannot find symbol
 * a1.show();
 * ^
 * symbol: method show()
 * location: variable a1 of type A
 * 1 error
 */
// ...EX-11......step-3 to create thread using annonymous inner
// class.....................
// class A
// {
// A()
// {
// Thread t1=new Thread(){
// public void run()
// {
// for(int i=1;i<13;i++)
// System.out.println(i);
// }
// };
// }
//
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A();
//
//
//
// }
// }
// output blank screen because we did not call run method
// ...EX-12........step-4 final step to create thread using annonymous inner
// class...................
// class A
// {
// A()
// {
// Thread t1=new Thread(){
// public void run()
// {
// for(int i=1;i<=13;i++)
// System.out.println(i);
// }
// };
// t1.start();
// }
//
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A();
//
//
//
// }
// }
// output 1 to 13
// ...EX-13........create Thread using lambda expresion STEP-1 .................
// class A
// {
// A()
// {
// Thread t1=()->{for(int i=1;i<=13;i++)
// System.out.println(i);
//
// };
// t1.start();
// }
//
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A();
//
//
//
// }
// }

/*
 * MultiThreading.java:1705: error: incompatible types: Thread is not a
 * functional interface
 * Thread t1=()->{for(int i=1;i<=13;i++)
 * ^
 * 1 error
 */
// ...EX-14........create Thread using lambda expresion final step
// .................

// class A
// {
// A()
// {
// Runnable r1=()->{for(int i=1;i<=13;i++)
// System.out.println(i);
//
// };
// Thread t1=new Thread(r1);
// t1.start();
// }
//
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A();
//
//
//
// }
// }

// output 1 to 13
// ...EX-15........create Thread using lambda expresion another way
// .................

// class A
// {
// A()
// {
// //Runnable r1=()->{for(int i=1;i<=13;i++)
// // System.out.println(i);
//
// //};
// //Thread t1=new Thread(r1);
//
//
// Thread t1=new Thread(()->{
// for(int i=1;i<=20 ;i++)System.out.println(i);});
// t1.start();
// }
//
// }
// class MultiThreading
// {
// public static void main(String ...a)
// {
// A a1=new A();
//
//
//
// }
// }
// output= 1 to 20 because pehla r1 pass kiya tha ab humna vo hee pass ker diya
// jo r1 ka pass tha
// *****************************************************************
// *********************Day-5*************************
// *****************************************************************
// ...EX-1............ two Thread class annonymous Object..................
// class A
// {
// A()
// {
// new Thread(()->
// {
// for(int i=1;i<=20;i++)
// System.out.println(i);
// }).start();
// new Thread(()->
// {
//
// for(int i=1;i<=20;i++)
// System.out.println(i);
// }).start();
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// A a1=new A();
// }
// }
// 1 to 20 two times mix ayga
// ...EX-2............ ticket cut and show program step -1..................
// class A
// {
// String s;
// A (String s)
// {
// this.s=s;
// }
// public void show()
// {
// for(int i=1;i<=20;i++)
// {
// System.out.println(s+"=>"+i);
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// A a1=new A("cut ticket");
// A a2=new A("show ticket");
// a1.show();
// a2.show();
// }
//
// }
/*
 * OUTPUT
 * cut ticket=>1
 * cut ticket=>2
 * cut ticket=>3
 * cut ticket=>4
 * cut ticket=>5
 * cut ticket=>6
 * cut ticket=>7
 * cut ticket=>8
 * cut ticket=>9
 * cut ticket=>10
 * cut ticket=>11
 * cut ticket=>12
 * cut ticket=>13
 * cut ticket=>14
 * cut ticket=>15
 * cut ticket=>16
 * cut ticket=>17
 * cut ticket=>18
 * cut ticket=>19
 * cut ticket=>20
 * show ticket=>1
 * show ticket=>2
 * show ticket=>3
 * show ticket=>4
 * show ticket=>5
 * show ticket=>6
 * show ticket=>7
 * show ticket=>8
 * show ticket=>9
 * show ticket=>10
 * show ticket=>11
 * show ticket=>12
 * show ticket=>13
 * show ticket=>14
 * show ticket=>15
 * show ticket=>16
 * show ticket=>17
 * show ticket=>18
 * show ticket=>19
 * show ticket=>20
 * 
 * 
 * THIS TYPE OF WORKING WE DONT WANT BECAUSE IF TICKET 1000 THOUSAND RAHA TO
 * PEHLA ALL TICKET
 * CUT HOGA THEN SHOW HOGA BUT THE WRIGHT PROCESS IS TICKET CUT HO OR SHOW HONA
 * CHAHIYA
 */

// ...EX-3...........CUT TICKET SHOW TICKET USING Thread...................
// class A extends Thread
// {
// String s;
// A (String s)
// {
// this.s=s;
// }
// public void run()
// {
// for(int i=1;i<=20;i++)
// {
// System.out.println(s+"=>"+i);
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// A a1=new A("cut ticket");
// A a2=new A("show ticket");
// a1.start();
// a2.start();
// }
// }
/*
 * output
 * show ticket=>1
 * cut ticket=>1
 * show ticket=>2
 * cut ticket=>2
 * show ticket=>3
 * cut ticket=>3
 * cut ticket=>4
 * show ticket=>4
 * show ticket=>5
 * cut ticket=>5
 * cut ticket=>6
 * show ticket=>6
 * show ticket=>7
 * cut ticket=>7
 * show ticket=>8
 * cut ticket=>8
 * show ticket=>9
 * cut ticket=>9
 * show ticket=>10
 * cut ticket=>10
 * cut ticket=>11
 * show ticket=>11
 * cut ticket=>12
 * show ticket=>12
 * cut ticket=>13
 * show ticket=>13
 * show ticket=>14
 * cut ticket=>14
 * cut ticket=>15
 * show ticket=>15
 * cut ticket=>16
 * show ticket=>16
 * show ticket=>17
 * cut ticket=>17
 * show ticket=>18
 * cut ticket=>18
 * show ticket=>19
 * cut ticket=>19
 * cut ticket=>20
 * show ticket=>20
 * note= this example is not wright because ticket cut hona pehla hee show ho
 * rahi ha
 */
// ...EX-4...........cut ticket and show ticket...................
// class A extends Thread
// {
// String s;
// A (String s)
// {
// this.s=s;
// }
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println(s+"=>"+i);
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// A a1=new A("cut ticket");
// A a2=new A("show ticket");
// a1.start();
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// a2.start();
// }
// }

/*
 * output
 * 
 * cut ticket=>1
 * cut ticket=>2
 * show ticket=>1
 * cut ticket=>3
 * show ticket=>2
 * show ticket=>3
 * cut ticket=>4
 * show ticket=>4
 * cut ticket=>5
 * cut ticket=>6
 * show ticket=>5
 * show ticket=>6
 * cut ticket=>7
 * cut ticket=>8
 * show ticket=>7
 * cut ticket=>9
 * show ticket=>8
 * show ticket=>9
 * cut ticket=>10
 * show ticket=>10
 * note = not proper output because ticket cut too ho rha ha but show late ho
 * raha ha or mix bhi aa rha ha
 * 
 */
// ...EX-5..........cut ticket show ticket example with
// join()....................
// class A extends Thread
// {
// String s;
// A (String s)
// {
// this.s=s;
// }
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println(s+"=>"+i);
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// A a1=new A("cut ticket");
// A a2=new A("show ticket");
// a1.start();
// try{a1.join();}catch(Exception e){}
//
// a2.start();
// }
// }
/*
 * output=
 * join ka karan pehla a1 thread execute hogin then a2 thread execute hogi
 * cut ticket=>1
 * cut ticket=>2
 * cut ticket=>3
 * cut ticket=>4
 * cut ticket=>5
 * cut ticket=>6
 * cut ticket=>7
 * cut ticket=>8
 * cut ticket=>9
 * cut ticket=>10
 * show ticket=>1
 * show ticket=>2
 * show ticket=>3
 * show ticket=>4
 * show ticket=>5
 * show ticket=>6
 * show ticket=>7
 * show ticket=>8
 * show ticket=>9
 * show ticket=>10
 */

// ...EX-6........cut ticket show ticket and use of join after start both
// thread......................
// class A extends Thread
// {
// String s;
// A (String s)
// {
// this.s=s;
// }
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println(s+"=>"+i);
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// A a1=new A("cut ticket");
// A a2=new A("show ticket");
// a1.start();
//
// a2.start();
// try{Thread.sleep(100);} catch(Exception e){}
// }
// }
/*
 * output=
 * cut ticket=>1
 * show ticket=>1
 * show ticket=>2
 * cut ticket=>2
 * cut ticket=>3
 * show ticket=>3
 * cut ticket=>4
 * show ticket=>4
 * cut ticket=>5
 * show ticket=>5
 * show ticket=>6
 * cut ticket=>6
 * show ticket=>7
 * cut ticket=>7
 * show ticket=>8
 * cut ticket=>8
 * show ticket=>9
 * cut ticket=>9
 * cut ticket=>10
 * show ticket=>10
 * 
 * note= output abhi bhi proper nahi aa raha ha mix ya aga picha aa raha ha
 */

// ...EX-7..............................
// class A extends Thread
// {
// String s;
// A (String s)
// {
// this.s=s;
// }
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println(s+"=>"+i);
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// A a1=new A("cut ticket");
// A a2=new A("show ticket");
// a1.start();
// a2.start();
// System.out.println(a1.isAlive());//thread execute ho rahi ha too true other
// wise thread complete execute ho gai to false retun kera ga isAlive method
// System.out.println(a2.isAlive());
// }
// }
/*
 * output= out mix ana ka sath true ,true or false ,false or true ,false
 * or false true kuch bhi a sakta ha not fix answer
 * 
 */

// ...EX-8............after join used isAlive() method..................
// class A extends Thread
// {
// String s;
// A (String s)
// {
// this.s=s;
// }
// public void run()
// {
// for(int i=1;i<=10;i++)
// {
// System.out.println(s+"=>"+i);
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// A a1=new A("cut ticket");
// A a2=new A("show ticket");
// a1.start();
// a2.start();
// try{
// a1.join();
// }
// catch(Exception e){}
// System.out.println(a1.isAlive());
// System.out.println(a2.isAlive());
// }
// }
/*
 * output=
 * out put mix ayga a1 ka liya fix false hee ayga or a2 ka liya true false kuch
 * bhi aa sakta ha
 */

// ...EX-9..............................
// class A extends Thread
// {
// String s;int n;
// A (String s,int n)
// {
// this.s=s;
// this.n=n;
// }
// public void run()
// {
// for(int i=1;i<=n;i++)
// {
// System.out.println(s+"=>"+i);
// try{
// Thread.sleep(100);
// }
// catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// A a1=new A("cut ticket",10);
// A a2=new A("show ticket",100);
// a1.start();
// try{
// a1.join();
// }
// catch(Exception e){}
// a2.start();
// System.out.println(a1.isAlive());
// System.out.println(a2.isAlive());
// }
// }
/*
 * output=
 * out put same hee ayga above example jasa bus loop n ka acording he chala ga
 */

// ...EX-10..........used join() method for two thread....................
// class A extends Thread
// {
// String s;int n;
// A(String s,int n)
//
// {
// this.s=s;this.n=n;
// }
// public void run()
// {
// for(int i=1;i<=n;i++)System.out.println(s+"=>"+i);
// }
// }
// class MultiThreading
// {
// public static void main(String s[])
// {
// A a1=new A("aaa",10);
// A a2=new A("bbb",100);
// a1.start();
// a2.start();
// try{a1.join();a2.join();}catch(Exception e){}
// System.out.println("a1="+a1.isAlive());
// System.out.println("a2="+a2.isAlive());
//
// }
// }
/*
 * output
 * 
 * note= thoda sa mix ayga then a1 or a2 ka liya seprate output ayga
 * then thono ka liya false false fix ayga
 */
// ...EX-11..............................
// class A extends Thread
// {
// String s;int n;
// A(String s,int n)
//
// {
// this.s=s;this.n=n;
// }
// public void run()
// {
// for(int i=1;i<=n;i++)System.out.println(s+"=>"+i);
// }
// }
// class MultiThreading
// {
// public static void main(String s[])
// {
// A a1=new A("aaa",10);
// A a2=new A("bbb",20);
// A a3=new A("ccc",100);
// a1.start();
// a2.start();
// a3.start();
// try{a1.join();a2.join();}catch(Exception e){}
// System.out.println("a1="+a1.isAlive());
// System.out.println("a2="+a2.isAlive());
// System.out.println("a3="+a3.isAlive());
//
// }
// }
/*
 * output
 * aaa=>1
 * aaa=>2
 * aaa=>3
 * aaa=>4
 * ccc=>1
 * ccc=>2
 * ccc=>3
 * ccc=>4
 * ccc=>5
 * ccc=>6
 * ccc=>7
 * ccc=>8
 * bbb=>1
 * bbb=>2
 * bbb=>3
 * bbb=>4
 * bbb=>5
 * bbb=>6
 * ccc=>9
 * ccc=>10
 * ccc=>11
 * aaa=>5
 * aaa=>6
 * aaa=>7
 * aaa=>8
 * ccc=>12
 * ccc=>13
 * ccc=>14
 * bbb=>7
 * bbb=>8
 * bbb=>9
 * bbb=>10
 * bbb=>11
 * bbb=>12
 * bbb=>13
 * bbb=>14
 * ccc=>15
 * ccc=>16
 * aaa=>9
 * aaa=>10
 * ccc=>17
 * bbb=>15
 * bbb=>16
 * bbb=>17
 * bbb=>18
 * bbb=>19
 * bbb=>20
 * ccc=>18
 * ccc=>19
 * a1=false
 * ccc=>20
 * ccc=>21
 * ccc=>22
 * ccc=>23
 * ccc=>24
 * ccc=>25
 * a2=false
 * ccc=>26
 * a3=true
 * ccc=>27
 * ccc=>28
 * ccc=>29
 * ccc=>30
 * ccc=>31
 * ccc=>32
 * ccc=>33
 * ccc=>34
 * ccc=>35
 * ccc=>36
 * ccc=>37
 * ccc=>38
 * ccc=>39
 * ccc=>40
 * ccc=>41
 * ccc=>42
 * ccc=>43
 * ccc=>44
 * ccc=>45
 * ccc=>46
 * ccc=>47
 * ccc=>48
 * ccc=>49
 * ccc=>50
 * ccc=>51
 * ccc=>52
 * ccc=>53
 * ccc=>54
 * ccc=>55
 * ccc=>56
 * ccc=>57
 * ccc=>58
 * ccc=>59
 * ccc=>60
 * ccc=>61
 * ccc=>62
 * ccc=>63
 * ccc=>64
 * ccc=>65
 * ccc=>66
 * ccc=>67
 * ccc=>68
 * ccc=>69
 * ccc=>70
 * ccc=>71
 * ccc=>72
 * ccc=>73
 * ccc=>74
 * ccc=>75
 * ccc=>76
 * ccc=>77
 * ccc=>78
 * ccc=>79
 * ccc=>80
 * ccc=>81
 * ccc=>82
 * ccc=>83
 * ccc=>84
 * ccc=>85
 * ccc=>86
 * ccc=>87
 * ccc=>88
 * ccc=>89
 * ccc=>90
 * ccc=>91
 * ccc=>92
 * ccc=>93
 * ccc=>94
 * ccc=>95
 * ccc=>96
 * ccc=>97
 * ccc=>98
 * ccc=>99
 * ccc=>100
 * note == a3 ka liya true false kuch bhi aa sakta ha
 */

// ...EX-12...........currentThread() method...................
// class MultiThreading extends Thread
// {
// public void run()
// {
// System.out.println(Thread.currentThread());
// }
// static public void main(String ...a)
// {
// MultiThreading m1=new MultiThreading();
// MultiThreading m2=new MultiThreading();
// m1.start();
// m2.start();
//
// System.out.println(Thread.currentThread());
// }
// }
/*
 * output=>
 * Thread[main,5,main]
 * Thread[Thread-0,5,main]
 * Thread[Thread-1,5,main]
 */
// ...EX-13..........currenThread() method....................
// class A extends Thread
// {
// String s;int n;
// A(String s,int n)
//
// {
// this.s=s;this.n=n;
// }
// public void run()
// {
//
// }
// }
// class MultiThreading
// {
// public static void main(String s[])
// {
// A a1=new A("aaa",10);
// A a2=new A("bbb",100);
// a1.start();
// a2.start();
// System.out.println(a1.currentThread());
// System.out.println(a2.currentThread());
// System.out.println(a1);
// System.out.println(a2);
// //System.out.println("a2="+a2.isAlive());
//
// }
// }
/*
 * output=>
 * Thread[main,5,main]
 * Thread[main,5,main]
 * Thread[Thread-0,5,]
 * Thread[Thread-1,5,]
 */
// ...EX-14..........what happen if we stop thread before
// start()....................
// class A extends Thread
// {
// String s;int n;
// A(String s,int n)
//
// {
// this.s=s;this.n=n;
// }
// public void run()
// {
// System.out.println("Thread "+ s +" running");
// }
// }
// class MultiThreading
// {
// public static void main(String s[])
// {
// A a1=new A("aaa",10);
// A a2=new A("bbb",100);
// a1.stop();
// a1.start();
// a2.start();
//
// //System.out.println("a2="+a2.isAlive());
//
// }
// }
/*
 * output
 * Thread bbb running
 * 
 */
// ...EX-15...........getName() method...................
//
// class MultiThreading
// {
// public static void main(String s[])
// {
// System.out.println(Thread.currentThread().getName());
//
// }
// }
/*
 * output
 * 
 * main
 */
// ...EX-16........setName() method......................
//
// class MultiThreading
// {
// public static void main(String s[])
// {
// System.out.println(Thread.currentThread());
// System.out.println("default name=>"+Thread.currentThread().getName());
// Thread.currentThread().setName("sachin");
// System.out.println(Thread.currentThread());
// System.out.println("user defined name=>"+Thread.currentThread().getName());
//
// }
// }

/*
 * output
 * Thread[main,5,main]
 * default name=>main
 * Thread[sachin,5,main]
 * user defined name=>sachin
 */
// ...EX-17............getPriority() method and setPriority()
// method..................
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// System.out.println(Thread.currentThread());
// System.out.println(Thread.currentThread().getPriority());
// Thread.currentThread().setPriority(10);
// System.out.println(Thread.currentThread());
// }
// }

/*
 * output
 * Thread[main,5,main]
 * 5
 * Thread[main,10,main]
 */
// ...EX-18....if we try to setPriority() more then 10..........................
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// System.out.println(Thread.currentThread());
// System.out.println(Thread.currentThread().getPriority());
// Thread.currentThread().setName("ram");
// Thread.currentThread().setPriority(15);
// System.out.println(Thread.currentThread());
// }
// }
/*
 * output
 * Thread[main,5,main]
 * 5
 * Exception in thread "ram" java.lang.IllegalArgumentException
 * at java.lang.Thread.setPriority(Thread.java:1094)
 * at MultiThreading.main(MultiThreading.java:2605)
 */
// ...EX-19...........if setPriority() less then 1 ...................
// class MultiThreading
// {
// public static void main(String ...ar)
// {
// System.out.println(Thread.currentThread());
// System.out.println(Thread.currentThread().getPriority());
// Thread.currentThread().setName("sita");
// Thread.currentThread().setPriority(0);
// System.out.println(Thread.currentThread());
// }
// }

/*
 * output
 * Thread[main,5,main]
 * 5
 * Exception in thread "sita" java.lang.IllegalArgumentException
 * at java.lang.Thread.setPriority(Thread.java:1094)
 * at MultiThreading.main(MultiThreading.java:2624)
 */
// ...EX-20.........priority constant for thread.....................
// class MultiThreading
// {
// public static void main(String ar[])
// {
// System.out.println(Thread.MIN_PRIORITY);
// System.out.println(Thread.NORM_PRIORITY);
// System.out.println(Thread.MAX_PRIORITY);
// }
// }

/*
 * OUTPUT
 * 1
 * 5
 * 10
 */
// ...EX-21.........program for to know user defined thread
// name.....................
// class MultiThreading extends Thread
// {
// public void run()
// {
// System.out.println(Thread.currentThread());
//
// }
// public static void main(String ar[])
// {
// MultiThreading m1=new MultiThreading();
// MultiThreading m2=new MultiThreading();
// m1.start();
// m2.start();
// System.out.println(Thread.currentThread());
// }
// }
/*
 * OUTPUT kisi bhi order ma aa sakta ha
 * Thread[main,5,main]
 * Thread[Thread-1,5,main]
 * Thread[Thread-0,5,main]
 */
// ...EX-22.........program for to know user defined thread name and change its
// name.....................
// class MultiThreading extends Thread
// {
// public void run()
// {
// System.out.println(Thread.currentThread());
//
// }
// public static void main(String ar[])
// {
// MultiThreading m1=new MultiThreading();
// MultiThreading m2=new MultiThreading();
// m1.start();
// m2.start();
// m1.setName("aaa");
// m2.setName("bbb");
// System.out.println(Thread.currentThread());
// }
// }
/*
 * output kisi bhi order ma aa sakta ha
 * Thread[main,5,main]
 * Thread[bbb,5,main]
 * Thread[aaa,5,main]
 */
// ...EX-23.........example that prove that Thread class overide toString()
// method.....................

// class A extends Thread
// {
// public void run()
// {
// System.out.println(Thread.currentThread());
//
// }}
// class MultiThreading{
// public static void main(String ar[])
// {
// A a1 =new A();
// A a2= new A();
// a1.start();
// a2.start();
//// try{Thread.sleep(100);}catch(Exception e){}
// a1.setName("aaa");
// a2.setName("bbb");
// System.out.println(a1);
// System.out.println(a2);
// }
// }

/*
 * output
 * Thread[aaa,5,main]
 * Thread[bbb,5,main]
 * Thread[aaa,5,main]
 * Thread[bbb,5,main]
 * 
 * 
 * if we use sleep
 * Thread[Thread-0,5,main]
 * Thread[Thread-1,5,main]
 * Thread[aaa,5,]
 * Thread[bbb,5,]
 * 
 */
// ...EX-24.........example that prove that Thread class overide toString()
// method.....................
// class A extends Thread
// {
// public void run(){}
// }
// class MultiThreading{
// public static void main(String ar[])
// {
// A a1 =new A();
// A a2= new A();
//
// System.out.println(a1.currentThread());
// System.out.println(a2.currentThread());
// }
// }
/*
 * Thread[main,5,main]
 * Thread[main,5,main]
 */
// ...EX-25.........example that prove that Thread class overide toString()
// method.....................
// class A extends Thread
// {
// public void run(){}
// }
// class MultiThreading{
// public static void main(String ar[])
// {
// A a1 =new A();
// A a2= new A();
// a1.start();
// a2.start();
//// try{Thread.sleep(100);}catch(Exception e){}//same output
// System.out.println(a1.currentThread());
// System.out.println(a2.currentThread());
// }
// }
// output same as previous
// ...EX-26.........example that prove that Thread class overide toString()
// method.....................
// class A extends Thread
// {
// public void run(){}
// }
// class MultiThreading{
// public static void main(String ar[])
// {
// A a1 =new A();
// A a2= new A();
// a1.start();
// a2.start();
// System.out.println(a1);
// System.out.println(a2);
// }
// }

/*
 * output
 * Thread[Thread-0,5,main]
 * Thread[Thread-1,5,]
 */

// ...EX-27.........example that prove that Thread class overide toString()
// method.....................
// class A extends Thread
// {
//
// }
// class MultiThreading{
// public static void main(String ar[])
// {
// A a1 =new A();
// A a2= new A();
// a1.start();
// a2.start();
// System.out.println(a1);
// System.out.println(a2);
// }
// }
// output
// Thread[Thread-0,5,main]
// Thread[Thread-1,5,]

// ...EX-28.........example that prove that Thread class overide toString()
// method.....................
// class A extends Thread
// {
//
// }
// class MultiThreading{
// public static void main(String ar[])
// {
// A a1 =new A();
// A a2= new A();
// System.out.println(a1);
// System.out.println(a2);
// }
// }

/*
 * output
 * Thread[Thread-0,5,main]
 * Thread[Thread-1,5,main]
 */

// ...EX-29.........object create kerna sa Thread create hota ha ya start method
// co call kerna sa .....................
// class A extends Thread
// {
// public void run()
// {
// System.out.println(Thread.currentThread());
// }
// }
// class MultiThreading{
// public static void main(String ar[])
// {
// A a1 =new A();
// A a2= new A();
// A a3= new A();
// a2.start();
// a3.start();
// }
// }
/*
 * output
 * Thread[Thread-2,5,main]
 * Thread[Thread-1,5,main]
 * 
 * same priority ka karan random output ayga
 */

// ...EX-30.........program for setPriority .....................
// class A extends Thread
// {
// public void run()
// {
// for(int i=1;i<=100;i++)
// {
//
// System.out.println(Thread.currentThread()+"=>"+i);
// }
// }
// }
// class MultiThreading{
// public static void main(String ar[])
// {
// A a1 =new A();
// A a2= new A();
//
// a1.start();
// a2.start();
// a1.setName("aaa");
// a2.setName("bbb");
// a1.setPriority(1);
// a2.setPriority(10);
// }}

/*
 * output mix aa rha ha humari set ki priority work nahi ker rahi ha
 * iska liya huma patch file download kerni hogi
 */

// ...EX-31.........example for join fix time .....................
// class A extends Thread
// {
// String s;
// A (String s)
// {
// this.s=s;
// }
// public void run()
// {
// for(int i=1;i<=100;i++)
// {
//
// System.out.println(s+"=>"+i);
// }
// }
// }
// class MultiThreading{
// public static void main(String ar[]) throws InterruptedException
// {
// A a1 =new A("aaa");
// A a2= new A("bbb");
//
// a1.start();
// a2.start();
// a1.join(100);
// System.out.println(a1.isAlive());
// System.out.println(a2.isAlive());
//
// }}
// *****************************************************************
// *********************Day-4 Date 18-05-25*************************
// *****************************************************************
// ....Example-1...............................................
// ....Example-2...............................................
// ....Example-3...............................................
// ....Example-4...............................................
// ....Example-5...............................................
// ....Example-6...............................................
// ....Example-7...............................................
// class A implements Runnable
// {
// int c=0;
// public synchronized void run()
// {
// for(int i=1;i<=500000;i++)
// {
// c++;
//
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[]) throws InterruptedException
// {
// A a1=new A();
// Thread t1=new Thread(a1);
// Thread t2=new Thread(a1);
// t1.start();
// t2.start();
// Thread.sleep(10000);
// System.out.println("t1=>"+a1.c);
// System.out.println("t2=>"+a1.c);
// }
// }
// output
// t1=>1000000
// t2=>1000000
// ....Example-8...............................................
// class A implements Runnable
// {
// int c=0;
// public synchronized void run()
// {
// for(int i=1;i<=100000;i++)
// {c++;
// System.out.println(Thread.currentThread().getName()+" => "+c);
//
//
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[]) throws InterruptedException
// {
// A a1=new A();
// Thread t1=new Thread(a1);
// Thread t2=new Thread(a1);
// t1.start();
// t2.start();
// // Thread.sleep(10000);
// System.out.println("t1=>"+a1.c);
// System.out.println("t2=>"+a1.c);
// }
// }

// ....Example-9...............................................
// class A implements Runnable
// {
// int c=0;
// public synchronized void run()
// {
// for(int i=1;i<=50;i++)
// {
// System.out.println(Thread.currentThread().getName()+" => "+(++c));
//
// try{Thread.sleep(100);}catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[])
// {
// A a1=new A();
// Thread t1=new Thread(a1);
// Thread t2=new Thread(a1);
// t1.start();
// t2.start();
//
// System.out.println("t1=>"+a1.c);
// System.out.println("t2=>"+a1.c);
// }
// }
//
// ....Example-10...............................................
// class A implements Runnable
// {
// int c=0;
// public synchronized void run()
// {
// for(int i=1;i<=50;i++)
// {
// System.out.println(Thread.currentThread().getName()+" => "+(++c));
//
// try{Thread.sleep(1000);}catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[]) throws InterruptedException
// {
// A a1=new A();
// Thread t1=new Thread(a1);
// Thread t2=new Thread(a1);
// t1.start();
// t2.start();
// t1.join();
// t2.join();
// System.out.println("t1=>"+a1.c);
// System.out.println("t2=>"+a1.c);
// }
// }
/*
 * output
 * Thread-1 => 1
 * Thread-1 => 2
 * Thread-1 => 3
 * Thread-1 => 4
 * Thread-1 => 5
 * Thread-1 => 6
 * Thread-1 => 7
 * Thread-1 => 8
 * Thread-1 => 9
 * Thread-1 => 10
 * Thread-1 => 11
 * Thread-1 => 12
 * Thread-1 => 13
 * Thread-1 => 14
 * Thread-1 => 15
 * Thread-1 => 16
 * Thread-1 => 17
 * Thread-1 => 18
 * Thread-1 => 19
 * Thread-1 => 20
 * Thread-1 => 21
 * Thread-1 => 22
 * Thread-1 => 23
 * Thread-1 => 24
 * Thread-1 => 25
 * Thread-1 => 26
 * Thread-1 => 27
 * Thread-1 => 28
 * Thread-1 => 29
 * Thread-1 => 30
 * Thread-1 => 31
 * Thread-1 => 32
 * Thread-1 => 33
 * Thread-1 => 34
 * Thread-1 => 35
 * Thread-1 => 36
 * Thread-1 => 37
 * Thread-1 => 38
 * Thread-1 => 39
 * Thread-1 => 40
 * Thread-1 => 41
 * Thread-1 => 42
 * Thread-1 => 43
 * Thread-1 => 44
 * Thread-1 => 45
 * Thread-1 => 46
 * Thread-1 => 47
 * Thread-1 => 48
 * Thread-1 => 49
 * Thread-1 => 50
 * Thread-0 => 51
 * Thread-0 => 52
 * Thread-0 => 53
 * Thread-0 => 54
 * Thread-0 => 55
 * Thread-0 => 56
 * Thread-0 => 57
 * Thread-0 => 58
 * Thread-0 => 59
 * Thread-0 => 60
 * Thread-0 => 61
 * Thread-0 => 62
 * Thread-0 => 63
 * Thread-0 => 64
 * Thread-0 => 65
 * Thread-0 => 66
 * Thread-0 => 67
 * Thread-0 => 68
 * Thread-0 => 69
 * Thread-0 => 70
 * Thread-0 => 71
 * Thread-0 => 72
 * Thread-0 => 73
 * Thread-0 => 74
 * Thread-0 => 75
 * Thread-0 => 76
 * Thread-0 => 77
 * Thread-0 => 78
 * Thread-0 => 79
 * Thread-0 => 80
 * Thread-0 => 81
 * Thread-0 => 82
 * Thread-0 => 83
 * Thread-0 => 84
 * Thread-0 => 85
 * Thread-0 => 86
 * Thread-0 => 87
 * Thread-0 => 88
 * Thread-0 => 89
 * Thread-0 => 90
 * Thread-0 => 91
 * Thread-0 => 92
 * Thread-0 => 93
 * Thread-0 => 94
 * Thread-0 => 95
 * Thread-0 => 96
 * Thread-0 => 97
 * Thread-0 => 98
 * Thread-0 => 99
 * Thread-0 => 100
 * t1=>100
 * t2=>100
 */
// ....Example-11...............Third constructor of Thread
// class................................
// class A implements Runnable
// {
// int c=0;
// public synchronized void run()
// {
// for(int i=1;i<=50;i++)
// {
// System.out.println(Thread.currentThread().getName()+" => "+(++c));
//
// try{Thread.sleep(10);}catch(Exception e){}
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[]) throws InterruptedException
// {
// A a1=new A();
// Thread t1=new Thread(a1,"A");
// Thread t2=new Thread(a1,"B");
// t1.start();
// t2.start();
// t1.join();
// t2.join();
// System.out.println("t1=>"+a1.c);
// System.out.println("t2=>"+a1.c);
// }
// }
/*
 * output
 * 
 * D:\Mr.Sachin's data\GitDemo\My_Practice\JavaPractice\MultiThreading>java
 * MultiThreading
 * A => 1
 * A => 2
 * A => 3
 * A => 4
 * A => 5
 * A => 6
 * A => 7
 * A => 8
 * A => 9
 * A => 10
 * A => 11
 * A => 12
 * A => 13
 * A => 14
 * A => 15
 * A => 16
 * A => 17
 * A => 18
 * A => 19
 * A => 20
 * A => 21
 * A => 22
 * A => 23
 * A => 24
 * A => 25
 * A => 26
 * A => 27
 * A => 28
 * A => 29
 * A => 30
 * A => 31
 * A => 32
 * A => 33
 * A => 34
 * A => 35
 * A => 36
 * A => 37
 * A => 38
 * A => 39
 * A => 40
 * A => 41
 * A => 42
 * A => 43
 * A => 44
 * A => 45
 * A => 46
 * A => 47
 * A => 48
 * A => 49
 * A => 50
 * B => 51
 * B => 52
 * B => 53
 * B => 54
 * B => 55
 * B => 56
 * B => 57
 * B => 58
 * B => 59
 * B => 60
 * B => 61
 * B => 62
 * B => 63
 * B => 64
 * B => 65
 * B => 66
 * B => 67
 * B => 68
 * B => 69
 * B => 70
 * B => 71
 * B => 72
 * B => 73
 * B => 74
 * B => 75
 * B => 76
 * B => 77
 * B => 78
 * B => 79
 * B => 80
 * B => 81
 * B => 82
 * B => 83
 * B => 84
 * B => 85
 * B => 86
 * B => 87
 * B => 88
 * B => 89
 * B => 90
 * B => 91
 * B => 92
 * B => 93
 * B => 94
 * B => 95
 * B => 96
 * B => 97
 * B => 98
 * B => 99
 * B => 100
 * t1=>100
 * t2=>100
 * 
 * above ya below dono ma sa kuch bhi aa sakta hai
 * B => 1
 * B => 2
 * B => 3
 * B => 4
 * B => 5
 * B => 6
 * B => 7
 * B => 8
 * B => 9
 * B => 10
 * B => 11
 * B => 12
 * B => 13
 * B => 14
 * B => 15
 * B => 16
 * B => 17
 * B => 18
 * B => 19
 * B => 20
 * B => 21
 * B => 22
 * B => 23
 * B => 24
 * B => 25
 * B => 26
 * B => 27
 * B => 28
 * B => 29
 * B => 30
 * B => 31
 * B => 32
 * B => 33
 * B => 34
 * B => 35
 * B => 36
 * B => 37
 * B => 38
 * B => 39
 * B => 40
 * B => 41
 * B => 42
 * B => 43
 * B => 44
 * B => 45
 * B => 46
 * B => 47
 * B => 48
 * B => 49
 * B => 50
 * A => 51
 * A => 52
 * A => 53
 * A => 54
 * A => 55
 * A => 56
 * A => 57
 * A => 58
 * A => 59
 * A => 60
 * A => 61
 * A => 62
 * A => 63
 * A => 64
 * A => 65
 * A => 66
 * A => 67
 * A => 68
 * A => 69
 * A => 70
 * A => 71
 * A => 72
 * A => 73
 * A => 74
 * A => 75
 * A => 76
 * A => 77
 * A => 78
 * A => 79
 * A => 80
 * A => 81
 * A => 82
 * A => 83
 * A => 84
 * A => 85
 * A => 86
 * A => 87
 * A => 88
 * A => 89
 * A => 90
 * A => 91
 * A => 92
 * A => 93
 * A => 94
 * A => 95
 * A => 96
 * A => 97
 * A => 98
 * A => 99
 * A => 100
 * t1=>100
 * t2=>100
 * 
 */

// ....Example-12...........Abobve example without synchronized
// method...................................
// class A implements Runnable
// {
// int c=0;
// public void run()
// {
// for(int i=1;i<=500;i++)
// {
// System.out.println(Thread.currentThread().getName()+" => "+(++c));
//
//
// }
// }
// }
// class MultiThreading
// {
// public static void main(String ar[]) throws InterruptedException
// {
// A a1=new A();
// Thread t1=new Thread(a1,"A");
// Thread t2=new Thread(a1,"B");
// t1.start();
// t2.start();
// t1.join();
// t2.join();
// System.out.println("t1=>"+a1.c);
// System.out.println("t2=>"+a1.c);
// }
// }
/*
 * output
 * A => 1
 * B => 2
 * A => 3
 * A => 5
 * A => 6
 * B => 4
 * B => 8
 * A => 7
 * B => 9
 * A => 10
 * B => 11
 * A => 12
 * B => 13
 * B => 15
 * A => 14
 * B => 16
 * A => 17
 * B => 18
 * A => 19
 * B => 20
 * A => 21
 * B => 22
 * A => 23
 * B => 24
 * B => 26
 * A => 25
 * B => 27
 * B => 29
 * A => 28
 * B => 30
 * A => 31
 * A => 33
 * B => 32
 * A => 34
 * B => 35
 * A => 36
 * B => 37
 * A => 38
 * B => 39
 * B => 41
 * A => 40
 * B => 42
 * A => 43
 * B => 44
 * A => 45
 * B => 46
 * A => 47
 * B => 48
 * B => 50
 * A => 49
 * B => 51
 * A => 52
 * A => 54
 * B => 53
 * A => 55
 * B => 56
 * A => 57
 * B => 58
 * A => 59
 * A => 61
 * B => 60
 * A => 62
 * B => 63
 * A => 64
 * A => 66
 * B => 65
 * A => 67
 * B => 68
 * A => 69
 * B => 70
 * A => 71
 * B => 72
 * A => 73
 * B => 74
 * A => 75
 * B => 76
 * A => 77
 * B => 78
 * A => 79
 * A => 81
 * B => 80
 * A => 82
 * B => 83
 * A => 84
 * B => 85
 * B => 87
 * A => 86
 * B => 88
 * A => 89
 * B => 90
 * B => 92
 * A => 91
 * B => 93
 * B => 95
 * A => 94
 * B => 96
 * A => 97
 * B => 98
 * A => 99
 * B => 100
 * A => 101
 * B => 102
 * A => 103
 * B => 104
 * B => 106
 * A => 105
 * A => 108
 * B => 107
 * A => 109
 * B => 110
 * A => 111
 * A => 113
 * B => 112
 * A => 114
 * B => 115
 * A => 116
 * A => 118
 * A => 119
 * B => 117
 * A => 120
 * B => 121
 * A => 122
 * B => 123
 * A => 124
 * B => 125
 * A => 126
 * A => 128
 * A => 129
 * B => 127
 * A => 130
 * A => 132
 * B => 131
 * A => 133
 * B => 134
 * A => 135
 * B => 136
 * A => 137
 * B => 138
 * B => 140
 * A => 139
 * B => 141
 * A => 142
 * B => 143
 * A => 144
 * B => 145
 * B => 147
 * B => 148
 * A => 146
 * B => 149
 * A => 150
 * A => 152
 * A => 153
 * B => 151
 * A => 154
 * B => 155
 * A => 156
 * B => 157
 * B => 159
 * B => 160
 * A => 158
 * B => 161
 * A => 162
 * B => 163
 * A => 164
 * B => 165
 * A => 166
 * B => 167
 * A => 168
 * B => 169
 * A => 170
 * B => 171
 * A => 172
 * B => 173
 * A => 174
 * B => 175
 * A => 176
 * B => 177
 * A => 178
 * B => 179
 * A => 180
 * A => 182
 * B => 181
 * B => 184
 * B => 185
 * A => 183
 * B => 186
 * A => 187
 * B => 188
 * B => 190
 * B => 191
 * B => 192
 * A => 189
 * B => 193
 * B => 195
 * A => 194
 * A => 197
 * A => 198
 * B => 196
 * A => 199
 * B => 200
 * A => 201
 * A => 203
 * B => 202
 * B => 205
 * A => 204
 * A => 207
 * B => 206
 * B => 209
 * A => 208
 * B => 210
 * A => 211
 * B => 212
 * A => 213
 * B => 214
 * A => 215
 * A => 217
 * B => 216
 * A => 218
 * B => 219
 * A => 220
 * B => 221
 * B => 223
 * A => 222
 * B => 224
 * A => 225
 * B => 226
 * A => 227
 * B => 228
 * A => 229
 * A => 231
 * A => 232
 * A => 233
 * B => 230
 * A => 234
 * B => 235
 * A => 236
 * B => 237
 * A => 238
 * B => 239
 * A => 240
 * B => 241
 * A => 242
 * B => 243
 * A => 244
 * B => 245
 * A => 246
 * A => 248
 * B => 247
 * A => 249
 * B => 250
 * A => 251
 * B => 252
 * A => 253
 * B => 254
 * A => 255
 * A => 257
 * B => 256
 * A => 258
 * B => 259
 * A => 260
 * A => 262
 * A => 263
 * A => 264
 * A => 265
 * B => 261
 * A => 266
 * A => 268
 * B => 267
 * A => 269
 * A => 271
 * A => 272
 * B => 270
 * B => 274
 * A => 273
 * B => 275
 * A => 276
 * B => 277
 * B => 279
 * A => 278
 * B => 280
 * B => 282
 * A => 281
 * B => 283
 * A => 284
 * A => 286
 * A => 287
 * B => 285
 * A => 288
 * B => 289
 * B => 291
 * B => 292
 * A => 290
 * B => 293
 * A => 294
 * B => 295
 * A => 296
 * B => 297
 * A => 298
 * B => 299
 * A => 300
 * B => 301
 * A => 302
 * B => 303
 * A => 304
 * B => 305
 * A => 306
 * B => 307
 * B => 309
 * A => 308
 * B => 310
 * A => 311
 * B => 312
 * A => 313
 * A => 315
 * B => 314
 * B => 317
 * B => 318
 * A => 316
 * B => 319
 * A => 320
 * B => 321
 * B => 323
 * A => 322
 * B => 324
 * B => 326
 * A => 325
 * B => 327
 * A => 328
 * B => 329
 * A => 330
 * B => 331
 * B => 333
 * A => 332
 * B => 334
 * A => 335
 * A => 337
 * B => 336
 * A => 338
 * B => 339
 * B => 341
 * A => 340
 * B => 342
 * B => 344
 * B => 345
 * B => 346
 * B => 347
 * B => 348
 * B => 349
 * B => 350
 * A => 343
 * A => 352
 * B => 351
 * A => 353
 * A => 355
 * B => 354
 * A => 356
 * A => 358
 * A => 359
 * B => 357
 * A => 360
 * B => 361
 * A => 362
 * B => 363
 * A => 364
 * A => 366
 * A => 367
 * B => 365
 * A => 368
 * B => 369
 * A => 370
 * A => 372
 * A => 373
 * B => 371
 * A => 374
 * A => 376
 * B => 375
 * A => 377
 * B => 378
 * A => 379
 * A => 381
 * A => 382
 * B => 380
 * A => 383
 * A => 385
 * B => 384
 * B => 387
 * B => 388
 * A => 386
 * A => 390
 * B => 389
 * B => 392
 * A => 391
 * B => 393
 * A => 394
 * B => 395
 * A => 396
 * B => 397
 * A => 398
 * B => 399
 * A => 400
 * A => 402
 * B => 401
 * A => 403
 * B => 404
 * A => 405
 * B => 406
 * A => 407
 * B => 408
 * A => 409
 * B => 410
 * A => 411
 * B => 412
 * A => 413
 * B => 414
 * A => 415
 * B => 416
 * A => 417
 * B => 418
 * A => 419
 * B => 420
 * A => 421
 * B => 422
 * A => 423
 * A => 425
 * B => 424
 * B => 427
 * A => 426
 * A => 429
 * B => 428
 * A => 430
 * B => 431
 * B => 433
 * A => 432
 * B => 434
 * A => 435
 * A => 437
 * B => 436
 * A => 438
 * B => 439
 * A => 440
 * B => 441
 * B => 443
 * B => 444
 * A => 442
 * B => 445
 * A => 446
 * B => 447
 * A => 448
 * A => 450
 * B => 449
 * B => 452
 * A => 451
 * B => 453
 * A => 454
 * A => 456
 * B => 455
 * A => 457
 * A => 459
 * B => 458
 * A => 460
 * A => 462
 * B => 461
 * A => 463
 * B => 464
 * A => 465
 * B => 466
 * B => 468
 * B => 469
 * A => 467
 * A => 471
 * A => 472
 * A => 473
 * A => 474
 * A => 475
 * A => 476
 * B => 470
 * A => 477
 * B => 478
 * B => 480
 * A => 479
 * B => 481
 * A => 482
 * B => 483
 * B => 485
 * B => 486
 * A => 484
 * A => 488
 * A => 489
 * A => 490
 * B => 487
 * A => 491
 * B => 492
 * B => 494
 * A => 493
 * B => 495
 * B => 497
 * B => 498
 * A => 496
 * B => 499
 * A => 500
 * A => 502
 * B => 501
 * A => 503
 * B => 504
 * B => 506
 * B => 507
 * A => 505
 * B => 508
 * B => 510
 * B => 511
 * B => 512
 * B => 513
 * B => 514
 * B => 515
 * B => 516
 * B => 517
 * B => 518
 * B => 519
 * B => 520
 * A => 509
 * B => 521
 * B => 523
 * B => 524
 * B => 525
 * A => 522
 * A => 527
 * A => 528
 * A => 529
 * A => 530
 * B => 526
 * A => 531
 * B => 532
 * B => 534
 * A => 533
 * A => 536
 * B => 535
 * B => 538
 * A => 537
 * B => 539
 * B => 541
 * B => 542
 * A => 540
 * B => 543
 * B => 545
 * B => 546
 * B => 547
 * B => 548
 * A => 544
 * B => 549
 * B => 551
 * A => 550
 * B => 552
 * B => 554
 * B => 555
 * B => 556
 * B => 557
 * B => 558
 * B => 559
 * B => 560
 * B => 561
 * B => 562
 * B => 563
 * B => 564
 * B => 565
 * B => 566
 * B => 567
 * A => 553
 * B => 568
 * A => 569
 * A => 571
 * B => 570
 * A => 572
 * B => 573
 * A => 574
 * A => 576
 * A => 577
 * B => 575
 * A => 578
 * A => 580
 * B => 579
 * B => 582
 * B => 583
 * B => 584
 * A => 581
 * B => 585
 * A => 586
 * A => 588
 * A => 589
 * B => 587
 * A => 590
 * B => 591
 * A => 592
 * B => 593
 * B => 595
 * A => 594
 * B => 596
 * A => 597
 * B => 598
 * A => 599
 * A => 601
 * A => 602
 * B => 600
 * B => 604
 * B => 605
 * A => 603
 * A => 607
 * A => 608
 * A => 609
 * A => 610
 * A => 611
 * A => 612
 * A => 613
 * A => 614
 * A => 615
 * A => 616
 * A => 617
 * A => 618
 * B => 606
 * A => 619
 * A => 621
 * A => 622
 * B => 620
 * B => 624
 * B => 625
 * B => 626
 * A => 623
 * B => 627
 * B => 629
 * A => 628
 * A => 631
 * B => 630
 * B => 633
 * A => 632
 * B => 634
 * A => 635
 * A => 637
 * A => 638
 * A => 639
 * A => 640
 * A => 641
 * B => 636
 * B => 643
 * A => 642
 * B => 644
 * B => 646
 * B => 647
 * B => 648
 * B => 649
 * B => 650
 * B => 651
 * B => 652
 * B => 653
 * A => 645
 * B => 654
 * B => 656
 * B => 657
 * A => 655
 * A => 659
 * A => 660
 * B => 658
 * B => 662
 * B => 663
 * A => 661
 * A => 665
 * B => 664
 * A => 666
 * A => 668
 * B => 667
 * B => 670
 * A => 669
 * A => 672
 * A => 673
 * A => 674
 * B => 671
 * A => 675
 * A => 677
 * B => 676
 * A => 678
 * A => 680
 * A => 681
 * A => 682
 * B => 679
 * B => 684
 * A => 683
 * A => 686
 * A => 687
 * A => 688
 * A => 689
 * A => 690
 * A => 691
 * A => 692
 * A => 693
 * B => 685
 * B => 695
 * B => 696
 * A => 694
 * B => 697
 * B => 699
 * B => 700
 * B => 701
 * B => 702
 * B => 703
 * A => 698
 * B => 704
 * B => 706
 * A => 705
 * A => 708
 * A => 709
 * A => 710
 * A => 711
 * A => 712
 * A => 713
 * A => 714
 * B => 707
 * A => 715
 * A => 717
 * B => 716
 * A => 718
 * A => 720
 * A => 721
 * A => 722
 * B => 719
 * A => 723
 * A => 725
 * B => 724
 * A => 726
 * B => 727
 * B => 729
 * B => 730
 * A => 728
 * A => 732
 * A => 733
 * A => 734
 * A => 735
 * A => 736
 * A => 737
 * A => 738
 * A => 739
 * A => 740
 * B => 731
 * A => 741
 * A => 743
 * B => 742
 * B => 745
 * B => 746
 * B => 747
 * B => 748
 * B => 749
 * A => 744
 * A => 751
 * B => 750
 * B => 753
 * B => 754
 * B => 755
 * A => 752
 * A => 757
 * B => 756
 * A => 758
 * A => 760
 * B => 759
 * B => 762
 * A => 761
 * A => 764
 * A => 765
 * B => 763
 * B => 767
 * B => 768
 * A => 766
 * A => 770
 * A => 771
 * B => 769
 * B => 773
 * B => 774
 * A => 772
 * A => 776
 * A => 777
 * A => 778
 * A => 779
 * A => 780
 * A => 781
 * A => 782
 * A => 783
 * B => 775
 * B => 785
 * B => 786
 * A => 784
 * A => 788
 * A => 789
 * A => 790
 * A => 791
 * B => 787
 * B => 793
 * B => 794
 * A => 792
 * B => 795
 * A => 796
 * B => 797
 * B => 799
 * A => 798
 * B => 800
 * A => 801
 * A => 803
 * B => 802
 * A => 804
 * B => 805
 * B => 807
 * B => 808
 * B => 809
 * A => 806
 * B => 810
 * A => 811
 * B => 812
 * A => 813
 * B => 814
 * A => 815
 * A => 817
 * A => 818
 * A => 819
 * A => 820
 * A => 821
 * A => 822
 * A => 823
 * A => 824
 * A => 825
 * A => 826
 * B => 816
 * A => 827
 * A => 829
 * B => 828
 * A => 830
 * A => 832
 * B => 831
 * A => 833
 * A => 835
 * B => 834
 * B => 837
 * A => 836
 * B => 838
 * B => 840
 * B => 841
 * B => 842
 * A => 839
 * A => 844
 * A => 845
 * B => 843
 * A => 846
 * A => 848
 * A => 849
 * A => 850
 * B => 847
 * B => 852
 * A => 851
 * B => 853
 * A => 854
 * A => 856
 * A => 857
 * B => 855
 * B => 859
 * B => 860
 * B => 861
 * B => 862
 * B => 863
 * B => 864
 * A => 858
 * A => 866
 * A => 867
 * A => 868
 * A => 869
 * B => 865
 * B => 871
 * B => 872
 * B => 873
 * B => 874
 * A => 870
 * B => 875
 * B => 877
 * A => 876
 * B => 878
 * B => 880
 * B => 881
 * A => 879
 * B => 882
 * B => 884
 * B => 885
 * B => 886
 * A => 883
 * A => 888
 * B => 887
 * B => 890
 * B => 891
 * B => 892
 * B => 893
 * B => 894
 * B => 895
 * B => 896
 * B => 897
 * B => 898
 * B => 899
 * B => 900
 * A => 889
 * A => 902
 * A => 903
 * A => 904
 * A => 905
 * B => 901
 * A => 906
 * B => 907
 * B => 909
 * B => 910
 * B => 911
 * B => 912
 * B => 913
 * A => 908
 * A => 915
 * A => 916
 * A => 917
 * A => 918
 * A => 919
 * A => 920
 * B => 914
 * A => 921
 * A => 923
 * B => 922
 * A => 924
 * A => 926
 * A => 927
 * B => 925
 * B => 929
 * B => 930
 * B => 931
 * A => 928
 * A => 933
 * B => 932
 * B => 935
 * B => 936
 * B => 937
 * B => 938
 * B => 939
 * B => 940
 * B => 941
 * B => 942
 * A => 934
 * B => 943
 * A => 944
 * A => 946
 * B => 945
 * B => 948
 * B => 949
 * B => 950
 * A => 947
 * A => 952
 * A => 953
 * A => 954
 * B => 951
 * B => 956
 * B => 957
 * B => 958
 * A => 955
 * A => 960
 * A => 961
 * A => 962
 * B => 959
 * B => 964
 * B => 965
 * B => 966
 * A => 963
 * B => 967
 * B => 969
 * B => 970
 * A => 968
 * B => 971
 * B => 973
 * A => 972
 * A => 975
 * B => 974
 * A => 976
 * A => 978
 * B => 977
 * B => 980
 * B => 981
 * B => 982
 * B => 983
 * B => 984
 * B => 985
 * B => 986
 * B => 987
 * B => 988
 * A => 979
 * A => 989
 * A => 990
 * A => 991
 * A => 992
 * A => 993
 * A => 994
 * A => 995
 * A => 996
 * A => 997
 * A => 998
 * A => 999
 * A => 1000
 * t1=>1000
 * t2=>1000
 */
// ....Example-13................without
// println()...............................
// class A implements Runnable
// {
// int c=0;
// public void run()
// {
// for(int i=1;i<=500;i++)
// {
// c++;}
// }
// }
// class MultiThreading
// {
// public static void main(String ar[]) throws InterruptedException
// {
// A a1=new A();
// Thread t1=new Thread(a1,"A");
// Thread t2=new Thread(a1,"B");
// t1.start();
// t2.start();
// t1.join();
// t2.join();
// System.out.println("t1=>"+a1.c);
// System.out.println("t2=>"+a1.c);
// }
// }
/*
 * output
 * t1=>1000
 * t2=>1000
 */
// ....Example-14...............using getCount()
// method................................
// class A implements Runnable
// {
// int c=0;
// public int getCount()
// {
// return ++c;
// }
// public void run()
// {
// for(int i=1;i<=500000;i++)
// {
// getCount();
// }
// }}
// class MultiThreading
// {
// public static void main(String ar[]) throws InterruptedException
// {
// A a1=new A();
// Thread t1=new Thread(a1,"A");
// Thread t2=new Thread(a1,"B");
// t1.start();
// t2.start();
// t1.join();
// t2.join();
// System.out.println("t1=>"+a1.c);
// System.out.println("t2=>"+a1.c);
// }
// }
/*
 * 
 * t1=>953291
 * t2=>953291
 * 
 * 
 */
// ....Example-15...............................................
// class A implements Runnable
// {
// int c=0;
// public synchronized int getCount()
// {
// return ++c;
// }
// public void run()
// {
// for(int i=1;i<=500000;i++)
// {
// getCount();
// }
// }}
// class MultiThreading
// {
// public static void main(String ar[]) throws InterruptedException
// {
// A a1=new A();
// Thread t1=new Thread(a1,"A");
// Thread t2=new Thread(a1,"B");
// t1.start();
// t2.start();
// t1.join();
// t2.join();
// System.out.println("t1=>"+a1.c);
// System.out.println("t2=>"+a1.c);
// }
// }

/*
 * output=
 * t1=>1000000
 * t2=>1000000
 */
//// ....Example-16...............................................
// class A implements Runnable
// class A implements Runnable
// class A implements Runnable
// {
// int c=0;
// public synchronized int getCount()
// {
// return ++c;
// }
// public void run()
// {
// for(int i=1;i<=50000;i++)
// {
// System.out.println(Thread.currentThread().getName()+" => "+getCount());
// }
// }}
// class MultiThreading
// {
// public static void main(String ar[]) throws InterruptedException
// {
// A a1=new A();
// Thread t1=new Thread(a1,"A");
// Thread t2=new Thread(a1,"B");
// t1.start();
// t2.start();
// t1.join();
// t2.join();
// System.out.println("t1=>"+a1.c);
// System.out.println("t2=>"+a1.c);
// }
// }

/*
 * output
 * 1 to 100000
 * t1=100000
 * t2=100000
 */
// ....Example-17.....Example for class level
// lock..........................................
// class A implements Runnable {
// static int c = 0;
//
// synchronized static int getCount() {
// return ++c;
//
// }
//
// public void run() {
// for (int i = 1; i <= 50000; i++) {
// getCount();
// }
// }
//
// }

// class MultiThreading {
// public static void main(String[] args) throws Exception {
//
// A a1 = new A();
//
// A a2 = new A();
// Thread t1 = new Thread(a1, "A");
// Thread t2 = new Thread(a2, "B");
//
// t1.start();
// t2.start();
// t1.join();
// t2.join();
// System.out.println("a1=" + a1.c);
// System.out.println("a2=" + a2.c);
// }
// }

/*
 * output
 * a1=100000
 * a2=100000
 */

// .......... Example 18 Graphics using Thread ....................
/*
 * import java.awt.*;
 * import javax.swing.*;
 * 
 * class FDemo extends Frame implements Runnable {
 * FDemo() {
 * Font f = new Font("Arial Black", Font.BOLD, 35);
 * setFont(f);
 * setVisible(true);
 * setBounds(200, 200, 800, 800);
 * }
 * 
 * public void run() {
 * 
 * }
 * 
 * public void paint(Graphics g) {
 * g.drawString("my name is ram", 200, 200);
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String... a) {
 * FDemo f = new FDemo();
 * // f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
 * }
 * }
 */

// .......... Example 19 now we wnat my name is ram should be
// moved....................
/*
 * import java.awt.*;
 * import javax.swing.*;
 * 
 * class FDemo extends Frame implements Runnable {
 * 
 * String s = " MY NAME IS SACHIN";
 * 
 * FDemo() {
 * Font f = new Font("Arial Black", Font.BOLD, 35);
 * setFont(f);
 * // Color c = new Color(36, 184, 149);
 * 
 * setVisible(true);
 * setBounds(200, 200, 800, 800);
 * }
 * 
 * public void run() {
 * for (;;) {
 * s = s.substring(1) + s.charAt(0);
 * repaint();
 * try {
 * Thread.sleep(200);
 * } catch (Exception e) {
 * }
 * }
 * }
 * 
 * public void paint(Graphics g) {
 * g.drawString(s, 200, 300);
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String... a) {
 * FDemo f = new FDemo();
 * Thread t = new Thread(f);
 * t.start();
 * // f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
 * }
 * }
 */

// ......Example 20 Create Above program in diffrent way
/*
 * import java.awt.*;
 * import javax.swing.*;
 * 
 * class FDemo extends Frame implements Runnable {
 * 
 * String s = " MY NAME IS SACHIN";
 * int x = 100, y = 300;
 * 
 * FDemo() {
 * Font f = new Font("Arial Black", Font.BOLD, 35);
 * setFont(f);
 * // Color c = new Color(36, 184, 149);
 * 
 * setVisible(true);
 * setBounds(200, 200, 800, 800);
 * }
 * 
 * public void run() {
 * for (;;) {
 * if (x == -200)
 * x = 500;
 * x -= 10;
 * try {
 * Thread.sleep(100);
 * } catch (Exception e) {
 * }
 * repaint();
 * }
 * }
 * 
 * public void paint(Graphics g) {
 * g.drawString(s, x, y);
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String... a) {
 * FDemo f = new FDemo();
 * Thread t = new Thread(f);
 * t.start();
 * // f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
 * }
 * }
 */

// ********NEW DAY **********
// .....EXAMPLE 01.......ticket example........
/*
 * class A implements Runnable {
 * int t = 1;
 * 
 * public void run() {
 * if (t >= 1)
 * t -= 1;
 * System.out.println("ticket Booked by" + Thread.currentThread().getName());
 * 
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String ar[]) {
 * A a1 = new A();
 * Thread t1 = new Thread(a1, "A");
 * Thread t2 = new Thread(a1, "B");
 * t1.start();
 * t2.start();
 * }
 * 
 * }
 */

// .....EXAMPLE 01.......ticket example........
/*
 * class A implements Runnable {
 * int t = 1;
 * 
 * public void run() {
 * if (t >= 1) {
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * t = t - 1;
 * 
 * System.out.println("ticket Booked by" + Thread.currentThread().getName());
 * 
 * }
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String ar[]) {
 * A a1 = new A();
 * Thread t1 = new Thread(a1, "A");
 * Thread t2 = new Thread(a1, "B");
 * Thread t3 = new Thread(a1, "C");
 * Thread t4 = new Thread(a1, "D");
 * Thread t5 = new Thread(a1, "E");
 * Thread t6 = new Thread(a1, "F");
 * Thread t7 = new Thread(a1, "G");
 * Thread t8 = new Thread(a1, "H");
 * Thread t9 = new Thread(a1, "I");
 * Thread t10 = new Thread(a1, "J");
 * t1.start();
 * t2.start();
 * t3.start();
 * t4.start();
 * t5.start();
 * t6.start();
 * t7.start();
 * t8.start();
 * t9.start();
 * t10.start();
 * }
 * 
 * }
 */

// ............ Example 02 .........ticket book ..................
/*
 * class A implements Runnable {
 * int i = 5;
 * 
 * public synchronized void run() {
 * if (i >= 1) {
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * System.out.print("");
 * i -= 1;
 * System.out.println("ticket Booked by => " +
 * Thread.currentThread().getName());
 * }
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String[] args) {
 * A a1 = new A();
 * Thread t1 = new Thread(a1, "A");
 * Thread t2 = new Thread(a1, "B");
 * Thread t3 = new Thread(a1, "C");
 * Thread t4 = new Thread(a1, "D");
 * Thread t5 = new Thread(a1, "E");
 * Thread t6 = new Thread(a1, "F");
 * Thread t7 = new Thread(a1, "G");
 * Thread t8 = new Thread(a1, "H");
 * Thread t9 = new Thread(a1, "I");
 * Thread t10 = new Thread(a1, "J");
 * t1.start();
 * t2.start();
 * t3.start();
 * t4.start();
 * t5.start();
 * t6.start();
 * t7.start();
 * t8.start();
 * t9.start();
 * t10.start();
 * }
 * }
 */
// out put =booked any 5 ticket not more then 5

// .......EXAMPLE 03 . USE TWO DIFRENT CLASS ......................
/*
 * class A implements Runnable {
 * public void run() {
 * for (int i = 1; i <= 10; i++) {
 * System.out.println("class A");
 * }
 * }
 * }
 * 
 * class B implements Runnable {
 * public void run() {
 * for (int i = 1; i <= 10; i++) {
 * System.out.println("class B");
 * }
 * }
 * }
 * 
 * class MultiThreading1 {
 * public static void main(String ar[]) {
 * A a1 = new A();
 * B b1 = new B();
 * Thread t1 = new Thread(a1, "A");
 * Thread t2 = new Thread(b1, "B");
 * t1.start();
 * t2.start();
 * 
 * }
 * }
 * 
 */
// A and B 10 times ayga mix
// ....EXAMPLE =4..........TWO DIFFRENT CLASS.......
/*
 * 
 * class A implements Runnable {
 * B b1;
 * 
 * A() {
 * }
 * 
 * A(B b1) {
 * this.b1 = b1;
 * }
 * 
 * public void run() {
 * System.out.println("class A run method");
 * synchronized (b1) {
 * for (int i = 1; i <= 10; i++) {
 * System.out.println("class A Block");
 * try {
 * Thread.sleep(200);
 * } catch (Exception e) {
 * }
 * }
 * }
 * }
 * }
 * 
 * class B implements Runnable {
 * A a1;
 * 
 * B() {
 * }
 * 
 * B(A a1) {
 * this.a1 = a1;
 * }
 * 
 * public void run() {
 * System.out.println("class B run method");
 * synchronized (a1) {
 * 
 * for (int i = 1; i <= 10; i++) {
 * System.out.println("class B block");
 * try {
 * Thread.sleep(200);
 * } catch (Exception e) {
 * }
 * }
 * }
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String[] args) {
 * A a1 = new A();
 * B b1 = new B();
 * A a11 = new A(b1);
 * B b11 = new B(a1);
 * Thread t1 = new Thread(a11, "A");
 * Thread t2 = new Thread(b11, "B");
 * t1.start();
 * t2.start();
 * 
 * }
 * }
 * 
 */

// .........EXAMPLE =5...........WHEN NullPointerException comes.....
/*
 * class A implements Runnable {
 * B b1;
 * 
 * A() {
 * }
 * 
 * A(B b1) {
 * this.b1 = b1;
 * }
 * 
 * public void run() {
 * synchronized (b1) {
 * System.out.println("class A run method");
 * for (int i = 1; i <= 10; i++) {
 * System.out.println("class A block");
 * try {
 * Thread.sleep(200);
 * } catch (Exception e) {
 * }
 * }
 * 
 * }
 * }
 * }
 * 
 * class B implements Runnable {
 * A a1;
 * 
 * B() {
 * }
 * 
 * B(A a1) {
 * this.a1 = a1;
 * }
 * 
 * public void run() {
 * synchronized (a1) {
 * System.out.println("class B run method");
 * for (int i = 1; i <= 10; i++) {
 * System.out.println("class B block");
 * try {
 * Thread.sleep(200);
 * } catch (Exception e) {
 * }
 * }
 * 
 * }
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String[] args) {
 * A a1 = new A();
 * B b1 = new B();
 * A a11 = new A(b1);
 * B b11 = new B(a1);
 * Thread t1 = new Thread(a1, "A");
 * Thread t2 = new Thread(b1, "B");
 * t1.start();
 * t2.start();
 * }
 * }
 */
// out put => NullPointerException will comes

//...........Example =>06......PROGRAM DEAD LOCK CONDITION.....................
/* 
class A {
}

class B {
}

class C implements Runnable {
        A a1;
        B b1;

        C(A a1, B b1) {
                this.a1 = a1;
                this.b1 = b1;
        }

        public void run() {
                System.out.println("class C run method");
                synchronized (a1) {
                        for (int i = 1; i <= 10; i++) {
                                System.out.println("class C synchronized outer block =" + i);
                        }
                        synchronized (b1) {
                                for (int i = 1; i <= 10; i++) {
                                        System.out.println("class C synchronized inner block =" + i);
                                }
                        }
                }
        }
}

class D implements Runnable {
        A a1;
        B b1;

        D(A a1, B b1) {
                this.a1 = a1;
                this.b1 = b1;
        }

        public void run() {
                System.out.println("class D run method");
                synchronized (b1) {
                        for (int i = 1; i <= 10; i++) {
                                System.out.println("class D synchronized outer block =" + i);
                        }
                        synchronized (a1) {
                                for (int i = 1; i <= 10; i++) {
                                        System.out.println("class D synchronized inner block =" + i);
                                }
                        }
                }
        }
}

class MultiThreading {
        public static void main(String[] args) {
                A a1 = new A();
                B b1 = new B();
                C c = new C(a1, b1);
                D d = new D(a1, b1);
                Thread t1 = new Thread(c, "C");
                Thread t2 = new Thread(d, "D");
                t1.start();
                t2.start();
        }
}
        */

//out put both outer block will work then dead lock ocuurs

//.....EXAMPLE =07.......................

//
//class MultiThreading {
//        public static void main(String[] args) {
//                for (int i = 1; i <= 500000; i++) {
//                        if (i % 2 == 0)
//                                System.out.println("*******************");
//                        else if (i % 3 == 0)
//                                System.out.println(">>>>>>>>>>>>>>>>>>>>");
//                        else if (i % 5 == 0)
//
//                        {
//                                int a = 1, b1 = 1;
//                                while (b1 <= 5) {
//                                        System.out.print(a);
//                                        if (b1 <= a) {
//                                                System.out.println();
//                                                b1 += 1;
//                                                a = 0;
//                                        }
//                                        a++;
//
//                                }
//                        } else
//                                System.out.println(i * i / i);
//
//                        try {
//                                Thread.sleep(200);
//                        } catch (Exception e) {
//                                // TODO: handle exception
//                        }
//                }
//        }
//}

//..........................DATE 21/06/25..........................
//EX-1...............................
//EX-2...............................
//EX-3...............................
//EX-4...............................
//EX-5...............................
//EX-6...............................
//EX-7...............................
//EX-8...............................
//EX-9..............................