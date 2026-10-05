package Math.CountCommasInRange;

public class CountCommasInRange {
    public static void main(String [] args) {
        int [] input = {1002, 998, 10015, 215000, 1234567};
        for (int i : input)
            System.out.println("Count commas: " + countCommas(i) + "\n");
    }

    public static int countCommas(int n) {
        int count = 0;

        for (int i=1;  i<=n; i++) {
//            System.out.println("i: " + i);

            String current = String.valueOf(i);
            if (current.length() <= 3)
                continue;
            else if(current.length() <= 6)
                count += 1;
            else if(current.length() <= 9)
                count += 2;
            else if(current.length() <= 12)
                count += 3;
        }


        return count;
    }
}
