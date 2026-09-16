package Lists.MinDisBetweenThreeElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MinDisBetweenThreeElements {

    public static void main(String [] args) {
        int [][] input = {{1,2,1,1,3}, {1,1,2,3,2,1,2}, {1}};
        for (int [] i : input)
            System.out.println("Min Distance: " + minimumDistance(i) + "\n");
    }

    public static int minimumDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> map = new TreeMap<>();

        for (int i=0; i<nums.length; i++) {
            int current = nums[i];

            List<Integer> list = new ArrayList<>();
            if (map.containsKey(current))
                list = map.get(current);
            list.add(i);
            map.put(current, list);
        }
        System.out.println("Map: " + map);


        for (Map.Entry<Integer, List<Integer>> keyVal : map.entrySet()) {
            List<Integer> list = keyVal.getValue();

            if (list.size() < 3)
                continue;

            System.out.println("Checking: " + list );
            for (int index=0; index<list.size()-2; index++) {
                int i = list.get(index);
                int j = list.get(index + 1);
                int k = list.get(index + 2);
                int distance = Math.abs(i - j) + Math.abs(j-k) + Math.abs((k-i));
                System.out.println("distance: " + distance + "      min: " + min);

                min = Math.min(min, distance);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
