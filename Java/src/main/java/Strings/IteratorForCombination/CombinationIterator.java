package Strings.IteratorForCombination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

class CombinationIterator {

    private List<Integer> indexList;
    private String characters;
    private int maxLength;
    private StringBuilder sb;

    public CombinationIterator(String characters, int combinationLength) {
        this.indexList = new ArrayList<>();
        this.characters = characters;
        this.maxLength = combinationLength;
        this.sb = new StringBuilder();

        initializeList();
    }

    private void initializeList() {
        int counter = 0;
        while (counter < maxLength) {
            indexList.add(counter);
            counter++;
        }
    }


    public String next() {

        // Clear sb
        sb.delete(0, sb.length());

        for (int i=0; i < indexList.size(); i++) {
            char letter = characters.charAt(indexList.get(i));
            sb.append(letter);
        }
        System.out.println(sb.toString());

        incrementIndex();

        return sb.toString();
    }

    private void incrementIndex() {
    }


    public boolean hasNext() {
        return false;
    }
}