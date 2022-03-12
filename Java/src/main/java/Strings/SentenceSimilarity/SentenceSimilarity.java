package Strings.SentenceSimilarity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SentenceSimilarity {
    public static void main(String [] args) {
        String [] sentence1 = {"great","acting","skills"};
        String [] sentence2 = {"fine","drama","talent"};
        String [][] temp = {{"great","fine"}, {"drama","acting"}, {"skills","talent"}};
        List<List<String>> similarPairs = convertTo2DList(temp);
        System.out.println("Are Sentence Similar: " + areSentencesSimilar(sentence1, sentence2, similarPairs) + "\n");

        String [] sentence1A = {"an","extraordinary","meal"};
        String [] sentence2A = {"one","good","dinner"};
        String [][] tempA = {{"great","good"}, {"drama","acting"}, {"skills","talent"}, {"extraordinary","good"},{"well","good"},
        {"wonderful","good"},{"excellent","good"},{"fine","good"},{"nice","good"},{"any","one"},{"some","one"},{"unique","one"},
        {"the","one"},{"an","one"},{"single","one"},{"a","one"},{"truck","car"},{"wagon","car"},{"automobile","car"},{"auto","car"},
        {"vehicle","car"},{"entertain","have"},{"drink","have"},{"eat","have"},{"take","have"},{"fruits","meal"},{"brunch","meal"}, {"breakfast","meal"},
        {"food","meal"},{"dinner","meal"},{"super","meal"},{"lunch","meal"},{"possess","own"},{"keep","own"},{"have","own"},
        {"extremely","very"},{"actually","very"},{"really","very"},{"super","very"}};
        List<List<String>> similarPairsA = convertTo2DList(tempA);
        System.out.println("Are Sentence Similar: " + areSentencesSimilar(sentence1A, sentence2A, similarPairsA) + "\n");


        String [] sentence1B = {"one","good","dinner"};
        String [] sentence2B = {"one","good","dinner"};
        String [][] tempB = {{"great","good"},{"extraordinary","good"},{"well","good"},{"wonderful","good"},{"excellent","good"},
                {"fine","good"},{"nice","good"},{"any","one"},{"some","one"},{"unique","one"},{"the","one"},{"an","one"},
                {"single","one"},{"a","one"},{"truck","car"},{"wagon","car"},{"automobile","car"},{"auto","car"},{"vehicle","car"},
                {"entertain","have"},{"drink","have"},{"eat","have"},{"take","have"},{"fruits","meal"},{"brunch","meal"},
                {"breakfast","meal"},{"food","meal"},{"dinner","meal"},{"super","meal"},{"lunch","meal"},{"possess","own"},
                {"keep","own"},{"have","own"},{"extremely","very"},{"actually","very"},{"really","very"},{"super","very"}};

        List<List<String>> similarPairsB = convertTo2DList(tempB);
        System.out.println("Are Sentence Similar: " + areSentencesSimilar(sentence1B, sentence2B, similarPairsB) + "\n");



    }

    private static List<List<String>> convertTo2DList(String[][] temp) {
        List<List<String>> list = new ArrayList<>();

        for (int i=0; i<temp.length; i++) {
            List<String> tempList = new ArrayList<>();
            tempList.add(temp[i][0]);
            tempList.add(temp[i][1]);
            list.add(tempList);
        }
        return list;
    }


    public static boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {

        // Step1 - If similar pairs are empty, then they are similar
        if (similarPairs.isEmpty())
            return true;

        // Step2 - If both are sentences are not the same size. Then they are not equal
        if (sentence1.length != sentence2.length)
            return false;

        // Step3 - Create two to store the pairs
        // map1 will deal element 0 as key , element1 as value
        // map2 will deal element 0 as value, element1 as key
        Map<String, List<String>> map1 = new TreeMap<>();
        Map<String, List<String>> map2 = new TreeMap<>();
        for (List<String> pairs : similarPairs) {
            String key = pairs.get(0);
            String value = pairs.get(1);

            // Step4a - Add to map1
            List<String> temp1 = new ArrayList<>();
            if (map1.containsKey(key)) {
                temp1 = map1.get(key);

            }
            temp1.add(value);
            map1.put(key, temp1);


            // Step4b - Add to map2
            List<String> temp2 = new ArrayList<>();
            if (map2.containsKey(value)) {
                temp2 = map2.get(value);

            }
            temp2.add(key);
            map2.put(value, temp2);

        }
        System.out.println("Map: " + map1);
        System.out.println("Map: " + map2);

        // Step5 - Go through each pair one by one
        for (int i=0; i < sentence1.length; i++) {
            String word1 = sentence1[i];
            String word2 = sentence2[i];

            // If the sentences have the same sentences, we simply move on.
            if (word1.equalsIgnoreCase(word2))
                continue;

            // Check map1 and map2 contains the pair
            if (map1.containsKey(word1) && map1.get(word1).contains(word2))
                continue;
            if (map2.containsKey(word1) && map2.get(word1).contains(word2))
                continue;

            if (map1.containsKey(word2) && map1.get(word2).contains(word1))
                continue;
            if (map2.containsKey(word2) && map2.get(word2).contains(word1))
                continue;


            // return false if no matches seen
            return false;
        }


        return true;    // if all pairs match
    }
}
