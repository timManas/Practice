package Strings.IteratorForCombination;

public class IteratorForCombination {

    public static void main(String [] args) {

//        String characters = "abcde";
//        int combo = 3;

        String characters = "chp";
        int combo = 1;

        CombinationIterator iterator = new CombinationIterator(characters, combo); // creates the iterator.
//        System.out.println(iterator.next()); // returns "ab"
//        System.out.println(iterator.next()); // returns "ac"
//        System.out.println(iterator.next()); // returns "bc"
//        System.out.println(iterator.next()); // returns "bc"
//        System.out.println(iterator.next()); // returns "bc"
//        System.out.println(iterator.next()); // returns "bc"
//        System.out.println(iterator.hasNext()); // returns true
//
//        System.out.println(iterator.next()); // returns "ab"
//        System.out.println(iterator.next()); // returns "ac"
//        System.out.println(iterator.next()); // returns "bc"
//        System.out.println(iterator.next());
//
//        System.out.println(iterator.hasNext());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());

    }

}

/**
 Real Solution is on the other class
 */

