package Strings.MaximumNumBalloons;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaximumNumOfBalloons {

    public static void main(String [] args) {
//        String text = "balon"; // 0
//        String text = "loonbalxballpoon"; // 2
        String text = "nlaebolko";      // 1
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


        boolean isValid = true;

        int count = 0;
        while (isValid) {

            for (Map.Entry<Character, Integer> mapEntry : balloonMap.entrySet()) {
                char balloonKey = mapEntry.getKey();
                Integer balloonValue = mapEntry.getValue();

                // If it does not contain Balloon letters -> Return
                if (!inputTextMap.containsKey(balloonKey))
                    return count;


                // If count is zero or lower
                if (inputTextMap.get(balloonKey) <= 0 || inputTextMap.get(balloonKey) < balloonValue)
                    return count;


                inputTextMap.put(balloonKey, inputTextMap.get(balloonKey) - balloonValue);
//                System.out.println();
            }
            count++;
        }

        return 0;
    }
}
