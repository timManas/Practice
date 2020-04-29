package Trees.KthLexiographicalStringOfHappyStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLexiographicalStringOfHappyStrings {

    public static void main(String [] args) {

        int n = 3;
        int k = 9;
        System.out.println("K Happy String: " + getHappyString(n, k));
    }

    public static String getHappyString(int n, int k) {
        String result = "";
        List<String> list = new ArrayList<>();
        TreeNode root = new TreeNode('-');

        buildTree(root);
        populateList();
        Collections.sort(list);

        return list.get(k);
    }

    private static void buildTree(TreeNode root) {
    }


    private static void populateList() {
    }

}

class TreeNode {
    char val;
    TreeNode left;
    TreeNode right;
    TreeNode(char x) { val = x; }
}