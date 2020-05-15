package Strings.IteratorForCombination;

public class IteratorForCombination {

    public static void main(String [] args) {
        CombinationIterator iterator = new CombinationIterator("abc", 2); // creates the iterator.
        System.out.println(iterator.next()); // returns "ab"
        iterator.hasNext(); // returns true
        System.out.println(iterator.next()); // returns "ac"
        iterator.hasNext(); // returns true
        System.out.println(iterator.next()); // returns "bc"
        iterator.hasNext(); // returns false
    }

}
