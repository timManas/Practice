package Trees.DesignExpressionTree;

public class DesignExpressionTree {
    public static void main (String [] args) {
        String [][] postfix = {{"3","4","+","2","*","7","/"}, {"4","5","2","7","+","-","*"}};

        for (String [] i : postfix) {
            TreeBuilder obj = new TreeBuilder();
            Node expTree = obj.buildTree(i);
            int ans = expTree.evaluate();
            System.out.println("Ans: " + ans);
        }




    }


}
