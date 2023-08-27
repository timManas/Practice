package Misc.PascalTriangleII;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PascalTriangleII {

    public static void main(String [] args) {
        int [] rowIndex = {3,4,0,1};
        for (int i : rowIndex)
            System.out.println("getRow: " + getRow(i) + "\n");
    }

    public static List<Integer> getRow(int rowIndex) {


        List<Integer> output = new ArrayList<>();
        output.add(1);

        if (rowIndex == 0)
            return output;

        output.add(1);

        if (rowIndex == 1)
            return output;

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i=2; i <= rowIndex; i++) {
            System.out.println("i: " + i);

            for (int x=0; x < output.size() - 1; x++) {
                int current = output.get(x);
                int next = output.get((x+1));
                System.out.println("current: " + current + "      next: " + next);

                int temp = current + next;
                queue.addLast(temp);
            }
            queue.addFirst(1);
            queue.addLast(1);
            System.out.println("Queue: " + queue);

            output = new ArrayList<>(queue);
            queue.clear();
        }


        return output;
    }
}
