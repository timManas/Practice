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
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> positionList = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        int startIndex = 0;

        for (int i=0; i<input.length(); i++) {
            char letter = input.charAt(i);
            char startLetter = input.charAt(startIndex);

            if (startLetter == letter) {
                sb.append(letter);

                if (i == input.length() - 1) {
                    positionList = new ArrayList<>();
                    positionList.add(startIndex);
                    positionList.add(i);
                    if (Math.abs(startIndex - i) + 1 >= 3)
                        output.add(positionList);
                    System.out.println("Last Group Found: " + sb.toString() + " positionList:" + positionList);
                }

            } else {

                positionList = new ArrayList<>();
                positionList.add(startIndex);
                positionList.add(i - 1);
                if (Math.abs(startIndex - i)>= 3)
                    output.add(positionList);
                System.out.println("Group Found: " + sb.toString() + " positionList:" + positionList);

                // Update startIndex
                startIndex = i;
                sb = new StringBuilder();
                sb.append(input.charAt(startIndex));
            }
        }

        return output;
    }


}
