package Misc.TrappingRainWater;

public class TrappingRainWater {
    public static void main(String [] args) {
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("trap: " + trap(height));
    }

    public static int trap(int[] height) {
        int total = 0;
        int [] dp = new int[height.length];

        for (int current=0; current<height.length-1; current++) {
            System.out.println("current: "+ height[current]);

            int trap = 0;
            for (int next=current+1; next < height.length; next++) {
                System.out.println("    next: " + height[next]);

                if (height[current] <= height[next]) {
                    current = next-1;
                    dp[next-1] = next-1;
                    total += trap;
                    System.out.println("        trap: " + trap + "      total: " + total);
                    break;
                }

                trap += height[current] - height[next];


            }
        }

        return total;
    }
}
