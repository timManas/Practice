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

        // If both are sentences are not the same size. Then they are not equal
        if (sentence1.length != sentence2.length)
            return false;

        // Create map to store the similar pairs
        Map<String, List<String>> map1 = new TreeMap<>();
        Map<String, List<String>> map2 = new TreeMap<>();
        for (List<String> pairs : similarPairs) {
            String key = pairs.get(0);
            String value = pairs.get(1);

            // Add to map1
            List<String> temp1 = new ArrayList<>();
            if (map1.containsKey(key)) {
                temp1 = map1.get(key);

            }
            temp1.add(value);
            map1.put(key, temp1);


            // Add to map2
            List<String> temp2 = new ArrayList<>();
            if (map2.containsKey(value)) {
                temp2 = map2.get(value);

            }
            temp2.add(key);
            map2.put(value, temp2);

        }
        System.out.println("Map: " + map1);
        System.out.println("Map: " + map2);



        return true;
    }
}
