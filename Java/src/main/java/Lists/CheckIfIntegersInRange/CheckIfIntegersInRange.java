package Lists.CheckIfIntegersInRange;

public class CheckIfIntegersInRange {
    public static void main(String [] args) {
        int [][] range = {{1,2}, {3,4}, {5,6}};
        int left = 2;
        int right = 5;
        System.out.println("Is Covered: " + isCovered(range, left, right) + "\n");


        int [][] range1 = {{1,10}, {10,20}};
        int left1 = 21;
        int right1 = 21;
        System.out.println("Is Covered: " + isCovered(range1, left1, right1) + "\n");


        int [][] range2 = {{36,50},{14,28},{4,31},{24,37},{13,36},{27,33},{23,32},{23,27},{1,35}};
        int left2 = 35;
        int right2 = 40;
        System.out.println("Is Covered: " + isCovered(range2, left2, right2) + "\n");

    }

    public static  boolean isCovered(int[][] ranges, int left, int right) {
        int current = left;
        int index = 0;
        while (current <= right) {
            System.out.println("Current: " + current);

            if (index > ranges.length - 1)
                return false;

            int [] range = ranges[index];

            if (range[0] <= current && current <= range[1] ) {
                System.out.println("Current Found range: " + range[0] + "," + range[1]);
                ++current;
            } else {
                System.out.println("Not Found");
                ++index;
            }

        }
        return true;
    }
}
