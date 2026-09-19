package Lists.ShortDistanceTargetStrCircArray;

public class ShortDistanceTargetStrCircArray {
    public static void main(String [] args) {
        String [] words = {"hello","i","am","leetcode","hello"};
        String target = "hello";
        int startIndex = 1;
        System.out.println("Closest Target: " + closestTarget(words, target, startIndex) + "\n");

        String [] words1 = {"a","b","leetcode"};
        String target1 = "leetcode";
        int startIndex1 = 0;
        System.out.println("Closest Target: " + closestTarget(words1, target1, startIndex1) + "\n");
    }

    public static int closestTarget(String[] words, String target, int startIndex) {
        int distanceForward = Integer.MAX_VALUE;

        if (target == words[startIndex])
            return distanceForward;

        //Traverse Forward
        int countForward = 1;
        int currentIndex = startIndex + 1;
        while (currentIndex != startIndex) {

            if (currentIndex == words.length)
                currentIndex = 0;

            String current = words[currentIndex];
            System.out.println("i: " + currentIndex + "     words[i]: " + current);


            if (current == target)
                distanceForward = Math.min(distanceForward, countForward);

            ++currentIndex;
            ++countForward;
        }

        System.out.println();

        System.out.println("MinDistance Forward: " + distanceForward);


        System.out.println();

        //Traverse Backward
        int distanceBackward = Integer.MAX_VALUE;

        int countBackward = 1;
        currentIndex = startIndex - 1 < 0 ? words.length - 1 : startIndex - 1;
        while (currentIndex != startIndex) {

            if (currentIndex < 0)
                currentIndex = words.length-1;

            String current = words[currentIndex];
            System.out.println("i: " + currentIndex + "     words[i]: " + current);

            if (current == target)
                distanceBackward = Math.min(distanceBackward, countBackward);

            --currentIndex;
            ++countBackward;
        }

        System.out.println("MinDistance Backward: " + distanceBackward);

        if (distanceForward == Integer.MAX_VALUE && distanceBackward == Integer.MAX_VALUE)
            return -1;

        return Math.min(distanceForward, distanceBackward);
    }
}
