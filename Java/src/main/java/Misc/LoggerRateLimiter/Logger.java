package Misc.LoggerRateLimiter;

import java.util.LinkedHashMap;
import java.util.Map;

public class Logger {

    private Map<String, Integer> map;

    /** Initialize your data structure here. */
    public Logger() {
        map = new LinkedHashMap<>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {

        // Step1 - Check if message exists in Map
        if (!map.containsKey(message)) {
            map.put(message, timestamp);
            return true;
        }

        // Step2 - At this point, map contains message. Hence we have to check if timestamp is greater than 10 seconds
        if (timestamp >= map.get(message) + 10) {
            map.put(message, timestamp);
            return true;
        }

        return false;
    }
}
