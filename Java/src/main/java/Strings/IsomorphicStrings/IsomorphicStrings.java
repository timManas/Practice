package Strings.IsomorphicStrings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class IsomorphicStrings {

    public static void main(String [] args) {
//        String s = "paper";
//        String t = "title";

//        String s = "foo";     // False
//        String t = "bar";

        String s = "food";      // false
        String t = "abad";
        System.out.println("Isomorphic: " + isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {

        // Initialize Maps to store Mapping
        HashMap<Character, Character> mapS = new LinkedHashMap<Character, Character>();
        HashMap<Character, Character> mapT = new LinkedHashMap<Character, Character>();

        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();

        // Traverse both list
        int index = 0;
        while (index < sArr.length && index < tArr.length) {

            // Fetch current char values
            char sChar = sArr[index];
            char tChar = tArr[index];

            // Step 1 - If it contains the key but has a different mapping ...return false
            if (mapS.containsKey(sChar)) {

                if (mapS.get(sChar) != tChar)
                    return false;

            } else {
                // If it doesent exist, add to mapping
                mapS.put(sChar, tChar);
            }


            // Step 2 - Make sure the mapping is also unique for the other string
            if (mapT.containsKey(tChar)) {

                if (mapT.get(tChar) != sChar)
                    return false;

            } else {
                mapT.put(tChar, sChar);
            }

            index++;
        }


        return true;        // Return true until we reached the end and all characters are unique
    }

}

/**
 Solution
 1. Use two maps
 2. Map each values with their respective counterpart
 3. If counterpart exists and has a different value than currently stored in map, then false
 4. continue untill the end


 */
