package Lists.ValidMountainArray;

public class ValidMountainArray {
    public static void main(String [] args) {
        int [][] arr = {{2,1}, {3,5,5}, {0,3,2,1}};
        for (int [] i : arr)
            System.out.println("valid mountain array: " + validMountainArray(i) + "\n");

    }

    public static boolean validMountainArray(int[] arr) {

        // Step1 - Keep track of # of changes
        int hasChanged = 0;
        String prevState = "";

        // Step2 - Traverse each number in array
        for (int i=1; i < arr.length; i++) {
            int prev = arr[i-1];
            int current = arr[i];
            String currentState = "neutral";

            // Step3 - Find what current state is
            if (prev == current) {
                currentState = "neutral";
            } else if (prev < current) {
                currentState = "increasing";
            }else if (prev > current) {
                currentState = "decreasing";
            }

            // If beginning of the array. It is imperative that the state is increasing
            if (prevState.equalsIgnoreCase("")) {

                // The beginning HAS to be Incrreasing...otherwise its not a mountain array
                if (!currentState.equalsIgnoreCase("increasing"))
                    return false;

                prevState = currentState;
                hasChanged++;
                continue;
            }


            // Step4 - increment the number of times it changes
            if (currentState.equalsIgnoreCase("neutral")) {
                return false;

            } else if(prevState.equalsIgnoreCase(currentState)) {

            } else {
                hasChanged++;
            }

            // Step5 - Update the prevState
            prevState = currentState;

        }

        return hasChanged == 2;
    }
}
