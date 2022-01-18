package Lists.CheckIfIntegersInRange;

public class CheckIfIntegersInRange {
    public static void main(String [] args) {
        int [][] range = {{1,2}, {3,4}, {5,6}};
        int left = 2;
        int right = 5;
        System.out.println("Is Covered: " + isCovered(range, left, right));


        int [][] range1 = {{1,10}, {10,20}};
        int left1 = 21;
        int right1 = 21;
        System.out.println("Is Covered: " + isCovered(range1, left1, right1));
    }

    public static  boolean isCovered(int[][] ranges, int left, int right) {

        for (int row=0; row < ranges.length; row++) {
            System.out.println("Row: " + ranges[row][0] + "," + ranges[row][1]);

            if (left <= ranges[row][0] && ranges[row][0] <= right) {
                System.out.println("WithinBounds: " + ranges[row][0]);
            } else {
                if (left <= ranges[row][1] && ranges[row][1] <= right) {
                    System.out.println("WithinBounds: " + ranges[row][1]);
                } else
                    return false;
            }
        }
        return true;
    }
}
