package Lists.NumDiffIntegerString;

import java.util.Set;
import java.util.TreeSet;

public class NumDiffIntegerString {
    public static void main(String [] args) {
        String [] input = {"a123bc34d8ef34", "leet1234code234", "a1b01c001","167278959591294"};
        for (String i : input)
            System.out.println("Num Diff Int:" + numDifferentIntegers(i) + "\n");
    }

    public static int numDifferentIntegers(String word) {
        // Step1 - Replace all words nondigit with space
        word = word.replaceAll("[A-Za-z]", " ");
        System.out.println("replaced word: " + word);

        // Step2 - Split array
        String [] array = word.split(" ");

        // Step3 - Create set to store unique strings
        Set<String> set = new TreeSet<>();
        for (String w : array) {
            if (w.equals(""))
                continue;
            // Step4 - Replace all leading 0 with blanks
            String number = w.replaceAll("^0+(?!$)", "");
            set.add(number);
        }

        System.out.println("set: " + set);

        return set.size();
    }
}
