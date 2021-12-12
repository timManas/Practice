package Strings.RansomNote;

import java.util.Map;
import java.util.TreeMap;

public class RansomNote {
    public static void main(String [] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println("Can Construct: " + canConstruct(ransomNote, magazine));

        String ransomNote1 = "aa";
        String magazine1 = "ab";
        System.out.println("Can Construct: " + canConstruct(ransomNote1, magazine1));

        String ransomNote2 = "aa";
        String magazine2 = "aab";
        System.out.println("Can Construct: " + canConstruct(ransomNote2, magazine2));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        // Step1 - Create Maps for ransomNote and magazine
        Map<Character, Integer> ransomNoteMap = new TreeMap<>();
        Map<Character, Integer> magazineMap = new TreeMap<>();


        // Step2 - Populate the maps
        for (int i=0; i < ransomNote.length(); i++) {
            char letter = ransomNote.charAt(i);
            if (ransomNoteMap.containsKey(letter))
                ransomNoteMap.put(letter, ransomNoteMap.get(letter) + 1);
            else
                ransomNoteMap.put(letter, 1);
        }
        for (int i=0; i < magazine.length(); i++) {
            char letter = magazine.charAt(i);
            if (magazineMap.containsKey(letter))
                magazineMap.put(letter, magazineMap.get(letter) + 1);
            else
                magazineMap.put(letter, 1);
        }

        System.out.println("RansomNote: " + ransomNoteMap);
        System.out.println("MagazineMap: " + magazineMap);

        // Step3 - Compare both the maps. Find if the values in ransomNote contained in magazine
        for (Map.Entry<Character, Integer> mapEntry : ransomNoteMap.entrySet()) {
            Character letter = mapEntry.getKey();
            int value = mapEntry.getValue();

            if (!magazineMap.containsKey(letter))
                return false;

            if (magazineMap.get(letter) < value)
                return false;
        }


        return true;
    }
}
