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
        {"vehicle","car"},{"entertain","have"},{"drink","have"},{"eat","have"},{"take","have"},{"fruits","meal"},{"brunch","meal"},{"breakfast","meal"},
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

        // Create map to store the similar pairs
        Map<String, String> map = new TreeMap<>();
        for (List<String> pairs : similarPairs) {
            map.put(pairs.get(0), pairs.get(1));
            map.put(pairs.get(1), pairs.get(0));
        }
        System.out.println("Map: " + map);

        StringBuilder sbSentence1 = new StringBuilder();
        StringBuilder sbSentence2 = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String word : sentence1) {
            String converted = map.containsKey(word) ? map.get(word) : word;
            sb1.append(converted);

            sbSentence1.append(word);
        }

        for (String word : sentence2) {
            String converted = map.containsKey(word) ? map.get(word) : word;
            sb2.append(converted);

            sbSentence2.append(word);
        }

        System.out.println("sbSentence1: " + sbSentence1);
        System.out.println("sbSentence2: " + sbSentence2);
        System.out.println("sb1: " + sb1);
        System.out.println("sb2: " + sb2);


        return sb1.toString().equals(sbSentence2.toString()) || sb2.toString().equals(sbSentence1.toString());
    }
}
