package Strings.RepeatedSubStringPattern;

import java.util.Deque;
import java.util.LinkedList;

public class RepeatedSubStringPattern {
    public static void main(String [] args) {

        String [] input = {"ababab","abab", "aba", "abcabcabcabc"};
        for (String i : input)
            System.out.println("Repeated SubString: " + repeatedSubstringPattern(i) + "\n");


    }

    public static boolean repeatedSubstringPattern(String s) {

        Deque<Character> queue = new LinkedList<>();

        for (int i=0; i<s.length(); i++) {
            char current = s.charAt(i);

            // Add to queue if Empty
            if (queue.isEmpty()) {
                System.out.println("Adding: " + current);
                queue.addLast(current);
                continue;
            }

            if (current == queue.peekFirst()) {
                System.out.println("Removing: " + queue.removeFirst());
            } else {
                System.out.println("Adding: " + current);
                queue.addLast(current);
            }

            System.out.println("Queue: " + queue);
        }



        return queue.isEmpty();
    }
}
