package Math.SortIntegersByPowerValue;

import java.util.Map;
import java.util.TreeMap;

public class SortIntegersByPowerValue {

    public static void main(String [] args) {
        int lo = 12;
        int hi = 15;
        int k = 2;

        System.out.println("Kth value: " + getKth(lo, hi, k));
    }

    public static int getKth(int lo, int hi, int k) {
        int result = 0;
        Map<Integer, Integer> map = new TreeMap<>();

        while (lo <= hi) {
            
            ++lo;
        }

        return result;
    }

}
