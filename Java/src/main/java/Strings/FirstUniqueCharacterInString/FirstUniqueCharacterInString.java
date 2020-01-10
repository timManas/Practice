package Strings.FirstUniqueCharacterInString;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FirstUniqueCharacterInString {

    public static void main(String [] args) {

        String input = "z";
        System.out.println("FirstUniqueChar: " + firstUniqChar(input));
    }

    public static int firstUniqChar(String input) {

        if (input.equals(""))
            return -1;

        char [] strArr = input.toCharArray();
        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();
        for (char letter : strArr) {

            if (treeMap.containsKey(letter)) {
                treeMap.put(letter, treeMap.get(letter) + 1);
            } else {
                treeMap.put(letter, 1);
            }
        }

        TreeSet<Integer> sortedValuesSet = new TreeSet<Integer>(treeMap.values());
        int lowestValue = sortedValuesSet.first();

        if (lowestValue != 1) {
            return -1;

        } else if (treeMap.size() == 1 && treeMap.get(treeMap.firstKey()) > 1) {
            return -1;
        }



        System.out.println("SamllestValue: " + lowestValue);
        for (int i=0; i < strArr.length; i++) {
            if (treeMap.get(strArr[i]) == lowestValue) {
                return i;
            }
        }

        return 0;
    }

}
