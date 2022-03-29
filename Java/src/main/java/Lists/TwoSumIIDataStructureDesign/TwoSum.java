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

        // Step1 - Check size
        if (list.size() <= 1)
            return false;

        for (int i=0; i < list.size(); i++) {
            // Step2 - Get Sublist to find the missing element
            List<Integer> subList = list.subList(i + 1, list.size());
            int current = list.get(i);
            int difference = target - current;

            System.out.println("current: " + current + "    diff: " + difference + "    target: " + target + "      subList:" + subList);

            // Step3 - Use Binary Search
            int indexDiff = findElement(subList, difference, 0, subList.size() - 1);
            if (indexDiff != -1)
                return true;
        }

        return false;
    }

    private int findElement(List<Integer> list, int difference, int start, int end) {

        if (start > end || list.isEmpty())
            return -1;

        int i = (start + end) / 2;
        int mid = list.get(i);


        if (mid == difference) {
            return i;
        } else if (mid < difference) {
            return findElement(list, difference, i + 1, end);
        } else if (mid > difference) {
            return findElement(list, difference, start, i - 1);
        }

        return -1;
    }
}
