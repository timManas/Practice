package Trees.KthLexiographicalStringOfHappyStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLexiographicalStringOfHappyStrings {

    public static void main(String [] args) {

//        int n = 3;
//        int k = 9;

        int n = 1;
        int k = 4;

        System.out.println("K Happy String: " + getHappyString(n, k));
    }

    public static String getHappyString(int n, int k) {

        // Step1 - Define th characters to iterate through
        char [] charArr = {'a', 'b', 'c'};

        int count = 0;                                  // count is needed to keep track of how many characters in a word
        TreeNode root = new TreeNode('-');          // The reason you never see '-' is because it is done in the root node ...and never added to the sb

        // Step2 - Define String builder to keep track of letters and create new list
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        // Step3 - Build Tree
        buildTree(root, list, charArr, sb, count, n, '-');

        // Step4 - Sort Tree by value
        Collections.sort(list);

        // Step5 - Return kth value or "" if k is larger than list
        return k <= list.size() ? list.get(k - 1) : "";
    }

    private static void buildTree(TreeNode node, List<String> list, char[] charArr, StringBuilder sb, int count, int n, char last) {

        // Step1 - STOP if our count is greater than n - 1
        // Why ? Otherwise our look would go on forever
        if (count > n - 1) {
            System.out.println("=====");
            return;
        }


        // Step2 - Iterate through charArray
        for (char letter : charArr) {

            // Step3 - Check if last letter is the same as the current letter, if it is ...piss of
            if (letter == last)
                continue;

            // Step4 - Create a new child node to place in the current node
            TreeNode childNode = new TreeNode(letter);
            node.childList = new ArrayList<>();
            node.childList.add(childNode);

            // Step5 - Update the Stringbuilder with the new Letter
            sb.append(letter);

            // Step6 - Add Substring to list if letter == n
            if (sb.length() == n) {
                list.add(sb.toString());
                System.out.println(sb.toString());
            }


            // Step7 - We traverse the child Node
            // Why ? Because we need to go down using DFS
            buildTree(childNode, list, charArr, sb, ++count, n, letter);

            // Step8 - After we reach the end, we remove the letter and reduce count
            // Why ? Because we need to traverse to the next letter in char array
            System.out.println("Removing: " + sb.charAt(sb.length() - 1));
            sb.deleteCharAt(sb.length() - 1);
            --count;
        }
    }


}

class TreeNode {
    char val;
    List<TreeNode> childList;
    TreeNode(char x) {
        val = x;
        childList = new ArrayList<>();
    }
}


/**
 Solution
 - Holy fuk ... this was NOT easy to come up with a solution
 - My first instinct was to create a loop within a loop within a loop
 - Never though using a Tree to create this MF

 Essentially this is what we do
 1. Build the tree from ground up using each letter
    - Root letter is '-' and never gets added to sb  (i think this was a fluke)
    - if sb size is equal to n, we add it to the list
    - We continue building / Deleting the tree until we reach all characters
 2. Sort the list
 3. Return kth element from list

 Notes:
 1. If current letter is equal to last letter in sb.toString we fuck off
 2. We only stop the loop once the count  == n, then start deleting elements


 */