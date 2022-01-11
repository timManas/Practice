package Strings.CheckIfStringDecomposable;

public class CheckIfStringDecomposable {
    public static void main(String [] args) {
        String [] input = {"66666666666677722","000111000", "00011111222", "011100022233"};
        for (String i : input)
            System.out.println("Is String Decomposable: " + isDecomposable(i) + "\n");
    }

    public static boolean isDecomposable(String input) {

        // Step1 - Create index to track movement
        boolean containsLength2 = false;
        int startIndex = 0;
        char startChar = input.charAt(startIndex);
        char endChar;
        char nextChar = 0;
        StringBuilder sb = new StringBuilder();

        // Step2 - Traverse input string one letter at a time
        for (int endIndex=0; endIndex < input.length() - 1; endIndex++) {
            endChar = input.charAt(endIndex);
            nextChar = input.charAt(endIndex + 1);

            // Add current letter to StringBuilder
            sb.append(endChar);


            // Step3 - Check if the nextChar is still valid
            if (startChar != nextChar) {
                System.out.println("SubString: " + sb.toString());
                if (sb.length() == 1) {
                    return false;
                } else if (sb.length() == 2) {
                    containsLength2 = true;
                } else if (sb.length() > 3) {

                    if (sb.length() % 3 != 0) {
                        int remainder = sb.length() - 2;
                        containsLength2 = true;

                        if (remainder % 3 != 0 || remainder < 3) {
                            System.out.println("Remainder: " + remainder);
                            return false;
                        }
                    }

                }



                // Step4 - Updates indexes
                sb = new StringBuilder();
                startIndex = endIndex + 1;
                startChar = input.charAt(startIndex);
            }

            System.out.println("SubString: " + sb.toString());
        }

        // Step5 - Check the last subSet
        sb.append(nextChar);
        System.out.println("Final SubString: " + sb.toString());

        if (sb.length() == 1) {
            return false;
        } else if (sb.length() == 2) {
            containsLength2 = true;
        } else if (sb.length() > 3) {

            if (sb.length() % 3 != 0) {
                int remainder = sb.length() - 2;
                containsLength2 = true;

                if (remainder % 3 != 0 || remainder < 3) {
                    System.out.println("Remainder: " + remainder);
                    return false;
                }
            }

        }


        if (!containsLength2)
            return false;


        return true;
    }
}
