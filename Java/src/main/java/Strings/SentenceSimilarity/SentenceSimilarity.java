package Strings.SentenceSimilarity;

import java.util.ArrayList;
import java.util.List;

public class SentenceSimilarity {
    public static void main(String [] args) {
        String [] sentence1 = {"great","acting","skills"};
        String [] sentence2 = {"fine","drama","talent"};
        String [][] temp = {{"great","fine"}, {"drama","acting"}, {"skills","talent"}};
        List<List<String>> similarPairs = convertTo2DList(temp);
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


        return true;
    }
}
