package Strings.RearrangeCharTargetStr;

import java.util.Map;
import java.util.TreeMap;

public class RearrangeCharTargetStr {
    public static void main(String [] args) {
        String [][] input = {{"ilovecodingonleetcode", "code"}, {"abcba", "abc"}, {"abbaccaddaeea", "aaaaa"}};
        for (String [] tc : input) {
            System.out.println("reArrange Chars: " + rearrangeCharacters(tc[0], tc[1]) + "\n");
        }
    }

    public static int rearrangeCharacters(String s, String target) {
        int count = 0;

        Map<Character, Integer> stringMap = new TreeMap<>();
        Map<Character, Integer> targetMap = new TreeMap<>();

        for (int i=0; i<target.length();i++) {
            char letter = target.charAt(i);

            if (targetMap.containsKey(letter))
                targetMap.put(letter, targetMap.get(letter) + 1);
             else
                targetMap.put(letter, 1);
        }
        System.out.println("TargetMap: " + targetMap);

        for (int i=0; i<s.length();i++) {
            char letter = s.charAt(i);

            if (!targetMap.containsKey(letter))
                continue;

            if (stringMap.containsKey(letter))
                stringMap.put(letter, stringMap.get(letter));
            else
                stringMap.put(letter, 1);
        }
        System.out.println("String map: " + stringMap);






        return count;
    }
}
