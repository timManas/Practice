package Strings.ReverseStringIII;

public class ReverseStringIII {

    public static void main(String [] args) {
        String input = "Let's take LeetCode contest";
        System.out.println("Reversed: " + reverseWords(input));
    }

    public static String reverseWords(String input) {
        StringBuilder reverseStr = new StringBuilder();
        if (input.equals(""))
            return reverseStr.toString();

        String [] inputArr = input.split(" ");
        for (int i=0; i < inputArr.length; i++) {
            reverseStr.append(reverseStr(inputArr[i]) + " ");
        }


        return reverseStr.toString().trim();
    }

    private static String reverseStr(String string) {
        return new StringBuilder(string).reverse().toString();
    }

}
