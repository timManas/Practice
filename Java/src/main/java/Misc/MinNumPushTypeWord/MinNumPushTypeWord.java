package Misc.MinNumPushTypeWord;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MinNumPushTypeWord {
    public static void main(String [] args) {
        String [] word = {"abcde", "xycdefghij"};
        for (String i : word) {
            System.out.println("Min Push: " + minimumPushes(i) + "\n");
        }
    }

    public static int minimumPushes(String word) {
        System.out.println("word: " + word);
        int min = 0;

        int count = 2;
        Map<Integer, List<Character>> map = new TreeMap<>();
        for (char letter : word.toCharArray()) {
            System.out.println("letter: " + letter + "  count: " + count);

            List<Character> list = new ArrayList<>();
            if (map.containsKey(count))
                list = map.get(count);

            list.add(letter);
            map.put(count, list);
            ++count;


            if (count > 9) {
                count = 2;
            }
        }
        System.out.println("Map: " + map);


        for (Map.Entry<Integer, List<Character>> es : map.entrySet()) {
            int num = es.getKey();
            List<Character> list = es.getValue();

            for (int i=0; i<list.size(); i++) {
                min += i+1;
            }
        }

        return min;
    }
}
