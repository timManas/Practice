package Strings.LatestTimeByReplacingHiddenDigits;

public class LatestTimeByReplacingHiddenDigits {
    public static void main(String [] args) {
        String [] input = {"2?:?0", "0?:3?", "1?:22", "?0:15"};
        for (String i : input)
            System.out.println("Max Time:  " + maximumTime(i) + "\n");
    }

    public static String maximumTime(String time) {
        StringBuilder sb = new StringBuilder(time);

        if (sb.charAt(0) == '?') {
            sb.replace(0, 1, "2");
        }

        if (sb.charAt(1) == '?') {
            if (sb.charAt(0) == '2') {
                sb.replace(1, 2, "3");
            } else {
                sb.replace(1, 2, "9");
            }
        }

        if (sb.charAt(3) == '?') {
            sb.replace(3, 4, "5");
        }

        if (sb.charAt(4) == '?') {
            sb.replace(4, 5, "9");
        }

        return sb.toString();
    }
}
