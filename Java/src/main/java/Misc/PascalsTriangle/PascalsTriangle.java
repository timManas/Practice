package Misc.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String [] args) {
        int [] input = {5,1};
        for (int i : input)
            System.out.println("Triangle: " + generate(i));
    }

    public static List<List<Integer>> generate(int numRows) {

        // Step1 - Create output variable
        List<List<Integer>> output = new ArrayList<>();

        // Step2 - Traverse from from 0 to numRows-1
        for (int i=0; i < numRows; i++) {
            List<Integer> tempList = new ArrayList<>();

            // If first row, add only 1
            if (i==0) {
                tempList.add(1);
            } else if (i==1) {  // Add two 1's on second
                tempList.add(1);
                tempList.add(1);
            } else {

                tempList.add(1);    // Add the border ones

                // Step3- Calculate the total of the row above
                for (int x=1; x < output.get(i-1).size(); x++) {
                    int current = output.get(i-1).get(x);
                    int prev = output.get(i-1).get(x-1);
                    tempList.add(current + prev);
                }
                tempList.add(1);    // Add the border ones
            }
            System.out.println("tempList: " + tempList);

            // Step5 - Add to the output list
            output.add(tempList);
        }
        

        return output;
    }
}
