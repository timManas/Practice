package Misc.MaximumPopulationYear;

import java.util.*;

public class MaximumPopulationYear {
    public static void main(String [] args) {
//        int [][] logs = {{1993,1999}, {2000,2010}};
//        System.out.println("Max Population: " + maximumPopulation(logs));

//        int [][] logs2 = {{1950,1961}, {1960,1971}, {1970,1981}};
//        System.out.println("Max Population: " + maximumPopulation(logs2));

//        int [][] logs3 = {{2025,2041},{1988,2007},{2003,2046},{2045,2049},{2025,2027},{2014,2040},{2014,2027},{2011,2027},{1972,2019}};
//        System.out.println("Max Population: " + maximumPopulation(logs3));

        int [][] logs4 = {{2008,2026},{2004,2008},{2034,2035},{1999,2050},{2049,2050},{2011,2035},{1966,2033},{2044,2049}};
        System.out.println("Max Population: " + maximumPopulation(logs4));
    }

    public static int maximumPopulation(int[][] logs) {
        // Step1 - Create map to store population
        Map<Integer, Integer> map = new TreeMap<>();

        // Step2 - Traverse through
        for (int i=0; i < logs.length; i++) {
           int [] person = logs[i];
           int birth = person[0];
           int death = person[1];

           for (int x=birth; x < death; x++) {
               if (map.containsKey(x)) {
                   map.put(x, map.get(x) + 1);
               } else {
                   map.put(x,1);
               }
           }
        }

        // Step3 - Traverse Map to find largest year
        int largestPopulation = 0;
        int earliestYear = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            if (largestPopulation < mapEntry.getValue()) {
                largestPopulation = mapEntry.getValue();
                earliestYear = mapEntry.getKey();
            }
        }

        System.out.println("Map: " + map);


        return earliestYear;
    }
}
