package Strings.MinNumStepsTwoStringAnagram;

public class MinNumStepsTwoStringAnagram {

    public static void main(String [] args) {

        String s = "leetcode";
        String t = "practice";

        System.out.println("Min Steps: " + minSteps(s, t));
    }

    public static int minSteps(String s, String t) {

        // Step1 - Create StringBuilder to remove/Edit characters in String
        StringBuilder sbT = new StringBuilder(t);

        // Step2 - Traverse s
        for (int i=0; i < s.length(); i++) {
            char sChar = s.charAt(i);

            // Step3 - Check if char exists. IF NOT -> We move on
            if (sbT.indexOf(String.valueOf(sChar)) == -1)
                continue;

            // Step4 - If Letter exists, we REMOVE from StringBuilder
            sbT.deleteCharAt(sbT.indexOf(String.valueOf(sChar)));

        }

        System.out.println("Left: " + sbT.toString());

        // Step5 - Return the length of SBT
        return sbT.length();
    }
}


/**

 Solution
 1. Create a stringBuilder for t
    Why ? Because sb allows us to remove and edit values in the String
 2. Traverse characters in s
 3. For each character is S,
    > We check if letter exists in T. If Does NOT Exists, we continue.
            > If does  exists, we delete character in sb

 4. Return the size of sbT

 */
