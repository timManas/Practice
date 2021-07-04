package Math.NumberComplement;

public class NumberComplement {

    public static void main (String [] args) {
        int [] input = {5,1};
        for (int num : input)
            System.out.println("Complement: " + findComplement(num));
    }

    public static int findComplement(int num) {
        StringBuilder sb = new StringBuilder();

        // Step1 - Convert int to binary String
        String binary = Integer.toBinaryString(num);

        // Step2 - Replace digits
        for (int i=0; i < binary.length(); i++) {
            char letter = binary.charAt(i) == '0' ? '1' : '0';
            sb.append(letter);
        }

        // Step3 - Convert binary to Int
        int complement = Integer.parseInt(sb.toString(), 2);


        return complement;
    }
}
