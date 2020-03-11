package Lists.DecryptStringFromAlphabetToIntMapping;

public class DecryptStringFromAlphabetToIntMapping {

    public static void main(String [] args) {


//        System.out.println(freqAlphabets("10#11#12"));

        String [] str = {"10#11#12", "1326#", "25#", "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"};
        for (String word : str)
            System.out.println(freqAlphabets(word));
    }

    public static String freqAlphabets(String input) {
        String str = "";

        // Step1 - Need two Sb. Main will keep track of the actual letters. sb will track the digitsStrs
        StringBuilder mainSB = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        // Need a way to check if double check is necessary
        boolean isDouble = false;
        int index = input.length() - 1; // Traverse from the end

        // Step2 - Traverse starting from End to beginning
        while (index >= 0) {

            char letter = input.charAt(index);

            if (letter == '#') {
                isDouble = true;
                // Do nothing if we run into the "#" character

            } else {

                // Step3 - Check if double
                if (isDouble) {

                    sb.append(letter);

                    // Step4 - If maximum is reached, we add to mainSB
                    if (sb.length() == 2){

                        // Step5 - Add 96 to the start of the array
                        int decrypted = Integer.valueOf(sb.reverse().toString()) + 96;
                        mainSB.append((char) decrypted);

                        // Reset SB
                        isDouble = false;
                        sb = new StringBuilder();       // Reset sb
                    }


                } else {    // Single
                    sb = new StringBuilder();
                    sb.append(letter);
                    int decrypted = Integer.valueOf(sb.reverse().toString()) + 96;
                    mainSB.append((char) decrypted);

                    // Reset
                    sb.deleteCharAt(0);
                }
            }
            index--;
        }

        return mainSB.reverse().toString();
    }

}
