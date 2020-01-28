package Strings.RepeatedStringMatch;

public class RepeatedStringMatch {

    public static void main(String [] args) {
        String A = "abaabaa";
        String B = "abaababaab";
        System.out.println("Repeated: " + repeatedStringMatch(A, B));
    }

    public static int repeatedStringMatch(String A, String B) {
        int total = 1;
        if (A == null || B == null)
            return -1;

        if (B.indexOf(A) == -1 && B.length() < A.length()) {
            System.out.println("A not substring of B");
            return -1;
        }

        StringBuilder stringBuilder = new StringBuilder(A);
        while (true) {
            if (stringBuilder.toString().indexOf(B) != -1)
                return total;

            stringBuilder.append(A);
            ++total;

            if (total >= 10000) {
                return  -1;
            }


        }
    }

}
