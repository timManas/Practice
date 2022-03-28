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
        for (int i=0; i < list.size(); i++) {
            int current = list.get(i);
            int difference = target - current;
            if (current > target )
                break;

            if (list.contains(difference) && list.indexOf(difference) != i)
                return true;


        }

        return false;
    }
}
