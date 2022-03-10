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
        System.out.println("Are Sentence Similar: " + areSentencesSimilar(sentence1, sentence2, similarPairs));
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

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String word : sentence1) {
            String converted = map.containsKey(word) ? map.get(word) : word;
            sb1.append(converted);
        }

        for (String word : sentence2) {
            String converted = map.containsKey(word) ? map.get(word) : word;
            sb2.append(converted);
        }

        System.out.println("sb1: " + sb1);
        System.out.println("sb2: " + sb2);




        return sb1;
    }
}
