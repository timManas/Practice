package Misc.ExecutionSuffixInstrGrid;

import java.util.Arrays;

public class ExecutionSuffixInstrGrid {
    public static void main(String [] args) {
        int n = 3;
        int [] startPos = {0,1};
        String s = "RRDDLU";
        System.out.println("Exec Instr: " + Arrays.toString(executeInstructions(n, startPos, s)) + "\n");

        int n1 = 2;
        int [] startPos1 = {1,1};
        String s1 = "LURD";
        System.out.println("Exec Instr: " + Arrays.toString(executeInstructions(n1, startPos1, s1)) + "\n");

        int n2 = 1;
        int [] startPos2 = {0,0};
        String s2 = "LRUD";
        System.out.println("Exec Instre " + Arrays.toString(executeInstructions(n2, startPos2, s2)) + "\n");

    }

    public static int[] executeInstructions(int n, int[] startPos, String s) {
        int [] output = new int [s.length()];

        // Step1 - Traverse Instructions
        for (int i=0; i<s.length(); i++) {
            int count = 0;
            char letter = s.charAt(i);
            System.out.println("Letter: " + letter);

            // Step2 - Create copy of the starting position
            int [] currentPos = Arrays.copyOf(startPos, startPos.length);

            // Step3 - Traverse each move
            for (int x=i; x < s.length(); x++) {
                char moveLetter = s.charAt(x);

                // Step4 - Update the current position
                switch(moveLetter) {
                    case ('L'): {
                        currentPos[1] = currentPos[1] - 1;
                        break;
                    } case ('U'): {
                        currentPos[0] = currentPos[0] - 1;
                        break;
                    } case ('R'): {
                        currentPos[1] = currentPos[1] + 1;
                        break;
                    } case ('D'): {
                        currentPos[0] = currentPos[0] + 1;
                        break;
                    }
                }

                // Step5 - Check the position
                if (currentPos[0] < 0 || currentPos[1] < 0 ||
                    currentPos[0] >= n || currentPos[1] >= n ) {
                    break;
                }

                count++;
            }

            output[i] = count;
        }

        return output;
    }
}
