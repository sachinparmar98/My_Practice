package String;

public class FindTheDiffrence {
    /*
     * public static char findTheDifference(String s, String t) {
     * int sApp[]=new int[26];
     * int tApp[]=new int[26];
     * int i=0;
     * while(i<s.length())
     * {
     * sApp[s.charAt(i)-'a']++;
     * tApp[t.charAt(i)-'a']++;
     * i++;
     * }
     * tApp[t.charAt(i)-'a']++;
     * for(int c:sApp)
     * System.out.print(c+"   ");
     * System.out.println();
     * for(int c:tApp)
     * System.out.print(c+"   ");
     * 
     * for(int j=0;j<26;j++)
     * {
     * if(sApp[j]!=tApp[j])return (char)(97+j);
     * }
     * return '0';
     * }
     * 
     */
    // one more way

    public static char findTheDifference(String s, String t) {

        int sum = 0, diff = 0;
        char stemp[] = s.toCharArray();
        char ttemp[] = t.toCharArray();
        for (char c : stemp) {
            sum += c - 'a';
        }
        for (char c : ttemp) {
            diff += c - 'a';
        }
        return (char) (diff - sum + 'a');
    }
}
