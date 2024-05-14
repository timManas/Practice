package Strings.CheckIfAllAsAppearBeforeBs;

public class CheckIfAllAsAppearBeforeBs {
    public static void main(String [] args) {
        String [] input = {"aaabbb", "abab", "bbbb"};

        for (String i : input)
            System.out.println("Check String: " + checkString(i) + "\n");
    }

    public static boolean checkString(String s) {

        boolean encounteredB = false;

        for (int i=0; i<s.length(); i++) {
            char letter = s.charAt(i);

            if (letter == 'a'){
                if(encounteredB)
                    return false;
                continue;
            }

            encounteredB = true;
        }

        return true;
    }
}
