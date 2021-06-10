package Lists.CountItemsMatchingaRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingaRule {
    public static void main(String [] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList(new String[]{"phone","blue","pixel"}));
        items.add(Arrays.asList(new String[]{"computer","silver","phone"}));
        items.add(Arrays.asList(new String[]{"phone","gold","iphone"}));

        String ruleKey = "type";
        String ruleValue = "phone";

        System.out.println("CountItem: " + countMatches(items, ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int searchIndex = -1;
        if (ruleKey.equalsIgnoreCase("type"))
            searchIndex = 0;
        else if(ruleKey.equalsIgnoreCase("color"))
            searchIndex = 1;
        else if(ruleKey.equalsIgnoreCase("name"))
            searchIndex = 2;

        for (List<String> list : items) {
            if (list.get(searchIndex).equalsIgnoreCase(ruleValue))
                count++;
        }

        return count;
    }
}
