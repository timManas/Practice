package Math.DecompressList;

import java.util.ArrayList;

public class DecompressList {

    public static void main(String [] args) {
        int [] nums = {1,2,3,4};
        int [] result = decompressRLElist(nums);
        for (int i : result)
            System.out.println(i);
    }

    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Step1 -  Use for loop to traverse by 2
        for (int i=0; i < nums.length; i=i+2){

            // Fetch the count and the value to repeat
            int repCount = nums[i];
            int repChar = nums[i+1];
            System.out.println("Index: " + i + "    Repeat: " + repCount + "   Times: " + repChar);

            // Store values in count
            for (int j=0; j < repCount; j++) {
                list.add(repChar);
            }
        }
        
        // Convert to int [] array
        int [] arr = new int[list.size()];
        for (int i=0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
