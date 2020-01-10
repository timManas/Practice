package Lists.MoveZeroes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MoveZeroes {

    public static void main(String [] args) {

        int [] input = {0,1,0,3,12};
        moveZeroes(input);
        for (int i : input) {
            System.out.println(i);
        }


    }

    public static void moveZeroes(int[] nums) {

        // Solution using a Stack
//        stackSolution(nums);

        // Solution using Queue
        stackQueue(nums);
    }

    private static void stackSolution(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                ++zeroCount;
                continue;
            }
            stack.push(num);
        }

        while (zeroCount-- > 0) {
            stack.push(0);
        }

        for (int i=nums.length -1; i >= 0; i--) {
            nums[i] = stack.pop();
        }
    }

    private static void stackQueue(int[] nums) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                ++zeroCount;
                continue;
            }
            queue.add(num);
        }

        while (zeroCount > 0) {
            queue.add(0);
            --zeroCount;
        }

        for (int i=0; i < nums.length; i++) {
            nums[i] = queue.remove();
        }

    }

}

/**

 Solution
 1. For every 0, shift all elements after 0 by 1 BACKWARDS
 - Performance: O(n^2) ...Yikes
 2. Place in Queue
 - Performance: O(n)
 3. Place in Stack
 - Performance: O(n)

 */
