package Misc.TrappingRainWater;

public class TrappingRainWater {
    public static void main(String [] args) {
        int [] height = {0,1,0,3,1,0,1,3,2,1,2,1};
        System.out.println("trap: " + trap(height) + "\n");

//        int [] height1 = {4,2,0,3,2,5};
//        System.out.println("trap: " + trap(height1) + "\n");
//
//        int [] height2 = {4,2,3};
//        System.out.println("trap: " + trap(height2) + "\n");
    }

    public static int trap(int[] height) {
        int total = 0;

        for (int i=1; i<height.length-1; i++) {
            int curr = height[i];
            int prev = height[i-1];
            int next = height[i+1];

            System.out.println("current: "+ height[i]);

            if (prev <= curr || curr >= next) {
                continue;
            }

            // This scenario is where prev<current && current<next
            int trappedIndex = 0;
            int leftIndex = i - trappedIndex;
            int rightIndex = i + trappedIndex;
            int prevL = curr;
            int prevR = curr;
            while (0<leftIndex && rightIndex<height.length) {
                int leftCurrent = height[leftIndex];
                int rightCurrent = height[rightIndex];

                // Do not proceed if the L&R Current are smaller than prev ones
                if (leftCurrent < prevL || rightCurrent < prevR) {
                    break;
                }
                System.out.print("   L height["+ leftIndex + "]: " + leftCurrent + " |  R height["+ rightCurrent + "]: " + rightCurrent);

                // Find the difference
                int leftDiff = leftCurrent - prevL;
                int rightDiff = rightCurrent - prevR;
                int minDiff = Math.min(leftDiff, rightDiff);
                System.out.print("  | MinDiff: " + minDiff + "\n");



                //Update the counters
                prevL = leftCurrent;
                prevR = rightCurrent;
                trappedIndex++;
                leftIndex = i - trappedIndex;
                rightIndex = i + trappedIndex;
            }

        }

        return total;
    }
}
