package Strings.ThousandSeperator;

public class ThousandSeperator {
    public static void main(String [] args) {
        int [] input = { 987, 1234, 123456789, 0};
        for (int i : input)
            System.out.println("Thousand Seperator: " + thousandSeparator(i));
    }

    public static String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        String num = String.valueOf(n);
        int count = 0;
        for (int i=num.length()-1; i >= 0; i--) {

            if (sb.length() > 0 && count % 3 == 0) {
                sb.append(".");
            }

            sb.append(num.charAt(i));
            count++;
            System.out.println("Num: " + num.charAt(i));

        }

        return sb.reverse().toString();
    }

}
