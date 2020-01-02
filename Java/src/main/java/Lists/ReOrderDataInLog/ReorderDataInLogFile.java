package Lists.ReOrderDataInLog;

import java.util.ArrayList;

public class ReorderDataInLogFile {
    public static void main(String [] args) {
        String [] input = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        String [] orderdLogs = reorderLogFiles(input);

    }

    public static String[] reorderLogFiles(String[] logs) {
        String [] orderedLogs = null;
        ArrayList <String> digOrdLogs = null;
        ArrayList <String> letOrdLogs = null;

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

        // Step 3 - Sort letOrdLogs


        // Step4 - Combine Logs together into one array

        return orderedLogs;
    }
}
