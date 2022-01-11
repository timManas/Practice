package Strings.CheckIfStringDecomposable;

public class CheckIfStringDecomposable {
    public static void main(String [] args) {
        String [] input = {"000111000", "00011111222", "011100022233"};
        for (String i : input)
            System.out.println("Is String Decomposable: " + isDecomposable(i) + "\n");
    }

    public static boolean isDecomposable(String input) {

        boolean containsLength2 = false;

        int startIndex = 0;
        char startChar = input.charAt(startIndex);
        char endChar;
        char nextChar = 0;
        StringBuilder sb = new StringBuilder();
        for (int endIndex=0; endIndex < input.length() - 1; endIndex++) {
            endChar = input.charAt(endIndex);
            nextChar = input.charAt(endIndex + 1);

            if (startChar == endChar) {
                sb.append(endChar);
            }

            if (startChar != nextChar) {
                System.out.println("SubString: " + sb.toString());
                if (sb.length() == 1)
                    return false;
                if (sb.length() == 2)
                    containsLength2 = true;
                if (sb.length() > 3)
                    return false;


                // Updates indexes
                sb = new StringBuilder();
                startIndex = endIndex + 1;
                startChar = input.charAt(startIndex);
            }

            System.out.println("SubString: " + sb.toString());
        }

        sb.append(nextChar);
        System.out.println("Final SubString: " + sb.toString());
        if (sb.length() == 1 || sb.length() > 3)
            return false;

        if (!containsLength2)
            return false;


        return true;
    }
}
