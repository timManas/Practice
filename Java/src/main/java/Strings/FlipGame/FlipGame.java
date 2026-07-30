package Strings.FlipGame;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {
    public static void main(String [] args) {

        String [] input = {"++++", "+"};
        for (String i : input) {
            System.out.println("Possible Moves: " + generatePossibleNextMoves(i));
        }
    }

    public static List<String> generatePossibleNextMoves(String currentState) {
        List<String> output = new ArrayList<>();
        StringBuilder tmp = new StringBuilder(currentState);

        if (currentState.length() <= 1)
            return output;

        for (int i=0; i<currentState.length()-1; i++) {
            char character = currentState.charAt(i);
            char next = currentState.charAt(i+1);

            if (character == '+' && next == '+') {
               tmp.setCharAt(i, '-');
               tmp.setCharAt(i+1, '-');
               output.add(tmp.toString());
               tmp = new StringBuilder(currentState);
            }
        }


        return output;
    }
}
