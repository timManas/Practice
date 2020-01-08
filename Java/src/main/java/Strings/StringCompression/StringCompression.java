package Strings.StringCompression;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static void main(String [] args) {
//        char [] input = {'a','a','b','b','c','c','c'};
//        char [] input = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char [] input = {'a','a','a','b','b','a','a'};          // ["a","3","b","2","a","2"]
        int output = compress(input);
        System.out.println("Size: " + output);
    }

    public static int compress(char[] inputArr) {

        if (inputArr.length == 1)
            return 1;

        int total = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char letter : inputArr) {

            if (map.containsKey(letter)) {
                int count = map.get(letter);
                map.put(letter, count + 1);
            } else {
                map.put(letter, 1);
            }
        }


        // Get rid of all values which have 1's
        HashMap<Character, String> filteredMap = new HashMap<Character, String>();
        for (Character character : map.keySet()) {
            if (map.get(character) == 1) {
                filteredMap.remove(character);
            } else {
                filteredMap.put(character, String.valueOf(map.get(character)));
            }
        }

        // Place back into Array
        char prevLetter = 0;
        for (int i=0; i<inputArr.length; i++) {

            if (map.isEmpty())
                break;

            char currentLetter = inputArr[i];
            if (prevLetter == currentLetter) {
                // Take only the first Digit

                if (filteredMap.get(currentLetter).equals(''))
                    continue;

                char value = filteredMap.get(currentLetter).charAt(0);
                inputArr[i] = value;
                filteredMap.put(currentLetter, filteredMap.get(currentLetter).substring(1));
                continue;
            }

            prevLetter = currentLetter;
        }

        // Find Total
        char prev = 0;
        for (int i=0; i<inputArr.length; i++) {
            char currentLetter = inputArr[i];

            if (prev != currentLetter) {
                ++total;
            }


            prev = currentLetter;
        }

        return  total - 1;
    }
}
