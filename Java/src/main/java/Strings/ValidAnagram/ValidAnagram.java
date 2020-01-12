package Strings.ValidAnagram;

import java.util.TreeMap;
import java.util.TreeSet;

public class ValidAnagram {

    public static void main(String [] args) {
        String input1 = "hhbywxfzydbppjxnbhezsxepfexkzofxyqdvcgdvgnjbvihgufvgtuxtpioxgjuwawkbaerbsirrktcjcesepcocaglbassivfbjhikynfsvlbtkawstrclbkpuldshfgfvwjawownulsggsxhhqglbhjlgltfrqyjntgldlgorgatnjrsywlyngxrcwfojkmydmjbzuquqnzbpwlcbdzgdicctpkgtbdjgywkyrkityvohjbuvmzdfyicyplmrpygdhaeqbuxnehfybsysnnmzbhprsyjmtpcrzeqqbirofzjtlsyofdyeffkvpuhzaflwjfhnsuyryetjuajjnjwvlvrhvpenaarnzoafztixjrisfzdlepcwhxudjpsiirtofymnovacjmpdjtethjqfwduekczlqhsfjgqesyoxcfooagrdhyvsmssbhsclnlblhobvhwtpyftolneozlhbtjagpgqnnapktyevdvjfwdnbwsbelweoflhyhifprieuvfcdkavqxkygjlaegqfmzndgxbsccjgpclxmlpstrqjtqyvlqcopnahqvnpvkjimfdlosvletmamqjvotqwhadutmfvlgldniixvdkmymfadckuaglgbuttymoqmzkaeqxugsrnfyxzcamwxujgzupefretsvbdweuwwcizjvhcowtmwgkdafcpzctpsjwdocgofivyshwdinbdhbxdfhjsrrsfchxkeqndgzauyprwfnrbmunanqnhmjhrufoinakwaciaoerioqffmipfqujfxwofqdyjbhagkyvmnxcwomgnmwlaodxgkgthnuctoozxrebjiynjwohtgukyneyofabpfdrxklopmxxiwjuxqpaazknscagfiaetmmwnwpzceglupqvlctywtpluoqbzdultcsudubqclbwlxyfboimfwriugfulbntvdwnxgiycxvennakpodorvpiknkridcumsovvfziki";
        String input2 = "rmhdxtymfgxjluxmeeerhxrrtjgecmyfdhevakyosvvuwgbwmxiakbmtqjjpgctjojdqatuelqmfeldgoprxbzcylajhhjngqlmporofjpoyhrkptrbpzvvnkrqjovfzmmqybqxzjxarhguqcyvlugwmnzwtffanzuajraqbvjflgalgcwuhmrkblobybwouffzptbvkmwoklczfhvkqsirkqvhkryyxpkyfnwnjudvllmznupldkpoplwdlfzncwxdlgvgkehpcudqybnyhofpjnjmahnsrntxjtgocwsrnukejehwzxdetglgahdvzyypdztqwbnfrnytxprhtqjgobzjyewuasgnryjoyvwhdmemppixqcowgmicbmsukgodwgnsdieuqyzuysedmsphmritlqtnvnvfnmgnghxdsmmnzdhdalhfsfsppupteyrlajxrlbyqteaytgpsckottqnibbxhmkwuqfftwvibzsnaumsbohxeoaulsmwuvjcimscyqhtioekembdwfozglussscbzejqnvmcpfwdmxshhrkquacplctruyklkxcfovcbqllmyghdbkhdmawpmalrsgymgmbleftwtvldxkqprcbcbneyyluoyydtcvkimqjoinwntfxfbwqjbufqansdlgrgauzfwxpzrjxpesmozcsczbfzfeziedqzwywtxhyfnpbxfgbqcsfwdiplegcsrseqsagvkpjrupkaxffrddebpntocmkbarvdrhvujedwnktsdimzcbqlqyizozxcexqpoefjpznegsrtbfanqdyqaaudcklplvxojfuzccmtauaxurbwbexulqbxooadcrlxbtggxcycadratsuqavwwkdqtutptdpbnxeicmackhyvjhkfbayjmymjwejybhoryyqjjmwqzhpgulovxaccychffcplvkqfqghmgmdsigkugsevwkvzgpxiolhtzocdiphokfitgg";

//        String input1 = "TRIANGLE";
//        String input2 = "INTEGRAL";

        System.out.println("IsAnagram: " + isAnagram(input1, input2));

    }

    public static boolean isAnagram(String str1, String str2) {
        str1.toLowerCase();
        str2.toLowerCase();

        TreeMap<String, Integer> treeMap1 = new TreeMap<String, Integer>();
        TreeMap<String, Integer> treeMap2 = new TreeMap<String, Integer>();

        // Insert Values
        insertValuesToMap(str1, treeMap1);
        insertValuesToMap(str2, treeMap2);

        if (treeMap1.size() != treeMap2.size())
            return false;

        for (String letter : treeMap1.keySet()) {

            if (!treeMap2.containsKey(letter))
                return false;
            else if (treeMap1.get(letter) != treeMap2.get(letter))
                return false;

        }

        return true;
    }

    private static void insertValuesToMap(String str, TreeMap<String, Integer> treeMap) {
        for (int i=0; i < str.length(); i++) {
            String key = String.valueOf(str.charAt(i));
            if (treeMap.containsKey(key)) {
                treeMap.put(key, treeMap.get(key) + 1);
            } else {
                treeMap.put(key, 1);
            }
        }
    }

}
