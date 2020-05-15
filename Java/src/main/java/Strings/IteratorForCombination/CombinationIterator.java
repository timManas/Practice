package Strings.IteratorForCombination;

import java.util.ArrayList;
import java.util.List;

class CombinationIterator {

    private List<Integer> referenceList;
    private String characters;
    private int maxLength;
    private StringBuilder sb;

    // Initialize the Object
    public CombinationIterator(String characters, int combinationLength) {
        this.referenceList = new ArrayList<>();
        this.characters = characters;
        this.maxLength = combinationLength;
        this.sb = new StringBuilder();
        initializeList();
    }

    // Add the proper # of references ...aka maxLength of the combination
    private void initializeList() {
        int counter = 0;
        while (counter < maxLength) {
            referenceList.add(counter);
            counter++;
        }
    }


    public String next() {

        // Step1 - Clear the StringBuilde
        sb.delete(0, sb.length());

        // Step2 - Fetch the character in the referenceList
        for (int i=0; i < referenceList.size(); i++) {
            char letter = characters.charAt(referenceList.get(i));

            // Step3 - Append to String builder
            sb.append(letter);
        }

        // Step3 - Update the positions
        updatePositions(referenceList.size() - 1);

        // Step4 - Return the StringBuilders value
        return sb.toString();
    }

    // This is the trickiest part of the code
    private int updatePositions(int reference) {

        // Step1 - Check if our recursion went too FAR BACK
        // Return some value
        if (reference < 0)
            return Integer.MAX_VALUE;

        // Step2 - Incrememnt the current reference position
        int position = referenceList.get(reference) + 1;

        // Step3 - Keep Backtracking if the position is GREATER Or Equal to character length ..aka abcde
        while (position >= characters.length()) {
            position = updatePositions(reference - 1);

            // Step3b - Stop the loop if reached toooo far back
            // If we dont, we end up an infinite loop
            if (position == Integer.MAX_VALUE)
                break;
        }

        // Setp4 - Set the new position with their respective reference
        referenceList.set(reference, position);

        return position + 1;
    }


    public boolean hasNext() {

        // Step1 - Fetch the first Element
        int prevPosition = referenceList.get(0);

        // Step2 - Compare prev element to every single element
        // Update the prev to current
        for (int i=1; i < referenceList.size(); i++) {

            if (prevPosition >= referenceList.get(i) || prevPosition == Integer.MAX_VALUE)
                return false;

            // Update prev to current
            prevPosition = referenceList.get(i);
        }

        // Step2 - Check if first value is crayyyyyyy
        if (prevPosition == Integer.MAX_VALUE)
            return false;

        return true;
    }
}


/**
 Note:
 - Medium difficulty problem
 - The hardest part for me was keep track of the positions when we update them
    > Mainly due to the fact that if we reach the end of the string, we need to update the previous stored reference in the list
    > Hence we use recursion
    > Have to admit this was alot better than we first started doing this
 - We use a recursion starting form last stored reference to the 1st
 - The recursive method will return the position for the next reference stored in positionList
 - We use an ArrayList to keep track of all the reference
    why ? So it can be dynamic

 Solution
  - next()
  1. Use an ArrayList to keep track of the positions
    Remember: References and positions are different
    lol what ? If you have combo of 3, then you have 3 references you need to keep track off
    So whats is reference  ? It is a pointer to the positions of the characters
    What is position ? Refers to the actual position ...aka which letter we are looking at
        > All the references store a  position of letter

  - hasNext()
    1. We just check if the 1st index position is smaller than (index + 1) position
    2. Continue till end and return true
        > Return false if not


 */