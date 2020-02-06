package Strings.MaximumNumBalloons;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MaximumNumOfBalloons {

    public static void main(String [] args) {
        String text = "nlaebolko";
        System.out.println("MaxNumber: " + maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {

        // Create Balloon Map for comparison
        HashMap<Character, Integer> balloonMap = new LinkedHashMap<Character, Integer>();
        balloonMap.put('b', 1);
        balloonMap.put('a', 1);
        balloonMap.put('l', 2);
        balloonMap.put('o', 2);
        balloonMap.put('n', 1);

        // Create Text Map given to us
        HashMap<Character, Integer> inputTextMap = new LinkedHashMap<Character, Integer>();
        for (int i=0; i < text.length(); i++) {
            char letter = text.charAt(i);
            int count = 1;

            if (inputTextMap.containsKey(letter))
                count = inputTextMap.get(letter) + 1;

            inputTextMap.put(letter, count);
        }

        return 0;
    }
}
