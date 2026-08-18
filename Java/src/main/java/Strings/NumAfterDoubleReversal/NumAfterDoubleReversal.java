package Strings.NumAfterDoubleReversal;

public class NumAfterDoubleReversal {
    public static void main(String [] args) {
        int [] input = {526, 1800, 0};
        for (int i : input)
            System.out.println("Is Sale: " + isSameAfterReversals(i) + "\n");
    }

    public static boolean isSameAfterReversals(int num) {
        System.out.println("num: " + num);

        StringBuilder reversal = new StringBuilder(String.valueOf(num));
        String reversed1 = reversal.reverse().toString();
        int rev1 = Integer.valueOf(reversed1);

        StringBuilder reversal2 = new StringBuilder(String.valueOf(rev1));
        String reversed2 = reversal2.reverse().toString();
        int rev2 = Integer.valueOf(reversed2);


        System.out.println("rev: " + rev1);
        System.out.println("rev: " + rev2);



        return num == rev2;
    }
}
