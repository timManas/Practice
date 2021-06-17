package Lists.FindHighestAltitude;

public class FindHighestAltitude {
    public static void main(String [] args) {
        int [][] input = {{-4,-3,-2,-1,4,3,2}, {52,-91,72}};

        for (int [] arr : input) {
            System.out.println("Largest Altitude: " + largestAltitude(arr));
        }
    }

    public static int largestAltitude(int[] input) {
        int largestAltitude = 0;

        int currentAltitude = 0;
        for (int i=0; i < input.length; i++) {
            currentAltitude += input[i];
            largestAltitude = currentAltitude > largestAltitude ? currentAltitude : largestAltitude;
        }

        return largestAltitude;
    }
}
