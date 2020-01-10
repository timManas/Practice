package Math.AddBinary;

public class AddBinary {

    public static void main(String [] args) {
        String a = "1010";
        String b = "1011";
        String c = "1111";
        String d = "1111";

        System.out.println(addBinary(c,d));
    }

    public static String addBinary(String a, String b) {


        if (a.length() < b.length()) {
            String tempA = addZerosIfSmaller(a,b);
            a = tempA + a;
         } else if (a.length() > b.length()) {
            String tempB = addZerosIfSmaller(b, a);
            b = tempB + b;
        }

        // Initialize
        char [] totalChar = new char[a.length()];
        int index = a.length() - 1;
        char carryOvr = 0;

        // Traverse starting from end to the front
        while (index >= 0) {
            char charA = a.charAt(index);
            char charB = b.charAt(index);
            System.out.println("Index: " + index + "    a: " + charA + "    b: " + charB );



            char result = 0;
            if (charA == '1' && charB =='1') {
                result = '0';
                carryOvr = '1';

                totalChar[index] = result;
                index--;
                continue;

            } else if (charA == '1' || charB =='1') {
                result = '1';
            } else {
                result = '0';
            }

            if (carryOvr == '1') {
                if (result == '1') {
                    result = '0';
                    carryOvr = '1';
                } else if (result == '0') {
                    result = '1';
                    carryOvr = '0';
                }
            }

            totalChar[index] = result;
            index--;
        }


        String str = String.valueOf(totalChar);
        if (carryOvr == '1')
            str = "1" + str;
        return str;
    }

    private static String addZerosIfSmaller(String smallStr, String largerStr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < largerStr.length() - smallStr.length(); i++) {
            sb.append(0);
        }

        return sb.toString();
    }
}
