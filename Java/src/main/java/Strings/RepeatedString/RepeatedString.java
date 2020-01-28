package Strings.RepeatedString;

public class RepeatedString {

    public static void main(String [] args) {

        String A = "abcde";
        String B = "cdeab";
        System.out.println("RotateString ? " + rotateString(A, B));
    }

    public static boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        if (A.equalsIgnoreCase("") && B.equalsIgnoreCase("")) {
            return true;
        } else if (A.equalsIgnoreCase("") || B.equalsIgnoreCase(""))
            return false;


        // Take Substring from index 1 to end  + index(0)
        String rotateStr = A.substring(1, A.length()) + A.charAt(0);
        while (!A.equalsIgnoreCase(rotateStr)) {
            System.out.println(rotateStr);
            if (rotateStr.equalsIgnoreCase(B))
                return true;

            rotateStr = rotateStr.substring(1, rotateStr.length()) + rotateStr.charAt(0);

        }

        return false;
    }

}
