package Misc.VerifyingAlienDictionary;

public class VerifyingAlienDictionary {
    public static void main(String [] args) {
        String [] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println("Is Alien Sorted: " + isAlienSorted(words, order));

        String [] words1 = {"word","world","row"};
        String order1 = "worldabcefghijkmnpqstuvxyz";
        System.out.println("Is Alien Sorted: " + isAlienSorted(words1, order1));

        String [] words2 = {"apple","app"};
        String order2 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Is Alien Sorted: " + isAlienSorted(words2, order2));
    }

    public static boolean isAlienSorted(String[] words, String order) {



        return true;
    }
}
