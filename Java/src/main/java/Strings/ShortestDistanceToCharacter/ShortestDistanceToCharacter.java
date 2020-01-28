package Strings.ShortestDistanceToCharacter;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class ShortestDistanceToCharacter {

    public static void main(String [] args) {
        String input = "loveleetcode";
        char letter = 'e';

//        String input = "aaba";
//        char letter = 'b';

        int [] output = shortestToChar(input, letter);
        for (int i : output)
            System.out.println(i);

    }

    public static int[] shortestToChar(String str, char targetLetter) {
        int [] arr = new int[str.length()];

        // Step 1 - Find Left and Right
        for (int i=0; i < str.length(); i++) {
            int left = fetchIndex(str, targetLetter, i, "left");
            int right = fetchIndex(str, targetLetter, i, "right");

            // Step 2 - Compare left and right and take min
            int shortest = Math.min(left, right);
            arr[i] = shortest;
        }

        return arr;
    }

    private static int fetchIndex(String str, char targetLetter, int currentIndex, String side) {

        // Traverse the Left until first targetLetter
        if (side.equalsIgnoreCase("left")) {
            for (int i = currentIndex; i >= 0; i--) {
                if (str.charAt(i) == targetLetter)
                    return Math.abs(i - currentIndex);
            }

            return Integer.MAX_VALUE;

        } else  {
            // Traverse the right until first targetLetter
            for (int i = currentIndex; i < str.length(); i++) {
                if (str.charAt(i) == targetLetter)
                    return Math.abs(i - currentIndex);
            }

            return Integer.MAX_VALUE;
        }



    }

}
