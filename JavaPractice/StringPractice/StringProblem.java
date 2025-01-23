
// ***********StringIsPalindrome or not*******************

// class StringProblem {
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

// **********HOW MANY TIME OCURES TARGET STRING*********** */

// class StringProblem {
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

