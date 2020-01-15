package Strings.RemoveAllAdjStrings;

public class RemoveAllAdjStrings {

    public static void main(String [] args) {
//        String input = "aaaaaaaa";
//        String input = "aaaaaaaa";
//        String input = "aababaab";
        String input = "lisukrbebfudcupuvjiuunsutortnrrtjfqrpgcghqgdckbfbklriplmqtvksuqnrhrmmultddklsooqnvvsvclgbkmubhdpnplqidrnssnplkmthdgqlqarpgvbtsmbhlovnupnhpjbvnvlshuvgothtoblahuuncsjhdfrdqjlgedvhhvrcibinfsbdqgqdqksodvltgiskljokfgvthdashirlulnheqppajvffvnpglsgujbalochufeiogdfcenqvmaepdcmjsdqoardnkforkugidiglaafvnunratpqlcunttmviahofdomligogmdokmagpdhjkgrckladtepnjsbftinelimgloofigmkeokrcnpjevknechketgibfcljanvdmmkkquhpbofovgcebejflslufodskcjsseqpmnarqthvadlolkcaqpgskmcihioidusingdevmfkpltlvntomckrcockdbnddcjmsoglllbabojhprnoflisukrbebfudcupuvjiuunsutortnrrtjfqrpgcghqgdckbfbklriplmqtvksuqnrhrmmultddklsooqnvvsvclgbkmubhdpnplqidrnssnplkmthdgqlqarpgvbtsmbhlovnupnhpjbvnvlshuvgothtoblahuuncsjhdfrdqjlgedvhhvrcibinfsbdqgqdqksodvltgiskljokfgvthdashirlulnheqppajvffvnpglsgujbalochufeiogdfcenqvmaepdcmjsdqoardnkforkugidiglaafvnunratpqlcunttmviahofdomligogmdokmagpdhjkgrckladtepnjsbftinelimgloofigmkeokrcnpjevknechketgibfcljanvdmmkkquhpbofovgcebejflslufodskcjsseqpmnarqthvadlolkcaqpgskmcihioidusingdevmfkpltlvntomckrcockdbnddcjmsoglllbabojhprnof";
        System.out.println("Result: " + removeDuplicates(input));
    }


    public static  String removeDuplicates(String input) {
        String removed;
        StringBuilder stringBuilder = new StringBuilder(input);
        boolean hasDuplicates = true;

        char prevChar = 0;
        int index = 0;
        while (hasDuplicates) {

            if (stringBuilder.toString().equals(""))
                return "";

            System.out.println(stringBuilder.toString());
            char currentChar = stringBuilder.charAt(index);
            if (currentChar == prevChar) {

                if (index == 1) {
                    stringBuilder.delete(0, index + 1);

                } else {
                    stringBuilder.delete(index - 1, index + 1);
                }
                prevChar = 0;

                index = 0;
                continue;
            }

            if (index == stringBuilder.length() - 1)
                break;


            prevChar = currentChar;
            index++;
        }

        return stringBuilder.toString();
    }
}
