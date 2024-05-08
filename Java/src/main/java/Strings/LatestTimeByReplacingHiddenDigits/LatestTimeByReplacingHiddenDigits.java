package Strings.LatestTimeByReplacingHiddenDigits;

public class LatestTimeByReplacingHiddenDigits {
    public static void main(String [] args) {
        String [] input = {"2?:?0", "0?:3?", "1?:22", "?0:15", "?4:03", "00:??", "?0:15", "??:3?", "1?:??"};
        for (String i : input)
            System.out.println("Max Time:  " + maximumTime(i) + "\n");
    }

    public static String maximumTime(String time) {
        StringBuilder sb = new StringBuilder(time);

        if (time.charAt(4) == '?') {
            sb.replace(4, 5, "9");
        }

        if (time.charAt(3) == '?') {
            sb.replace(3, 4, "5");
        }

        if (time.charAt(3) == '?' && time.charAt(4) == '?' &&
                Character.getNumericValue(time.charAt(1)) > 3 &&  Character.getNumericValue(time.charAt(0)) > 2) {
            sb.replace(4, 5, "0");
            sb.replace(3, 4, "0");
        }

        if (sb.charAt(1) == '?') {

            if ((sb.charAt(0) == '?' || sb.charAt(0) == '2') ) {
                sb.replace(1, 2, "3");

                if ((sb.charAt(3) == '0' && sb.charAt(4) == '0'))
                    sb.replace(1, 2, "4");

            }else {
                sb.replace(1, 2, "9");
            }
        }

        if (sb.charAt(0) == '?') {
            sb.replace(0, 1, "2");

            if (Character.getNumericValue(sb.charAt(1)) > 3 ) {
                sb.replace(0, 1, "1");
            }
        }

        return sb.toString();
    }
}
