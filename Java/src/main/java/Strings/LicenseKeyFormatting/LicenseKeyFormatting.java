package Strings.LicenseKeyFormatting;

public class LicenseKeyFormatting {

    public static void main(String [] args) {
//        String input = "2-5g-3-J";          //25G3J
//        int K = 2;
        String input = "5F3Z-2e-9-w";
        int K = 4;
        System.out.println("Formatted: " + licenseKeyFormatting(input, K));
    }

    public static String licenseKeyFormatting(String input, int K) {
        String formatted = "";
        if (input.equals(""))
            return formatted;

        StringBuilder stringBuilder = new StringBuilder();
        String stringInput = input.toUpperCase().replace("-", "");
        System.out.println(stringInput);

        int counter = K;
        for (int i=stringInput.length() - 1; i >= 0; i--) {

            if (counter == 0) {
                stringBuilder.append("-");
                counter = K;
            }
            stringBuilder.append(stringInput.charAt(i));
            counter--;
        }



        return stringBuilder.reverse().toString();
    }
}
