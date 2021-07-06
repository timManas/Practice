package Strings.ReformatPhoneNumber;

public class ReformatPhoneNumber {
    public static void main (String [] args) {
        String [] input = {"1-23-45 6","123 4-567",  "123 4-5678", "12", "--17-5 229 35-39475 "};
        for (String number : input)
            System.out.println("Reformat Number: " + reformatNumber(number));
    }

    public static String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        String unFormattedNum = number.replaceAll(" ", "").replaceAll("-", "");
        System.out.println("Starting number: " + unFormattedNum);

        for (int i=0; i < unFormattedNum.length(); i++) {
            int remaining = (unFormattedNum.length() - 1) - i;

            sb.append(unFormattedNum.charAt(i));
            if ((i+1) % 3 == 0)
                sb.append('-');


            // Split
            if (remaining == 4) {
                System.out.println("4 Rem");
                sb.append(unFormattedNum.charAt(i+1)).append(unFormattedNum.charAt(i+2)).append('-').append(unFormattedNum.charAt(i+3)).append(unFormattedNum.charAt(i+4));
                break;
            } else if (remaining == 3) {
                System.out.println("3 Rem");
                sb.append(unFormattedNum.charAt(i+1)).append(unFormattedNum.charAt(i+2)).append(unFormattedNum.charAt(i+3));
                break;
            } else if (remaining == 2) {
                System.out.println("2 Rem");
                sb.append(unFormattedNum.charAt(i+1)).append(unFormattedNum.charAt(i+2));
                break;
            } else if (remaining == 1) {
                System.out.println("Error");
                break;
            }

            System.out.println("Current: " + unFormattedNum.charAt(i) + "       Rem: " + remaining + "      " + sb.toString());


        }


        return sb.toString();
    }
}
