package Lists.FindSmallestLetterGreaterThanTarget;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String [] args) {
        char [] letters = {'c', 'f','j'};
        char target = 'a';
        System.out.println("Next greatest letter: " + nextGreatestLetter(letters, target) + "\n");

        char [] letters1 = {'c', 'f','j'};
        char target1 = 'c';
        System.out.println("Next greatest letter: " + nextGreatestLetter(letters1, target1) + "\n");

        char [] letters2 = {'c', 'f','j'};
        char target2 = 'd';
        System.out.println("Next greatest letter: " + nextGreatestLetter(letters2, target2) + "\n");
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        // Step1 - Set letter to first character
        char letter = letters[0];
        int numTarget = target;

        // Step2 - Traverse input array
        for (int i=0; i<letters.length; i++) {
            int numCurrentLetter = letters[i];
            System.out.println(numCurrentLetter);

            // Step3 - Check the currentNode is greater than letter.
            // Return letter if true, continue otherwis
            if (numTarget < numCurrentLetter) {
                letter = letters[i];
                break;
            }
        }

        return letter;
    }
}
