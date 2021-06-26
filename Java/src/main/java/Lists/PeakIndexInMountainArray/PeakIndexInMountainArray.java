package Lists.PeakIndexInMountainArray;

public class PeakIndexInMountainArray {
    public static void main (String [] args) {
        int [][] input = {{0,1,0}, {0,2,1,0}, {0,10,5,2}, {3,4,5,1}, {24,69,100,99,79,78,67,36,26,19}};
        for (int [] arr : input)
            System.out.println("Peak Index: " + peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int peakIndex = -1;
        int peakValue = -1;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] > peakValue) {
                peakValue = arr[start];
                peakIndex = start;
            }

            if (arr[end] > peakValue) {
                peakValue = arr[end];
                peakIndex = end;
            }

            start++;
            end--;
        }

        return peakIndex;
    }
}
