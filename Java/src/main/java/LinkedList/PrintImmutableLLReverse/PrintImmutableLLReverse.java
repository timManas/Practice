package LinkedList.PrintImmutableLLReverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PrintImmutableLLReverse {

    public static void printLinkedListInReverse(ImmutableListNode node) {

        // Step1 - Create Stack
        Stack<ImmutableListNode> stack = new Stack<>();

        // Step2 - Populate Stack
        while (node != null) {
            stack.push(node);
            node = node.getNext();
        }

        // Step3 - Pop value from stack and print value so that it prints in reverse
        while (!stack.isEmpty()) {
            stack.pop().printValue();
        }
    }
}
