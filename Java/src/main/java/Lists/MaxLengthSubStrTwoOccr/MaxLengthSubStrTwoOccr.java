package Lists.MaxLengthSubStrTwoOccr;

import java.util.Map;
import java.util.TreeMap;

public class MaxLengthSubStrTwoOccr {
    public static void main(String [] args) {
        String [] input = {"bcbbbcba", "aaaa"};
        for (String i : input)
            System.out.println("maxLength: " + maximumLengthSubstring(i) + "\n");
    }

    public static int maximumLengthSubstring(String s) {
        int max = 2;

        for (int i=0; i<s.length()-1; i++) {
            char current = s.charAt(i);
            Map<Character, Integer> map = new TreeMap<>();
            StringBuilder sb = new StringBuilder();

            map.put(current, 1);
            sb.append(current);

            for (int j=i+1; j<s.length(); j++) {
                char next = s.charAt(j);
//                System.out.println("current: " + current  + "   next: " + next + "  sb: " + sb);

                int count = 0;
                if (map.containsKey(next))
                    count = map.get(next);
                map.put(next, count + 1);

                if (map.get(next) >= 3) {
                    max = Math.max(max, sb.length());
                    break;
                }

                sb.append(next);
                System.out.println("current: " + current  + "   next: " + next + "  sb: " + sb);

            }
            System.out.println();
            max = Math.max(max, sb.length());


        }

        return max;
    }
}
