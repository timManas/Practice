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



        return count;
    }
}
