package Math.PartitionDeciBinary;

public class PartitionDeciBinary {
    public static void main (String [] args) {
        String [] input = {"27346209830709182346"};
//        String [] input = {"32", "82734"};
        for (String i : input)
            System.out.println("minPartition: " + minPartitions(i) + "\n");
    }

    public static int minPartitions(String n) {

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
