package Trees.ConstructBTFromPreAndPostOrder;

import java.util.Arrays;

public class ConstructBTFromPreAndPostOrder {

    public static void main(String [] args) {
        int [] pre = {1,2,4,5,3,6,7};
        int [] post = {4,5,2,6,7,3,1};

        System.out.println("Root Node: " + constructFromPrePost(pre, post).val);

    }

    // Test Solution
    public static TreeNode constructFromPrePost(int[] pre, int[] post) {
        int N = pre.length;
        if (N == 0)
            return null;

        TreeNode root = new TreeNode(pre[0]);
        if (N == 1)
            return root;

        int L = 0;
        for (int i = 0; i < N; ++i)
            if (post[i] == pre[1])
                L = i+1;

        root.left = constructFromPrePost(Arrays.copyOfRange(pre, 1, L+1), Arrays.copyOfRange(post, 0, L));
        root.right = constructFromPrePost(Arrays.copyOfRange(pre, L+1, N), Arrays.copyOfRange(post, L, N-1));
        return root;
    }


}
