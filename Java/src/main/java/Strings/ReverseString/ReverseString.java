package Strings.ReverseString;

public class ReverseString {

    /**
     * REVERSE STRING IN PLACE
     */

    public static void main (String [] args) {

        char [] input = {'h','e','l','l','o'};
        reverseString(input);
        for (Character letter : input) {
            System.out.println(letter);
        }


    }

    public static void reverseString(char[] inputArr) {

        int forwardIndex = 0;
        int backwardIndex = inputArr.length - 1;


        while (forwardIndex < backwardIndex) {
            char front = inputArr[forwardIndex];
            char back = inputArr[backwardIndex];

            // Do the Switch
            char temp = front;
            inputArr[forwardIndex] = back;
            inputArr[backwardIndex] = temp;

            ++forwardIndex;
            --backwardIndex;
        }
    }
}
