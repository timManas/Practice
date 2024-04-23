package Strings.LatestTimeByReplacingHiddenDigits;

public class LatestTimeByReplacingHiddenDigits {
    public static void main(String [] args) {
        String [] input = {"2?:?0", "0?:3?", "0?:3?"};
        for (String i : input)
            System.out.println("Max Time:  " + maximumTime(i) + "\n");
    }

    public static String maximumTime(String time) {

        if (time.charAt(0) == '?') {
        }

        if (time.charAt(1) == '?') {

        }

        if (time.charAt(3) == '?') {

        }

        if (time.charAt(4) == '?') {

        }

        return time;
    }
}
