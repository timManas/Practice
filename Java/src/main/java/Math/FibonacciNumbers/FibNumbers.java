package Math.FibonacciNumbers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FibNumbers {

    public static void main(String [] args) {

        System.out.println("FibValue: " + fib(4));
    }

    public static int fib(int N) {
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for (int i=0; i <= N; i++) {


            if (i == 0) {
                map.put(i, 0);
            } else if (i ==1 ) {
                map.put(i, 1);
            } else {
                int fibValue = map.get(i - 1) + map.get(i - 2);
                map.put(i, fibValue);
            }
        }

        System.out.println(map);


        int fibValue = map.get(map.size() - 1);


        return fibValue;
    }

}
