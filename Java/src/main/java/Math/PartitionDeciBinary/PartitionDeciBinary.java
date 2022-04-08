package Math.PartitionDeciBinary;

public class PartitionDeciBinary {
    public static void main (String [] args) {
        String [] input = {"32", "82734", "27346209830709182346"};
        for (String i : input)
            System.out.println("minPartition: " + minPartitions(i) + "\n");
    }

    public static int minPartitions(String n) {
        int counter = 0;

        // Create base string with all 1's
        StringBuilder base = new StringBuilder();
        for (int i=0; i<n.length(); i++) base.append('1');

        // Create stringbuilder to store all the non zero values
        StringBuilder sb = new StringBuilder(n);

        // Keep running the loop until we get to all 0000000000....
        while (base.indexOf("1") != -1) {
            System.out.println("sb: " + sb + "      base: " + base);


            counter++;
        }




        return counter;
    }
}
