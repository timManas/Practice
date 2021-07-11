package Misc.CrawlerLogFile;

import java.util.Stack;

public class CrawlerLogFile {
    public static void main(String [] args) {
        String [][] input = {{"d1/","d2/","../","d21/","./"}, {"d1/","d2/","./","d3/","../","d31/"}, {"d1/","../","../","../"}};
        for (String [] logs : input)
            System.out.println("Min Operations: " + minOperations(logs));
    }

    public static int minOperations(String[] logs) {

        // Create stack to store the folder path
        Stack<String> stack = new Stack<>();

        // Traverse the input log array
        for (int i=0; i<logs.length; i++) {
            String command = logs[i].split("/")[0]; // Find the command

            // Perform action
            switch (command) {
                case ".": {
                    // Do Nothing since stay the same
                    break;
                }
                case "..": {
                    if (stack.size() >= 1)
                        stack.pop() ;
                    break;
                } default: {
                    stack.push(command);
                }            }
        }

        return stack.size();
    }
}
