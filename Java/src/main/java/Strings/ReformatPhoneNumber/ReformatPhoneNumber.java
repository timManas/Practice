package Strings.ReformatPhoneNumber;

public class ReformatPhoneNumber {
    public static void main (String [] args) {
        String [] input = {"1-23-45 6","123 4-567",  "123 4-5678", "12", "--17-5 229 35-39475 "};
        for (String number : input)
            System.out.println("Reformat Number: " + reformatNumber(number));
    }

    private static String reformatNumber(String number) {

        // Step1 - Create Strinbuilder to store the reformatted string
        StringBuilder sb = new StringBuilder();

        // Step2 - Filer out all dash and spaces
        String unFormattedNum = number.replaceAll(" ", "").replaceAll("-", "");
        System.out.println("Starting number: " + unFormattedNum);

        // Step3 - Traverse the unformattedNum
        for (int i=0; i < unFormattedNum.length(); i+=3) {

            // Step4 - Calculate the remaining number of digits
            int remaining = unFormattedNum.length()  - i;
            System.out.println("Current: " + unFormattedNum.charAt(i) + "       Rem: " + remaining);

            // Add in increments of three
            if (remaining >= 5) {
                sb.append(unFormattedNum.charAt(i)).append(unFormattedNum.charAt(i+1)).append(unFormattedNum.charAt(i+2)).append('-');
                continue;
            } else if (remaining == 4) {
                //4 digits: Two blocks of length 2 each
                sb.append(unFormattedNum.charAt(i)).append(unFormattedNum.charAt(i+1)).append('-').append(unFormattedNum.charAt(i+2)).append(unFormattedNum.charAt(i+3));
            } else if (remaining == 3) {
                // 3 digits: A single block of length 3
                sb.append(unFormattedNum.charAt(i)).append(unFormattedNum.charAt(i+1)).append(unFormattedNum.charAt(i+2));
            } else if (remaining == 2) {
                // 2 digits: A single block of length 2
                sb.append(unFormattedNum.charAt(i)).append(unFormattedNum.charAt(i+1));
            }

            System.out.println(sb.toString());
        }

        return sb.toString();
    }
}

/**
 Notes
 - Tricker than expected but not impossible

 Solution
 1. Filter out dash and spaces
 2. Traverse unFormattedNumber by incrementing in groups of 3
 3. If there are 5 or more, we add the next three
    //4 digits: Two blocks of length 2 each
    // 3 digits: A single block of length 3
    // 2 digits: A single block of length 2
 */
