package Lists.FindSmallestCommonElementInRows;

import java.util.HashMap;
import java.util.Map;

public class FindSmallestCommonElementInRows {

    public static void main(String [] args) {
        int [][] mat = {{1,2,3,4,5},{2,4,5,8,10},{3,5,7,9,11},{1,3,5,7,9}};
        System.out.println("SmallestCommonElement: " + smallestCommonElement(mat));
    }

    public static int smallestCommonElement(int[][] mat) {
        int element = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int x=0; x < mat.length; x++) {
            for (int y=0; y < mat[x].length; y++) {
                int key = mat[x][y];
                int value = 1;

                if (map.containsKey(key))
                    value = map.get(key) + 1;

                map.put(key, value);
            }
        }

        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            int key = mapEntry.getKey();
            int value = mapEntry.getValue();

            if (value == mat.length)
                return key;
        }


        return element;
    }

}
