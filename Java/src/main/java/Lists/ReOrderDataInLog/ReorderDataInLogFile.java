package Lists.ReOrderDataInLog;

import java.util.*;

public class ReorderDataInLogFile {
    public static void main(String [] args) {
//        String [] input = {"dig2 8 1 5 1","let1 art can","dig1 3 6","let2 own kit dig","let3 art zero"};
//        String [] input = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
//        String [] input = {"t kvr", "r 3 1", "i 403", "7 so", "t 54"};
        String [] input = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"};
        String [] orderdLogs = reorderLogFiles(input);

    }

    public static String[] reorderLogFiles(String[] logs) {
        String [] orderedLogs;
        ArrayList <String> digOrdLogs = new ArrayList<String>();
        ArrayList <String> letOrdLogs = new ArrayList<String>();

        // Step1 - Seperate into two different list
        for (String log : logs) {
            // Fetch the 1st three character sub array
            String [] identifier = log.split(" ");


            if (identifier[1].matches("^[a-zA-Z]*$")) {
                letOrdLogs.add(log);
            } else if (identifier[1].matches("^[0-9]*$")) {
                digOrdLogs.add(log);
            }
        }

        // Step 2 - Sort digOrdLogs
        digOrdLogs = sortDigOrdLogs(digOrdLogs);

        // Step 3 - Sort letOrdLogs
        letOrdLogs = sortLetOrdLogs(letOrdLogs);

        // Step4 - Combine Logs together into one array
        ArrayList<String> mergedList = new ArrayList<String>(letOrdLogs);
        mergedList.addAll(digOrdLogs);
        orderedLogs = mergedList.toArray(new String[0]);
        System.out.println(mergedList);
        return orderedLogs;
    }

    private static ArrayList<String> sortLetOrdLogs(ArrayList<String> letOrdLogs) {
        ArrayList<String> orderedList = new ArrayList<String>();                    // List to be returned
        HashMap<String, String> hmLetMap = new HashMap<String, String>();           // To keep an map of which is which
        ArrayList<String> withoutIdentifierLetOrdLogs = new ArrayList<String>();    // Why Arraylist ? we have duplicates =/

        // Step1 - Place them in List for easy access
        for (int i=0; i < letOrdLogs.size(); i++) {
            String log = letOrdLogs.get(i);
            String formattedLog = log.substring(log.indexOf(" ") + 1, log.length());
            hmLetMap.put(log, formattedLog);                                                // Add to Map
            withoutIdentifierLetOrdLogs.add(formattedLog);                                  // Add to List to be sorted
        }

        // Step2 - Sort the Arraylist WITHOUT the identifier.
        Collections.sort(withoutIdentifierLetOrdLogs);

        // Step3 - Place back into List to Send out
        // At this point, withoutIndentifier list is sorted, we compare this with list and remove the from the hashmap to avoid sending the same one
        for (String orderedLog : withoutIdentifierLetOrdLogs) {
            String key = fetchKeyFromValue(orderedLog, hmLetMap);
            orderedList.add(key);
        }

        return orderedList;
    }

    private static String fetchKeyFromValue(String orderedLog , HashMap<String, String> hmLetMap) {
        for (Map.Entry<String, String> mapSetEntry : hmLetMap.entrySet()) {
            String key = mapSetEntry.getKey();
            String value = mapSetEntry.getValue();
            if (value.equals(orderedLog)) {
                hmLetMap.remove(key);
                return key;
            }
        }
        return null;
    }


    private static ArrayList<String> sortDigOrdLogs(ArrayList<String> digOrdLogs) {

        return digOrdLogs;
    }
}
