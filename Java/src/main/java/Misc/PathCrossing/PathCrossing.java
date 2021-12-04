package Misc.PathCrossing;

import java.util.Set;
import java.util.TreeSet;

public class PathCrossing {
    public static void main(String [] args) {
        String [] input = {"NES", "NESWW", "NEEEEEEEEEENNNNNNNNNNWWWWWWWWWW"};
        for (String i : input)
            System.out.println("Is PathCrossing: " + isPathCrossing(i));
    }

    public static boolean isPathCrossing(String path) {

        // Step1 - Create set and store origin point
        Set<String> set = new TreeSet<>();
        set.add("00");
        int x = 0;
        int y = 0;

        // Step2 - Traverse through each letter
        for (int i=0; i<path.length(); i++) {
            char letter = path.charAt(i);

            // Step3 - Increment the counter
            switch (letter) {
                case 'N':
                    ++y;
                    break;
                case 'E':
                    ++x;
                    break;
                case 'S':
                    --y;
                    break;
                case 'W':
                    --x;
                    break;

            }
            // Step4 - Check if set already contains coordinates
            if (set.contains(x + String.valueOf(y)))
                return true;

            // Step5 - Add coordinates to set
            set.add(x + String.valueOf(y));
            System.out.println("x:" + x + "     y: " + y);
        }

        return false;       // return false if paths have not crossed
    }
}
