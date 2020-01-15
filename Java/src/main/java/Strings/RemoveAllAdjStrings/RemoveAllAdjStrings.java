package Strings.RemoveAllAdjStrings;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveAllAdjStrings {

    public static void main(String [] args) {
//        String input = "abbaca";
//        String input = "aaaaaaaa";
//        String input = "aababaab";
        String input = "lisukrbebfudcupuvjiuunsutortnrrtjfqrpgcghqgdckbfbklriplmqtvksuqnrhrmmultddklsooqnvvsvclgbkmubhdpnplqidrnssnplkmthdgqlqarpgvbtsmbhlovnupnhpjbvnvlshuvgothtoblahuuncsjhdfrdqjlgedvhhvrcibinfsbdqgqdqksodvltgiskljokfgvthdashirlulnheqppajvffvnpglsgujbalochufeiogdfcenqvmaepdcmjsdqoardnkforkugidiglaafvnunratpqlcunttmviahofdomligogmdokmagpdhjkgrckladtepnjsbftinelimgloofigmkeokrcnpjevknechketgibfcljanvdmmkkquhpbofovgcebejflslufodskcjsseqpmnarqthvadlolkcaqpgskmcihioidusingdevmfkpltlvntomckrcockdbnddcjmsoglllbabojhprnoflisukrbebfudcupuvjiuunsutortnrrtjfqrpgcghqgdckbfbklriplmqtvksuqnrhrmmultddklsooqnvvsvclgbkmubhdpnplqidrnssnplkmthdgqlqarpgvbtsmbhlovnupnhpjbvnvlshuvgothtoblahuuncsjhdfrdqjlgedvhhvrcibinfsbdqgqdqksodvltgiskljokfgvthdashirlulnheqppajvffvnpglsgujbalochufeiogdfcenqvmaepdcmjsdqoardnkforkugidiglaafvnunratpqlcunttmviahofdomligogmdokmagpdhjkgrckladtepnjsbftinelimgloofigmkeokrcnpjevknechketgibfcljanvdmmkkquhpbofovgcebejflslufodskcjsseqpmnarqthvadlolkcaqpgskmcihioidusingdevmfkpltlvntomckrcockdbnddcjmsoglllbabojhprnof";
        System.out.println("Result: " + removeDuplicates(input));
    }


    public static  String removeDuplicates(String input) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder stringBuilder = new StringBuilder();


        for (int i=0; i < input.length(); i++) {

            char letter = input.charAt(i);

            if (stack.isEmpty()) {
                stack.push(letter);

            } else {
                char top = stack.peek();
                if (top == letter) {
                    stack.pop();
                } else {
                    stack.push(letter);
                }
            }

            System.out.println(stack.toString());
        }

        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();
    }
}
