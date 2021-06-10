package Strings.GoalParser;

public class GoalParser {
    public static void main(String [] args) {
        String [] input = {"G()(al)", "G()()()()(al)", "(al)G(al)()()G"};
        for (String i : input) {
            System.out.println("Output: " + interpret(i));
        }
    }

    public static String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}
