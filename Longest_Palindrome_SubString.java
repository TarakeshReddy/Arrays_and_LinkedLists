//import java.util.*;
class Solution {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int first = 0;
        int last = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);     
            int len2 = expand(s, i, i + 1); 
            int len = Math.max(len1, len2);

            if (len > last - first) {
                first = i - (len - 1) / 2;
                last = i + len / 2;
            }
        }

        return s.substring(first, last + 1);
    }

    private static int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
    // To take user input
    /*public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        String res = longestPalindrome(S);
        System.out.println(res);
    }*/
}
