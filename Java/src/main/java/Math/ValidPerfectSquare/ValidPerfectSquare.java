package Math.ValidPerfectSquare;

public class ValidPerfectSquare {
    public static void main(String [] args) {
        int [] input = {2147483647, 16,14};
        for (int i : input)
            System.out.println("isPerfectSq: " + isPerfectSquare(i) + "\n");
    }

    public static boolean isPerfectSquare(int target) {
        int num = 1;
        int squared = 1;

        // Step1 - Traverse from 1 to targer
        while (num <= target) {
            squared = num * num;

            System.out.println("num: " + num + "    squared: " + squared);

            // Step2 - Check if squared is equal to target
            if (squared == target)
                return true;

            // Step3 - If squared is bigger than target, means it is not perfect square
            // If squared is negative, then that means we by passed the int limit boundaries. Hence it becomes a negative number
            if (squared > target || squared < 0 )
                return false;

            ++num;
        }

        return false;
    }
}
