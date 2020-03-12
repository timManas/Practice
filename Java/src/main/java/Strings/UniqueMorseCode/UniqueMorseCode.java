package Strings.UniqueMorseCode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueMorseCode {

    public static void main(String [] args) {
        String [] words = {"gin", "zen", "gig", "msg"};
        System.out.println("UniqueMorseRep: " + uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {

        // Step1 - Create set to keep track of all unique values
        HashSet<String> set = new HashSet<String>();

        // Step2 - Create map to map the morse to letter
        HashMap<Character, String> morseMap = setMap();

        // Step3 - Traverse through all the words and place the moreseRepresentation in the set
        for (String word : words) {
            String morseWord = convertToMorse(word, morseMap);
            set.add(morseWord);
        }

        // Step4 - Return the sizse of the set to get all the unique morse representation
        return set.size();
    }

    private static HashMap<Character, String> setMap() {
        HashMap<Character, String> map = new HashMap<Character, String>();
        String [] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        char letter = 'a';
        for (String rep : morseList) {
            map.put(letter, rep);
            ++letter;
        }

        return map;
    }

    private static String convertToMorse(String word, HashMap<Character, String> morseMap) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i < word.length(); i++) {
            char letter = word.charAt(i);
            sb.append(morseMap.get(letter));
        }

        System.out.println(sb.toString());
        return sb.toString();

    }


}
