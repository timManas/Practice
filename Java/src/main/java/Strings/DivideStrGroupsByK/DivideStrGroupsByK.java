package Strings.DivideStrGroupsByK;

import java.util.ArrayList;
import java.util.List;

public class DivideStrGroupsByK {
    public static void main(String [] args) {
        String s = "abcdefghi";
        int k = 3;
        char fill = 'x';
        System.out.println("DivideByStr: " + divideString(s,k,fill) + "n");

        s = "abcdefghij";
        k = 3;
        fill = 'x';
        System.out.println("DivideByStr: " + divideString(s,k,fill) + "n");

    }

    public static String[] divideString(String s, int k, char fill) {
        List<String> output = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (char letter : s.toCharArray()){
            System.out.println("letter: " + letter);
            sb.append(letter);

            if (sb.length() == k) {
                output.add(sb.toString());
                sb = new StringBuilder();
            }
        }

        while (sb.length() != 0 && sb.length() < k) {
            sb.append(fill);
            if (sb.length() == k)
                output.add(sb.toString());
        }

        String [] outputStr = new String[output.size()];
        for (int i=0; i<output.size(); i++) outputStr[i] = output.get(i);

        return outputStr;
    }
}
