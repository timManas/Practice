package Strings.ValidWordAbbreviation;

public class ValidWordAbbreviation {
    public static void main (String [] args) {
        String word = "internationalization";
        String abbr = "i12iz4n";
        System.out.println("ValidWordAbbreviation: " + validWordAbbreviation(word, abbr));

        String word1 = "apple";
        String abbr1 = "a2e";
        System.out.println("ValidWordAbbreviation: " + validWordAbbreviation(word1, abbr1));

        String word2 = "hi";
        String abbr2 = "2i";
        System.out.println("ValidWordAbbreviation: " + validWordAbbreviation(word2, abbr2));

        String word3 = "hi";
        String abbr3 = "02";
        System.out.println("ValidWordAbbreviation: " + validWordAbbreviation(word3, abbr3));

        String word4 = "word";
        String abbr4 = "2r0";
        System.out.println("ValidWordAbbreviation: " + validWordAbbreviation(word4, abbr4));
    }

    public static boolean validWordAbbreviation(String word, String abbr) {

        if (word.length() < abbr.length())
            return false;

        int wordIndex = 0;

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<abbr.length(); i++) {

            if (word.length() < wordIndex + 1)
                return false;

            char letter = abbr.charAt(i);
            System.out.println("current: " + letter + "         word: " + word.charAt(wordIndex) + "|wordIndex: " + wordIndex);


            if (Character.isLetter(letter)) {
                if (word.charAt(wordIndex) != letter)
                    return false;

                wordIndex++;
            } else if (Character.isDigit(letter)) {
                sb.append(letter);

                if(sb.toString().startsWith("0"))
                    return false;

                if (i == abbr.length()-1) {



                    wordIndex += Integer.parseInt(sb.toString());
                    return wordIndex == word.length();
                }

                if (!Character.isDigit(abbr.charAt(i+1))) {


                    wordIndex += Integer.parseInt(sb.toString());

                    sb = new StringBuilder();   // Reset
                }
            }
        }

        if (word.length() != wordIndex)
            return false;

        return true;
    }
}
