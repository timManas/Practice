package Trees.PseudoPalindromicPathsBST;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class PseudoPalindromicPathsBST {

    public static void main(String [] args) {

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

        System.out.println("NumPalindromePaths: " + pseudoPalindromicPaths(node1));
    }

    public static int pseudoPalindromicPaths (TreeNode root) {

        // Step1 - Create variable to return
        AtomicInteger numPaths = new AtomicInteger(0);

        // Step2 - Create list to store values seen from root to leaf
        List<Integer> list = new ArrayList<>();

        // Step3 - Traverse Tree
        traverseTree(root, list, numPaths);

        return numPaths.get();
    }

    private static void traverseTree(TreeNode node, List<Integer> list, AtomicInteger numPaths) {

        // Step1 - Check if node null ...return if so
        if (node == null)
            return;


        // Step2 - Add Node to list
        // We need this to keep track of all the node values we went through
        list.add(node.val);
        System.out.println("CurrentNode: " + node.val + "   List: " + list);

        // Step3 - Traverse Left and Right Node
        traverseTree(node.left, list, numPaths);
        traverseTree(node.right, list, numPaths);

        // Step4 - Check if node is a leaf and palindrome
        if (node.left == null && node.right == null && isPalindrome(list))
            numPaths.getAndIncrement();

        // Step5 - Remove current Node from List
        if (list.size() > 0 )
            list.remove(list.size() - 1);


    }

    // Checks if the value in list is Palindromic
    private static boolean isPalindrome(List<Integer> list) {

        // Step1 - Create tempList, Sort and Reverse
        List<Integer> tempList = new ArrayList<>(list);
        Collections.sort(tempList);
        Collections.reverse(tempList);

        // Step2 - Remove ALL PAIRS  in the tempList
        int i = 0;
        while ( i < tempList.size() - 1) {

            if (tempList.get(i) == tempList.get(i + 1)) {
                tempList.remove(i);
                tempList.remove(i);
            } else
                ++i;
        }

        // Step3 - We know if it is Palindromic is Length of tempList is either 1 or 0
        return tempList.size() <= 1;
    }
}


/**
 Note
 - Wow was this tricky
 - The idea is that we keep track of all the values we pass through from root to leaf using a list
 - The same list, we check if is palindromic
 - YOOOO !!!!! Notice the list is UNTOUCHED but we create a COPY of the list ('tempList') and use that to determine if it is palindromic
    Why ? Because we want to keep the main list to keep track of the all the values we passed through
        - And to remove as needed

 Steps
 1. Traverse through list using DFS to add elements to list
 2. Once we get a leaf, we check if the values in the list are palindromic
    > If so, we increment
 3. At the end, we remove the current node from list

 How do you know if a list is a Palindrome ?
 - Good question
 - Basically We know that if a Palindromic has either 0 or 1 characters
 Ex. aba ... Removing 'a' we get b which is of length = 1
 abba ... Removing 'a' and 'b' pairs we get a length = 0
 abcba ... Removing 'a' and 'b' pairs we get a length = 1 ... 'c' is still there since it has NO pairs
 - We REMOVE ALL Pairs...
 - THerefore, we KNOW if the length of list is 0 or 1, then it is palindromic, Otherwise it is NOT



 */
