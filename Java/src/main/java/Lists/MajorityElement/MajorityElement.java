package Lists.MajorityElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String [] args) {
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println("MajorityElement: " + majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int majority = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>(map.values());
        Collections.sort(list);
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            int key = mapEntry.getKey();
            int value = mapEntry.getValue();

            if(value == list.get(list.size() - 1))
                return key;
        }

        return majority;
    }

}
