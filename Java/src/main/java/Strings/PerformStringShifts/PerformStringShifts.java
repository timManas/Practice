package Strings.PerformStringShifts;

import java.util.Deque;
import java.util.LinkedList;

public class PerformStringShifts {
    public static void main(String [] args) {
        String s = "abc";
        int [][] shift = {{0,1}, {1,2}};
        System.out.println("String Shift: " + stringShift(s, shift));

        String s1 = "abcdefg";
        int [][] shift1 = {{1,1}, {1,1}, {0,2}, {1,3}};
        System.out.println("String Shift: " + stringShift(s1, shift1));
    }

    public static String stringShift(String s, int[][] shiftArr) {
        // Step1 - Add letters to Queue
        Deque<Character> queue = new LinkedList<>();
        for (int i=s.length() - 1; i >= 0; i--)
            queue.push(s.charAt(i));
        System.out.println("Queue: " + queue);

        // Step2 - Shift Characters
        for (int i=0; i < shiftArr.length; i++) {
            int [] shift = shiftArr[i];
            int direction = shift[0];
            int amount = shift[1];

            // Shift the queue by the amount
            for (int j=0; j < amount; j++) {
                if (direction == 0) {       // Move Left
                    char letter = queue.removeFirst();
                    queue.addLast(letter);
                } else if (direction == 1) {    // Move Right
                    char letter = queue.removeLast();
                    queue.addFirst(letter);
                }
            }
            System.out.println("Queue: " + queue);
        }

        // Step3 - Convert queue to string again
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty())
            sb.append(queue.removeFirst());

        return sb.toString();
    }
}
