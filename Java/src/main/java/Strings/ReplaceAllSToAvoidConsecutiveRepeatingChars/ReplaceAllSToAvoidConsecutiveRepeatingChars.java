package Strings.ReplaceAllSToAvoidConsecutiveRepeatingChars;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReplaceAllSToAvoidConsecutiveRepeatingChars {
    public static void main(String [] args) {
        String [] input = {"????????????????????????????????????????????????????????????????????????????????????????????????????","j?qg??b", "?zs", "ubv?w"};
        for (String i : input)
            System.out.println("Modify String: " + modifyString(i));

    }

    public static String modifyString(String s) {

        // Step1 - Create a StringBuilder to modify the string
        StringBuilder sb = new StringBuilder(s);

        // Step2 - Create and populate set to store the unique characters
        Set<Character> set = new TreeSet<>();
        char letter = 'a';
        for (int i=0; i<26; i++) set.add((char)(letter + i));

        // Step2b - Remove Characters from String
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == '?' || !set.contains(s.charAt(i)))
                continue;

            set.remove(s.charAt(i));
        }
        System.out.println("Set: " + set);

        // Step3 - Create new unique String
        int index = 0;
        List<Character> list = new ArrayList<>(set);
        for (int i=0; i < sb.length(); i++) {
            if (sb.charAt(i) != '?')    // Continue is we havent run into ?
                continue;

            sb.setCharAt(i, list.get(index));
            System.out.println(sb);

            // Update indexes
            if (index >= list.size() - 1)
                index = 0;
            else
                ++index;
        }

        return sb.toString();
    }
}
