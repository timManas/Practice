package Misc.NumLaserBeamsInBank;

public class NumLaserBeamsInBank {
    public static void main(String [] args) {
        String [] bank = {"011001","000000","010100","001000"};
        System.out.println("Num Beams: " + numberOfBeams(bank) + "\n");

        String [] bank1 = {"000000","11111","000000"};
        System.out.println("Num Beams: " + numberOfBeams(bank1) + "\n");
    }

    public static int numberOfBeams(String[] bank) {
        int num = 0;
        String prev = "";

        // Step1 - Traverse floor plan array
        for (int i=0; i < bank.length; i++) {
            System.out.println("current: " + bank[i]);

            // Step2 - Replace all 0's with blanks
            String current = bank[i].replace("0", "");

            // Step3 - If blank, we move onto the next
            if (current.length() == 0)
                continue;

            // Step4 - Initiliaze prev if empty
            if (prev.equalsIgnoreCase("")) {
                prev = current;
                continue;
            }

            // Step5 - Calculate the number of beams
            num += prev.length() * current.length();
            prev = current;
        }

        return num;
    }
}
