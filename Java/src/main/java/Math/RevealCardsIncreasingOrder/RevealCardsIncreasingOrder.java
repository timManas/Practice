package Math.RevealCardsIncreasingOrder;

import java.util.Arrays;

public class RevealCardsIncreasingOrder {

    public static void main (String [] args) {
//        int [] deck = {17,13,11,2,3,5,7};
        int [] deck = {1,2,3,4,5,6,7,8,9};
        int [] result = deckRevealedIncreasing(deck);

        for (int i : result)
            System.out.println(i);
    }

    public static int[] deckRevealedIncreasing(int[] deck) {

        // Step1 - Create the variable to return
        int [] result = new int[deck.length];

        // Step2 - Populate Result to have default value of -1
        for (int i=0; i < deck.length; i++) {
            result[i] = -1;
        }

        // Step3 - Sort the original deck
        Arrays.sort(deck);

        // Ste4 - Create checks for traversal
        boolean isTop =  true;              // We need this to check if topCard
        int index = 0;                      // Current Index
        int counter = 0;                    // Counter to check how many times we saw "-1"

        // Step5 - Traverse the deck
        for (int i : deck) {

            // Step6 - We continue this process UNTIL we find two "-1" and then break
            while (true) {

                // Step7b - Check if -1
                // why ? Because we only traverse on the -1 and NOT on any number
                if (result[index] == -1) {

                    // Step8 - Check if Top Card
                    if (isTop) {
                        isTop = false;
                        break;
                    }

                    // Step9 - Increment counter
                    ++counter;

                    // Step10 - Check if coUNTER is 2... if it is we break
                    // This meanss that we traversed TWICE "-1"
                    if (counter == 2) {
                        counter = 0;
                        break;
                    }
                }

                // Step7b - Increment counter
                ++index;

                // Step7c - If index is larger than deck size, reset back to ZERO
                if (index > deck.length - 1)
                    index = 0 ;
            }

            // Step 11 - Add value to results array
            result[index] = i;
        }

        return result;
    }

}


/**
 Solution
 - Man this was a tricky one forrealllz

 Basically, the way you need to solve it as traversing the array by 2 x "-1" (-1 is just a place holder)
 - However, you only traverse on the -1  (which was why we initiaated it to -1)
    >> We use a counter to check if we traversed 2 x "-1"
            >> If we did  traverse Two "-1", we break and add number to results array
 - If hit a positive number >> we just move on to the next index
 - Continue until you hit all numbers

 */