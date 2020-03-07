package Lists.FindEvenNumberDigits;

public class FindEvenNumberDigits {

    public static void main(String [] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println("Even Number Digits: " + findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            String [] digitArray = String.valueOf(num).split("");
            if (digitArray.length % 2 ==  0)
                count++;
        }


        return count;
    }
}
