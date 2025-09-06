
/*
E1  String class 18 method
E2  String is palindrome or not (using loop)
E3  target how many times come in String
E4  revers the given String
E5  Java program to find all substrings of a string
E6  String is palindrome or not using recursion
E7
E8
E9
E10
E5
E5

 */
import java.util.Scanner;
//*****************E-1******************** */
// ********* length() concat() charAt()
// class st1 {
// public static void main(String[] args) {
// String s1 = "sachin";
// String s2 = "parmar";
// System.out.println(s1.length());
// System.out.println(s2.length());
// System.out.println(s1.length());
// System.out.println(s1.charAt(2));
// System.out.println(s1.concat(" " + s2));
// }

// }

// *****************toUpperCase */
// class String18Methods {
// public static void main(String[] args) {
// String s1 = "Softwaves";
// System.out.println(s1.toUpperCase());
// }
// }

// *****************toLowerCase */

// class String18Methods {
// public static void main(String[] args) {
// String s1 = "INDIA";
// System.out.println(s1.toLowerCase());
// }
// }

// *****************equals()*****equalsIgnoreCase() both method return type is
// boolean

// class String18Methods {
// public static void main(String[] args) {
// String s1 = "INDIA";
// String s2 = "india";
// String s3 = "INDIA";
// System.out.println(s1.equals(s2));
// System.out.println(s1.equals(s3));
// System.out.println(s1.equalsIgnoreCase(s2));
// }
// }

/// *********************compareTo() return type is int ****************/

// class String18Methods {
// public static void main(String[] args) {
// String s1 = "ZADIA";
// String s2 = "zadia";
// String s3 = "INDIA";
// System.out.println(s1.compareTo(s2));
// System.out.println("ram");
// // System.out.println(s1.equalsIgnoreCase(s2));
// }
// }

/// *********************compareToIgnoreCase() return type is int
/// ****************/

// class String18Methods {
// public static void main(String[] args) {
// String s1 = "ZADIA";
// String s2 = "zadia";
// String s3 = "INDIA";
// System.out.println(s1.compareToIgnoreCase(s2));
// System.out.println("janki");
// System.out.println(s1.compareToIgnoreCase(s3));
// }
// }

/// *********************indexOf() return type int ****************/

// class String18Methods {
// public static void main(String[] args) {
// String s1 = "my name is raja ram i am the king of india";
// System.out.println(s1.indexOf("ram"));
// }
// }

/// *********************lastIndexOf() return type int ****************/

// class String18Methods {
// public static void main(String[] args) {
// String s1 = "my name is raja ram i am the king of india sdlf dsjflj jsfjsl
// is";
// System.out.println(s1.lastIndexOf("is"));
// System.out.println(s1.length());
// System.out.println("ram ji");
// }
// }

// *********************toCharArray()****************

// class A {
// String lowerCASE(String s) {
// String s3 = null;
// char ch[] = s.toCharArray();
// for (int i = 0; i < ch.length; i++) {
// if (ch[i] > 65 && ch[i] < 90) {
// char ch1 = (char) (ch[i] + 32);
// s3 = s3 + ch1;
// } else {
// s3 = s3 + ch[i];
// }
// }
// return s3;
// }
// }

// class String18Methods {
// public static void main(String[] args) {
// String s = "RAS JS JDFLSJ JSJ Jaj SJ LJDs sj SJDJ d D LDJ d ";
// A a = new A();

// System.out.println(a.lowerCASE(s));
// }
// }

// ************************length() method */
// class Employe {
// public String get()
// {
// return "ram";
// }

// }

// class length_method {
// public static void main(String ar[]) {
// Employe e1 = new Employe();

// System.out.println(e1.get().length());

// }
// }
// /*
// because get method Employe class ki mil gai or length() method String class
// ki call hui kyo ki
// Employe class ma length method nhi ha.
// out put==
// 3

// */

//*****************E-2******************** */

// ***********StringIsPalindrome or not*******************

// class StringClass{
// public static void main(String ar[]) {
// String s1 = ar[0];
// char s2[] = s1.toCharArray();
// String s3 = "";

// for (int i = s2.length - 1; i >= 0; i--) {
// s3 = s3 + s2[i];
// }
// if (s1.equals(s3)) {
// System.out.println("string is palindrome");
// } else {
// System.out.println("string is not palindrome");
// }

// }

// }

//*****************E-3******************** */

// **********HOW MANY TIME OCURES TARGET STRING*********** */

// class StringClass {
// static int countTarget(String source, String target) {
// int count = 0;
// int n = target.length();
// for (int i = 0; i < source.length() - 1; i++) {
// /*-1 nahi karga too index out
// of bound ho jay ga i+n ka karan*/
// String s = source.substring(i, i + n);
// if (s.equals(target))
// ++count;
// }
// return count;
// }

// public static void main(String... a) {
// System.out.println("target is ocurs total time=" + countTarget("my name is
// myhomye is my jdkjf my ,", "my"));
// }
// }
//*****************E-4******************** */
// revers the String
// class StringClass {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER ANY STRING");
//         String orignal = sc.nextLine();
//         String reverse = "";
//         int i = orignal.length();
//         while (i > 0)
//             reverse += orignal.charAt(--i);

//         System.out.println("orignal=" + orignal + "\nreverse=" + reverse);
//     }
// }

// *****************E-5******************** */
//java program to find all substring of a string
// class StringClass {
//     public static void main(String[] args) {
//         int count = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your data");
//         String s = sc.nextLine();

//         System.out.println(s.substring(0, 2));
//         for (int i = 0; i < s.length(); i++) {
//             if (s.substring(i, i + 3).equals(sbString)) {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// *****************E-6******************** */
/* 
class StringClass {
    static boolean isPalindrome(String s) {
        if (!((s.charAt(s.length() - 1)) == (s.charAt(0))))
            return false;
        else if (true) {

        } else {

        }
        return true;
    }

    public static void main(String ar[]) {
        System.out.println(isPalindrome("ramar"));
    }
}
*/
// *****************E-7******************** *
// class StringClass {
//     public static void main(String ar[]) {
//         String s = "my name is sachin sachin sachin";
//         System.out.println(s.substring(1));// y name is sachin

//         System.out.println(s.substring(1, 4));// y n
//         String s1[] = s.split("sachin", 2);// y n
//         for (String s3 : s1)
//             System.out.println(s3);
//     }
// }
// *****************E-8******************** */
// class StringClass {
//     public static void main(String[] args) {

//         char ch[] = { 'L', 'I', 'K', 'E' };
//         String s1 = new String(ch);
//         String s2 = "LIKE";
//         String s3 = s1.intern();
//         System.out.println(s1 == s2);//flase
//         System.out.println(s2 == s3);//true

//     }
// }
// *****************E-9******************** *
class StringClass {
    public static void main(String[] args) {
    
        
    
    
    }
}

// *****************E-10******************** */
