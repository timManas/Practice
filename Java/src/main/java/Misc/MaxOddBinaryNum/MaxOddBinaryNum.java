package Misc.MaxOddBinaryNum;

public class MaxOddBinaryNum {
    public static void main(String [] args) {
        String [] input = { "010",  "0101"};
        for (String i : input)
            System.out.println("maxOddBinNum: " + maximumOddBinaryNumber(i) "\n");
    }

    public static String maximumOddBinaryNumber(String s) {

        if (s.length() == 1) return s;

        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int num1s = s.replace("0", "").length();
        int num0s = len - num1s;
        System.out.println("num1s: " + num1s + "    num0s: " + num0s);

        while (num1s > 1) {
            sb.append("1");
            num1s--;
        }

        while (num0s > 0) {
            sb.append("0");
            num0s--;
        }

        sb.append("1");


        return sb.toString();
    }
}
