package Strings.ShortestWordDistance;

import java.util.ArrayList;
import java.util.List;

public class ShortestWordDistance {
    public static void main(String [] args) {
        String [] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding", word2 = "practice";
        System.out.println("Shortest Distance: " + shortestDistance(wordsDict, word1, word2));

        String [] wordsDict2 = {"practice", "makes", "perfect", "coding", "makes"};
        word1 = "makes";
        word2 = "coding";
        System.out.println("Shortest Distance: " + shortestDistance(wordsDict2, word1, word2));

        String [] wordsDict3 = {"a", "b"};
        word1 = "a";
        word2 = "b";
        System.out.println("Shortest Distance: " + shortestDistance(wordsDict3, word1, word2));


    }

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int shortestDistance = Integer.MAX_VALUE;

        // Step1 - Create list to store index of word1 and word2 occurences
        List<Integer> indexWord1 = new ArrayList<>();
        List<Integer> indexWord2 = new ArrayList<>();

        // Step2 - Populate the lists
        for (int i=0; i < wordsDict.length; i++) {
            String word = wordsDict[i];

            if (word.equalsIgnoreCase(word1)) {
                indexWord1.add(i);
            } else if (word.equalsIgnoreCase(word2)) {
                indexWord2.add(i);
            }
        }

        // Step3 - Find the shortestDistance
        // We take the difference between word1 and word2.
        // Shortet one gets returned
        for (int i=0; i<indexWord1.size(); i++) {
            for (int j=0; j<indexWord2.size(); j++) {
                int distance = Math.abs(indexWord1.get(i) - indexWord2.get(j));
                if (distance < shortestDistance)
                    shortestDistance = distance;
            }
        }

        return shortestDistance;
    }
}
