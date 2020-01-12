package Lists.IntersectionOfArrays;

import java.util.Arrays;
import java.util.TreeSet;

public class IntersectionOfArrays {


    public static void main(String [] args) {
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};

        int [] nums3 = intersection(nums1, nums2);
        for (int i : nums3)
            System.out.println(i);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int [] intersection = new int[nums1.length + nums2.length];
        TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();

        // Add to TreeSets to avoid duplicates
        for (int i=0; i < nums1.length; i++) {
            treeSet1.add(nums1[i]);
        }

        for (int i=0; i < nums2.length; i++) {
            treeSet2.add(nums2[i]);
        }

        // Travere and Compare Sets
        int counter = 0;
        TreeSet<Integer> smallTreeSet = treeSet1.size() <= treeSet2.size() ? treeSet2 : treeSet1;
        for (int integer : smallTreeSet) {

            // One or Both of the Sets dont contain the integer
            if (!treeSet1.contains(integer) || !treeSet2.contains(integer))
                continue;

            intersection[counter] = integer;
            counter++;
        }

        int [] newIntersection = Arrays.copyOf(intersection, counter);

        return newIntersection;
    }
}
