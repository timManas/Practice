package Math.ArmstrongNumber;

public class ArmstrongNumber {

    public static void main(String [] args) {

        int [] inputList = {153, 123};
        for (int i : inputList)
            System.out.println("Input: " + i + "    isArmStrong: " + isArmstrong(i));
    }

    public static boolean isArmstrong(int N) {

        String [] arr = String.valueOf(N).split("");
        int length = arr.length;
        int total = 0;

        for (String strDigit : arr) {
            int digit = Integer.valueOf(strDigit);
            total += Math.pow(digit, length);
        }

        System.out.println("Total: " + total);

        if (total != N)
            return false;

        return true;
    }

}
