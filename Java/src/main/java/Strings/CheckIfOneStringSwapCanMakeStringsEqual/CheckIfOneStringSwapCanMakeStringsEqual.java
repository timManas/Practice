package Strings.CheckIfOneStringSwapCanMakeStringsEqual;

public class CheckIfOneStringSwapCanMakeStringsEqual {
    public static void main(String [] args) {
        String [][] input = {{"bank", "kanb"}, {"attack", "defend"}, {"kelb", "kelb"}};
        for (String [] i : input)
            System.out.println("Almost equal: " + areAlmostEqual(i[0], i[1]) + "\n");
    }

    public static boolean areAlmostEqual(String str1, String str2) {
        // Step1 - Check if str1 and str2 are the same
        if (str1.equalsIgnoreCase(str2))
            return true;

        // Step2 - Check if the legnths are the same
        if (str1.length() != str2.length())
            return false;

        // Step3 - Create two sb to track the different letters between the two strings
        // All similar letters in the same positions would get eliminated
        // All different letters would stay as is and not change
        // In order to swap, we should ONLY see a maximum of two letters in each stringbuilder. Otherwise we requir more than one swap
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        for (int i=0; i < str1.length(); i++) {
            char letter1 = str1.charAt(i);
            char letter2 = str2.charAt(i);

            if (letter1 != letter2)
                continue;

            sb1.setCharAt(i,' ');
            sb2.setCharAt(i,' ');
        }

        // Step4 - Reverse only one of the sb to check if they are the same as the other
        str1 = sb1.reverse().toString();
        str2 = sb2.toString();

        // Step5 - Replace all blank spaces to no spaces
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        System.out.println("str1: " + str1 + "  str2: " + str2);
        if (str1.length() != 2 && str2.length() != 2)
            return false;

        // Return true if both strings are the same
        return str1.equalsIgnoreCase(str2);
    }
}
