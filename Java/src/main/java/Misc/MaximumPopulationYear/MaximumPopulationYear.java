package Misc.MaximumPopulationYear;

import java.util.*;

public class MaximumPopulationYear {
    public static void main(String [] args) {
//        int [][] logs = {{1993,1999}, {2000,2010}};
//        System.out.println("Max Population: " + maximumPopulation(logs));

//        int [][] logs2 = {{1950,1961}, {1960,1971}, {1970,1981}};
//        System.out.println("Max Population: " + maximumPopulation(logs2));

        int [][] logs3 = {{2025,2041},{1988,2007},{2003,2046},{2045,2049},{2025,2027},{2014,2040},{2014,2027},{2011,2027},{1972,2019}};
        System.out.println("Max Population: " + maximumPopulation(logs3));
    }

    public static int maximumPopulation(int[][] logs) {

        List<List<Integer>> populationLogs = new ArrayList<>();

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i=0; i < logs.length; i++) {
           int [] person = logs[i];
           int birth = person[0];
           int death = person[1];

            List<Integer> tempList = new ArrayList<>();
            tempList.add(birth);
            tempList.add(death);
            populationLogs.add(tempList);


            for (int x=0; x < populationLogs.size(); x++) {
               int start = populationLogs.get(x).get(0);
               int end = populationLogs.get(x).get(1);

               if (start <= birth && birth <= end) {
                   if (map.containsKey(birth)) {
                       map.put(birth, map.get(birth) + 1);
                   } else {
                       map.put(birth, 1);
                   }
               }
           }
        }

        // Traverse Map to find largest year
        int largestPopulation = 0;
        int earliestYear = 0;
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
