package Math.PartitionDeciBinary;

public class PartitionDeciBinary {
    public static void main (String [] args) {
        String [] input = {"32", "82734","27346209830709182346"};
        for (String i : input)
            System.out.println("minPartition: " + minPartitions(i) + "\n");
    }

    // TIP: We have to count the largest number in the input. You should see a pattern here
    // Why ? Because that will be a maximum number of times we have to subtract until we get to zero
    private static int minPartitions(String n) {

        int largest = 0;
        for (int i=0; i < n.length(); i++) {
            largest = Integer.parseInt(String.valueOf(n.charAt(i))) > largest ? Integer.parseInt(String.valueOf(n.charAt(i))) : largest;
        }

        return largest;
    }

    // This only passes 91/97
    public static int minPartitions_OLD(String n) {

        int nSize = n.length();

        int counter = 0;

        // Create string builder to store all the non zero values
        StringBuilder sb = new StringBuilder(n);

        // Create base string with all 1's
        StringBuilder deciBinary = new StringBuilder();
        for (int i=0; i < sb.length(); i++) {
            char letter = sb.charAt(i);

            if (letter == '0') {
                deciBinary.append('0');
                nSize--;
            } else {
                deciBinary.append('1');
            }
        }
        System.out.println("deciBinary: " + deciBinary);


        // Keep running the loop until we get to all 0000000000....
        while (nSize > 0) {
            System.out.println("sb: " + sb + "      base: " + deciBinary);

            for (int i=0; i < sb.length();i++) {
                int s = Integer.parseInt(String.valueOf(sb.charAt(i)));
                int b = Integer.parseInt(String.valueOf(deciBinary.charAt(i)));

                if (s == 0)
                    continue;

                int diff = s - b;
                sb.replace(i, i+1, String.valueOf(diff));

                if (diff == 0)
                    nSize--;

            }
            System.out.println("sb: " + sb);
            counter++;
        }

        return counter;
    }
}
