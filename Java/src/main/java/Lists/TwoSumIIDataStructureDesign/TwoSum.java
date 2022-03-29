package Lists.TwoSumIIDataStructureDesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoSum {
    List<Integer> list;
    public TwoSum() {
      list = new ArrayList<>();
    }

    public void add(int number) {
        this.list.add(number);
        Collections.sort(list);
    }

    public boolean find(int target) {

        if (list.size() <= 1)
            return false;

        for (int i=0; i < list.size(); i++) {
            List<Integer> subList = list.subList(i + 1, list.size());
            int current = list.get(i);
            int difference = target - current;

            System.out.println("current: " + current + "    diff: " + difference + "    target: " + target + "      subList:" + subList);

            if (subList.contains(difference))
                return true;



        }

        return false;
    }
}
