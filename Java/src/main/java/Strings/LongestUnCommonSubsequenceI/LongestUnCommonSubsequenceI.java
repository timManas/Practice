package Strings.LongestUnCommonSubsequenceI;

public class LongestUnCommonSubsequenceI {
    public static void main (String [] args) {

        String a = "aba";
        String b = "cdc";
        System.out.println("LUSLength: " + findLUSlength(a, b));

        String a1 = "aaa";
        String b1 = "bbb";
        System.out.println("LUSLength: " + findLUSlength(a1, b1));

        String a2 = "aaa";
        String b2 = "aaa";
        System.out.println("LUSLength: " + findLUSlength(a2, b2));

        String a3 = "aefawfawfawfaw";
        String b3 = "aefawfeawfwafwaef";
        System.out.println("LUSLength: " + findLUSlength(a2, b2));

    }

    public static int findLUSlength(String a, String b) {
        if (a.equalsIgnoreCase(b))
            return -1;

        return Integer.max(a.length(), b.length());
    }
}
