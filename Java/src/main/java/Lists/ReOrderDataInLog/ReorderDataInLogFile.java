package Lists.ReOrderDataInLog;

import java.util.ArrayList;
import java.util.TreeMap;

public class ReorderDataInLogFile {
    public static void main(String [] args) {
        String [] input = {"dig2 8 1 5 1","let1 art can","dig1 3 6","let2 own kit dig","let3 art zero"};
        String [] orderdLogs = reorderLogFiles(input);

    }

    public static String[] reorderLogFiles(String[] logs) {
        String [] orderedLogs;
        ArrayList <String> digOrdLogs = new ArrayList<String>();
        ArrayList <String> letOrdLogs = new ArrayList<String>();

        // Step1 - Seperate into two different list
        for (String log : logs) {
            // Fetch the 1st three character sub array
            String identifier = log.substring(0,4);
            System.out.println(identifier);

            if (identifier.contains("dig")) {
                digOrdLogs.add(log);
            } else if (identifier.contains("let")) {
                letOrdLogs.add(log);
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

        return orderedLogs;
    }

    private static ArrayList<String> sortLetOrdLogs(ArrayList<String> letOrdLogs) {
        TreeMap<Integer, String> tmLetMap = new TreeMap<Integer, String>();
        for (int i=0; i < letOrdLogs.size(); i++) {
            String log = letOrdLogs.get(i);
            int total = fetchTotal(log.substring(4, log.length()));
            tmLetMap.put(total, log);
        }

        ArrayList<String> orderedList = new ArrayList<String>(tmLetMap.values());
        return orderedList;
    }

    private static int fetchTotal(String log) {
        int total = 0;
        char [] logArr = log.toCharArray();
        for (int i=0; i < logArr.length; i++) {
            total = total + (int)(logArr[i]);
        }

        return total;
    }

    private static ArrayList<String> sortDigOrdLogs(ArrayList<String> digOrdLogs) {

        TreeMap<Integer, String> tmDigMap = new TreeMap<Integer, String>();
        for (int i = 0; i < digOrdLogs.size(); i++) {
            String log = digOrdLogs.get(i);
            int identifier = Integer.parseInt(log.substring(3,4));
            tmDigMap.put(identifier, log);
        }

        ArrayList<String> orderedList = new ArrayList<String>(tmDigMap.values());
        return orderedList;
    }
}
