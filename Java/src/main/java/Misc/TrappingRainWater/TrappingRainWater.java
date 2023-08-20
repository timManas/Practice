package Misc.TrappingRainWater;

public class TrappingRainWater {
    public static void main(String [] args) {
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("trap: " + trap(height));
    }

    public static int trap(int[] height) {
        int trap = 0;

        for (int current=0; current<height.length-1; current++) {
            System.out.println("current: "+ height[current]);
            for (int next=current+1; next < height.length; next++) {
                    System.out.println("    next: " + height[next]);

                    if (height[current] <= height[next]) {
                        current = next-1;
                        break;
                    }

            }
        }

        return trap;
    }
}
