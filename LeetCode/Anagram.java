import java.util.Arrays;

class Anagram {

	public static void main(String s[]) {
		boolean b = isAnagram("sachindsd", "nihcasdsd");
		System.out.println(b);
	}

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		char sChar[] = s.toCharArray();
		char tChar[] = t.toCharArray();

		Arrays.sort(sChar);
		Arrays.sort(tChar);
		int i = 0;
		while (i < sChar.length) {
			System.out.print(sChar[i]);
			i++;
		}
		for (int k = 1; k < 2147483647; k++) {
			for (int j = 1; j < k; j++) {
			Object o=	new Object();
			o=null;
				System.gc();
			}

		}

		return Arrays.equals(sChar, tChar);

	}

	@Override
	public void finalize() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
}

// ONE MORE WAY TO CREATE ANAGRAM
/*
 * class Dam1
 * {
 * public static void main(String ...a)
 * {
 * boolean b=isAnagram("sachin","nihcas");
 * System.out.println(b);
 * }
 * public static boolean isAnagram(String s,String t)
 * { if(s.length()!=t.length())return false;
 * byte count[]=new byte[26];
 * for(int i=0;i<s.length();i++)
 * {
 * count[s.charAt(i)-'a']+=1;
 * }
 * for(int i=0;i<t.length();i++)
 * {if(count[t.charAt(i)-'a']==0)return false;
 * count[t.charAt(i)-'a']-=1;
 * }
 * return true;
 * }
 * }
 */