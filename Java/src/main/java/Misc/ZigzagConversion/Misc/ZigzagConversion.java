package Misc.ZigzagConversion.Misc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ZigzagConversion {
    public static void main(String [] args) {
       String s = "A";
       int numRows = 3;
       System.out.println("Converted: " + convert(s, numRows) + "\n");

        String s1 = "PAYPALISHIRING";
        int numRows1 = 4;
        System.out.println("Converted: " + convert(s1, numRows1) + "\n");
    }

    public static String convert(String s, int numRows) {
        StringBuilder output = new StringBuilder();
        int max = numRows - 1;
        boolean traverseDown = true;
        Map<Integer, StringBuilder> map = new LinkedHashMap<>();

        int row = 0;
        int col = 0;
        for (char letter : s.toCharArray()) {
            System.out.println("letter:" + letter + "   row: " + row + "    col: " + col );

            StringBuilder sb = new StringBuilder();
            if (map.containsKey(row)) {
                sb = map.get(row);
            }
            sb.append(letter);
            map.put(row, sb);

            // Traverse Down
            if (traverseDown) {
                row++;
            } else {
                row--;
                col++;
            }

            if (row == 0) {
                System.out.println("Traverse Down");
                traverseDown = true;
            }
            if (row == max) {
                System.out.println("Traverse Diagonal");
                traverseDown = false;
            }
        }

        System.out.println("map: " + map);
        for (StringBuilder entry : map.values()){
            output.append(entry.toString());
        }

        return output.toString();
    }
}
