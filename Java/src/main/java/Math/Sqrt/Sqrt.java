package Math.Sqrt;

public class Sqrt {

    public static void main(String [] args) {
        int input = 1;
        System.out.println("Sqrt: " + mySqrt(input));
    }

    public static int mySqrt(int target) {
        int sqrt = 0;

        // Edge case where target is 0
        if (target == 0)
            return 0;
        
        for (int i=1; i <= target ; i++) {

            int current = i * i;
            if (target == current) {
                return i;
            } else if (current < target) {  // Current 4

            } else if (current > target) {  // Current 9
                return i - 1;
            }


        }

        return sqrt;
    }

}
