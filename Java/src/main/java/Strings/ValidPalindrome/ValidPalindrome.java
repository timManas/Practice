package Strings.ValidPalindrome;

public class ValidPalindrome {

    public static void main(String [] args) {

//        String input = "A man, a plan, a canal: Panama";
        String input = "race a car";
        System.out.println("Valid palindrome: " + isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {

        // Step #1: Convert to lower case and get only alphanumeric characters
        String rawString = str.toLowerCase();
        rawString = rawString.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(rawString);

        // Step #2: Send Indexes for going forward and backwards
        int forwardIndex = 0;
        int backIndex = rawString.length() - 1;

        char [] charArray = rawString.toCharArray();

        // Step #3: Traverse both sides of the array
        while (forwardIndex <= backIndex) {
            if (charArray[forwardIndex] != charArray[backIndex])
                return false;

            forwardIndex++;
            backIndex--;

        }

        return true;
    }

}

/**

 Algorithm
 1. Convert to only lowercase and only alphanumeric characters
 2. Traverse both sides of the string
    - If they match, continue traverseing
    - If NOT match, return false;
 3. Return true if it finishes till the end

 */
