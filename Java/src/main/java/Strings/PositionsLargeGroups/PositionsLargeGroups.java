package Strings.PositionsLargeGroups;

import java.util.ArrayList;
import java.util.List;

public class PositionsLargeGroups {
    public static void main(String [] args) {
        String [] input = {"bababbaaab","aaa","abbxxxxzzy", "abbxxxxzzyyy", "abc", "abcdddeeeeaabbbcd"};
        for (String i : input)
            System.out.println("Large Group Positions: " + largeGroupPositions(i) + "\n");
    }

    public static List<List<Integer>> largeGroupPositions(String input) {

        // Step1 - Create output variable
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> positionList;

        // Step2 - Use Strinbuilder to build String
        StringBuilder sb = new StringBuilder();
        int startIndex = 0;

        // Step3 - Traverse letter by letter
        for (int i=0; i<input.length(); i++) {
            char letter = input.charAt(i);
            char startLetter = input.charAt(startIndex);

            // Step4 - Check if the letter is the same as the starting letter
            if (startLetter == letter) {
                sb.append(letter);              // Add to stringbuilder

                // Check if the last element in list. Add to Output if length >= 3
                if (i == input.length() - 1) {
                    positionList = new ArrayList<>();
                    positionList.add(startIndex);
                    positionList.add(i);
                    if (sb.toString().length() >= 3)
                        output.add(positionList);
                    System.out.println("Last Group Found: " + sb.toString() + " positionList:" + positionList);
                }

            } else {

                positionList = new ArrayList<>();
                positionList.add(startIndex);
                positionList.add(i - 1);
                if (sb.toString().length() >= 3)    //Add to Output if length >= 3
                    output.add(positionList);
                System.out.println("Group Found: " + sb.toString() + " positionList:" + positionList);

                // Step5 - Update startIndex
                startIndex = i;
                sb = new StringBuilder();
                sb.append(input.charAt(startIndex));
            }
        }

        return output;
    }


}
