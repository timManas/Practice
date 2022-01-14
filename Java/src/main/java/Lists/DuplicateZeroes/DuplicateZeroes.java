package Lists.DuplicateZeroes;

public class DuplicateZeroes {
    public static void main(String [] args) {
        int [][] input = {{0,1,7,6,0,2,0,7},{1,0,2,3,0,4,5,0}, {1,2,3}};
        for (int [] x : input) {
            duplicateZeros(x);
            System.out.println("Output: ");
            for (int i : x) System.out.print(i + ",");
            System.out.println("\n");
        }

    }

    public static void duplicateZeros(int[] arr) {
        // Find out how many zeroes are present
        int numZeros = 0;
        for (int i=0; i<arr.length-2; i++) numZeros = arr[i] == 0 ? numZeros + 1 : numZeros;
        System.out.println("NumZeroes: " + numZeros);

        // Return if no zeroes present
        if (numZeros == 0)
            return;

        int lastIndex = arr.length - 1;
        for (int x=(arr.length - 1) - numZeros; x >= 0; x--) {
            System.out.println(arr[x]);
            int current = arr[x];

            if (current == 0) {
                arr[lastIndex] = 0;
                --lastIndex;
            }

            arr[lastIndex] = current;
            --lastIndex;
        }
    }
}
