package Misc.TrappingRainWater;

public class TrappingRainWater {
    public static void main(String [] args) {
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
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
            while (0<leftIndex && rightIndex<height.length) {
                System.out.println("    L: " + leftIndex + "    |   R: " + rightIndex);

                trappedIndex++;
                leftIndex = i - trappedIndex;
                rightIndex = i + trappedIndex;
            }

        }

        return total;
    }
}
