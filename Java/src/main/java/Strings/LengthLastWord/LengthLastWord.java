package Strings.LengthLastWord;

public class LengthLastWord {
    public static void main(String [] args) {
        String [] input = {"Hello World", "   fly me   to   the moon  ", "luffy is still joyboy"};
        for (String i : input)
            System.out.println("Length of last word: " + lengthOfLastWord(i));
    }

    public static int lengthOfLastWord(String s) {
        String [] array = s.trim().split(" ");
        return array[array.length -1].length();
    }
}
