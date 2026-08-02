package Strings.ReverseStringII;

public class ReverseStringII {
    public static void main (String [] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println("ReverseString: " + reverseStr(s, k) + "\n");

        String s1 = "abcd";
        int k1 = 2;
        System.out.println("ReverseString: " + reverseStr(s1, k1) + "\n");

        String s2 = "abcdefg";
        int k2 = 3;
        System.out.println("ReverseString: " + reverseStr(s2, k2) + "\n");

        String s3 = "abcdefg";
        int k3 = 8;
        System.out.println("ReverseString: " + reverseStr(s3, k3) + "\n");

    }

    public static String reverseStr(String s, int k) {
        StringBuilder strBldr = new StringBuilder();
        System.out.println("orig: " + s);

        if (s.length() < k)
            return new StringBuilder(s).reverse().toString();

        int i = 0;
        while (i < s.length()) {
            int e = i + k * 2;

            if (e > s.length())
                e = s.length();

            int diff = e - i;
            System.out.println("index: " + i + "    end: " + e + "      diff: " + diff);


            String subStr = s.substring(i, e);
            System.out.println("subStr: " + subStr);

            int f = subStr.length() > k ? k : subStr.length();
            String subsubStr = subStr.substring(0, f);

            String reverseStr = new StringBuilder(subsubStr).reverse() + subStr.substring(f, subStr.length());
            System.out.println("reversStr:  " + reverseStr);

            strBldr.append(reverseStr);


            i = i + k * 2;
        }

        return strBldr.toString();
    }

}
