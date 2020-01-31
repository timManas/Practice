package Strings.GoatLatin;

public class GoatLatin {

    public static void main (String [] args) {
        String input = "Each word consists of lowercase and uppercase letters only";
        System.out.println("Output: " + toGoatLatin(input));
    }

    public static String toGoatLatin(String str) {
        String [] strArr = str.split(" ");
        StringBuilder toGoatLatin = new StringBuilder();
        String a = "";
        for (int i=0; i < strArr.length; i++) {

            String word = strArr[i];
            char firstLetter = word.charAt(0);
            StringBuilder sb = new StringBuilder(word);

            if (firstLetter == 'a' || firstLetter == 'A' ||
                firstLetter == 'e' || firstLetter == 'E' ||
                firstLetter == 'i' || firstLetter == 'I' ||
                firstLetter == 'o' || firstLetter == 'O' ||
                firstLetter == 'u' || firstLetter == 'U' ) {
                sb.append("ma");
            } else {
                sb.replace(0,1, "");
                sb.append(firstLetter);
                sb.append("ma");
            }

            a = a + "a";
            sb.append(a);
            System.out.println("StringBuilder: " + sb.toString());

            toGoatLatin.append(sb.toString() + " ");
        }

        return toGoatLatin.toString().trim();
    }

}
