package Misc.LoggerRateLimiter;

public class LoggerRateLimiter {
    public static void main (String [] args) {
        Logger obj = new Logger();
        System.out.println(obj.shouldPrintMessage(1, "foo"));
        System.out.println(obj.shouldPrintMessage(2, "bar"));
        System.out.println(obj.shouldPrintMessage(3, "foo"));
        System.out.println(obj.shouldPrintMessage(8, "bar"));
        System.out.println(obj.shouldPrintMessage(10, "foo"));
        System.out.println(obj.shouldPrintMessage(11, "foo"));
    }


}
